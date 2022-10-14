


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiero
 */
public class LoginCheck{
      private Connection myconObject=null;
      private PreparedStatement mystatObject=null;
      private ResultSet myresultObject=null;
      private boolean change;      

    public LoginCheck() 
    {
        
    }
   
    public void checkDatabase(LoginVerification login) throws SQLException
    {
       try {
            
            myconObject= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");
            
            String sql= "Select Email, Password, Type from Users where Email=? and Password=?";
            mystatObject=myconObject.prepareStatement(sql);
            mystatObject.setString(1,login.getUname());
            mystatObject.setString(2,login.getPass());            
            myresultObject=mystatObject.executeQuery();
            
            roles(login);
            System.out.println("Results: "  + myresultObject.getInt(3)); 
            myconObject.close();
		

	} catch (SQLException e) {

		System.out.println(e.getMessage());

        }
    }
    public void setVisible(Boolean change)
    {
        this.change=change;
    }
    public boolean getVisible()
    {
        return change;
    }    
    public void roles(LoginVerification login) throws SQLException
    {
        if(myresultObject.next())
            { 
                login.setRole(myresultObject.getInt(3));               
                System.out.println("Role: "+login.getRole());
            switch (login.getRole()) {
                case 1:
                    {
                        AdministratorView a=new AdministratorView();
                        a.showView();                       
                        change=false;
                        break;
                    }
                case 2:
                    {
                        DirectorView d=new DirectorView();
                        d.showView();                        
                        change=false;
                        break;
                    }
                case 3:
                    {
                        
                        StaffUserView s=new StaffUserView();
                        s.showView();
                        change=false;
                        break;
                    }
                default:
                    break;
            }
            }
        else{
                JOptionPane.showMessageDialog(null, "Username or Password is Incorrect", "Please Try Again",JOptionPane.ERROR_MESSAGE);
                change=true;
            }
    }
}
