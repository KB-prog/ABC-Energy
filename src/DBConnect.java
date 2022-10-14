/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kiero
 */
public class DBConnect {
    
    
  public static Connection getDBConnection()
  {
   Connection dbConnection = null;  
  
   try{
       
        String url="jdbc:oracle:thin:@localhost:1521/XE";
        String user="HND";
        String password="HND";
        dbConnection = DriverManager.getConnection(url,user,password);
        System.out.println("successful connection");
        
   }catch(SQLException e)
   {
       System.out.println(e.getMessage());
   }
   return dbConnection;
  }
}
