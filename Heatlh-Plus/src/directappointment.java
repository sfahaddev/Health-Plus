
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
public class directappointment extends javax.swing.JFrame {
        String filePath = "patientdata.txt";
        ArrayList<Patient> allpatients = new ArrayList<>();
   
    public directappointment() {
        initComponents();
         Readalldata();
        
    }
       void Readalldata(){
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] currentdata = line.split(";");
                Patient patient = new Patient();
                patient.setId(Integer.parseInt(currentdata[0]));
                patient.setName(currentdata[1]);
                patient.setAge(Integer.parseInt(currentdata[2]));
                patient.setGender(currentdata[3]);
                patient.setContact(currentdata[4]);
                patient.setAddress(currentdata[5]);
                allpatients.add(patient);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contactsearch = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("SEARCH BY CONTACT:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, 20));

        contactsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactsearchActionPerformed(evt);
            }
        });
        jPanel1.add(contactsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 250, -1));

        searchbtn.setBackground(new java.awt.Color(0, 102, 102));
        searchbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("SEARCH");
        searchbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchbtnMouseClicked(evt);
            }
        });
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        searchbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchbtnKeyPressed(evt);
            }
        });
        jPanel1.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 110, 30));

        homebtn.setBackground(new java.awt.Color(0, 102, 102));
        homebtn.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        homebtn.setForeground(new java.awt.Color(255, 255, 255));
        homebtn.setText("HOME");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        jPanel1.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/appoint.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnActionPerformed
     
      private boolean validateContact(String contact) {
        return Pattern.matches("\\d{11}", contact);
    }
    private void contactsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactsearchActionPerformed
         String contact = contactsearch.getText().trim(); // Trim to remove leading/trailing whitespace
         if (!validateContact(contact)) {
        JOptionPane.showMessageDialog(this, "Invalid contact number format. Please enter 11 digits.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        boolean patientFound = false;
        int userId;
         for (int i = 0; i < allpatients.size(); i++) {
            if (allpatients.get(i).getContact().equals(contact)) {
                patientFound = true;
                userId = allpatients.get(i).getId();
                if(patientFound){
                appointment appoint1 = new appointment(userId);
                this.setVisible(false);
                appoint1.setVisible(true);
                break;
            }}
        }
             if (!patientFound) {
            JOptionPane.showMessageDialog(this, "Contact not Found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_contactsearchActionPerformed

    private void searchbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtnMouseClicked
          contactsearchActionPerformed(null);
   
    }//GEN-LAST:event_searchbtnMouseClicked

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        homepage homebtn2 = new homepage();
        this.setVisible(false);
        homebtn2.setVisible(true);
    }//GEN-LAST:event_homebtnMouseClicked

    private void searchbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbtnKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
           contactsearchActionPerformed(null);
        }
    }//GEN-LAST:event_searchbtnKeyPressed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new directappointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactsearch;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables

}