
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class records extends javax.swing.JFrame { 
    private Queue<Medicine> allmedicine; 
    ArrayList <BillingInfo> allRecord = new ArrayList<>();
    ArrayList<Patient> allPatient= new ArrayList<>();
    public records() {
        initComponents();
        allmedicine = new Queue<>(100);
        ReadallMdata();
        readAllPData();
        ReadallRData();
       setLocationRelativeTo(null); // Center the window on the screen

    }
    private void ReadallMdata() {
   try{
       File pfile = new File("Medicinedata.txt");
       Scanner scanner =new Scanner(pfile);
         while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[]curdata=data.split(";");
                
                Medicine medicine =new Medicine();
                medicine.setId(Integer.parseInt(curdata[0]));
                medicine.setName(curdata[1]);
                medicine.setSellingPrice(Integer.parseInt(curdata[2]));
                medicine.setBuyingPrice(Integer.parseInt(curdata[3]));
                medicine.setQuantity(Integer.parseInt(curdata[4]));
                medicine.setDescription(curdata[5]);
                
                allmedicine.enqueue(medicine);
                
         }
         scanner.close();
   }catch(Exception e){
       
   }
}
void readAllPData(){
      try{
            // saving in the txt file we created
            File pfile= new File("patientdata.txt");
            Scanner scanner= new Scanner(pfile);
            
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                //converting data
                String[] curdata=data.split(";");
                Patient patient = new Patient();
                
                patient.setId(Integer.parseInt(curdata[0]));
                patient.setName(curdata[1]);
                patient.setAge(Integer.parseInt(curdata[2]));
                patient.setGender(curdata[3]);
                patient.setContact(curdata[4]);
                patient.setAddress(curdata[5]);
                
                allPatient.add(patient);
                
                
            }
            scanner.close();
            
        }catch(Exception e){
            
        }
    }
     private void ReadallRData() {
   try{
       File pfile = new File("record.txt");
       Scanner scanner =new Scanner(pfile);
         while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[]curdata=data.split(";");
                
                BillingInfo record =new BillingInfo();
                record.setPatientID(Integer.parseInt(curdata[0]));
                record.setFee(Integer.parseInt(curdata[1]));
                record.setRecomendation((curdata[2]));
                record.setDate((curdata[3]));
                String []mlist = curdata[4].split(",");
                
             for(int i=0; i<mlist.length; i++){
                 record.setMedicineID(Integer.parseInt(mlist[i]));
             }
                
                allRecord.add(record);
                
         }
         scanner.close();
   }catch(Exception e){
       
   }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        getrecord = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pr = new javax.swing.JTextArea();
        print = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(741, 474));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -20, -1, -1));

        getrecord.setBackground(new java.awt.Color(0, 102, 102));
        getrecord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getrecord.setForeground(new java.awt.Color(255, 255, 255));
        getrecord.setText("Get Record");
        getrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getrecordActionPerformed(evt);
            }
        });
        jPanel2.add(getrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 140, 20));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 470, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Enter ID For Search");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));

        pr.setColumns(20);
        pr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pr.setRows(5);
        jScrollPane2.setViewportView(pr);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 610, 210));

        print.setBackground(new java.awt.Color(0, 102, 102));
        print.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 434, 90, -1));

        home.setBackground(new java.awt.Color(0, 102, 102));
        home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medrecord.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 470));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 741, 474));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        homepage home = new homepage();
        setVisible(false);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Records");
        MessageFormat footer = new MessageFormat("Page {0}");
        try {
            pr.print();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "There is an error: " + e);
        }
    }//GEN-LAST:event_printActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void getrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getrecordActionPerformed
        // TODO add your handling code here:
       String idText = id.getText().trim();    
    // Validate if the ID is numeric using regular expression
    if (!idText.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.");
        return;  
    }else{
         pr.setText(""); // Clear previous patient's data
          boolean recordFound = false;
            for(int i=0;i<allRecord.size(); i++){
                if(allRecord.get(i).getPatientID()== Integer.parseInt(id.getText())){
                    pr.append("\n**************************************************\n");
                    pr.append("\t\tHMS\n");
                    pr.append("\n Patient Info\n");
                    Patient patient = getPData(allRecord.get(i).getPatientID());
                    pr.append(" Patient Name= " +patient.getName()+"\n");
                    pr.append(" Patient Contact= " +patient.getContact()+"\n");
                    ArrayList<Integer> tmp=allRecord.get(i).getMedicineID();
                    pr.append(" Medicine suggested: ");
                    for(int j=0; j<tmp.size(); j++){
                        Medicine medicine = getMData(tmp.get(j));
                        pr.append(medicine.getName()+" , ");
                    }
                    pr.append("\n Date: " +allRecord.get(i).getDate());
                    pr.append("\n Recomentation: " +allRecord.get(i).getRecomendation()+"\n");
                    pr.append("\n**************************************************\n");
                    recordFound = true;
                    break;
                }
                 if (!recordFound) {
            JOptionPane.showMessageDialog(null, "No record found for the given ID.");
        }
            }
        }
    }//GEN-LAST:event_getrecordActionPerformed
    
    Patient getPData(int cid){
        for (int i=0; i<allPatient.size(); i++){
            if(allPatient.get(i).getId()==cid){
                return allPatient.get(i);
            }
    }
        return null;
    }
    
    Medicine getMData(int cid){
        for (int i=0; i<allmedicine.size(); i++){
            if(allmedicine.get(i).getId()==cid){
                return allmedicine.get(i);
            }
    }
        return null;
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
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getrecord;
    private javax.swing.JButton home;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea pr;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
