

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Amna
 */
public class bloodbank extends javax.swing.JFrame {
      private Queue<Donate> donationqueue; 
      private Queue<Recieveblood> recievebloodqueue; 
     
    public bloodbank() {
        initComponents();
        donationqueue = new Queue<>(100); 
        recievebloodqueue = new Queue<>(100);     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        home = new javax.swing.JButton();
        bottles = new javax.swing.JTextField();
        donorname = new javax.swing.JTextField();
        donorage = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acceptorname = new javax.swing.JTextField();
        Rbottle = new javax.swing.JTextField();
        Rcontact = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Rage = new javax.swing.JTextField();
        btype = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("DONOR NAME");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("BLOODTYPE");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("NO OF BOTTLES");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("AGE");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("CONTACT NO");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        Addbtn.setBackground(new java.awt.Color(0, 102, 102));
        Addbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addbtn.setText("ADD");
        Addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbtnMouseClicked(evt);
            }
        });
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 80, 30));

        home.setBackground(new java.awt.Color(0, 102, 102));
        home.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 90, 30));
        jPanel2.add(bottles, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 190, -1));
        jPanel2.add(donorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, -1));
        jPanel2.add(donorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 190, -1));
        jPanel2.add(contactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 190, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 190, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/donate.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        jTabbedPane1.addTab("DONATE", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ACCEPTOR NAME");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("BLOODTYPE");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("NO OF BOTTLES");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("CONTACT NO");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));
        jPanel3.add(acceptorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 180, -1));
        jPanel3.add(Rbottle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 180, -1));
        jPanel3.add(Rcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 180, -1));

        update.setBackground(new java.awt.Color(0, 102, 102));
        update.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 100, 30));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 100, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("AGE");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));
        jPanel3.add(Rage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 180, -1));

        btype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel3.add(btype, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 180, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/donate.jpg"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        jTabbedPane1.addTab("RECIEVE", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        homepage backbtn1 = new homepage();
        this.setVisible(false);
        backbtn1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
         homepage backbtn1 = new homepage();
        this.setVisible(false);
        backbtn1.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void AddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AddbtnMouseClicked
    void savealldata1() {//saving recieving blood data
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Recievebloodata.txt", true))) { 
        for (int i = 0; i < recievebloodqueue.size(); i++) {
            Recieveblood recieve = recievebloodqueue.get(i);
            writer.write( recieve.getName() + ";" +
                          recieve.getBloodtype() + ";" +
                          recieve.getNoofbottles() + ";" +
                          recieve.getAge() + ";" +
                          recieve.getContact());
            writer.write(System.lineSeparator());
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
  private static final String NAME_PATTERN = "^[a-zA-Z\\s]+$";
  private static final String CONTACT_PATTERN = "^\\d{11}$"; // Accepts 11-digit numeric contact numbers
  private static final String AGE_PATTERN = "^[1-9]\\d*$"; // Accepts positive integers
  private static final String BOTTLES_PATTERN = "^[1-9]\\d*$"; // Accepts positive integers

 
  private boolean validateName(String name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
  
    private boolean validateContact(String contact) {
        Pattern pattern = Pattern.compile(CONTACT_PATTERN);
        Matcher matcher = pattern.matcher(contact);
        return matcher.matches();
    }
     private boolean validateAge(int age) {
      if (age <= 18) {
        return false; // Age must be a positive integer
    }
      return true;
}
      private boolean RvalidateAge(int age) {
      if (age <= 0) {
        return false; // Age must be a positive integer
    }
      return true;
}

    private void Recieve() {
    String bloodtype = (String) btype.getSelectedItem();
    String name = acceptorname.getText();
    int noofbottles = Integer.parseInt(Rbottle.getText());
    int age = Integer.parseInt(Rage.getText());
    String contact = Rcontact.getText();
      if (btype.getSelectedItem().equals("Select") || !validateName(name) || !RvalidateAge(age) ||
          !validateContact(contact)) {
            JOptionPane.showMessageDialog(null, "Please enter valid input in all fields.");
        } else {
    if (isBloodTypeAvailable(bloodtype)) {
        Recieveblood recieve = new Recieveblood(name, bloodtype, age, noofbottles, contact);
        if (!recievebloodqueue.isFull()) {
            recievebloodqueue.enqueue(recieve);
            JOptionPane.showMessageDialog(null, "Updated!");
            clearFields();
            savealldata1();
        } else {
            JOptionPane.showMessageDialog(null, "Cannot Update.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Blood not available.");
    }
}}

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
           Recieve();
               
    }//GEN-LAST:event_updateMouseClicked
     private void clearFields() {
        type.setSelectedIndex(0);
        donorname.setText("");
        bottles.setText("");
        donorage.setText("");
        contactno.setText("");
    }
    void savealldata() {//saving donation data
     try (BufferedWriter writer = new BufferedWriter(new FileWriter("donation.txt", true))) {
        for (int i = 0; i < donationqueue.size(); i++) {
            Donate donate = donationqueue.get(i);
            writer.write(donate.getName() + ";" +
                         donate.getBloodtype() + ";" +
                         donate.getNoofbottles() + ";" +
                         donate.getAge() + ";" +
                         donate.getContact());
            writer.write(System.lineSeparator());
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error saving donation data.");
    }
}
  private void AddDonor() {
    String bloodtype = (String) type.getSelectedItem();
    String name = donorname.getText();
    int  noofbottles = Integer.parseInt(bottles.getText());
    int age = Integer.parseInt(donorage.getText());
    String contact = contactno.getText();
    if (type.getSelectedItem().equals("Select") || !validateName(name) ||
        !validateContact(contact)) {
        JOptionPane.showMessageDialog(null, "Please enter valid input in all fields.");
    } 
    else if( !validateAge(age) ){
        JOptionPane.showMessageDialog(null, "Only Age 18+ can donate.");
    }else {
        
    Donate donate = new Donate(name, bloodtype, age, noofbottles, contact);
    if (!donationqueue.isFull()) {
        donationqueue.enqueue(donate);
        savealldata();
        JOptionPane.showMessageDialog(null, "Donor Added!");
        clearFields();
    } else {
        JOptionPane.showMessageDialog(null, "Cannot Add more Donors.");
    }
}}
   
    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
           AddDonor();       
        
    }//GEN-LAST:event_AddbtnActionPerformed
   private boolean isBloodTypeAvailable(String bloodType) {
    try (BufferedReader reader = new BufferedReader(new FileReader("donation.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(";");
            if (parts.length > 1 && parts[1].equals(bloodType)) {
                return true;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
}
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
            java.util.logging.Logger.getLogger(bloodbank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bloodbank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bloodbank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bloodbank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bloodbank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextField Rage;
    private javax.swing.JTextField Rbottle;
    private javax.swing.JTextField Rcontact;
    private javax.swing.JTextField acceptorname;
    private javax.swing.JTextField bottles;
    private javax.swing.JComboBox<String> btype;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField donorage;
    private javax.swing.JTextField donorname;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}