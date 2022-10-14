


import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiero
 */
public class Person {
    
    private int custID;    
    private String forename;    
    private String surname;    
    private Date dob;    
    private String address;   
    private String postcode;    
    private String phone;   
    private String email;    
    private String password;
    
    public Person()
    {
        custID=0;
        forename=null;
        surname=null;
        dob=new Date();
        address=null;
        postcode=null;
        phone=null;
    }
    
    public Person(int custID,String forename, String surname, Date dob, String address,String postcode,String phone)
    {
        this.custID=custID;
        this.forename=forename;
        this.surname=surname;
        this.dob=dob;
        this.address=address;
        this.postcode=postcode;
        this.phone=phone;
    }
    
    public Person(String forename, String surname, int d,int m,int y, String address)
    {
      this.forename=forename;
      this.surname=surname;
      this.dob=new Date(d,m,y);
      this.address=address;
    }
    public void copy(Person other)
    {
       this.custID=other.custID;
        this.forename=other.forename;
        this.surname=other.surname;
        this.dob=other.dob;
        this.address=other.address;
        this.postcode=other.postcode;
        this.phone=other.phone;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.custID != other.custID) {
            return false;
        }
        if (!Objects.equals(this.forename, other.forename)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.postcode, other.postcode)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        return true;
    }
 

 
    /**
     * Get the value of phone
     *
     * @return the value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the value of phone
     *
     * @param phone new value of phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * Get the value of postcode
     *
     * @return the value of postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Set the value of postcode
     *
     * @param postcode new value of postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Get the value of dob
     *
     * @return the value of dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * Set the value of dob
     *
     * @param dob new value of dob
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }
public void setDob(int d, int m, int y)
    {
       this.dob=new Date(d,m,y); 
    }

    /**
     * Get the value of surname
     *
     * @return the value of surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set the value of surname
     *
     * @param surname new value of surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }


    /**
     * Get the value of forename
     *
     * @return the value of forename
     */
    public String getForename() {
        return forename;
    }

    /**
     * Set the value of forename
     *
     * @param forename new value of forename
     */
    public void setForename(String forename) {
        this.forename = forename;
    }

    /**
     * Get the value of custID
     *
     * @return the value of custID
     */
    public int getCustID() {
        return custID;
    }

    /**
     * Set the value of custID
     *
     * @param custID new value of custID
     */
    public void setCustID(int custID) {
        this.custID = custID;
    }

        /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Person{" + "custID=" + custID + ", forename=" + forename + ", surname=" + surname + ", dob=" + dob + ", address=" + address + ", postcode=" + postcode + ", phone=" + phone + '}';
    }

}
