/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Objects;

/**
 *
 * @author kiero
 */
public class Products {

    private int productID;      
    private int categoryID;
    private String productName;
    private String productDesc;
    private String slug;
    private double productPrice;
    private String productPhoto;
    private Date date_view;
    private int viewCounter;


    public Products(int productID, int categoryID, String productName, String productDesc, String slug, double productPrice, String productPhoto, Date date_view, int viewCounter) {
        this.productID = productID;
        this.categoryID = categoryID;
        this.productName = productName;
        this.productDesc = productDesc;
        this.slug = slug;
        this.productPrice = productPrice;
        this.productPhoto = productPhoto;
        this.date_view = date_view;
        this.viewCounter = viewCounter;
    }    

    /**
     * Get the value of viewCounter
     *
     * @return the value of viewCounter
     */
    public int getViewCounter() {
        return viewCounter;
    }

    /**
     * Set the value of viewCounter
     *
     * @param viewCounter new value of viewCounter
     */
    public void setViewCounter(int viewCounter) {
        this.viewCounter = viewCounter;
    }

    /**
     * Get the value of date_view
     *
     * @return the value of date_view
     */
    public Date getDate_view() {
        return date_view;
    }

    /**
     * Set the value of date_view
     *
     * @param date_view new value of date_view
     */
    public void setDate_view(Date date_view) {
        this.date_view = date_view;
    }

    /**
     * Get the value of productPhoto
     *
     * @return the value of productPhoto
     */
    public String getProductPhoto() {
        return productPhoto;
    }

    /**
     * Set the value of productPhoto
     *
     * @param productPhoto new value of productPhoto
     */
    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto;
    }

    /**
     * Get the value of productPrice
     *
     * @return the value of productPrice
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * Set the value of productPrice
     *
     * @param productPrice new value of productPrice
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * Get the value of slug
     *
     * @return the value of slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Set the value of slug
     *
     * @param slug new value of slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * Get the value of productDescription
     *
     * @return the value of productDescription
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * Set the value of productDescription
     *
     * @param productDesc new value of productDescription
     */
    public void setProductDescription(String productDesc) {
        this.productDesc = productDesc;
    }
 
    /**
     * Get the value of productName
     *
     * @return the value of productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Set the value of productName
     *
     * @param productName new value of productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Get the value of CategoryID
     *
     * @return the value of CategoryID
     */
    public int getCategoryID() {
        return categoryID;
    }

    /**
     * Set the value of CategoryID
     *
     * @param CategoryID new value of CategoryID
     */
    public void setCategoryID(int CategoryID) {
        this.categoryID = CategoryID;
    }

    /**
     * Get the value of productID
     *
     * @return the value of productID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Set the value of productID
     *
     * @param productID new value of productID
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.productID;
        hash = 97 * hash + this.categoryID;
        hash = 97 * hash + Objects.hashCode(this.productName);
        hash = 97 * hash + Objects.hashCode(this.productDesc);
        hash = 97 * hash + Objects.hashCode(this.slug);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.productPrice) ^ (Double.doubleToLongBits(this.productPrice) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.productPhoto);
        hash = 97 * hash + Objects.hashCode(this.date_view);
        hash = 97 * hash + this.viewCounter;
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
        final Products other = (Products) obj;
        if (this.productID != other.productID) {
            return false;
        }
        if (this.categoryID != other.categoryID) {
            return false;
        }
        if (Double.doubleToLongBits(this.productPrice) != Double.doubleToLongBits(other.productPrice)) {
            return false;
        }
        if (this.viewCounter != other.viewCounter) {
            return false;
        }
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        if (!Objects.equals(this.productDesc, other.productDesc)) {
            return false;
        }
        if (!Objects.equals(this.slug, other.slug)) {
            return false;
        }
        if (!Objects.equals(this.productPhoto, other.productPhoto)) {
            return false;
        }
        if (!Objects.equals(this.date_view, other.date_view)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Products{" + "productID=" + productID + ", categoryID=" + categoryID + ", productName=" + productName + ", productDesc=" + productDesc + ", slug=" + slug + ", productPrice=" + productPrice + ", productPhoto=" + productPhoto + ", date_view=" + date_view + ", viewCounter=" + viewCounter + '}';
    }

    
    
}
