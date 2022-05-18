/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventoryapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ayxan
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
        SelectProd();
        SelectCust();

    }

    Connection Con = null;
    Statement State = null;
    ResultSet Rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ToTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        OrderIDField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        QuantityField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        AddBtn1 = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        CustomerLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        AddToOrd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProdTable = new javax.swing.JTable();
        TotalAmountLabel = new javax.swing.JLabel();
        PriceField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 152, 152));

        jPanel2.setBackground(new java.awt.Color(204, 153, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(992, 81));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("İnventory Management System");

        ExitBtn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(0, 153, 153));
        ExitBtn.setText("X");
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ayxan\\Desktop\\some şəkils\\54.jpg")); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addComponent(ExitBtn)
                .addGap(394, 394, 394))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ExitBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel10.setBackground(new java.awt.Color(0, 153, 153));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 153, 0));
        jLabel10.setText("PRODUCT LIST");

        ToTable.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ToTable.setForeground(new java.awt.Color(0, 153, 153));
        ToTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Quantity", "UPrice", "Total"
            }
        ));
        ToTable.setRowHeight(30);
        ToTable.setSelectionBackground(new java.awt.Color(204, 153, 0));
        ToTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ToTable);

        CustomerTable.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustomerTable.setForeground(new java.awt.Color(0, 153, 153));
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CustID", "CustomerName", "CustomerPhone"
            }
        ));
        CustomerTable.setRowHeight(25);
        CustomerTable.setSelectionBackground(new java.awt.Color(204, 153, 0));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTable);

        jLabel11.setBackground(new java.awt.Color(0, 153, 153));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 153, 0));
        jLabel11.setText("CUSTOMER LIST");

        OrderIDField.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        OrderIDField.setForeground(new java.awt.Color(0, 153, 153));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Customer Name");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        QuantityField.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        QuantityField.setForeground(new java.awt.Color(0, 153, 153));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Quantity");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Order ID");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Date");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        AddBtn.setBackground(new java.awt.Color(204, 153, 0));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(0, 153, 153));
        AddBtn.setText("ADD Order");
        AddBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        AddBtn1.setBackground(new java.awt.Color(204, 153, 0));
        AddBtn1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddBtn1.setForeground(new java.awt.Color(0, 153, 153));
        AddBtn1.setText("VIEW Orders");
        AddBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtn1MouseClicked(evt);
            }
        });
        AddBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn1ActionPerformed(evt);
            }
        });

        HomeBtn.setBackground(new java.awt.Color(204, 153, 0));
        HomeBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(0, 153, 153));
        HomeBtn.setText("HOME");
        HomeBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        CustomerLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustomerLabel.setForeground(new java.awt.Color(204, 153, 0));
        CustomerLabel.setText("Customer name");

        DateLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(204, 153, 0));
        DateLabel.setText("Date");

        AddToOrd.setBackground(new java.awt.Color(204, 153, 0));
        AddToOrd.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddToOrd.setForeground(new java.awt.Color(0, 153, 153));
        AddToOrd.setText("ADD to ORDER");
        AddToOrd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddToOrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToOrdMouseClicked(evt);
            }
        });
        AddToOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToOrdActionPerformed(evt);
            }
        });

        ProdTable.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ProdTable.setForeground(new java.awt.Color(0, 153, 153));
        ProdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ProductID", "Name", "Quantity", "Description", "Category"
            }
        ));
        ProdTable.setRowHeight(30);
        ProdTable.setSelectionBackground(new java.awt.Color(204, 153, 0));
        ProdTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ProdTable);

        TotalAmountLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        TotalAmountLabel.setForeground(new java.awt.Color(204, 153, 0));
        TotalAmountLabel.setText("Amount");

        PriceField.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        PriceField.setForeground(new java.awt.Color(0, 153, 153));

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Price");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Print.setBackground(new java.awt.Color(204, 153, 0));
        Print.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Print.setForeground(new java.awt.Color(0, 153, 153));
        Print.setText("Print");
        Print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintMouseClicked(evt);
            }
        });
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AddBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(OrderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CustomerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(93, 93, 93)
                                                .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(126, 126, 126))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel11)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9)
                                .addGap(28, 28, 28)
                                .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddToOrd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1567, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TotalAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(511, 511, 511))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OrderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CustomerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(AddToOrd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotalAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void SelectProd() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
            State = Con.createStatement();
            Rs = State.executeQuery("select * from producttable");
            ProdTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void SelectCust() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
            State = Con.createStatement();
            Rs = State.executeQuery("select * from customertable");
            CustomerTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void DateofToday() {
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:MM:SS");
        LocalDateTime now = LocalDateTime.now();

        DateLabel.setText(d.format(now));
    }


    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBtnMouseClicked

    private void ToTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToTableMouseClicked
//        DefaultTableModel model = (DefaultTableModel) ProdTable.getModel();
//        int idx = ProdTable.getSelectedRow();
//        ProdID.setText(model.getValueAt(idx, 0).toString());
//        ProdName.setText(model.getValueAt(idx, 1).toString());
//        ProdQty.setText(model.getValueAt(idx, 2).toString());
//        ProdDesc.setText(model.getValueAt(idx, 3).toString());
    }//GEN-LAST:event_ToTableMouseClicked

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
        int idx = CustomerTable.getSelectedRow();
//        CustID.setText(model.getValueAt(idx, 0).toString());
        CustomerLabel.setText(model.getValueAt(idx, 1).toString());
        DateofToday();
//        CustPhone.setText(model.getValueAt(idx, 2).toString());
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked

        if (OrderIDField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill the blank area!");
        }
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
            PreparedStatement add = Con.prepareStatement("insert into ordertable values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(OrderIDField.getText()));
            add.setString(2, CustomerLabel.getText());
            add.setString(3, DateLabel.getText());
            add.setInt(4, AllTotal);
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Order Successfully Added");
            Con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void AddBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtn1MouseClicked

    private void AddBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtn1ActionPerformed

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeBtnActionPerformed
    public void updteNewQty() {
        int newQty = oldquantity - Integer.valueOf(QuantityField.getText());
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
            String UpdateQuery = "update project.producttable set ProdQty ='" + newQty + "'" + "where ProdID=" + prodid;
            Statement Add = Con.createStatement();
            Add.executeUpdate(UpdateQuery);
            SelectProd();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    int i = 1, Uprice, total = 0, AllTotal;
    String ProdName;
    private void AddToOrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToOrdMouseClicked
        if (curs == 0 || QuantityField.getText().isEmpty() || PriceField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Specify Qty and Price");
        } else {
            Uprice = Integer.valueOf(PriceField.getText());
            total = Uprice * Integer.valueOf(QuantityField.getText());
            Vector v = new Vector();
            v.add(i);
            v.add(ProdName);
            v.add(QuantityField.getText());
            v.add(Uprice);
            v.add(total);
            DefaultTableModel tt = (DefaultTableModel) ToTable.getModel();
            tt.addRow(v);
            AllTotal = AllTotal + total;
            TotalAmountLabel.setText("Your total payment:" + AllTotal);
            updteNewQty();
            i++;
        }
    }//GEN-LAST:event_AddToOrdMouseClicked


    private void AddToOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToOrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToOrdActionPerformed

    int curs = 0, prodid, oldquantity;
    private void ProdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdTableMouseClicked
        DefaultTableModel pt = (DefaultTableModel) ProdTable.getModel();
        int idx = ProdTable.getSelectedRow();
        prodid = Integer.valueOf(pt.getValueAt(idx, 0).toString());
        ProdName = pt.getValueAt(idx, 1).toString();
        oldquantity = Integer.valueOf(pt.getValueAt(idx, 2).toString());
        curs = 1;
    }//GEN-LAST:event_ProdTableMouseClicked

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
        try {
            ToTable.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintMouseClicked

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton AddBtn1;
    private javax.swing.JButton AddToOrd;
    private javax.swing.JLabel CustomerLabel;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField OrderIDField;
    private javax.swing.JTextField PriceField;
    private javax.swing.JButton Print;
    private javax.swing.JTable ProdTable;
    private javax.swing.JTextField QuantityField;
    private javax.swing.JTable ToTable;
    private javax.swing.JLabel TotalAmountLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
