/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import java.awt.Color;
import java.awt.Font;

import DAO.BillingDao;
import DAO.DbConnection;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.print.*;
import java.awt.*;
import javax.print.attribute.*;
import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaSizeName;


/**
 *
 * @author anukul
 */
public class BillingView extends javax.swing.JFrame {
     String patientName ;
     String opdPatientName;
     String ipdNumber ;
     String opdNumber ;
     String age1 ;
     String age2 ;
     String roomCharge ;
     String serviceCharge ;
     String ipdCharge;
     String opdCharge;
     String opdTotalSum;
     String ipdTotalSum;
     String paidAmount;
     String ipdReturnAmount;
     String opdReturnAmount;
     
    /**
     * Creates new form BillingView
     */
    public BillingView() {
        initComponents();
        ComboData();
        
        IpdLabel.setVisible(false);
        IpdTxt.setVisible(false);
        OpdLabel.setVisible(false);
        OpdTxt.setVisible(false);
        RoomLabel.setVisible(false);
        roomCombo.setVisible(false);
        ServiceLabel.setVisible(false);
        serviceCombo.setVisible(false);
        
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        dateLabel.setText(dFormat.format(date));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        timeLabel.setText(dtf.format(now));
        
    }

    private void ComboData(){
        BillingDao bill = new BillingDao();
        bill.updateQueryForRoomsCombo();
        bill.updateQueryForServicesCombo();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        roomCombo = new javax.swing.JComboBox<>();
        serviceCombo = new javax.swing.JComboBox<>();
        RoomLabel = new javax.swing.JLabel();
        ServiceLabel = new javax.swing.JLabel();
        IpdLabel = new javax.swing.JLabel();
        OpdLabel = new javax.swing.JLabel();
        IpdTxt = new javax.swing.JTextField();
        OpdTxt = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        totalAmountTxt = new javax.swing.JTextField();
        paidAmountTxt = new javax.swing.JTextField();
        changeAmountTxt = new javax.swing.JTextField();
        IPDRadioButton = new javax.swing.JRadioButton();
        OPDRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 199, 180));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        roomCombo.setBackground(new java.awt.Color(223, 230, 216));
        roomCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        " }));
        roomCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomComboActionPerformed(evt);
            }
        });

        serviceCombo.setBackground(new java.awt.Color(223, 230, 216));
        serviceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                           " }));

        RoomLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RoomLabel.setText("Room No");

        ServiceLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ServiceLabel.setText("Service");

        IpdLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        IpdLabel.setText("IPD No");

        OpdLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        OpdLabel.setText("OPD No");

        IpdTxt.setBackground(new java.awt.Color(223, 230, 216));
        IpdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpdTxtActionPerformed(evt);
            }
        });

        OpdTxt.setBackground(new java.awt.Color(223, 230, 216));

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png"))); // NOI18N
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Logo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("BILLING");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Paid Amount");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Total Amount");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Change");

        AddButton.setText("Add Bill");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        totalAmountTxt.setBackground(new java.awt.Color(223, 230, 216));

        paidAmountTxt.setBackground(new java.awt.Color(223, 230, 216));

        changeAmountTxt.setBackground(new java.awt.Color(223, 230, 216));

        IPDRadioButton.setText("IPD");
        IPDRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPDRadioButtonActionPerformed(evt);
            }
        });

        OPDRadioButton.setText("OPD");
        OPDRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPDRadioButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Date :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Time :");

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        timeLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        TextArea.setColumns(20);
        TextArea.setRows(5);
        TextArea.setMaximumSize(new java.awt.Dimension(13, 20));
        jScrollPane2.setViewportView(TextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(269, 269, 269)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateLabel)
                                            .addComponent(timeLabel)))
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(IPDRadioButton)
                                .addGap(27, 27, 27)
                                .addComponent(OPDRadioButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OpdLabel)
                                    .addComponent(RoomLabel))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IpdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OpdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IpdLabel)
                                            .addComponent(ServiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(78, 78, 78))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(26, 26, 26)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalAmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serviceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paidAmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changeAmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(AddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IPDRadioButton)
                            .addComponent(OPDRadioButton))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IpdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IpdLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OpdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OpdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoomLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ServiceLabel)
                            .addComponent(serviceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalAmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(paidAmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(changeAmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(131, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(dateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(timeLabel))))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(AddButton))
                        .addGap(63, 63, 63))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IpdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IpdTxtActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        UserDashboardView1 view = new UserDashboardView1();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void IPDRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPDRadioButtonActionPerformed
        // TODO add your handling code here:
        OPDRadioButton.setSelected(false);
        boolean isSelected = IPDRadioButton.isSelected();
        IpdLabel.setVisible(true);
        IpdTxt.setVisible(true);
        OpdLabel.setVisible(false);
        OpdTxt.setVisible(false);
        RoomLabel.setVisible(true);
        roomCombo.setVisible(true);
        ServiceLabel.setVisible(true);
        serviceCombo.setVisible(true);
        IpdLabel.setVisible(isSelected);
        IpdTxt.setVisible(isSelected);
        RoomLabel.setVisible(isSelected);
        roomCombo.setVisible(isSelected);
        ServiceLabel.setVisible(isSelected);
        serviceCombo.setVisible(isSelected);
        OpdTxt.setText(null);
        IpdTxt.setText(null);
        roomCombo.setSelectedIndex(0);
        serviceCombo.setSelectedIndex(0);
        TextArea.setText("");
        totalAmountTxt.setText("");
        paidAmountTxt.setText("");
        changeAmountTxt.setText("");
        

      
    }//GEN-LAST:event_IPDRadioButtonActionPerformed
   
  
    
    private void OPDRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPDRadioButtonActionPerformed
        // TODO add your handling code here:
        IPDRadioButton.setSelected(false);
        boolean isSelected = OPDRadioButton.isSelected();
        IpdLabel.setVisible(false);
        IpdTxt.setVisible(false);
        OpdLabel.setVisible(true);
        OpdTxt.setVisible(true);
        ServiceLabel.setVisible(true);
        serviceCombo.setVisible(true);
        OpdLabel.setVisible(isSelected);
        OpdTxt.setVisible(isSelected);
        RoomLabel.setVisible(false);
        roomCombo.setVisible(false);
        ServiceLabel.setVisible(isSelected);
        serviceCombo.setVisible(isSelected);
        serviceCombo.setSelectedIndex(0);
        roomCombo.setSelectedIndex(0);
        OpdTxt.setText("");
        IpdTxt.setText("");
        TextArea.setText("");
        totalAmountTxt.setText("");
        paidAmountTxt.setText("");
        changeAmountTxt.setText("");

        
    }//GEN-LAST:event_OPDRadioButtonActionPerformed

    private void roomComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomComboActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        
        if((IPDRadioButton.isSelected() || OPDRadioButton.isSelected()) == false){
            JOptionPane.showMessageDialog(this, "Please tick ipd or opd");
        }
        
        BillingDao dao = new BillingDao();
        patientName = dao.viewPatientName(this);
        ipdNumber = IpdTxt.getText();
        ipdCharge = dao.viewIpdCharge(this);
        opdNumber = OpdTxt.getText();
        opdCharge = dao.viewOpdCharge(this);
        opdPatientName = dao.viewOpdPatientName(this);
        age1 = dao.viewIpdAge(this);
        age2 = dao.viewOpdAge(this);
        roomCharge = dao.viewRoomCharge(this);
        serviceCharge = dao.viewServiceCharge(this);
        if(OPDRadioButton.isSelected()){
            opdTotalSum = Integer.toString(opdTotal(opdCharge, serviceCharge));
            totalAmountTxt.setText(opdTotalSum);
        }
        if(IPDRadioButton.isSelected()){
            ipdTotalSum = Integer.toString(ipdTotal(ipdCharge, roomCharge, serviceCharge));
            totalAmountTxt.setText(ipdTotalSum);
        }
        paidAmount = paidAmountTxt.getText();
        try{
            if(IPDRadioButton.isSelected()){
            ipdReturnAmount =Integer.toString(Integer.parseInt(paidAmount)-ipdTotal(ipdCharge, roomCharge,serviceCharge)); 
            changeAmountTxt.setText(ipdReturnAmount);
        }
        if(OPDRadioButton.isSelected()){
            opdReturnAmount =Integer.toString(Integer.parseInt(paidAmount)-opdTotal(opdCharge,serviceCharge)); 
            changeAmountTxt.setText(opdReturnAmount);
        }
        }catch(Exception e){
            e.getMessage();
        }
        
       
        
        
        
        //TEXT AREA
        TextArea.setText("***************************************************************\n");
        TextArea.setText(TextArea.getText()+"           *               GRACE CLINIC RECEIPT                  *\n");
        TextArea.setText(TextArea.getText()+"***************************************************************\n");
        Date obj = new Date();
        String date1 = obj.toString();
        TextArea.setText(TextArea.getText()+"                           "+date1+"    ");
        TextArea.setText(TextArea.getText()+"\n----------------------------------------------------------------------------\n");
        if(IPDRadioButton.isSelected()){
        TextArea.setText(TextArea.getText()+"    Patient name :   "+patientName + "\n");
        TextArea.setText(TextArea.getText()+"    Age : "+ age1  +"\n");
        }
        else {
            TextArea.setText(TextArea.getText()+"    Patient name :   "+opdPatientName + "\n");
            TextArea.setText(TextArea.getText()+"    Age :"+ age2  +"\n");
        }
        if(ipdNumber==null|| ipdNumber.isEmpty() || ipdNumber.isBlank()){
            TextArea.setText(TextArea.getText()+"    Ipd number : n/a \n");
        }else{
            TextArea.setText(TextArea.getText()+"    Ipd number :"+ipdNumber +"\n");
        }
        if(opdNumber==null|| opdNumber.isEmpty() || opdNumber.isBlank()){
            TextArea.setText(TextArea.getText()+"    Opd number : n/a \n");

        }else{
            TextArea.setText(TextArea.getText()+"    Opd number :"+opdNumber  +"\n");
        }
        TextArea.setText(TextArea.getText()+"----------------------------------------------------------------------------\n");
        if(ipdCharge==null|| ipdCharge.isEmpty() || ipdCharge.isBlank()){
            TextArea.setText(TextArea.getText()+"\n    Ipd charge : n/a \n");
        }else{
            TextArea.setText(TextArea.getText()+"\n    Ipd charge : "+ipdCharge+"\n");
        }
        if(opdCharge == null || opdCharge.isEmpty() || opdCharge.isBlank()){
            TextArea.setText(TextArea.getText()+"    Opd charge : n/a \n");
        }else{
            TextArea.setText(TextArea.getText()+"    Opd charge : "+ opdCharge +"\n");
        }
        if(roomCharge==null|| roomCharge.isEmpty() || roomCharge.isBlank()){
            TextArea.setText(TextArea.getText()+"    Room charge : n/a \n");
        }else{
            TextArea.setText(TextArea.getText()+"    Room charge : "+roomCharge   +"\n");
        }
        if(serviceCharge==null || serviceCharge.isEmpty() || serviceCharge.isBlank()){
            TextArea.setText(TextArea.getText()+"    Service charge : n/a \n");
        }else{
            TextArea.setText(TextArea.getText()+"    Service charge : "+ serviceCharge  +"\n");

        }
        TextArea.setText(TextArea.getText()+"----------------------------------------------------------------------------\n");
        if(IPDRadioButton.isSelected()){
            TextArea.setText(TextArea.getText()+"\n   Total : "+ipdTotalSum+"\n");
        }else{
            TextArea.setText(TextArea.getText()+"\n   Total : "+opdTotalSum+"\n");

        }
        
        try{
           TextArea.setText(TextArea.getText()+"    Paid amount : "+paidAmount  +" \n");
        } catch(NullPointerException e)
        {
            e.getMessage();
        }
        
        try{
            if(IPDRadioButton.isSelected()){
            TextArea.setText(TextArea.getText()+"    Return : "+ ipdReturnAmount  +"\n");        
        }
        else{
            TextArea.setText(TextArea.getText()+"\n   Total : "+opdReturnAmount+"\n");
        }
        }catch(NullPointerException e)
        {
            e.getMessage();
        }
        
        TextArea.setText(TextArea.getText()+"----------------------------------------------------------------------------\n");
        TextArea.setText(TextArea.getText()+"           *               We value our patient          *\n");
        TextArea.setText(TextArea.getText()+"           *               Thank you !                         *\n");
        TextArea.setText(TextArea.getText()+"\n                 Emergency helpline : 01-4211213                  ");
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        printTextArea();
    }//GEN-LAST:event_jButton2ActionPerformed
    private int opdTotal(String oc, String sc){
        int sc1;
        int oc1;
        int totalOpd;
        if(sc.isEmpty()|| sc.isBlank()){
            sc1 = 0;
        }else{
            sc1 = Integer.parseInt(sc);
        }
        if(oc.isEmpty()|| oc.isBlank()){
            oc1 = 0;
        }else{
            oc1 = Integer.parseInt(oc);
        }
        totalOpd = sc1 + oc1;
        return totalOpd;
    }
    private int ipdTotal(String ic, String rc, String sc){
        int ic1;
        int rc1;
        int sc1;
        int totalIpd;
        if(ic.isEmpty()||ic.isBlank()){
            ic1 = 0;
        }else{
            ic1 = Integer.parseInt(ic);
        }if(rc.isEmpty()||rc.isBlank()){
            rc1 = 0;
        }else{
            rc1 = Integer.parseInt(rc);
        }if(sc.isEmpty()||ic.isBlank()){
            sc1 = 0;
        }else{
            sc1 = Integer.parseInt(sc);
        }
        totalIpd = ic1+rc1+sc1;
        return totalIpd;
    }
    
    private void printTextArea() {
    PrinterJob job = PrinterJob.getPrinterJob();
    PageFormat pf = job.defaultPage();
    Paper paper = pf.getPaper();
    
    // Set the paper size
    MediaSizeName mediaSize = MediaSize.findMedia(100, 150, MediaSize.MM);
    if (mediaSize != null) {
        MediaSize ms = MediaSize.getMediaSizeForName(mediaSize);
        paper.setSize(ms.getX(MediaSize.MM), ms.getY(MediaSize.MM));
        pf.setPaper(paper);
    }
    
    job.setPrintable(new Printable() {
        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex > 0) {
                return NO_SUCH_PAGE;
            }
            
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            
            // Print the JTextArea content
            Font font = TextArea.getFont();
            FontMetrics fontMetrics = g2d.getFontMetrics(font);
            int lineHeight = fontMetrics.getHeight();
            
            String[] lines = TextArea.getText().split("\\n");
            int y = 0;
            for (String line : lines) {
                y += lineHeight;
                g2d.drawString(line, 0, y);
            }
            
            return PAGE_EXISTS;
        }
    });
    
    boolean printDialogResult = job.printDialog();
    if (printDialogResult) {
        try {
            job.print();
        } catch (PrinterException e) {
            // Handle printing exception
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(BillingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JRadioButton IPDRadioButton;
    private javax.swing.JLabel IpdLabel;
    public javax.swing.JTextField IpdTxt;
    private javax.swing.JRadioButton OPDRadioButton;
    private javax.swing.JLabel OpdLabel;
    public javax.swing.JTextField OpdTxt;
    private javax.swing.JLabel RoomLabel;
    private javax.swing.JLabel ServiceLabel;
    private javax.swing.JTextArea TextArea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JTextField changeAmountTxt;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField paidAmountTxt;
    public static javax.swing.JComboBox<String> roomCombo;
    public static javax.swing.JComboBox<String> serviceCombo;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField totalAmountTxt;
    // End of variables declaration//GEN-END:variables
}

