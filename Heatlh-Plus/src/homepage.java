/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Amna
 */
public class homepage extends javax.swing.JFrame {

     private javax.swing.JButton[] buttons; 

    /**
     * Creates new form homepage
     */
    public homepage() {
        initComponents();
        initializeButtons(); // Initialize the buttons array
        hideButtons();
       setLocationRelativeTo(null); // Center the window on the screen

        
    }

    /**
     * Initialize the buttons array
     */
    private void initializeButtons() {
        buttons = new javax.swing.JButton[]{patienticon,logout, dashboardicon, bloodbankicon,appointmenticon, recordsicon, medicineicon, earningicon, inventoryicon};
    }
    /**
     * Hide the buttons while still allowing them to be clickable
     */
    private void hideButtons() {
        for (javax.swing.JButton button : buttons) {
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
            button.setFocusable(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        patienticon = new javax.swing.JButton();
        dashboardicon = new javax.swing.JButton();
        bloodbankicon = new javax.swing.JButton();
        appointmenticon = new javax.swing.JButton();
        recordsicon = new javax.swing.JButton();
        medicineicon = new javax.swing.JButton();
        earningicon = new javax.swing.JButton();
        inventoryicon = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patienticon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patienticonMouseClicked(evt);
            }
        });
        jPanel1.add(patienticon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 100, 80));

        dashboardicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardiconMouseClicked(evt);
            }
        });
        dashboardicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardiconActionPerformed(evt);
            }
        });
        jPanel1.add(dashboardicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, 80));

        bloodbankicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bloodbankiconMouseClicked(evt);
            }
        });
        jPanel1.add(bloodbankicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 110, 90));

        appointmenticon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmenticonMouseClicked(evt);
            }
        });
        jPanel1.add(appointmenticon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 100, 80));

        recordsicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordsiconMouseClicked(evt);
            }
        });
        recordsicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordsiconActionPerformed(evt);
            }
        });
        jPanel1.add(recordsicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 100, 90));

        medicineicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineiconMouseClicked(evt);
            }
        });
        jPanel1.add(medicineicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 100, 80));

        earningicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                earningiconMouseClicked(evt);
            }
        });
        jPanel1.add(earningicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 100, 100));

        inventoryicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryiconMouseClicked(evt);
            }
        });
        jPanel1.add(inventoryicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 100, 110));

        logout.setBackground(new java.awt.Color(0, 102, 102));
        logout.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 110, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/homepage.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patienticonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patienticonMouseClicked
        patientmenu patient = new patientmenu();
        this.setVisible(false);
        patient.setVisible(true);
    }//GEN-LAST:event_patienticonMouseClicked

    private void appointmenticonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmenticonMouseClicked
     
        directappointment appoint = new directappointment();
        this.setVisible(false);
        appoint.setVisible(true);
        
    }//GEN-LAST:event_appointmenticonMouseClicked

    private void medicineiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineiconMouseClicked
        // TODO add your handling code here:
        medicines med  = new medicines();
        this.setVisible(false);
        med.setVisible(true);
    }//GEN-LAST:event_medicineiconMouseClicked

    private void bloodbankiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloodbankiconMouseClicked
           // TODO add your handling code here:
           bloodbank blood = new bloodbank();
           this.setVisible(false);
           blood.setVisible(true);
    }//GEN-LAST:event_bloodbankiconMouseClicked

    private void inventoryiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryiconMouseClicked
        // TODO add your handling code here:
        inventory invent = new inventory();
        this.setVisible(false);
        invent.setVisible(true);
    }//GEN-LAST:event_inventoryiconMouseClicked

    private void recordsiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordsiconMouseClicked
        // TODO add your handling code here:
        records rec = new records();
        this.setVisible(false);
        rec.setVisible(true);
    }//GEN-LAST:event_recordsiconMouseClicked

    private void earningiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earningiconMouseClicked
        // TODO add your handling code here:
        Earning earn = new Earning();
        this.setVisible(false);
        earn.setVisible(true);
    }//GEN-LAST:event_earningiconMouseClicked

    private void dashboardiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardiconMouseClicked
        // TODO add your handling code here
      
    }//GEN-LAST:event_dashboardiconMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        LoginPage log = new LoginPage();
        this.setVisible(false);
        log.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void dashboardiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardiconActionPerformed
        // TODO add your handling code here:
        CheckUp log = new CheckUp();
        this.setVisible(false);
        log.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_dashboardiconActionPerformed

    private void recordsiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordsiconActionPerformed
        // TODO add your handling code here:
         records log = new records();
        this.setVisible(false);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_recordsiconActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
 LoginPage lg =new LoginPage();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

  
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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointmenticon;
    private javax.swing.JButton bloodbankicon;
    private javax.swing.JButton dashboardicon;
    private javax.swing.JButton earningicon;
    private javax.swing.JButton inventoryicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton medicineicon;
    private javax.swing.JButton patienticon;
    private javax.swing.JButton recordsicon;
    // End of variables declaration//GEN-END:variables
}