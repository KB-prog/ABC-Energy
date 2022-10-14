

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiero
 */
public class LoginVerification {
    private String uname,pass;
    private int staffID,role;
    
    public LoginVerification()
    {
      uname=" ";
      pass=" ";
      staffID=0;
      role=0;
    }
    public LoginVerification(String aUname,String aPass,int aRole)
    {
        uname=aUname;
        pass=aPass;
        role=aRole;
    }
    public void copy(LoginVerification other)
    {
       this.uname=other.uname;
       this.pass=other.pass;
       this.role=other.role;
    }
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public int getRole()
    {
        return role;
    }
    
    public void setRole(int role)
    {
        this.role=role;
    }

    public int getStaffID()
    {
        return staffID;
    }
    public void setStaffID(int staffID)
    {
        this.staffID=staffID;
    }
    
    @Override
    public String toString() {
        return "LoginVerification{" + "uname=" + uname + ", pass=" + pass + '}';
    }
   
}
