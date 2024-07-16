
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class inventory extends javax.swing.JFrame {
     private DefaultTableModel tableModel;
     private DefaultTableModel tableModel1; 
     String filePath = "Medicinedata.txt";
     String donationFilePath = "donation.txt";
     String receivebloodFilePath = "Recievebloodata.txt";
     private Queue<Medicine> allmedicine; 
     private Queue<Donate> donationqueue; 
     private Queue<Recieveblood> recievebloodqueue; 
     
     
        public inventory() {
        initComponents();
        tableModel = (DefaultTableModel) allmdata.getModel();
        tableModel1 = (DefaultTableModel) allbdata.getModel();
        allmedicine = new Queue<>(100);
        donationqueue= new Queue<>(100);
        recievebloodqueue= new Queue<>(100);
        loadMedicines();
        loadBloodData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        allmdata = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchbtn = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allbdata = new javax.swing.JTable();
        savebtn2 = new javax.swing.JButton();
        bloodsearch = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allmdata.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        allmdata.setForeground(new java.awt.Color(0, 102, 102));
        allmdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Quantity"
            }
        ));
        allmdata.setSelectionBackground(new java.awt.Color(255, 255, 255));
        allmdata.setSelectionForeground(new java.awt.Color(0, 102, 102));
        allmdata.setShowGrid(true);
        jScrollPane2.setViewportView(allmdata);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 350, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("SEARCH BLOOD:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 140, -1));

        searchbtn.setBackground(new java.awt.Color(0, 102, 102));
        searchbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("SEARCH");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 110, 20));
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, 20));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 80, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("SEARCH MEDICINE:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 150, -1));

        allbdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Type", "No of bottles"
            }
        ));
        jScrollPane1.setViewportView(allbdata);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 360, 90));

        savebtn2.setBackground(new java.awt.Color(0, 102, 102));
        savebtn2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        savebtn2.setForeground(new java.awt.Color(255, 255, 255));
        savebtn2.setText("SEARCH");
        savebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(savebtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 110, 20));

        bloodsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel2.add(bloodsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 480));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 760, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private void loadMedicines() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] curdata = line.split(";");
                if (curdata.length == 6) { // Ensure the correct number of fields
                    Medicine medicine = new Medicine();
                    medicine.setId(Integer.parseInt(curdata[0].trim()));
                    medicine.setName(curdata[1].trim());
                    medicine.setQuantity(Integer.parseInt(curdata[2].trim()));
                    medicine.setSellingPrice(Integer.parseInt(curdata[3].trim()));
                    medicine.setBuyingPrice(Integer.parseInt(curdata[4].trim()));
                    medicine.setDescription(curdata[5].trim());
                    allmedicine.enqueue(medicine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading the medicines file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   private void searchMedicine() {
    String searchQuery = search.getText().trim();
    if (searchQuery.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a medicine name to search.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String regexPattern = "^[a-zA-Z0-9 ]+$";
    if (!searchQuery.matches(regexPattern)) {
        JOptionPane.showMessageDialog(this, "Invalid medicine name format. Please use only letters, numbers, and spaces.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    boolean found = false;
   // tableModel.setRowCount(0); // Clear existing rows
    int totalQuantity = 0;
    Medicine matchedMedicine = null;

    for (int i = 0; i < allmedicine.size(); i++) {
            Medicine medicine = allmedicine.get(i);
        if (medicine.getName().equalsIgnoreCase(searchQuery)) {
            if (matchedMedicine == null) {
                matchedMedicine = medicine;
            }
            totalQuantity += medicine.getQuantity();
            found = true;
        }
    }
    if (found && matchedMedicine != null) {
        tableModel.addRow(new Object[]{
            matchedMedicine.getName(),
            totalQuantity,
        });
    } else {
        JOptionPane.showMessageDialog(this, "Medicine not found in the inventory.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}
  
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        homepage home = new homepage();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        searchMedicine();
    }//GEN-LAST:event_searchbtnActionPerformed

    private void savebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtn2ActionPerformed
        // TODO add your handling code here:
        searchBlood();
    }//GEN-LAST:event_savebtn2ActionPerformed
   private int calculateTotalQuantity(String medicineName) {
        int totalQuantity = 0;
       for (int i = 0; i < allmedicine.size(); i++) {
            Medicine medicine = allmedicine.get(i);
            if (medicine.getName().equalsIgnoreCase(medicineName)) {
                totalQuantity += medicine.getQuantity();
            }
        }
        return totalQuantity;
    }
    private void loadBloodData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("donation.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] curdata = line.split(";");
                if (curdata.length == 5) {
                    String name = curdata[0].trim();
                    String bloodType = curdata[1].trim();
                    int noOfBottles = Integer.parseInt(curdata[2].trim());
                    int age = Integer.parseInt(curdata[3].trim());
                    String contact = curdata[4].trim();
                    Donate donate = new Donate(name, bloodType, noOfBottles, age, contact);
                    donationqueue.enqueue(donate);
                } else {
                    System.err.println("Invalid data format in the donation file: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading the donation data file.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error in number format in the donation data file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("Recievebloodata.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] curdata = line.split(";");
                if (curdata.length == 5) {
                    String name = curdata[0].trim();
                    String bloodType = curdata[1].trim();
                    int noOfBottles = Integer.parseInt(curdata[2].trim());
                    int age = Integer.parseInt(curdata[3].trim());
                    String contact = curdata[4].trim();
                    Recieveblood recieve = new Recieveblood(name, bloodType, noOfBottles, age, contact);
                    recievebloodqueue.enqueue(recieve);
                } else {
                    System.err.println("Invalid data format in the received blood file: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading the received blood data file.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error in number format in the received blood data file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

               
  void searchBlood() {
       String searchQuery = bloodsearch.getSelectedItem().toString();
    if (searchQuery.isEmpty() || searchQuery.equals("Select")) {
        JOptionPane.showMessageDialog(this, "Please select a valid blood type to search.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

        int totalDonated = 0;
        int totalReceived = 0;

           for (int i = 0; i < donationqueue.size(); i++) {
            Donate donate = donationqueue.get(i);
            if (donate.getBloodtype().equalsIgnoreCase(searchQuery)) {
                totalDonated += donate.getNoofbottles();
            }
        }

        for (int i = 0; i < recievebloodqueue.size(); i++) {
             Recieveblood recieve = recievebloodqueue.get(i);
            if (recieve.getBloodtype().equalsIgnoreCase(searchQuery)) {
                totalReceived += recieve.getNoofbottles();
            }
        }

        int totalAvailable = totalDonated - totalReceived;

       // tableModel1.setRowCount(0); // Clear existing rows
        tableModel1.addRow(new Object[]{searchQuery.toUpperCase(), totalAvailable});

        if (totalAvailable <= 0) {
            JOptionPane.showMessageDialog(this, "Blood type " + searchQuery + " is not available in inventory.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allbdata;
    private javax.swing.JTable allmdata;
    private javax.swing.JComboBox<String> bloodsearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton savebtn2;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables
}
