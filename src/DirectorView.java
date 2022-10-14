

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kiero
 */
public class DirectorView implements UserView{
    private boolean privilege;

    public void setEnabled(Boolean privilege)
    {
        this.privilege=privilege;
    }
    public boolean getEnabled()
    {
        return privilege;
    }
    
    
    @Override
    public void showView() 
    {
        JOptionPane.showMessageDialog(null, "Welcome");
        Test2 t= new Test2();
        t.setVisible(true);       
        t.setDirectorView();
        /*m.setBookingEnabled(privilege);
         m.setJobCardEnabled(privilege);
        privilege=true;
        m.setSalesReportEnabled(privilege);
        privilege=false;
        m.setProductsEnabled(privilege);
        m.setCustomerEnabled(privilege);
        m.setInvoicesEnabled(privilege);*/ 
                  
    }   
}
