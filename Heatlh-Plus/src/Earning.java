
import java.io.File;
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


public class Earning extends javax.swing.JFrame {
               
    private Queue<Medicine> allmedicine; 
    ArrayList<Patient> allpatients = new ArrayList<>();
    ArrayList<BillingInfo> allrecord = new ArrayList<>();
     private DefaultTableModel tableModel;

    public Earning() {
        allmedicine = new Queue<>(100);
        tableModel = new DefaultTableModel(new Object[]{"Earning by Fee", "Earning by Medicine", "Net Earning"}, 0); // Initialize table model here
        initComponents();
       jTable1.setModel(tableModel);
        ReadallMdata();
        ReadallRData();
        getAllEarning();
        setLocationRelativeTo(null); // Center the window on the screen
    }

    
    int getMData(int cid){
        for (int i=0; i<allmedicine.size(); i++){
            if(allmedicine.get(i).getId()==cid){
                return allmedicine.get(i).getSellingPrice()-allmedicine.get(i).getBuyingPrice();
            }
    }
        return 0;
    }
    
   void getAllEarning() {
        int earningByFee = 0;
        int earningByMedicine = 0;
        int netearning = 0;
        for (int i = 0; i < allrecord.size(); i++) {
            earningByFee += allrecord.get(i).getFee();
            ArrayList<Integer> tmp = allrecord.get(i).getMedicineID();
            for (int j = 0; j < tmp.size(); j++) {
                earningByMedicine += getMData(tmp.get(j));
            }
        }

        updateTableModel(earningByFee, earningByMedicine);
    }

    private void updateTableModel(int earningByFee, int earningByMedicine) {
        int netearning = earningByFee + earningByMedicine;
     //   tableModel.setRowCount(0);
        tableModel.addRow(new Object[]{earningByFee, earningByMedicine, netearning});
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 100, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Earning by fee", "Earning by Medicine", "Net Earning"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 410, 250));

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("UPDATE");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 100, 30));

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
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Earning.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Earnings Report");
        MessageFormat footer = new MessageFormat("Page {0}");
        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "There is an error: " + e);
        }
                         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_homeMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        getAllEarning();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
         homepage home = new homepage();
                setVisible(false);
                home.setVisible(true);
                this.dispose();
        
    }//GEN-LAST:event_homeActionPerformed

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
                
                allrecord.add(record);
                
         }
         scanner.close();
   }catch(Exception e){
       
   }
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
            java.util.logging.Logger.getLogger(Earning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Earning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Earning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Earning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Earning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
