/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.NullPointerException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.MouseEvent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author kiero
 */
public class Test2 extends javax.swing.JFrame {

    
    public Test2() {
        initComponents();         
        db = new DBConnect();       
        this.cardLayout = (CardLayout) (pnlCards.getLayout());
        refreshConnection();
        //profile(staffID);
        //UserProfile();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlCards = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblVendorNo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblQuotesNo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblProductNo = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblTest = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnHomeLogout = new javax.swing.JButton();
        btnHomeHelp = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        pnlProducts = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtProductSearch = new javax.swing.JTextField();
        btnProductSearch = new javax.swing.JButton();
        btnChooseProductFile = new javax.swing.JButton();
        txtProductFilePath = new javax.swing.JTextField();
        btnAddProduct = new javax.swing.JButton();
        txtProductName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnUpdateProduct = new javax.swing.JButton();
        btnRemoveProduct = new javax.swing.JButton();
        btnClearProduct = new javax.swing.JButton();
        txtProductPrice = new javax.swing.JTextField();
        CboxCategory = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        txtProductDesciption = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtProductQuantity = new javax.swing.JTextField();
        pnlCustomer = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        txtCustSearch = new javax.swing.JTextField();
        btnCustomerSearch = new javax.swing.JButton();
        btnCustHelp = new javax.swing.JButton();
        btnCustLogout = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        pnlQuotes = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtQuoteSearch = new javax.swing.JTextField();
        btnQuoteSearch = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblQuotes = new javax.swing.JTable();
        jSeparator31 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtaQuotes = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        txtQuoteEmail = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtQuoteTotal = new javax.swing.JTextField();
        cBoxQuoteStatus = new javax.swing.JComboBox<>();
        btnQuoteUpdate = new javax.swing.JButton();
        btnQuoteClear = new javax.swing.JButton();
        btnQuoteHelp = new javax.swing.JButton();
        btnQuoteLogout = new javax.swing.JButton();
        pnlVendors = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtVendorSearch = new javax.swing.JTextField();
        btnVendorSearch = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblVendors = new javax.swing.JTable();
        jSeparator32 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtVendorName = new javax.swing.JTextField();
        txtVendorEmail = new javax.swing.JTextField();
        txtVendorAddress = new javax.swing.JTextField();
        txtVendorPostcode = new javax.swing.JTextField();
        txtVendorPhone = new javax.swing.JTextField();
        btnVendorAdd = new javax.swing.JButton();
        btnVendorUpdate = new javax.swing.JButton();
        btnVendorRemove = new javax.swing.JButton();
        btnVendorClear = new javax.swing.JButton();
        btnVendorLogout = new javax.swing.JButton();
        btnVendorHelp = new javax.swing.JButton();
        pnlContracts = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblContracts = new javax.swing.JTable();
        cBoxContracts = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtContractSearch = new javax.swing.JTextField();
        btnContractSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnContractAdd = new javax.swing.JButton();
        txtVendorID = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtaContractDesc = new javax.swing.JTextArea();
        txtContractDiscount = new javax.swing.JTextField();
        btnContractUpdate = new javax.swing.JButton();
        btnContractRemove = new javax.swing.JButton();
        btnContractClear = new javax.swing.JButton();
        btnContractLogout = new javax.swing.JButton();
        btnContractHelp = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        pnlOrders = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        OrderFilter = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtOrderSearch = new javax.swing.JTextField();
        btnOrderSearch = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblVendorProducts = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblVendorOrder = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        btnAddProducts = new javax.swing.JButton();
        btnRemoveProducts = new javax.swing.JButton();
        txtVendorOrderlineID = new javax.swing.JTextField();
        txtProductID = new javax.swing.JTextField();
        txtOrdPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        cBoxProductFilter = new javax.swing.JComboBox<>();
        txtOrdVendorID = new javax.swing.JTextField();
        btnPlaceOrder = new javax.swing.JButton();
        cBoxOrdStatus = new javax.swing.JComboBox<>();
        btnOrderUpdate = new javax.swing.JButton();
        btnOrderLogout = new javax.swing.JButton();
        btnOrderHelp = new javax.swing.JButton();
        pnlInvoices = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblInvoices = new javax.swing.JTable();
        btnGenInvoice = new javax.swing.JButton();
        cBoxInvoices = new javax.swing.JComboBox<>();
        btnInvoiceLogout = new javax.swing.JButton();
        btnInvoiceHelp = new javax.swing.JButton();
        pnlSalesReport = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        navPanelCards = new javax.swing.JPanel();
        paneAdmin = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblCustomers = new javax.swing.JLabel();
        lblVendors = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblContracts = new javax.swing.JLabel();
        lblInvoices = new javax.swing.JLabel();
        lblSalesReport = new javax.swing.JLabel();
        lblProducts = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lblQuotesStaffUser1 = new javax.swing.JLabel();
        lblOrdersStaffUser1 = new javax.swing.JLabel();
        paneDirector = new javax.swing.JPanel();
        lblHomeDirector = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblInvoicesDirector = new javax.swing.JLabel();
        lblSalesReportDirector = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        paneStaffUser = new javax.swing.JPanel();
        lblHomeStaffUser = new javax.swing.JLabel();
        lblQuotesStaffUser = new javax.swing.JLabel();
        lblVendorsStaffUser = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lblContractsStaffUser = new javax.swing.JLabel();
        lblOrdersStaffUser = new javax.swing.JLabel();
        lblInvoicesStaffUser = new javax.swing.JLabel();
        lblProductsStaffUser = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABC Energy");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 41, 65)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCards.setBackground(new java.awt.Color(255, 255, 255));
        pnlCards.setLayout(new java.awt.CardLayout());

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(41, 41, 65));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Vendors.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 4, 270, 40));

        lblVendorNo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblVendorNo.setForeground(new java.awt.Color(255, 255, 255));
        lblVendorNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVendorNo.setText("0");
        jPanel4.add(lblVendorNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 100, 260, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 270, 220));

        jPanel6.setBackground(new java.awt.Color(41, 41, 65));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Quotes.png"))); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        lblQuotesNo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblQuotesNo.setForeground(new java.awt.Color(255, 255, 255));
        lblQuotesNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuotesNo.setText("0");
        jPanel6.add(lblQuotesNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 100, 270, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 280, 220));

        jPanel5.setBackground(new java.awt.Color(41, 41, 65));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Products.png"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        lblProductNo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblProductNo.setForeground(new java.awt.Color(255, 255, 255));
        lblProductNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductNo.setText("0");
        jPanel5.add(lblProductNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 260, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 220));

        pnlHome.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(lblTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 14, 197, 113));

        tblProducts.setAutoCreateRowSorter(true);
        tblProducts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ProductID", "ProductName", "ProductDescription", "ProductCategory", "ProductPrice", "ProductQuantity", "ProductImage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.setRowHeight(80);
        tblProducts.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(tblProducts);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 800, 430));

        btnHomeLogout.setBackground(new java.awt.Color(41, 41, 65));
        btnHomeLogout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnHomeLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnHomeLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Logout.png"))); // NOI18N
        btnHomeLogout.setText("Logout");
        btnHomeLogout.setToolTipText("");
        btnHomeLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHomeLogout.setName(""); // NOI18N
        btnHomeLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeLogoutActionPerformed(evt);
            }
        });
        jPanel8.add(btnHomeLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 110, 30));

        btnHomeHelp.setBackground(new java.awt.Color(41, 41, 65));
        btnHomeHelp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnHomeHelp.setForeground(new java.awt.Color(255, 255, 255));
        btnHomeHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Help.png"))); // NOI18N
        btnHomeHelp.setText("Help");
        btnHomeHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHomeHelp.setMaximumSize(new java.awt.Dimension(81, 29));
        btnHomeHelp.setMinimumSize(new java.awt.Dimension(81, 29));
        btnHomeHelp.setPreferredSize(new java.awt.Dimension(81, 29));
        btnHomeHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeHelpActionPerformed(evt);
            }
        });
        jPanel8.add(btnHomeHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 110, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Current Stock");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        pnlHome.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 850, 540));

        jSeparator11.setBackground(new java.awt.Color(41, 41, 65));
        pnlHome.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, 830, 10));

        pnlCards.add(pnlHome, "pnlHome");

        pnlProducts.setBackground(new java.awt.Color(255, 255, 255));
        pnlProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ProductID", "ProductName", "ProductDescription", "ProductCategory", "ProductPrice", "ProductQuantity", "ProductImage"
            }
        ));
        tblProduct.setRowHeight(80);
        jScrollPane2.setViewportView(tblProduct);

        pnlProducts.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 86, 814, 350));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Use ProductID to search for a specific Product");
        pnlProducts.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Search:");
        pnlProducts.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));
        pnlProducts.add(txtProductSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 211, 30));

        btnProductSearch.setBackground(new java.awt.Color(41, 41, 65));
        btnProductSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/search.png"))); // NOI18N
        btnProductSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductSearchActionPerformed(evt);
            }
        });
        pnlProducts.add(btnProductSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 50, 30));

        btnChooseProductFile.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnChooseProductFile.setText("Choose Image");
        btnChooseProductFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChooseProductFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseProductFileActionPerformed(evt);
            }
        });
        pnlProducts.add(btnChooseProductFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 670, -1, 30));
        pnlProducts.add(txtProductFilePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 670, 350, 30));

        btnAddProduct.setBackground(new java.awt.Color(41, 41, 65));
        btnAddProduct.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Add.png"))); // NOI18N
        btnAddProduct.setText("Add");
        btnAddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        pnlProducts.add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, 110, 30));
        pnlProducts.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 270, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Product Name:");
        pnlProducts.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 160, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Product Image:");
        pnlProducts.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 160, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Product Category:");
        pnlProducts.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 160, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Product Price:");
        pnlProducts.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 160, 30));

        btnUpdateProduct.setBackground(new java.awt.Color(41, 41, 65));
        btnUpdateProduct.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnUpdateProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Update.png"))); // NOI18N
        btnUpdateProduct.setText("Update");
        btnUpdateProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProducts.add(btnUpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 730, 110, 30));

        btnRemoveProduct.setBackground(new java.awt.Color(41, 41, 65));
        btnRemoveProduct.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnRemoveProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Remove.png"))); // NOI18N
        btnRemoveProduct.setText("Remove");
        btnRemoveProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProducts.add(btnRemoveProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 730, 110, 30));

        btnClearProduct.setBackground(new java.awt.Color(41, 41, 65));
        btnClearProduct.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnClearProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnClearProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Clear.png"))); // NOI18N
        btnClearProduct.setText("Clear");
        btnClearProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProducts.add(btnClearProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 730, 110, 30));
        pnlProducts.add(txtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 270, 30));

        CboxCategory.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        CboxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thermostats" }));
        CboxCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CboxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxCategoryActionPerformed(evt);
            }
        });
        pnlProducts.add(CboxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 270, 30));

        jButton7.setBackground(new java.awt.Color(41, 41, 65));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Logout.png"))); // NOI18N
        jButton7.setText("Logout");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnlProducts.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 730, 110, 30));

        jButton8.setBackground(new java.awt.Color(41, 41, 65));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Help.png"))); // NOI18N
        jButton8.setText("Help");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProducts.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 730, 110, 30));

        jSeparator1.setForeground(new java.awt.Color(41, 41, 65));
        pnlProducts.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 820, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Product Description:");
        pnlProducts.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 30));
        pnlProducts.add(txtProductDesciption, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 270, 30));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setText("Product Quantity:");
        pnlProducts.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 160, 30));
        pnlProducts.add(txtProductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 270, 30));

        pnlCards.add(pnlProducts, "pnlProducts");

        pnlCustomer.setBackground(new java.awt.Color(255, 255, 255));
        pnlCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Forename", "Surname", "DOB", "Address", "Postcode", "Phone", "Email", "Password"
            }
        ));
        tblCustomer.setRowHeight(80);
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCustomer);

        pnlCustomer.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 87, 814, 630));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Search:");
        pnlCustomer.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 41, -1, -1));
        pnlCustomer.add(txtCustSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 39, 211, 30));

        btnCustomerSearch.setBackground(new java.awt.Color(41, 41, 65));
        btnCustomerSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomerSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/search.png"))); // NOI18N
        btnCustomerSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCustomerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerSearchActionPerformed(evt);
            }
        });
        pnlCustomer.add(btnCustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 39, 50, 30));

        btnCustHelp.setBackground(new java.awt.Color(41, 41, 65));
        btnCustHelp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCustHelp.setForeground(new java.awt.Color(255, 255, 255));
        btnCustHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Help.png"))); // NOI18N
        btnCustHelp.setText("Help");
        btnCustHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCustHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustHelpActionPerformed(evt);
            }
        });
        pnlCustomer.add(btnCustHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 730, 110, 30));

        btnCustLogout.setBackground(new java.awt.Color(41, 41, 65));
        btnCustLogout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCustLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnCustLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Logout.png"))); // NOI18N
        btnCustLogout.setText("Logout");
        btnCustLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCustLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustLogoutActionPerformed(evt);
            }
        });
        pnlCustomer.add(btnCustLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 730, 110, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Use the Students Surname to search for a specific Student");
        pnlCustomer.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pnlCards.add(pnlCustomer, "pnlCustomers");

        pnlQuotes.setBackground(new java.awt.Color(255, 255, 255));
        pnlQuotes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Use QuoteID to search for a specific Quote");
        pnlQuotes.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("Search:");
        pnlQuotes.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 50, -1, 30));
        pnlQuotes.add(txtQuoteSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 210, 30));

        btnQuoteSearch.setBackground(new java.awt.Color(41, 41, 65));
        btnQuoteSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnQuoteSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/search.png"))); // NOI18N
        btnQuoteSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuoteSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuoteSearchActionPerformed(evt);
            }
        });
        pnlQuotes.add(btnQuoteSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        tblQuotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "QuoteID", "Email", "QuoteDescription", "QuoteStatus", "QuoteTotal"
            }
        ));
        tblQuotes.setRowHeight(80);
        tblQuotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuotesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblQuotes);

        pnlQuotes.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 810, 350));

        jSeparator31.setBackground(new java.awt.Color(41, 41, 65));
        pnlQuotes.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 810, 10));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Quote Description:");
        pnlQuotes.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 30));

        txtaQuotes.setEditable(false);
        txtaQuotes.setColumns(20);
        txtaQuotes.setRows(5);
        jScrollPane5.setViewportView(txtaQuotes);

        pnlQuotes.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 330, 260));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("Customer Email:");
        pnlQuotes.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, 30));

        txtQuoteEmail.setEditable(false);
        pnlQuotes.add(txtQuoteEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 330, 30));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setText("Quote Total:");
        pnlQuotes.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 130, 30));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("Quote Status:");
        pnlQuotes.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 130, 30));
        pnlQuotes.add(txtQuoteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 330, 30));

        cBoxQuoteStatus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cBoxQuoteStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "N", "C" }));
        pnlQuotes.add(cBoxQuoteStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, 330, 30));

        btnQuoteUpdate.setBackground(new java.awt.Color(41, 41, 65));
        btnQuoteUpdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnQuoteUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnQuoteUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Update.png"))); // NOI18N
        btnQuoteUpdate.setText("Update");
        btnQuoteUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuoteUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuoteUpdateActionPerformed(evt);
            }
        });
        pnlQuotes.add(btnQuoteUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 730, 110, 30));

        btnQuoteClear.setBackground(new java.awt.Color(41, 41, 65));
        btnQuoteClear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnQuoteClear.setForeground(new java.awt.Color(255, 255, 255));
        btnQuoteClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Clear.png"))); // NOI18N
        btnQuoteClear.setText("Clear");
        btnQuoteClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuoteClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuoteClearActionPerformed(evt);
            }
        });
        pnlQuotes.add(btnQuoteClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 730, 110, 30));

        btnQuoteHelp.setBackground(new java.awt.Color(41, 41, 65));
        btnQuoteHelp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnQuoteHelp.setForeground(new java.awt.Color(255, 255, 255));
        btnQuoteHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Help.png"))); // NOI18N
        btnQuoteHelp.setText("Help");
        btnQuoteHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuoteHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuoteHelpActionPerformed(evt);
            }
        });
        pnlQuotes.add(btnQuoteHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 730, 110, 30));

        btnQuoteLogout.setBackground(new java.awt.Color(41, 41, 65));
        btnQuoteLogout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnQuoteLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnQuoteLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Logout.png"))); // NOI18N
        btnQuoteLogout.setText("Logout");
        btnQuoteLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuoteLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuoteLogoutActionPerformed(evt);
            }
        });
        pnlQuotes.add(btnQuoteLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 730, 110, 30));

        pnlCards.add(pnlQuotes, "pnlQuotes");

        pnlVendors.setBackground(new java.awt.Color(255, 255, 255));
        pnlVendors.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlVendors.setRequestFocusEnabled(false);
        pnlVendors.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Use Vendors Name to search for a specific Vendor");
        pnlVendors.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Search:");
        pnlVendors.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 40, -1, 30));
        pnlVendors.add(txtVendorSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 40, 185, 30));

        btnVendorSearch.setBackground(new java.awt.Color(41, 41, 65));
        btnVendorSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnVendorSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/search.png"))); // NOI18N
        btnVendorSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendorSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendorSearchActionPerformed(evt);
            }
        });
        pnlVendors.add(btnVendorSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 30));

        tblVendors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblVendors.setRowHeight(80);
        tblVendors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendorsMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblVendors);

        pnlVendors.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 820, 350));

        jSeparator32.setForeground(new java.awt.Color(41, 41, 65));
        pnlVendors.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 820, 10));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setText("Vendor Name:");
        pnlVendors.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 140, 30));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setText("Vendor Email:");
        pnlVendors.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 130, 30));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("Vendor Address:");
        pnlVendors.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 140, 30));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48.setText("Vendor Postcode:");
        pnlVendors.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, 30));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setText("Vendor Phone:");
        pnlVendors.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 130, 30));
        pnlVendors.add(txtVendorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 330, 30));
        pnlVendors.add(txtVendorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 330, 30));
        pnlVendors.add(txtVendorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 330, 30));
        pnlVendors.add(txtVendorPostcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 330, 30));
        pnlVendors.add(txtVendorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 330, 30));

        btnVendorAdd.setBackground(new java.awt.Color(41, 41, 65));
        btnVendorAdd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnVendorAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnVendorAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Add.png"))); // NOI18N
        btnVendorAdd.setText("Add");
        btnVendorAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendorAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendorAddActionPerformed(evt);
            }
        });
        pnlVendors.add(btnVendorAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 110, 30));

        btnVendorUpdate.setBackground(new java.awt.Color(41, 41, 65));
        btnVendorUpdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnVendorUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnVendorUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Update.png"))); // NOI18N
        btnVendorUpdate.setText("Update");
        btnVendorUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendorUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendorUpdateActionPerformed(evt);
            }
        });
        pnlVendors.add(btnVendorUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 720, 110, 30));

        btnVendorRemove.setBackground(new java.awt.Color(41, 41, 65));
        btnVendorRemove.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnVendorRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnVendorRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Remove.png"))); // NOI18N
        btnVendorRemove.setText("Remove");
        btnVendorRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendorRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendorRemoveActionPerformed(evt);
            }
        });
        pnlVendors.add(btnVendorRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 720, 110, 30));

        btnVendorClear.setBackground(new java.awt.Color(41, 41, 65));
        btnVendorClear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnVendorClear.setForeground(new java.awt.Color(255, 255, 255));
        btnVendorClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Clear.png"))); // NOI18N
        btnVendorClear.setText("Clear");
        btnVendorClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendorClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendorClearActionPerformed(evt);
            }
        });
        pnlVendors.add(btnVendorClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 720, 110, 30));

        btnVendorLogout.setBackground(new java.awt.Color(41, 41, 65));
        btnVendorLogout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnVendorLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnVendorLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Logout.png"))); // NOI18N
        btnVendorLogout.setText("Logout");
        btnVendorLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendorLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendorLogoutActionPerformed(evt);
            }
        });
        pnlVendors.add(btnVendorLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 720, 110, 30));

        btnVendorHelp.setBackground(new java.awt.Color(41, 41, 65));
        btnVendorHelp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnVendorHelp.setForeground(new java.awt.Color(255, 255, 255));
        btnVendorHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Help.png"))); // NOI18N
        btnVendorHelp.setText("Help");
        btnVendorHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendorHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendorHelpActionPerformed(evt);
            }
        });
        pnlVendors.add(btnVendorHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 720, 110, 30));

        pnlCards.add(pnlVendors, "pnlVendors");

        pnlContracts.setBackground(new java.awt.Color(255, 255, 255));
        pnlContracts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblContracts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblContracts.setRowHeight(80);
        tblContracts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContractsMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblContracts);

        cBoxContracts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contracts", "Vendors" }));
        cBoxContracts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxContractsActionPerformed(evt);
            }
        });

        jLabel9.setText("Use ContractID to search for a specific Contract.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Search:");

        btnContractSearch.setBackground(new java.awt.Color(41, 41, 65));
        btnContractSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/search.png"))); // NOI18N
        btnContractSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractSearchActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("VendorID:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Contract Description:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Contract Discount:");

        btnContractAdd.setBackground(new java.awt.Color(41, 41, 65));
        btnContractAdd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnContractAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnContractAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Add.png"))); // NOI18N
        btnContractAdd.setText("Add");
        btnContractAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContractAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractAddActionPerformed(evt);
            }
        });

        txtaContractDesc.setColumns(20);
        txtaContractDesc.setRows(5);
        jScrollPane11.setViewportView(txtaContractDesc);

        btnContractUpdate.setBackground(new java.awt.Color(41, 41, 65));
        btnContractUpdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnContractUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnContractUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Update.png"))); // NOI18N
        btnContractUpdate.setText("Update");
        btnContractUpdate.setToolTipText("");
        btnContractUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContractUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractUpdateActionPerformed(evt);
            }
        });

        btnContractRemove.setBackground(new java.awt.Color(41, 41, 65));
        btnContractRemove.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnContractRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnContractRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Remove.png"))); // NOI18N
        btnContractRemove.setText("Remove");
        btnContractRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContractRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractRemoveActionPerformed(evt);
            }
        });

        btnContractClear.setBackground(new java.awt.Color(41, 41, 65));
        btnContractClear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnContractClear.setForeground(new java.awt.Color(255, 255, 255));
        btnContractClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Clear.png"))); // NOI18N
        btnContractClear.setText("Clear");
        btnContractClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContractClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractClearActionPerformed(evt);
            }
        });

        btnContractLogout.setBackground(new java.awt.Color(41, 41, 65));
        btnContractLogout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnContractLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnContractLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Logout.png"))); // NOI18N
        btnContractLogout.setText("Logout");
        btnContractLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContractLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractLogoutActionPerformed(evt);
            }
        });

        btnContractHelp.setBackground(new java.awt.Color(41, 41, 65));
        btnContractHelp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnContractHelp.setForeground(new java.awt.Color(255, 255, 255));
        btnContractHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Help.png"))); // NOI18N
        btnContractHelp.setText("Help");
        btnContractHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContractHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractHelpActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Table Filter:");

        javax.swing.GroupLayout pnlContractsLayout = new javax.swing.GroupLayout(pnlContracts);
        pnlContracts.setLayout(pnlContractsLayout);
        pnlContractsLayout.setHorizontalGroup(
            pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContractsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addGroup(pnlContractsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxContracts, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContractsLayout.createSequentialGroup()
                        .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContractDiscount)
                            .addComponent(jScrollPane11)
                            .addComponent(txtVendorID)))
                    .addGroup(pnlContractsLayout.createSequentialGroup()
                        .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addGroup(pnlContractsLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContractSearch)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContractSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlContractsLayout.createSequentialGroup()
                        .addComponent(btnContractAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContractUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContractRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContractClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContractHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContractLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlContractsLayout.setVerticalGroup(
            pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContractsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContractSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContractSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxContracts, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtVendorID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContractDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(pnlContractsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContractAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContractUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContractRemove)
                    .addComponent(btnContractClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContractLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContractHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCards.add(pnlContracts, "pnlContracts");

        pnlOrders.setBackground(new java.awt.Color(255, 255, 255));
        pnlOrders.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblOrders.setRowHeight(40);
        tblOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdersMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblOrders);

        OrderFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Vendor" }));
        OrderFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderFilterActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Filter Orders:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Search for Vendor Orders using VendorOrderlineID");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setText("Search:");

        btnOrderSearch.setBackground(new java.awt.Color(41, 41, 65));
        btnOrderSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/search.png"))); // NOI18N
        btnOrderSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrderSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderSearchActionPerformed(evt);
            }
        });

        jSeparator12.setBackground(new java.awt.Color(41, 41, 65));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setText("Place and update a Vendor Order");

        tblVendorProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblVendorProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendorProductsMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblVendorProducts);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel26.setText("VendorOrderlineID");

        tblVendorOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VendorOrderlineID", "Product_ID", "Quantity", "Status", "Total"
            }
        ));
        jScrollPane13.setViewportView(tblVendorOrder);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel27.setText("Product_ID");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel28.setText("Price");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel29.setText("Quantity");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel31.setText("Order Status");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel53.setText("VendorID");

        btnAddProducts.setBackground(new java.awt.Color(41, 41, 65));
        btnAddProducts.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAddProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Add.png"))); // NOI18N
        btnAddProducts.setText("Add Product");
        btnAddProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductsActionPerformed(evt);
            }
        });

        btnRemoveProducts.setBackground(new java.awt.Color(41, 41, 65));
        btnRemoveProducts.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnRemoveProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Remove.png"))); // NOI18N
        btnRemoveProducts.setText("Remove Product");
        btnRemoveProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveProductsActionPerformed(evt);
            }
        });

        txtVendorOrderlineID.setEditable(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel30.setText("Table Filter:");

        cBoxProductFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Products", "Vendors" }));
        cBoxProductFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxProductFilterActionPerformed(evt);
            }
        });

        btnPlaceOrder.setBackground(new java.awt.Color(41, 41, 65));
        btnPlaceOrder.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Add.png"))); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        cBoxOrdStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "N", "D" }));

        btnOrderUpdate.setBackground(new java.awt.Color(41, 41, 65));
        btnOrderUpdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnOrderUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Update.png"))); // NOI18N
        btnOrderUpdate.setText("Update Order Status");
        btnOrderUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrderUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderUpdateActionPerformed(evt);
            }
        });

        btnOrderLogout.setBackground(new java.awt.Color(41, 41, 65));
        btnOrderLogout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnOrderLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Logout.png"))); // NOI18N
        btnOrderLogout.setText("Logout");
        btnOrderLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrderLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderLogoutActionPerformed(evt);
            }
        });

        btnOrderHelp.setBackground(new java.awt.Color(41, 41, 65));
        btnOrderHelp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnOrderHelp.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Help.png"))); // NOI18N
        btnOrderHelp.setText("Help");
        btnOrderHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrderHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOrdersLayout = new javax.swing.GroupLayout(pnlOrders);
        pnlOrders.setLayout(pnlOrdersLayout);
        pnlOrdersLayout.setHorizontalGroup(
            pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addComponent(jSeparator12)
                    .addComponent(jScrollPane12)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlOrdersLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cBoxProductFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOrdersLayout.createSequentialGroup()
                        .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(pnlOrdersLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOrderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOrderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlOrdersLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVendorOrderlineID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOrdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlOrdersLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrdVendorID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxOrdStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrderUpdate))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrdersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrdersLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OrderFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrdersLayout.createSequentialGroup()
                                .addComponent(btnOrderHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOrderLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrdersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnRemoveProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        pnlOrdersLayout.setVerticalGroup(
            pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30)
                    .addComponent(cBoxProductFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVendorOrderlineID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrdVendorID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxOrdStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrderUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrderLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrderHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCards.add(pnlOrders, "pnlOrders");

        pnlInvoices.setBackground(new java.awt.Color(255, 255, 255));
        pnlInvoices.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlInvoices.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Use ProviderID to search for a specific Invoice:");
        pnlInvoices.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setText("Search:");
        pnlInvoices.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));
        pnlInvoices.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 180, 30));

        jButton21.setBackground(new java.awt.Color(41, 41, 65));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/search.png"))); // NOI18N
        pnlInvoices.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, 30));

        tblInvoices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblInvoices.setRowHeight(80);
        jScrollPane7.setViewportView(tblInvoices);

        pnlInvoices.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 820, 510));

        btnGenInvoice.setBackground(new java.awt.Color(41, 41, 65));
        btnGenInvoice.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnGenInvoice.setForeground(new java.awt.Color(255, 255, 255));
        btnGenInvoice.setText("Generate Invoice");
        btnGenInvoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenInvoiceActionPerformed(evt);
            }
        });
        pnlInvoices.add(btnGenInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 160, 30));

        cBoxInvoices.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cBoxInvoices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Provider Invoices" }));
        cBoxInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxInvoicesActionPerformed(evt);
            }
        });
        pnlInvoices.add(cBoxInvoices, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 30));

        btnInvoiceLogout.setBackground(new java.awt.Color(41, 41, 65));
        btnInvoiceLogout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnInvoiceLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnInvoiceLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Logout.png"))); // NOI18N
        btnInvoiceLogout.setText("Logout");
        btnInvoiceLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInvoiceLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoiceLogoutActionPerformed(evt);
            }
        });
        pnlInvoices.add(btnInvoiceLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 730, 110, 30));

        btnInvoiceHelp.setBackground(new java.awt.Color(41, 41, 65));
        btnInvoiceHelp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnInvoiceHelp.setForeground(new java.awt.Color(255, 255, 255));
        btnInvoiceHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Help.png"))); // NOI18N
        btnInvoiceHelp.setText("Help");
        btnInvoiceHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlInvoices.add(btnInvoiceHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 730, 110, 30));

        pnlCards.add(pnlInvoices, "pnlInvoices");

        pnlSalesReport.setBackground(new java.awt.Color(255, 255, 255));
        pnlSalesReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlSalesReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable7.setRowHeight(80);
        jScrollPane8.setViewportView(jTable7);

        pnlSalesReport.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 76, 814, 510));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel51.setText("ABC Energy Sales Report");
        pnlSalesReport.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 14, -1, -1));

        jComboBox6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Vendor", "Customer" }));
        pnlSalesReport.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 150, 30));

        jComboBox7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "A", "B", "C", "D" }));
        pnlSalesReport.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 640, 160, 30));

        jButton25.setBackground(new java.awt.Color(41, 41, 65));
        jButton25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Generate Basic Sales Report");
        pnlSalesReport.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, -1, 30));

        jButton26.setBackground(new java.awt.Color(41, 41, 65));
        jButton26.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Generate Detailed Sales Report");
        pnlSalesReport.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, -1, 30));

        jButton27.setBackground(new java.awt.Color(41, 41, 65));
        jButton27.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Logout.png"))); // NOI18N
        jButton27.setText("Logout");
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSalesReport.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 730, 110, 30));

        jButton28.setBackground(new java.awt.Color(41, 41, 65));
        jButton28.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Help.png"))); // NOI18N
        jButton28.setText("Help");
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSalesReport.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 730, 110, 30));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Select which type of Provider Sales Report");
        pnlSalesReport.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        pnlCards.add(pnlSalesReport, "pnlSalesReport");

        jPanel1.add(pnlCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 840, 770));

        navPanelCards.setLayout(new java.awt.CardLayout());

        paneAdmin.setBackground(new java.awt.Color(41, 41, 65));
        paneAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Home.png"))); // NOI18N
        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHome.setPreferredSize(null);
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeMouseExited(evt);
            }
        });
        paneAdmin.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 210, 60));

        lblCustomers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Customer.png"))); // NOI18N
        lblCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCustomersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCustomersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCustomersMouseExited(evt);
            }
        });
        paneAdmin.add(lblCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 60));

        lblVendors.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVendors.setForeground(new java.awt.Color(255, 255, 255));
        lblVendors.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVendors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Vendors.png"))); // NOI18N
        lblVendors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVendors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVendorsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVendorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVendorsMouseExited(evt);
            }
        });
        paneAdmin.add(lblVendors, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 210, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/logo.png"))); // NOI18N
        jLabel2.setText("ABC Energy");
        paneAdmin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 50));

        lblContracts.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContracts.setForeground(new java.awt.Color(255, 255, 255));
        lblContracts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContracts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Contracts.png"))); // NOI18N
        lblContracts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblContracts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContractsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblContractsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblContractsMouseExited(evt);
            }
        });
        paneAdmin.add(lblContracts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 210, 60));

        lblInvoices.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInvoices.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoices.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInvoices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Invoices.png"))); // NOI18N
        lblInvoices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInvoices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInvoicesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInvoicesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInvoicesMouseExited(evt);
            }
        });
        paneAdmin.add(lblInvoices, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 210, 60));

        lblSalesReport.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSalesReport.setForeground(new java.awt.Color(255, 255, 255));
        lblSalesReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSalesReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Sales Report.png"))); // NOI18N
        lblSalesReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalesReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalesReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalesReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalesReportMouseExited(evt);
            }
        });
        paneAdmin.add(lblSalesReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 210, 60));

        lblProducts.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProducts.setForeground(new java.awt.Color(255, 255, 255));
        lblProducts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Products.png"))); // NOI18N
        lblProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblProductsMouseExited(evt);
            }
        });
        paneAdmin.add(lblProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 210, 60));
        paneAdmin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 10));
        paneAdmin.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 10));
        paneAdmin.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, 10));
        paneAdmin.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 210, 10));
        paneAdmin.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, 10));
        paneAdmin.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 210, 10));
        paneAdmin.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 210, 10));
        paneAdmin.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 210, 10));
        paneAdmin.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 800, 210, 10));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright ABC Energy 2022");
        paneAdmin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 810, 210, -1));

        lblQuotesStaffUser1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblQuotesStaffUser1.setForeground(new java.awt.Color(255, 255, 255));
        lblQuotesStaffUser1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQuotesStaffUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Quotes.png"))); // NOI18N
        paneAdmin.add(lblQuotesStaffUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, 60));

        lblOrdersStaffUser1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOrdersStaffUser1.setForeground(new java.awt.Color(255, 255, 255));
        lblOrdersStaffUser1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOrdersStaffUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Orders.png"))); // NOI18N
        paneAdmin.add(lblOrdersStaffUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 210, 60));

        navPanelCards.add(paneAdmin, "paneAdmin");

        paneDirector.setBackground(new java.awt.Color(41, 41, 65));
        paneDirector.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHomeDirector.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHomeDirector.setForeground(new java.awt.Color(255, 255, 255));
        lblHomeDirector.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHomeDirector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Home.png"))); // NOI18N
        lblHomeDirector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHomeDirector.setPreferredSize(null);
        lblHomeDirector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeDirectorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeDirectorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeDirectorMouseExited(evt);
            }
        });
        paneDirector.add(lblHomeDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 210, 60));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/logo.png"))); // NOI18N
        jLabel33.setText("ABC Energy");
        paneDirector.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 50));

        lblInvoicesDirector.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInvoicesDirector.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoicesDirector.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInvoicesDirector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Invoices.png"))); // NOI18N
        paneDirector.add(lblInvoicesDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 210, 60));

        lblSalesReportDirector.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSalesReportDirector.setForeground(new java.awt.Color(255, 255, 255));
        lblSalesReportDirector.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSalesReportDirector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Sales Report.png"))); // NOI18N
        paneDirector.add(lblSalesReportDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 60));
        paneDirector.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 10));
        paneDirector.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 10));
        paneDirector.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, 10));
        paneDirector.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 210, 10));
        paneDirector.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, 10));
        paneDirector.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 210, 10));
        paneDirector.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 210, 10));
        paneDirector.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 210, 10));
        paneDirector.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 800, 210, 10));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Copyright ABC Energy 2021");
        paneDirector.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 810, 210, -1));

        navPanelCards.add(paneDirector, "paneDirector");

        paneStaffUser.setBackground(new java.awt.Color(41, 41, 65));
        paneStaffUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHomeStaffUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHomeStaffUser.setForeground(new java.awt.Color(255, 255, 255));
        lblHomeStaffUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHomeStaffUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Home.png"))); // NOI18N
        lblHomeStaffUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHomeStaffUser.setPreferredSize(null);
        lblHomeStaffUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeStaffUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeStaffUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeStaffUserMouseExited(evt);
            }
        });
        paneStaffUser.add(lblHomeStaffUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 210, 60));

        lblQuotesStaffUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblQuotesStaffUser.setForeground(new java.awt.Color(255, 255, 255));
        lblQuotesStaffUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQuotesStaffUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Quotes.png"))); // NOI18N
        paneStaffUser.add(lblQuotesStaffUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 60));

        lblVendorsStaffUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVendorsStaffUser.setForeground(new java.awt.Color(255, 255, 255));
        lblVendorsStaffUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVendorsStaffUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Vendors.png"))); // NOI18N
        paneStaffUser.add(lblVendorsStaffUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 210, 60));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/logo.png"))); // NOI18N
        jLabel40.setText("ABC Energy");
        paneStaffUser.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 50));

        lblContractsStaffUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContractsStaffUser.setForeground(new java.awt.Color(255, 255, 255));
        lblContractsStaffUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContractsStaffUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Contracts.png"))); // NOI18N
        paneStaffUser.add(lblContractsStaffUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 210, 60));

        lblOrdersStaffUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOrdersStaffUser.setForeground(new java.awt.Color(255, 255, 255));
        lblOrdersStaffUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOrdersStaffUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Orders.png"))); // NOI18N
        paneStaffUser.add(lblOrdersStaffUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 210, 60));

        lblInvoicesStaffUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInvoicesStaffUser.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoicesStaffUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInvoicesStaffUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Invoices.png"))); // NOI18N
        paneStaffUser.add(lblInvoicesStaffUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 210, 60));

        lblProductsStaffUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProductsStaffUser.setForeground(new java.awt.Color(255, 255, 255));
        lblProductsStaffUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductsStaffUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Week_SQL/Products.png"))); // NOI18N
        lblProductsStaffUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProductsStaffUser.setPreferredSize(null);
        lblProductsStaffUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductsStaffUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProductsStaffUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblProductsStaffUserMouseExited(evt);
            }
        });
        paneStaffUser.add(lblProductsStaffUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 210, 60));
        paneStaffUser.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 10));
        paneStaffUser.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 10));
        paneStaffUser.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, 10));
        paneStaffUser.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 210, 10));
        paneStaffUser.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, 10));
        paneStaffUser.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 210, 10));
        paneStaffUser.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 210, 10));
        paneStaffUser.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 210, 10));
        paneStaffUser.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 800, 210, 10));

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Copyright ABC Energy 2021");
        paneStaffUser.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 810, 210, -1));

        navPanelCards.add(paneStaffUser, "paneStaffUser");

        jPanel1.add(navPanelCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 840));

        lblExit.setBackground(new java.awt.Color(204, 204, 204));
        lblExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblExitMouseReleased(evt);
            }
        });
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 60, 50));

        FrameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameDragMouseDragged(evt);
            }
        });
        FrameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameDragMousePressed(evt);
            }
        });
        jPanel1.add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 50));

        jPanel2.setBackground(new java.awt.Color(41, 41, 65));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 840));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse); 
    }//GEN-LAST:event_FrameDragMouseDragged

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed

    private void lblExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseReleased
        // TODO add your handling code here:
        System.exit(0); 
    }//GEN-LAST:event_lblExitMouseReleased

    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        // TODO add your handling code here:
        this.lblHome.setBackground(new Color(52, 52, 81));
        this.lblHome.setOpaque(true); 
    }//GEN-LAST:event_lblHomeMouseEntered

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        // TODO add your handling code here:
        this.lblHome.setBackground(new Color(41,41,65));
    }//GEN-LAST:event_lblHomeMouseExited

    private void lblProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductsMouseEntered
        // TODO add your handling code here:
        this.lblProducts.setBackground(new Color(52, 52, 81));
        this.lblProducts.setOpaque(true); 
    }//GEN-LAST:event_lblProductsMouseEntered

    private void lblProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductsMouseExited
        // TODO add your handling code here:
        this.lblProducts.setBackground(new Color(41,41,65));
    }//GEN-LAST:event_lblProductsMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        // TODO add your handling code here:
        this.lblExit.setBackground(Color.RED);
        this.lblExit.setForeground(Color.WHITE);
        this.lblExit.setOpaque(true); 
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        // TODO add your handling code here:
        this.lblExit.setBackground(new Color(41,41,65));               
    }//GEN-LAST:event_lblExitMouseExited

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlHome");        
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductsMouseClicked
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlProducts");
    }//GEN-LAST:event_lblProductsMouseClicked

    private void lblCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomersMouseClicked
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlCustomers");
        //this.removeMouseListener((MouseListener) this);  
        //this.lblCustomers.e
    }//GEN-LAST:event_lblCustomersMouseClicked

    private void lblCustomersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomersMouseEntered
        // TODO add your handling code here:
            this.lblCustomers.setBackground(new Color(52, 52, 81));
            this.lblCustomers.setOpaque(true);
    }//GEN-LAST:event_lblCustomersMouseEntered

    private void lblCustomersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustomersMouseExited
        // TODO add your handling code here:
        this.lblCustomers.setBackground(new Color(41,41,65));
    }//GEN-LAST:event_lblCustomersMouseExited

    private void btnChooseProductFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseProductFileActionPerformed
        // TODO add your handling code here:
        try{
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        this.txtProductFilePath.setText(filename); 
        }catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null,"File not found or File is too Large", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnChooseProductFileActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
         
        try{  

        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");
        
        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
        
            PreparedStatement ps=con.prepareStatement("insert into products (category_id, name, description, slug, price,date_view,counter) values(?,?,?,?,?,?,?)");
            ps.setInt(1,1);
            ps.setString(2,this.txtProductName.getText());
            ps.setString(3,this.txtProductDesciption.getText());
            ps.setString(4,this.txtProductName.getText());
            ps.setString(5,this.txtProductPrice.getText());              
            /*FileInputStream fin=new FileInputStream(this.txtProductFilePath.getText());
            ps.setBinaryStream(6,fin,fin.available());*/
            ps.setDate(6,sqlDate);
            ps.setInt(7,0);                     
            ps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Success!");
        }catch (ClassNotFoundException | NullPointerException | SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"File is too Large or information is missing", "Error",JOptionPane.ERROR_MESSAGE);
        }          
 
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnCustomerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerSearchActionPerformed
     try{
            dbCon= getDBConnection();
            String query="Select * from users WHERE UPPER(lastname) = UPPER(?)";
            ps=dbCon.prepareStatement(query);
            ps.setString(1, txtCustSearch.getText());                    
            rs=ps.executeQuery();
                                
            TableModel model = DbUtils.resultSetToTableModel(rs);
            if (model.getRowCount()==0) 
            {
                // Row coount = 0 Throw Error message
                JOptionPane.showMessageDialog(null, "User does not exist"," Error",JOptionPane.ERROR_MESSAGE);
                 
            } 
            else 
            {
                tblCustomer.setModel(model);
            }
                                          
        }catch(SQLException e)
        {
       
                JOptionPane.showMessageDialog(null, "Error"," User deos not exist",JOptionPane.ERROR_MESSAGE);       
        }
        
    }//GEN-LAST:event_btnCustomerSearchActionPerformed

    private void lblHomeDirectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeDirectorMouseClicked
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlHome");  
    }//GEN-LAST:event_lblHomeDirectorMouseClicked

    private void lblHomeDirectorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeDirectorMouseEntered
        // TODO add your handling code here:
        this.lblHomeDirector.setBackground(new Color(52, 52, 81));
        this.lblHomeDirector.setOpaque(true); 
    }//GEN-LAST:event_lblHomeDirectorMouseEntered

    private void lblHomeDirectorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeDirectorMouseExited
        // TODO add your handling code here:
        this.lblHomeDirector.setBackground(new Color(41,41,65));
    }//GEN-LAST:event_lblHomeDirectorMouseExited

    private void lblHomeStaffUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeStaffUserMouseClicked
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlHome"); 
    }//GEN-LAST:event_lblHomeStaffUserMouseClicked

    private void lblHomeStaffUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeStaffUserMouseEntered
        // TODO add your handling code here:
        this.lblHome.setBackground(new Color(52, 52, 81));
        this.lblHome.setOpaque(true); 
    }//GEN-LAST:event_lblHomeStaffUserMouseEntered

    private void lblHomeStaffUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeStaffUserMouseExited
        // TODO add your handling code here:
        this.lblCustomers.setBackground(new Color(41,41,65));
    }//GEN-LAST:event_lblHomeStaffUserMouseExited

    private void lblProductsStaffUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductsStaffUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblProductsStaffUserMouseClicked

    private void lblProductsStaffUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductsStaffUserMouseEntered
        // TODO add your handling code here:
        this.lblProducts.setBackground(new Color(52, 52, 81));
        this.lblProducts.setOpaque(true); 
    }//GEN-LAST:event_lblProductsStaffUserMouseEntered

    private void lblProductsStaffUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductsStaffUserMouseExited
        // TODO add your handling code here:
        this.lblProducts.setBackground(new Color(41,41,65));
    }//GEN-LAST:event_lblProductsStaffUserMouseExited

    private void btnHomeLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeLogoutActionPerformed
        // TODO add your handling code here:
        Logout();
    }//GEN-LAST:event_btnHomeLogoutActionPerformed

    private void lblVendorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendorsMouseEntered
        // TODO add your handling code here:
        this.lblVendors.setBackground(new Color(52, 52, 81));
        this.lblVendors.setOpaque(true); 
    }//GEN-LAST:event_lblVendorsMouseEntered

    private void lblVendorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendorsMouseExited
        // TODO add your handling code here:
        this.lblVendors.setBackground(new Color(41,41,65));
    }//GEN-LAST:event_lblVendorsMouseExited

    private void lblVendorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendorsMouseClicked
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlVendors");
    }//GEN-LAST:event_lblVendorsMouseClicked

    private void cBoxInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxInvoicesActionPerformed

    if("Customer Invoices".equals(this.cBoxInvoices.getSelectedItem().toString()))
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="SELECT details.id AS DetailsID,sales.id AS SalesID,products.id AS ProductID, products.price AS Price,details.quantity AS Quantity, products.price * details.quantity AS Total FROM details LEFT JOIN products ON products.id=details.product_id LEFT JOIN sales ON sales.id=details.sales_id";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblInvoices.setModel(DbUtils.resultSetToTableModel(rs));
            

            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    else if("Vendor Invoices".equals(this.cBoxInvoices.getSelectedItem().toString()))
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="SELECT vendororderlines.id AS VendorOrderID,vendororderlines.VendorOrderlineID,products.id AS ProductID, products.price AS Price,vendororderlines.VendOrdQuantity AS Quantity, vendororderlines.VendOrdStatus AS OrderStatus, vendororderlines.Total FROM vendororderlines LEFT JOIN products ON products.id=vendororderlines.product_id WHERE vendororderlines.VendOrdStatus='D'";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblInvoices.setModel(DbUtils.resultSetToTableModel(rs));
            

            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_cBoxInvoicesActionPerformed

    private void CboxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxCategoryActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        String catName = (String) this.CboxCategory.getSelectedItem();
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="Select id from Category Where name="+catName;
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);          

            while(rs.next())
            {   
                catID=rs.getInt(1); 
                System.out.println("catID= "+catID);
            }
         
       
            
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CboxCategoryActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnCustLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustLogoutActionPerformed
        // TODO add your handling code here:
        Logout();
    }//GEN-LAST:event_btnCustLogoutActionPerformed

    private void btnHomeHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeHelpActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(null, "Use the buttons to navigate to your desired area"
            ,"Help",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHomeHelpActionPerformed

    private void btnProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductSearchActionPerformed
        // TODO add your handling code here:
          try{
            dbCon= getDBConnection();
            String query="Select * from products WHERE id=?";
            ps=dbCon.prepareStatement(query);
            ps.setString(1, txtProductSearch.getText());                    
            rs=ps.executeQuery();
                                
            TableModel model = DbUtils.resultSetToTableModel(rs);
            if (model.getRowCount()==0) 
            {
                // Row coount = 0 Throw Error message
                JOptionPane.showMessageDialog(null, "Product does not exist"," Error",JOptionPane.ERROR_MESSAGE);
                 
            } 
            else 
            {
                tblProduct.setModel(model);
            }
                                          
        }catch(SQLException e)
        {
       
                JOptionPane.showMessageDialog(null, "Error"," Product deos not exist",JOptionPane.ERROR_MESSAGE);       
        }
    }//GEN-LAST:event_btnProductSearchActionPerformed

    private void btnQuoteSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuoteSearchActionPerformed
        // TODO add your handling code here:
        try{
            dbCon= getDBConnection();
            String query="Select * from quotes WHERE QuoteID=?";
            ps=dbCon.prepareStatement(query);
            ps.setString(1, txtQuoteSearch.getText());                    
            rs=ps.executeQuery();
                                
            TableModel model = DbUtils.resultSetToTableModel(rs);
            if (model.getRowCount()==0) 
            {
                // Row coount = 0 Throw Error message
                JOptionPane.showMessageDialog(null, "Quote does not exist"," Error",JOptionPane.ERROR_MESSAGE);
                 
            } 
            else 
            {
                tblQuotes.setModel(model);
            }
                                          
        }catch(SQLException e)
        {
       
                JOptionPane.showMessageDialog(null, "Error"," Quote deos not exist",JOptionPane.ERROR_MESSAGE);       
        }
    }//GEN-LAST:event_btnQuoteSearchActionPerformed

    private void tblQuotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuotesMouseClicked
        // TODO add your handling code here:
        int rowIndex = tblQuotes.getSelectedRow();

        //Retreives QuoteID from Selected row and sets that into variable
        quoteID=Integer.parseInt(tblQuotes.getValueAt(rowIndex, 0).toString()); 
        this.txtQuoteEmail.setText(tblQuotes.getValueAt(rowIndex, 1).toString());
        this.txtaQuotes.setText(tblQuotes.getValueAt(rowIndex, 2).toString());
        this.txtQuoteTotal.setText(tblQuotes.getValueAt(rowIndex, 3).toString());
        this.cBoxQuoteStatus.setSelectedItem(tblQuotes.getValueAt(rowIndex, 4).toString()); 
    }//GEN-LAST:event_tblQuotesMouseClicked

    private void btnQuoteUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuoteUpdateActionPerformed
        // TODO add your handling code here:
        try{  

        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");
        
        char status;
        status=this.cBoxQuoteStatus.getSelectedItem().toString().charAt(0); 
        
            PreparedStatement ps=con.prepareStatement("Update Quotes SET QuoteTotal=?,QuoteStatus=? Where QuoteID="+this.quoteID);
            ps.setString(1,this.txtQuoteTotal.getText());
            ps.setString(2, String.valueOf(status));
                    
            ps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Success!");
            refreshConnection();
        }catch (ClassNotFoundException | NullPointerException | SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Information is missing or incorrect", "Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnQuoteUpdateActionPerformed

    private void btnVendorLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendorLogoutActionPerformed
        // TODO add your handling code here:
        Logout();
    }//GEN-LAST:event_btnVendorLogoutActionPerformed

    private void btnVendorAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendorAddActionPerformed
        // TODO add your handling code here:
        try{  

        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");
        
        
            PreparedStatement ps=con.prepareStatement("insert into Vendor (VendorName, VendorEmail, VendorAddress, VendorPostcode,VendorPhone) values(?,?,?,?,?)");
            ps.setString(1,this.txtVendorName.getText());
            ps.setString(2,this.txtVendorEmail.getText());
            ps.setString(3,this.txtVendorAddress.getText());
            ps.setString(4,this.txtVendorPostcode.getText());
            ps.setString(5,this.txtVendorPhone.getText());              
                   
            ps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Success!");
            refreshConnection();
            this.txtVendorName.setText(" ");
            this.txtVendorEmail.setText(" ");
            this.txtVendorAddress.setText(" ");
            this.txtVendorPostcode.setText(" ");
            this.txtVendorPhone.setText(" ");
        }catch (ClassNotFoundException | NullPointerException | SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Information is missing or incorrect", "Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnVendorAddActionPerformed

    private void btnVendorUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendorUpdateActionPerformed
        // TODO add your handling code here:
        try{  

        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");
        
        char status;
        status=this.cBoxQuoteStatus.getSelectedItem().toString().charAt(0); 
        
            PreparedStatement ps=con.prepareStatement("Update Vendor SET VendorName=?, VendorEmail=?, VendorAddress=?, VendorPostcode=?,VendorPhone=? Where VendorID="+this.VendorID);
            ps.setString(1,this.txtVendorName.getText());
            ps.setString(2,this.txtVendorEmail.getText());
            ps.setString(3,this.txtVendorAddress.getText());
            ps.setString(4,this.txtVendorPostcode.getText());
            ps.setString(5,this.txtVendorPhone.getText()); 
                    
            ps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Success!");
            refreshConnection();
            this.txtVendorName.setText(" ");
            this.txtVendorEmail.setText(" ");
            this.txtVendorAddress.setText(" ");
            this.txtVendorPostcode.setText(" ");
            this.txtVendorPhone.setText(" ");
        }catch (ClassNotFoundException | NullPointerException | SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Information is missing or incorrect", "Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnVendorUpdateActionPerformed

    private void tblVendorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendorsMouseClicked
        int rowIndex = tblVendors.getSelectedRow();

        //Retreives QuoteID from Selected row and sets that into variable
        VendorID=Integer.parseInt(tblVendors.getValueAt(rowIndex, 0).toString()); 
        this.txtVendorName.setText(tblVendors.getValueAt(rowIndex, 1).toString());
        this.txtVendorEmail.setText(tblVendors.getValueAt(rowIndex, 2).toString());
        this.txtVendorAddress.setText(tblVendors.getValueAt(rowIndex, 3).toString());
        this.txtVendorPostcode.setText(tblVendors.getValueAt(rowIndex, 4).toString());
        this.txtVendorPhone.setText(tblVendors.getValueAt(rowIndex, 5).toString());
    }//GEN-LAST:event_tblVendorsMouseClicked

    private void btnVendorSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendorSearchActionPerformed
        // TODO add your handling code here:
             try{
            dbCon= getDBConnection();
            String query="Select * from Vendor WHERE UPPER(Vendorname) = UPPER(?)";
            ps=dbCon.prepareStatement(query);
            ps.setString(1, txtVendorSearch.getText());                    
            rs=ps.executeQuery();
                                
            TableModel model = DbUtils.resultSetToTableModel(rs);
            if (model.getRowCount()==0) 
            {
                // Row coount = 0 Throw Error message
                JOptionPane.showMessageDialog(null, "Vendor does not exist"," Error",JOptionPane.ERROR_MESSAGE);
                 
            } 
            else 
            {
                tblVendors.setModel(model);
            }
                                          
        }catch(SQLException e)
        {
       
                JOptionPane.showMessageDialog(null, "Error"," Vendor deos not exist",JOptionPane.ERROR_MESSAGE);       
        }
    }//GEN-LAST:event_btnVendorSearchActionPerformed

    private void btnVendorRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendorRemoveActionPerformed
        try{  

        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");

            PreparedStatement ps=con.prepareStatement("Delete from Vendor WHERE VendorID=?");
            ps.setInt(1,VendorID);
     
            ps.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Success!");
            refreshConnection();
            this.txtVendorName.setText(" ");
            this.txtVendorEmail.setText(" ");
            this.txtVendorAddress.setText(" ");
            this.txtVendorPostcode.setText(" ");
            this.txtVendorPhone.setText(" ");
        }catch (ClassNotFoundException | NullPointerException | SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Information is missing or incorrect", "Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnVendorRemoveActionPerformed

    private void btnVendorClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendorClearActionPerformed
        // TODO add your handling code here:
            this.txtVendorName.setText(" ");
            this.txtVendorEmail.setText(" ");
            this.txtVendorAddress.setText(" ");
            this.txtVendorPostcode.setText(" ");
            this.txtVendorPhone.setText(" ");
    }//GEN-LAST:event_btnVendorClearActionPerformed

    private void btnVendorHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendorHelpActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Add, Update and Delete Vendors by searching and selecting a specific Vendor", "Help",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnVendorHelpActionPerformed

    private void OrderFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderFilterActionPerformed
    if("Customer".equals(this.OrderFilter.getSelectedItem().toString()))
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="SELECT details.id AS DetailsID,sales.id AS SalesID,products.id AS ProductID, products.price AS Price,details.quantity AS Quantity, products.price * details.quantity AS Total FROM details LEFT JOIN products ON products.id=details.product_id LEFT JOIN sales ON sales.id=details.sales_id";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblOrders.setModel(DbUtils.resultSetToTableModel(rs));
            

            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    else if("Vendor".equals(this.OrderFilter.getSelectedItem().toString()))
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="SELECT vendororderlines.id AS VendorOrderID,vendororderlines.VendorOrderlineID,products.id AS ProductID, products.price AS Price,vendororderlines.VendOrdQuantity AS Quantity, vendororderlines.VendOrdStatus AS OrderStatus, vendororderlines.Total FROM vendororderlines LEFT JOIN products ON products.id=vendororderlines.product_id";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblOrders.setModel(DbUtils.resultSetToTableModel(rs));
            

            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_OrderFilterActionPerformed

    private void lblContractsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContractsMouseEntered
        // TODO add your handling code here:
        this.lblContracts.setBackground(new Color(52, 52, 81));
        this.lblContracts.setOpaque(true);
    }//GEN-LAST:event_lblContractsMouseEntered

    private void lblContractsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContractsMouseExited
        // TODO add your handling code here:
        this.lblContracts.setBackground(new Color(41,41,65));
    }//GEN-LAST:event_lblContractsMouseExited

    private void lblContractsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContractsMouseClicked
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlContracts");
    }//GEN-LAST:event_lblContractsMouseClicked

    private void lblInvoicesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvoicesMouseEntered
        // TODO add your handling code here:
        this.lblInvoices.setBackground(new Color(52, 52, 81));
        this.lblInvoices.setOpaque(true);
    }//GEN-LAST:event_lblInvoicesMouseEntered

    private void lblInvoicesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvoicesMouseExited
        // TODO add your handling code here:
        this.lblInvoices.setBackground(new Color(41,41,65));
    }//GEN-LAST:event_lblInvoicesMouseExited

    private void lblInvoicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvoicesMouseClicked
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlInvoices");
    }//GEN-LAST:event_lblInvoicesMouseClicked

    private void lblSalesReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalesReportMouseEntered
        // TODO add your handling code here:
        this.lblSalesReport.setBackground(new Color(52, 52, 81));
        this.lblSalesReport.setOpaque(true);
    }//GEN-LAST:event_lblSalesReportMouseEntered

    private void lblSalesReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalesReportMouseExited
        // TODO add your handling code here:
        this.lblSalesReport.setBackground(new Color(41,41,65));
    }//GEN-LAST:event_lblSalesReportMouseExited

    private void lblSalesReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalesReportMouseClicked
        // TODO add your handling code here:
        cardLayout.show(pnlCards, "pnlSalesReport");
    }//GEN-LAST:event_lblSalesReportMouseClicked

    private void cBoxContractsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxContractsActionPerformed
        // TODO add your handling code here:
        if("Contracts".equals(this.cBoxContracts.getSelectedItem().toString()))
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="SELECT * from Contracts";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblContracts.setModel(DbUtils.resultSetToTableModel(rs));
            

            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    else if("Vendors".equals(this.cBoxContracts.getSelectedItem().toString()))
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="SELECT * from Vendor";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblContracts.setModel(DbUtils.resultSetToTableModel(rs));
            

            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_cBoxContractsActionPerformed

    private void btnQuoteClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuoteClearActionPerformed
        // TODO add your handling code here:
        this.txtQuoteEmail.setText(" ");
        this.txtQuoteTotal.setText(" ");
        this.txtaQuotes.setText(" ");
        this.cBoxQuoteStatus.setSelectedItem("None"); 
    }//GEN-LAST:event_btnQuoteClearActionPerformed

    private void btnQuoteLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuoteLogoutActionPerformed
        // TODO add your handling code here:
        Logout();
    }//GEN-LAST:event_btnQuoteLogoutActionPerformed

    private void btnQuoteHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuoteHelpActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Help"," Search and select a quote within the table and then update that record accordingly",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnQuoteHelpActionPerformed

    private void tblContractsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContractsMouseClicked
    if("Contracts".equals(this.cBoxContracts.getSelectedItem().toString()))
    {
        int rowIndex = tblContracts.getSelectedRow();

        //Retreives QuoteID from Selected row and sets that into variable
        ContractID=Integer.parseInt(tblContracts.getValueAt(rowIndex, 0).toString()); 
        this.txtVendorID.setText(tblContracts.getValueAt(rowIndex, 1).toString());
        this.txtaContractDesc.setText(tblContracts.getValueAt(rowIndex, 2).toString());
        this.txtContractDiscount.setText(tblContracts.getValueAt(rowIndex, 3).toString());

    }
    else if("Vendors".equals(this.cBoxContracts.getSelectedItem().toString()))
    {
        int rowIndex = tblContracts.getSelectedRow();
        this.txtVendorID.setText(tblContracts.getValueAt(rowIndex, 0).toString());
    }
    }//GEN-LAST:event_tblContractsMouseClicked

    private void btnContractClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractClearActionPerformed
        this.txtVendorID.setText(" ");
        this.txtaContractDesc.setText(" ");
        this.txtContractDiscount.setText(" ");
        
    }//GEN-LAST:event_btnContractClearActionPerformed

    private void btnContractLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractLogoutActionPerformed
    Logout();
    }//GEN-LAST:event_btnContractLogoutActionPerformed

    private void btnContractAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractAddActionPerformed
        try{  

        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");
        
        
            PreparedStatement ps=con.prepareStatement("insert into Contracts (VendorID, ContractDescription, ContractDiscount) values(?,?,?)");
            ps.setString(1,this.txtVendorID.getText());
            ps.setString(2,this.txtaContractDesc.getText());
            ps.setString(3,this.txtContractDiscount.getText());             
                   
            ps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Success!");
            refreshConnection();
            ContractFilter();
            this.txtVendorID.setText(" ");
            this.txtaContractDesc.setText(" ");
            this.txtContractDiscount.setText(" ");

        }catch (ClassNotFoundException | NullPointerException | SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Information is missing or incorrect", "Error",JOptionPane.ERROR_MESSAGE);
        } 
        
    }//GEN-LAST:event_btnContractAddActionPerformed

    private void btnContractUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractUpdateActionPerformed
        try{  

        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");        
        
            PreparedStatement ps=con.prepareStatement("Update Contracts SET VendorID=?, ContractDescription=?, ContractDiscount=? Where ContractID="+this.ContractID);
            ps.setString(1,this.txtVendorID.getText());
            ps.setString(2,this.txtaContractDesc.getText());
            ps.setString(3,this.txtContractDiscount.getText());
                    
            ps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Success!");
            refreshConnection();
            ContractFilter();
            this.txtVendorID.setText(" ");
            this.txtaContractDesc.setText(" ");
            this.txtContractDiscount.setText(" ");
        }catch (ClassNotFoundException | NullPointerException | SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Information is missing or incorrect", "Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnContractUpdateActionPerformed

    private void btnContractRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractRemoveActionPerformed
        try{  

        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");

            PreparedStatement ps=con.prepareStatement("Delete from Contracts WHERE ContractID=?");
            ps.setInt(1,ContractID);
     
            ps.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Success!");
            refreshConnection();
            ContractFilter();
            this.txtVendorName.setText(" ");
            this.txtVendorEmail.setText(" ");
            this.txtVendorAddress.setText(" ");
            this.txtVendorPostcode.setText(" ");
            this.txtVendorPhone.setText(" ");
        }catch (ClassNotFoundException | NullPointerException | SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Information is missing or incorrect", "Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnContractRemoveActionPerformed

    private void btnContractHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractHelpActionPerformed
    JOptionPane.showMessageDialog(null,"Help"," Search and select a contract within the table and then update that record accordingly or create a new contract",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnContractHelpActionPerformed

    private void btnContractSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractSearchActionPerformed
        // TODO add your handling code here:
        try{
            dbCon= getDBConnection();
            String query="Select * from Contracts WHERE ContractID=?";
            ps=dbCon.prepareStatement(query);
            ps.setString(1, txtContractSearch.getText());                    
            rs=ps.executeQuery();
                                
            TableModel model = DbUtils.resultSetToTableModel(rs);
            if (model.getRowCount()==0) 
            {
                // Row coount = 0 Throw Error message
                JOptionPane.showMessageDialog(null, "Contract does not exist"," Error",JOptionPane.ERROR_MESSAGE);
                 
            } 
            else 
            {
                tblContracts.setModel(model);
            }
                                          
        }catch(SQLException e)
        {
       
                JOptionPane.showMessageDialog(null, "Error"," Contract deos not exist",JOptionPane.ERROR_MESSAGE);       
        }
    }//GEN-LAST:event_btnContractSearchActionPerformed

    private void btnAddProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductsActionPerformed
        // TODO add your handling code here:
        
        try{
        char ordStatus='N';
        float qty=Float.parseFloat(txtQuantity.getText());      
        float price=Float.parseFloat(txtOrdPrice.getText());               
        float total=price*qty;
        
        
        DefaultTableModel model=(DefaultTableModel)tblVendorOrder.getModel();
                    model.addRow(new Object[]
                    {
                        txtVendorOrderlineID.getText(),
                        txtProductID.getText(),
                        txtQuantity.getText(),
                        ordStatus,
                        total,            
                    }
        
                    );
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Require field missing"," Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddProductsActionPerformed

    private void tblVendorProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendorProductsMouseClicked
        // TODO add your handling code here:
     
    if("Products".equals(this.cBoxProductFilter.getSelectedItem().toString()))
    {
         try{
        int rowIndex = tblVendorProducts.getSelectedRow();
        //Retreives ProductID from Selected row and sets that into variable       
        this.txtProductID.setText(tblVendorProducts.getValueAt(rowIndex, 0).toString());
        this.txtOrdPrice.setText(tblVendorProducts.getValueAt(rowIndex, 2).toString());
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Error"," Require field missing",JOptionPane.ERROR_MESSAGE);
        }
    }
    else if("Vendors".equals(this.cBoxProductFilter.getSelectedItem().toString()))
    {
       try{
        int rowIndex = tblVendorProducts.getSelectedRow();
        //Retreives VendorID from Selected row and sets that into variable       
        this.txtOrdVendorID.setText(tblVendorProducts.getValueAt(rowIndex, 0).toString());

        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Error"," Require field missing",JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_tblVendorProductsMouseClicked

    private void btnRemoveProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveProductsActionPerformed
        // TODO add your handling code here:
        try{
            DefaultTableModel model=(DefaultTableModel)tblVendorOrder.getModel();
            model.removeRow(tblVendorOrder.getSelectedRow());
        }catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "Error"," Require field missing",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveProductsActionPerformed

    private void cBoxProductFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxProductFilterActionPerformed
    if("Products".equals(this.cBoxProductFilter.getSelectedItem().toString()))
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="Select id AS ProductID,name AS Name,price AS Price from Products";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblVendorProducts.setModel(DbUtils.resultSetToTableModel(rs));
            

            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    else if("Vendors".equals(this.cBoxProductFilter.getSelectedItem().toString()))
    {
               try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="Select * from Vendor";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblVendorProducts.setModel(DbUtils.resultSetToTableModel(rs));
            

            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_cBoxProductFilterActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        try{    
            //Getting connection to database
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");
            //Inserting values into Orders table
            PreparedStatement ps=con.prepareStatement("insert into VendorOrderlines (VendorOrderlineID,product_id,VendOrdQuantity,VendOrdStatus, Total) values(?,?,?,?,?)");
              
            //Inserting values into VendorOrderLine table
            for(int t=0;t<tblVendorOrder.getRowCount();t++)
            {
                ps.setString(1,tblVendorOrder.getValueAt(t, 0).toString());
                ps.setString(2,tblVendorOrder.getValueAt(t, 1).toString());
                ps.setString(3,tblVendorOrder.getValueAt(t, 2).toString());
                ps.setString(4,tblVendorOrder.getValueAt(t, 3).toString());
                ps.setString(5,tblVendorOrder.getValueAt(t, 4).toString());
                ps.executeUpdate();
            }
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");
            ps=con.prepareStatement("insert into VendorOrders (VendorOrderlineID,VendorID,OrderDate) values(?,?,?)");
            //Inserting values into VendorOrders table
            ps.setString(1,this.txtVendorOrderlineID.getText());
            ps.setString(2,this.txtOrdVendorID.getText());
            ps.setDate(3,sqlDate);
            ps.executeUpdate();
            
               JOptionPane.showMessageDialog(this, "Order has been Successfully Placed");
               refreshConnection();
               
               DefaultTableModel model=(DefaultTableModel)tblVendorOrder.getModel();
               model.setRowCount(0);
        }catch (ClassNotFoundException | NullPointerException | SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Information is missing or incorrect", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnOrderUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderUpdateActionPerformed
        try{  

        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm","root","");        
            
        char status;
        status=this.cBoxOrdStatus.getSelectedItem().toString().charAt(0);
        
            PreparedStatement ps=con.prepareStatement("Update VendorOrderlines SET VendOrdStatus=? Where VendorOrderlineID="+this.vendorOrderlineID);
            ps.setString(1,String.valueOf(status));

                    
            ps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Success!");
            refreshConnection();

        }catch (ClassNotFoundException | NullPointerException | SQLException e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Information is missing or incorrect", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOrderUpdateActionPerformed

    private void tblOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdersMouseClicked
    if("Customer".equals(this.OrderFilter.getSelectedItem().toString()))
    {
        
    }
    else if("Vendor".equals(this.OrderFilter.getSelectedItem().toString()))
    {
       int rowIndex = tblOrders.getSelectedRow();
       vendorOrderlineID=Integer.parseInt(tblOrders.getValueAt(rowIndex, 1).toString()); 
    }
    }//GEN-LAST:event_tblOrdersMouseClicked

    private void btnOrderSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderSearchActionPerformed
        try{
            dbCon= getDBConnection();
            String query="Select * from VendorOrderlines WHERE VendorOrderlineID=?";
            ps=dbCon.prepareStatement(query);
            ps.setString(1, txtOrderSearch.getText());                    
            rs=ps.executeQuery();
                                
            TableModel model = DbUtils.resultSetToTableModel(rs);
            if (model.getRowCount()==0) 
            {
                // Row coount = 0 Throw Error message
                JOptionPane.showMessageDialog(null, "Contract does not exist"," Error",JOptionPane.ERROR_MESSAGE);
                 
            } 
            else 
            {
                tblOrders.setModel(model);
            }
                                          
        }catch(SQLException e)
        {
       
                JOptionPane.showMessageDialog(null, "Error"," Contract deos not exist",JOptionPane.ERROR_MESSAGE);       
        }        
    }//GEN-LAST:event_btnOrderSearchActionPerformed

    private void btnOrderLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderLogoutActionPerformed
        // TODO add your handling code here:
        Logout();
    }//GEN-LAST:event_btnOrderLogoutActionPerformed

    private void btnOrderHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHelpActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Search and select a order within the table and then update that record accordingly or create a new order by adding products to your order","Help",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnOrderHelpActionPerformed

    private void btnCustHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustHelpActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Search for a Customer using the Customers Surname","Help",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCustHelpActionPerformed

    private void btnGenInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenInvoiceActionPerformed
        // TODO add your handling code here:
        if("Customer Invoices".equals(this.cBoxInvoices.getSelectedItem().toString()))
        {
        Connection dbConnection=null;
        Statement statement=null;
        ResultSet resultset=null;
        
        Connection con=null;
        Statement stat=null;
        ResultSet rs=null;
        
        FileWriter fw=null;  //Used to stream objects
        BufferedWriter bw=null;  //to make good saving and more efficient 
    try{ 
        int rowIndex = tblInvoices.getSelectedRow();
        //String query="Select OrderID,PartID,CustomerID,OrdQuantity,Total,OrderDate,DeliveryAddress from OrderLine Join Orders Using(OrderID) Where OrderID = "+ table1.getValueAt(rowIndex, 0).toString();
        String query="SELECT details.id AS DetailsID,sales.id AS SalesID,products.id AS ProductID, products.price AS Price,details.quantity AS Quantity, products.price * details.quantity AS Total FROM details LEFT JOIN products ON products.id=details.product_id LEFT JOIN sales ON sales.id=details.sales_id Where sales.id= "+ tblInvoices.getValueAt(rowIndex, 1); 
        String query2="select SUM(products.price * details.quantity) from Details LEFT JOIN products ON products.id=details.product_id LEFT JOIN sales ON sales.id=details.sales_id Where sales.id='"+tblInvoices.getValueAt(rowIndex, 1)+"' GROUP BY sales.id";
    
           
        //Generating Main Invoice Details
        dbConnection = getDBConnection();
        statement = dbConnection.createStatement();
        System.out.print(query);
        System.out.println("Invoice");
        resultset = statement.executeQuery(query);
        
        //Total Cost
        con = getDBConnection();
        stat = con.createStatement();
        System.out.print(query);
        System.out.println("Invoice");
        rs = stat.executeQuery(query2);
                     
        fw=new FileWriter("ABCEnergyCustomerInvoice.txt");
        bw=new BufferedWriter(fw); //buffer
        PrintWriter pw=new PrintWriter(bw);//print doc
        
        pw.println("ABC Energy Customer Invoice");       
        pw.write(System.getProperty("line.separator"));
        pw.write(System.getProperty("line.separator"));
        pw.println("ABC Energy" +"\n"+ "Manchester Street" +"\n"+"M1 3HH");        
        pw.write(System.getProperty("line.separator"));
        pw.write(System.getProperty("line.separator"));
        pw.println("Products");
        pw.println("--------------------");
        pw.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s \r\n","ID","SalesID","ProductsID","Price","Quantity","Total"));     
        while(resultset.next())
        {
            pw.println(String.format(" %-20s %-20s %-20s %-20s %-20s %-20s\r\n", resultset.getInt(1)
            ,resultset.getInt(2),resultset.getInt(3),resultset.getString("price"),resultset.getString("quantity"),resultset.getString("Total")));           
        }
        //JOptionPane.showMessageDialog(null, "Invoice Generated","Success",JOptionPane.INFORMATION_MESSAGE);
        if(rs.next())
        {
           double total=rs.getFloat(1); 
           System.out.println("Total: "+total);          
           double vat=total*0.2;
           DecimalFormat df = new DecimalFormat("####0.00");
           System.out.println("Value: " + df.format(total));
           pw.println("---------------------------------------------------------------------------------------------------------------------");
           pw.println(String.format("%-2s %-20s","Total Excluding VAT : £",df.format(total)));
           pw.println(String.format("%-2s %-20s","Total VAT @: £",df.format(vat)));
           pw.println(String.format("%-2s %-20s","The Total Including VAT is: £",df.format(total+vat)));
           JOptionPane.showMessageDialog(null, "Invoice Generated","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        
       }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Invoice not Selected"," Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("Error:"+e.getMessage());
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Invoice not Selected"," Error",JOptionPane.ERROR_MESSAGE);          
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
             JOptionPane.showMessageDialog(null, "Invoice not Selected"," Error",JOptionPane.ERROR_MESSAGE);       
        }
    
        finally{
        System.out.println("Invoice");
            //Close Connection
            if(statement != null)
                
            if(dbConnection != null)
            {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            if(resultset != null)
            {
            try {  
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
            }
            }  
            
              if(bw!=null)
            {
                try {
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(fw!=null)
            {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            }
        }
        else if("Vendor Invoices".equals(this.cBoxInvoices.getSelectedItem().toString()))
        {
        Connection dbConnection=null;
        Statement statement=null;
        ResultSet resultset=null;
        
        Connection con=null;
        Statement stat=null;
        ResultSet rs=null;
        
        FileWriter fw=null;  //Used to stream objects
        BufferedWriter bw=null;  //to make good saving and more efficient 
    try{ 
        int rowIndex = tblInvoices.getSelectedRow();
        //String query="Select OrderID,PartID,CustomerID,OrdQuantity,Total,OrderDate,DeliveryAddress from OrderLine Join Orders Using(OrderID) Where OrderID = "+ table1.getValueAt(rowIndex, 0).toString();
        String query="SELECT vendororderlines.id AS VendorOrderID,vendororderlines.VendorOrderlineID,products.id AS ProductID, products.price AS Price,vendororderlines.VendOrdQuantity AS Quantity,vendororderlines.Total FROM vendororderlines LEFT JOIN products ON products.id=vendororderlines.product_id WHERE vendororderlines.VendorOrderlineID= "+ tblInvoices.getValueAt(rowIndex, 1); 
        String query2="select SUM(Total) from vendororderlines Where VendorOrderlineID='"+tblInvoices.getValueAt(rowIndex, 1)+"' GROUP BY VendorOrderlineID";
    
           
        //Generating Main Invoice Details
        dbConnection = getDBConnection();
        statement = dbConnection.createStatement();
        System.out.print(query);
        System.out.println("Invoice");
        resultset = statement.executeQuery(query);
        
        //Total Cost
        con = getDBConnection();
        stat = con.createStatement();
        System.out.print(query);
        System.out.println("Invoice");
        rs = stat.executeQuery(query2);
                     
        fw=new FileWriter("ABCEnergyVendorInvoice.txt");
        bw=new BufferedWriter(fw); //buffer
        PrintWriter pw=new PrintWriter(bw);//print doc
        
        pw.println("ABC Energy  Vendor Invoice");       
        pw.write(System.getProperty("line.separator"));
        pw.write(System.getProperty("line.separator"));
        pw.println("ABC Energy" +"\n"+ "Manchester Street" +"\n"+"M1 3HH");        
        pw.write(System.getProperty("line.separator"));
        pw.write(System.getProperty("line.separator"));
        pw.println("Products");
        pw.println("--------------------");
        pw.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s \r\n","ID","VendorOrderlineID","ProductsID","Price","Quantity","Total"));     
        while(resultset.next())
        {
            pw.println(String.format(" %-20s %-20s %-20s %-20s %-20s %-20s\r\n", resultset.getInt(1)
            ,resultset.getInt(2),resultset.getInt(3),resultset.getString("price"),resultset.getString("Quantity"),resultset.getString("Total")));           
        }
        //JOptionPane.showMessageDialog(null, "Invoice Generated","Success",JOptionPane.INFORMATION_MESSAGE);
        if(rs.next())
        {
           double total=rs.getFloat(1); 
           System.out.println("Total: "+total);          
           double vat=total*0.2;
           DecimalFormat df = new DecimalFormat("####0.00");
           System.out.println("Value: " + df.format(total));
           pw.println("---------------------------------------------------------------------------------------------------------------------");
           pw.println(String.format("%-2s %-20s","Total Excluding VAT : £",df.format(total)));
           pw.println(String.format("%-2s %-20s","Total VAT @: £",df.format(vat)));
           pw.println(String.format("%-2s %-20s","The Total Including VAT is: £",df.format(total+vat)));
           JOptionPane.showMessageDialog(null, "Invoice Generated","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        
       }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Invoice not Selected"," Error",JOptionPane.ERROR_MESSAGE);
            System.out.println("Error:"+e.getMessage());
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Invoice not Selected"," Error",JOptionPane.ERROR_MESSAGE);          
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
             JOptionPane.showMessageDialog(null, "Invoice not Selected"," Error",JOptionPane.ERROR_MESSAGE);       
        }
    
        finally{
        System.out.println("Invoice");
            //Close Connection
            if(statement != null)
                
            if(dbConnection != null)
            {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            if(resultset != null)
            {
            try {  
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
            }
            }  
            
              if(bw!=null)
            {
                try {
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(fw!=null)
            {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            }
        }
    }//GEN-LAST:event_btnGenInvoiceActionPerformed

    private void btnInvoiceLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceLogoutActionPerformed
        // TODO add your handling code here:
        Logout();
    }//GEN-LAST:event_btnInvoiceLogoutActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

public void setDirectorView()
{
    this.paneDirector.setVisible(true); 
    this.paneAdmin.setVisible(false); 
    this.paneStaffUser.setVisible(false); 
}

public void setAdminView()
{
    this.paneDirector.setVisible(false); 
    this.paneAdmin.setVisible(true); 
    this.paneStaffUser.setVisible(false); 
}

public void setStaffUserView()
{
    this.paneDirector.setVisible(false); 
    this.paneAdmin.setVisible(false); 
    this.paneStaffUser.setVisible(true); 
}

public void ContractFilter()
{
            if("Contracts".equals(this.cBoxContracts.getSelectedItem().toString()))
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="SELECT * from Contracts";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblContracts.setModel(DbUtils.resultSetToTableModel(rs));
            

            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    else if("Vendors".equals(this.cBoxContracts.getSelectedItem().toString()))
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="SELECT * from Vendor";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblContracts.setModel(DbUtils.resultSetToTableModel(rs));
            

            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
public void Logout()
{
    Object[] options = {"Yes","No"};
    
        int n = JOptionPane.showOptionDialog(null,
            "Do you want to Logout?",
            "Logout",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
        
        if(n==0)
        {
            JOptionPane.showMessageDialog(null, "Ok Goodbye Then!");
            Login l=new Login();
            l.setVisible(true);
            this.setVisible(false); 
        }
        else if(n==1)
        {
            JOptionPane.showMessageDialog(null, "Thank You for staying");
        }       
}

public void refreshConnection()
    {
       try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        
        this.dbCon=null;
        String url="jdbc:mysql://localhost:3306/ecomm";
        String user="root";
        String password="";
        String query="Select * from products";
        String query2="SELECT COUNT(id) FROM Products";
        String queryVendor="Select * from Vendor";
        String query3="Select COUNT(VendorID) from Vendor";
        String query4="Select COUNT(QuoteID) from Quotes";
        String query5="Select * from Users";
        String query6="Select * from Quotes";
        String query7="Select * from Contracts";
        String query8="Select id AS ProductID,name AS Name,price AS Price from Products";
        String query9="Select COUNT(VendorOrderlineID) from VendorOrderlines";
        String query10="SELECT details.id AS DetailsID,sales.id AS SalesID,products.id AS ProductID, products.price AS Price,details.quantity AS Quantity, products.price * details.quantity AS Total FROM details LEFT JOIN products ON products.id=details.product_id LEFT JOIN sales ON sales.id=details.sales_id";
        
        try{
            //Products table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblProducts.setModel(DbUtils.resultSetToTableModel(rs));
            
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query);
            this.tblProduct.setModel(DbUtils.resultSetToTableModel(rs));
            
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query2);
            
            
            while(rs.next())
            {   
                this.lblProductNo.setText("" + rs.getInt(1));  
            }
            
            //Vendor table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(queryVendor);
            this.tblVendors.setModel(DbUtils.resultSetToTableModel(rs));
            
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query3);
            
            
            while(rs.next())
            {   
                this.lblVendorNo.setText("" + rs.getInt(1));  
            }
            
            //Quotes Table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query4);
            
            
            while(rs.next())
            {   
                this.lblQuotesNo.setText("" + rs.getInt(1));  
            }
         
            //Customer Table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query5);
            this.tblCustomer.setModel(DbUtils.resultSetToTableModel(rs));
            
            //Quotes Table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query6);
            this.tblQuotes.setModel(DbUtils.resultSetToTableModel(rs));
            
            //Contracts Table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query7);
            this.tblContracts.setModel(DbUtils.resultSetToTableModel(rs));
            
            //Vendor Products Table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query8);
            this.tblVendorProducts.setModel(DbUtils.resultSetToTableModel(rs));
            
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query9);
            
            
            while(rs.next())
            {   
                int venOrdID=rs.getInt(1);
                venOrdID=venOrdID+1;
                this.txtVendorOrderlineID.setText("" + venOrdID);  
            }
            
            //Orders Table
            this.dbCon=DriverManager.getConnection(url, user, password);
            this.stat=this.dbCon.createStatement();
            this.rs=this.stat.executeQuery(query10);
            this.tblOrders.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

     private static Connection getDBConnection()
    {
        Connection dbConnection = null;  
  
        try{

            String url="jdbc:mysql://localhost:3306/ecomm";
            String user="root";
            String password="";
            dbConnection = DriverManager.getConnection(url,user,password);
            System.out.println("successful connection");
        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    return dbConnection;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test2().setVisible(true);
            }
        });
    }
private int vendorOrderlineID;
private int ContractID=0;
private int VendorID=0;
private int quoteID=0;
private int catID=0;
LoginVerification login=new LoginVerification();  
private DBConnect db;
private Connection dbCon=null;
private Statement stat=null;
private ResultSet rs=null;
private PreparedStatement ps=null;
private CardLayout cardLayout;
int xMouse, yMouse;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxCategory;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JComboBox<String> OrderFilter;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnAddProducts;
    private javax.swing.JButton btnChooseProductFile;
    private javax.swing.JButton btnClearProduct;
    private javax.swing.JButton btnContractAdd;
    private javax.swing.JButton btnContractClear;
    private javax.swing.JButton btnContractHelp;
    private javax.swing.JButton btnContractLogout;
    private javax.swing.JButton btnContractRemove;
    private javax.swing.JButton btnContractSearch;
    private javax.swing.JButton btnContractUpdate;
    private javax.swing.JButton btnCustHelp;
    private javax.swing.JButton btnCustLogout;
    private javax.swing.JButton btnCustomerSearch;
    private javax.swing.JButton btnGenInvoice;
    private javax.swing.JButton btnHomeHelp;
    private javax.swing.JButton btnHomeLogout;
    private javax.swing.JButton btnInvoiceHelp;
    private javax.swing.JButton btnInvoiceLogout;
    private javax.swing.JButton btnOrderHelp;
    private javax.swing.JButton btnOrderLogout;
    private javax.swing.JButton btnOrderSearch;
    private javax.swing.JButton btnOrderUpdate;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnProductSearch;
    private javax.swing.JButton btnQuoteClear;
    private javax.swing.JButton btnQuoteHelp;
    private javax.swing.JButton btnQuoteLogout;
    private javax.swing.JButton btnQuoteSearch;
    private javax.swing.JButton btnQuoteUpdate;
    private javax.swing.JButton btnRemoveProduct;
    private javax.swing.JButton btnRemoveProducts;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JButton btnVendorAdd;
    private javax.swing.JButton btnVendorClear;
    private javax.swing.JButton btnVendorHelp;
    private javax.swing.JButton btnVendorLogout;
    private javax.swing.JButton btnVendorRemove;
    private javax.swing.JButton btnVendorSearch;
    private javax.swing.JButton btnVendorUpdate;
    private javax.swing.JComboBox<String> cBoxContracts;
    private javax.swing.JComboBox<String> cBoxInvoices;
    private javax.swing.JComboBox<String> cBoxOrdStatus;
    private javax.swing.JComboBox<String> cBoxProductFilter;
    private javax.swing.JComboBox<String> cBoxQuoteStatus;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JLabel lblContracts;
    private javax.swing.JLabel lblContractsStaffUser;
    private javax.swing.JLabel lblCustomers;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHomeDirector;
    private javax.swing.JLabel lblHomeStaffUser;
    private javax.swing.JLabel lblInvoices;
    private javax.swing.JLabel lblInvoicesDirector;
    private javax.swing.JLabel lblInvoicesStaffUser;
    private javax.swing.JLabel lblOrdersStaffUser;
    private javax.swing.JLabel lblOrdersStaffUser1;
    private javax.swing.JLabel lblProductNo;
    private javax.swing.JLabel lblProducts;
    private javax.swing.JLabel lblProductsStaffUser;
    private javax.swing.JLabel lblQuotesNo;
    private javax.swing.JLabel lblQuotesStaffUser;
    private javax.swing.JLabel lblQuotesStaffUser1;
    private javax.swing.JLabel lblSalesReport;
    private javax.swing.JLabel lblSalesReportDirector;
    private javax.swing.JLabel lblTest;
    private javax.swing.JLabel lblVendorNo;
    private javax.swing.JLabel lblVendors;
    private javax.swing.JLabel lblVendorsStaffUser;
    private javax.swing.JPanel navPanelCards;
    private javax.swing.JPanel paneAdmin;
    private javax.swing.JPanel paneDirector;
    private javax.swing.JPanel paneStaffUser;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlContracts;
    private javax.swing.JPanel pnlCustomer;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlInvoices;
    private javax.swing.JPanel pnlOrders;
    private javax.swing.JPanel pnlProducts;
    private javax.swing.JPanel pnlQuotes;
    private javax.swing.JPanel pnlSalesReport;
    private javax.swing.JPanel pnlVendors;
    private javax.swing.JTable tblContracts;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblInvoices;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTable tblQuotes;
    private javax.swing.JTable tblVendorOrder;
    private javax.swing.JTable tblVendorProducts;
    private javax.swing.JTable tblVendors;
    private javax.swing.JTextField txtContractDiscount;
    private javax.swing.JTextField txtContractSearch;
    private javax.swing.JTextField txtCustSearch;
    private javax.swing.JTextField txtOrdPrice;
    private javax.swing.JTextField txtOrdVendorID;
    private javax.swing.JTextField txtOrderSearch;
    private javax.swing.JTextField txtProductDesciption;
    private javax.swing.JTextField txtProductFilePath;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtProductQuantity;
    private javax.swing.JTextField txtProductSearch;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtQuoteEmail;
    private javax.swing.JTextField txtQuoteSearch;
    private javax.swing.JTextField txtQuoteTotal;
    private javax.swing.JTextField txtVendorAddress;
    private javax.swing.JTextField txtVendorEmail;
    private javax.swing.JTextField txtVendorID;
    private javax.swing.JTextField txtVendorName;
    private javax.swing.JTextField txtVendorOrderlineID;
    private javax.swing.JTextField txtVendorPhone;
    private javax.swing.JTextField txtVendorPostcode;
    private javax.swing.JTextField txtVendorSearch;
    private javax.swing.JTextArea txtaContractDesc;
    private javax.swing.JTextArea txtaQuotes;
    // End of variables declaration//GEN-END:variables
}
