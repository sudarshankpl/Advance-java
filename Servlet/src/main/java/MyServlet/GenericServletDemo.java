/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyServlet;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.http.*;

/**
 *
 * @author Prasid
 */

    
    
    
 public class GenericServletDemo extends GenericServlet{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
//        out.println("this is a generic Servlet");
        res.getWriter().println("This is generic ");
    }

}
