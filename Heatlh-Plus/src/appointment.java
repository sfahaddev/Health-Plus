
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class appointment extends javax.swing.JFrame {
     private Queue<appointment1> AppointmentQueue; 
     private DateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy");
     
    public appointment(int userId) {
        initComponents();
        AppointmentQueue = new Queue<>(100); // Initialize AppointmentQueue with capacity 10
       // Readalldata();// Call method to populate appointmentQueue from file on GUI initialization
        appointid.setText(String.valueOf(userId));
    }
     public appointment() {
        this(-1); // Call the parameterized constructor with a default ID
    }
     
      private void clearFields() {
        appointid.setText(""); 
        bloodgrp.setSelectedIndex(0);
        disease.setText("");
        Date.setCalendar(null);
        selecttime.setSelectedIndex(0);
        fee.setText("");
        selectdoc.setSelectedIndex(0);
    }
 
    void savealldata() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("appointmentdata.txt",true));
            for (int i = 0; i < AppointmentQueue.size(); i++) {
                appointment1 appointment = AppointmentQueue.get(i);
                writer.write(appointment.getId() + ";" +
                             appointment.getBloodgroup() + ";" +
                             appointment.getDisease() + ";" +
                             appointment.getDoctor() + ";" +
                             dateFormat.format(appointment.getDate()) + ";" +
                             appointment.getTime() + ";" +
                             appointment.getFee()+ "\n");
                if (i < AppointmentQueue.size() - 1) {
                    writer.write(System.lineSeparator());
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fee = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        bookaptbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        disease = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        selectdoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        appointid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selecttime = new javax.swing.JComboBox<>();
        bloodgrp = new javax.swing.JComboBox<>();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 30, -1));
        jPanel1.add(fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 200, -1));

        home.setBackground(new java.awt.Color(0, 102, 102));
        home.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("BACK");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 110, 30));

        bookaptbtn.setBackground(new java.awt.Color(0, 102, 102));
        bookaptbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        bookaptbtn.setForeground(new java.awt.Color(255, 255, 255));
        bookaptbtn.setText("BOOK APPOINTMENT");
        bookaptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookaptbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bookaptbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("DATE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("FEE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("SELECT DOCTOR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));
        jPanel1.add(disease, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 200, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("DISEASE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        selectdoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Dr laiba noor", "Dr Iman gulzar", "Dr preetam kumari", "Dr Alina", "Dr Hani", "Dr Vanisha Jumani" }));
        selectdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectdocActionPerformed(evt);
            }
        });
        jPanel1.add(selectdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 200, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("TIME");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));
        jPanel1.add(appointid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 200, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("BLOODGROUP");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        selecttime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "10:00 am", "12:00 pm", "01:30 pm", "02:00 pm", "04:00 pm", "05:00 pm" }));
        jPanel1.add(selecttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 200, -1));

        bloodgrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(bloodgrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, -1));
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/appoint.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 750, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        homepage backbtn1 = new homepage();
        this.setVisible(false);
        backbtn1.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed
 
    private boolean validateID(String id) {
         return Pattern.matches("\\d+", id);
    }
    private boolean validateFee(String fee) {
        return Pattern.matches("\\d+", fee);
    }
    private boolean validateDisease(String disease) {
     return Pattern.matches("[a-zA-Z ]+", disease);
     }
    private void bookAppointment() {
         if (validateID(appointid.getText()) &&
        validateFee(fee.getText()) &&
        validateDisease(disease.getText()) &&
        Date.getDate() != null){
        int id = Integer.parseInt(appointid.getText());
        String bloodgroup = bloodgrp.getSelectedItem().toString();
        String disease = this.disease.getText();
        String doctor = selectdoc.getSelectedItem().toString();
        Date date = Date.getDate();
        String time = selecttime.getSelectedItem().toString();
        int Fee = Integer.parseInt(fee.getText());

        appointment1 appointment = new appointment1(id,bloodgroup, disease, doctor, date, time, Fee);

        if (!AppointmentQueue.isFull()) {
            AppointmentQueue.enqueue(appointment);
            JOptionPane.showMessageDialog(null, "Appointment booked successfully!");
            clearFields();
            savealldata();
        } else {
            JOptionPane.showMessageDialog(null, "Cannot add more appointments.");
        }
    }}
       
  
    
    private void bookaptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookaptbtnActionPerformed
        // TODO add your handling code here:
          if (appointid.getText().equals("")||bloodgrp.getSelectedItem().equals("select") || disease.getText().equals("") || 
            selectdoc.getSelectedItem().equals("select") || 
            Date.getDate()==null || selecttime.getSelectedItem().equals("select") || 
            fee.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "All fields required");
        } else {
           bookAppointment();
        }
    }//GEN-LAST:event_bookaptbtnActionPerformed

    private void selectdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectdocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectdocActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JTextField appointid;
    private javax.swing.JComboBox<String> bloodgrp;
    private javax.swing.JButton bookaptbtn;
    private javax.swing.JTextField disease;
    private javax.swing.JTextField fee;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selectdoc;
    private javax.swing.JComboBox<String> selecttime;
    // End of variables declaration//GEN-END:variables
}
