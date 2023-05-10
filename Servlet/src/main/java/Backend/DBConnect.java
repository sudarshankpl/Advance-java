/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prasid
 */
public class DBConnect {
    public static Connection connect() throws ClassNotFoundException, SQLException{
//        Class.forName("com.mysql.jdbc.Driver");
//        String url = "jdbc:mysql://localhost/inventory_db";
//        String username = "root";
//        String password = "";
//        Connection con = DriverManager.getConnection(url,username,password);
//        return con;
//        
//        
//    }
//    
//}
  try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 String url="jdbc:mysql://localhost/inventory_db";
                 String username="root";
                 String password="";
         
            Connection con=DriverManager.getConnection(url,username,password);
            return con;
            }catch(SQLException ex){
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE,null,ex);
                return null;
            }
        
    }
}