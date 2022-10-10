/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myloginform;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SHEM TOM
 */
public class MyLoginForm 
{
     public static Connection DbConnection()
     {
         try {
            String user = "root";
            String password = "17382002";
            String url = "jdbc:mysql://localhost:3306/form";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, user, password);
            
            //check if the connection is working well
            if(c!=null)
            {
                System.out.println("Connection Established!");
            }
            else
            {
                System.out.println("Connection Failed!");
            }
            
            return c;
        } catch (ClassNotFoundException | SQLException e) 
        {
            Logger.getLogger(MyLoginForm.class.getName()).log(Level.SEVERE, null, e);
        }
         
         return null;
     }
    
}
