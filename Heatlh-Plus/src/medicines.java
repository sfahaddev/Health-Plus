
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class medicines extends javax.swing.JFrame {

    private Queue<Medicine> allmedicine; 

    public medicines() {
        initComponents();
        allmedicine = new Queue<>(100);
        Readalldata();
        
    }
    private boolean isValidID(String id) {
        return Pattern.matches("\\d+", id); // Allows only numeric values
    }
    private boolean isValidName(String name) {
        return Pattern.matches("[a-zA-Z\\s]+", name); // Allows only alphabets and spaces
    }
    private boolean isValidQuantity(String quantity) {
        return Pattern.matches("\\d+", quantity); // Allows only numeric values
    }
    private boolean isValidPrice(String price) {
        return Pattern.matches("\\d+", price); // Allows only numeric value
    }
    private boolean isValidDescription(String description) {
    return Pattern.matches("[\\w\\s.,!?()-]*", description); // Allows alphanumeric, spaces, punctuation, and numbers
}


private void Readalldata() {
   try{
       File pfile = new File("Medicinedata.txt");
       Scanner scanner =new Scanner(pfile);
         while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[]curdata=data.split(";"); 
                Medicine medicine =new Medicine();
                medicine.setId(Integer.parseInt(curdata[0]));
                medicine.setName(curdata[1]);
                medicine.setQuantity(Integer.parseInt(curdata[2]));
                medicine.setSellingPrice(Integer.parseInt(curdata[3]));
                medicine.setBuyingPrice(Integer.parseInt(curdata[4]));
                medicine.setDescription(curdata[5]);
                
                allmedicine.enqueue(medicine);
                
         }
         scanner.close();
   }catch(Exception e){
       
   }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        sprice = new javax.swing.JTextField();
        des = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("BUYING PRICE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Description");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 100, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 180, -1));
        jPanel1.add(sprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 180, -1));
        jPanel1.add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 180, -1));

        Save.setBackground(new java.awt.Color(0, 102, 102));
        Save.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("SAVE");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 90, 30));

        backbtn.setBackground(new java.awt.Color(0, 102, 102));
        backbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 90, 30));
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("SELLING PRICE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 110, -1));
        jPanel1.add(bprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("QUANTITY");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 50, 30));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 180, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/med.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        // TODO add your handling code here:
        homepage backbtn1 = new homepage();
        this.setVisible(false);
        backbtn1.setVisible(true);
    }//GEN-LAST:event_backbtnMouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        //Addmedicine();
        // JOptionPane.showMessageDialog(null,"Inventory updated!");
    }//GEN-LAST:event_SaveMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed
 boolean checkID(){//chcking the id if it already exist in the file or not
           for (int i=0;i<allmedicine.size();i++){
           if(id.getText().equals(allmedicine.get(i).getId()+"")){
               return true;
           }
           }
           return false;
       }
 void Savealldata() { // Saving all the data in the txt file for patient data
    try (FileWriter file = new FileWriter("Medicinedata.txt", false))  { // Append mode
        for (int i = 0; i < allmedicine.size(); i++) {
            file.write(allmedicine.get(i).getId() + ";" +
                       allmedicine.get(i).getName() + ";" +
                       allmedicine.get(i).getQuantity() + ";" +
                       allmedicine.get(i).getSellingPrice() + ";" +
                       allmedicine.get(i).getBuyingPrice() + ";" +
                       allmedicine.get(i).getDescription() + "\n");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
         if (id.getText().isEmpty() || name.getText().isEmpty() || quantity.getText().isEmpty() ||
            sprice.getText().isEmpty() || bprice.getText().isEmpty() || des.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else if (!isValidID(id.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid ID format. Please enter numeric ID.");
        } else if (!isValidName(name.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid name format. Please use alphabets and spaces only.");
        } else if (!isValidQuantity(quantity.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid quantity format. Please enter numeric value.");
        } else if (!isValidPrice(sprice.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid selling price format. Please enter numeric value.");
        } else if (!isValidPrice(bprice.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid buying price format. Please enter numeric value.");
        } else if (!isValidDescription(des.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid description format. Please use alphanumeric characters, spaces, and punctuation.");
        } else if (checkID()) {
            JOptionPane.showMessageDialog(null, "ID already exists");
        } else{
            try{
                Medicine medicine= new Medicine();
                medicine.setId(Integer.parseInt(id.getText()));
                medicine.setName(name.getText());
                medicine.setQuantity(Integer.parseInt(quantity.getText()));
                medicine.setSellingPrice(Integer.parseInt(sprice.getText()));
                medicine.setBuyingPrice(Integer.parseInt(bprice.getText()));
                medicine.setDescription(des.getText());
                allmedicine.enqueue(medicine);
                //clear feild funvtion
                id.setText("");
                name.setText("");
                quantity.setText("");
                des.setText("");
                bprice.setText("");
                sprice.setText("");
                Savealldata();
                           JOptionPane.showMessageDialog(null,"Medicine saved"); 

        }       
            catch (Exception e){
                
            }
            }
    }//GEN-LAST:event_SaveActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicines().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bprice;
    private javax.swing.JTextField des;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField sprice;
    // End of variables declaration//GEN-END:variables
}
