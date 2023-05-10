package Backend;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Prasid
 */
public class SavePurchase extends HttpServlet {
    Connection con;
       
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PreparedWay(req, res);
    }
    
    public void PreparedWay(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        String itemid = req.getParameter("item_id");
       String itemPrice = req.getParameter("itemPrice");
       String quantity = req.getParameter("quantity");
        
        try {
            con = DBConnect.connect();
            String query1 = "UPDATE `tbl_item` SET `stock`=?+ (select stock from tbl_item WHERE id=?) WHERE id=?";
            
            String query = "INSERT INTO `tbl_purchase`(`item_id`, `quantity`, `price`) VALUES (?,?,?)";
            PreparedStatement stat  = con.prepareStatement(query);
            //binding parameter value
            stat.setString(1, itemid);
            stat.setString(2, quantity);
            stat.setString(3, itemPrice);
            stat.executeUpdate();
            
            PreparedStatement stat1  = con.prepareStatement(query1);
            //binding parameter value
            stat1.setString(1, quantity);
            stat1.setString(2, itemid);
            stat1.setString(3, itemid);
                  
            
            
            stat1.executeUpdate();
            
            HttpSession s = req.getSession();
            s.setAttribute("successMsg", "data inserted sucessfully");
            res.sendRedirect("frontend/menu.jsp");
            res.getWriter().println("data inserted sucessfully");
                    
                    
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            res.getWriter().println(ex.getMessage());
        }
       
    }
}