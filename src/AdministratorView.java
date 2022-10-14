

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author kiero
 */
public class AdministratorView implements UserView{

    
    @Override
    public void showView() {
            JOptionPane.showMessageDialog(null, "Welcome");
            Test2 t= new Test2();
            t.setVisible(true);
            t.setAdminView();
    }
    
}
