package managementsystem.inventorypkg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package managementsystem

import managementsystem.ButtonConfig;
import managementsystem.inventory;
import managementsystem.Home;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import managementsystem.ButtonConfig;
import managementsystem.DB;
import managementsystem.Home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import managementsystem.DateConfig;
import managementsystem.validation;
import net.proteanit.sql.DbUtils;

/**
/**
 *
 * @author ASUS
 */
public class addinventory extends javax.swing.JFrame {

    double total1 = 0;
    /**
     * Creates new form addinventory
     */
    int xx,xy;
    
    public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
    if(date != null) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
    return null;
}
    
    public void loadtable(){
    
        try{
        Connection c = DB.mycon();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT product_id, product_name, product_description, unit_price, quantity, total_amount  FROM inventory_add";
        pst = c.prepareStatement(sql);
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    }
  
    public addinventory() {
        initComponents();
        loadtable();
        
        //pid.setText("");
        pnme.setText("");
        desc.setText("");
        uprice.setText("");
        qunty.setText("");
        //tot.setText("");
    }
    public boolean isValidName(String name) {
        /*
        Validate Name
        */
        char c;
        for (int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            if (!Character.isLetter(c)) {
                JOptionPane.showMessageDialog(rootPane,"Enter Charactors Only in the 'Product name' Field");
                return false;
                
            }
        }
        return true;
    }
    
    public boolean isValidNumber(String name) {
        /*
        Validate Name
        */
        char c;
        for (int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(rootPane,"Enter Numbers Only in the 'Quantity' Field");
                return false;
                
            }
        }
        return true;
    
    
}
    
    public boolean isValidNumber1(String name) {
        /*
        Validate Name
        */
        char c;
        for (int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(rootPane,"Enter Numbers Only in the 'Unit price' Field");
                return false;
                
            }
        }
        return true;
    
    
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnme = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        qunty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 23, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 23, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 70)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("add inventory");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 22, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 117, 528, 10));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("<");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Product name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        pnme.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pnme.setText("jTextField2");
        pnme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnmeActionPerformed(evt);
            }
        });
        getContentPane().add(pnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 251, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Product description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        desc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        desc.setText("jTextField3");
        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 251, 30));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 278, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Unit price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        uprice.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        uprice.setText("jTextField4");
        uprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upriceActionPerformed(evt);
            }
        });
        getContentPane().add(uprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 251, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product id", "Product name", "Product description", "Unit price", "Quantity", "Total price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 947, 184));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Add inventory");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, -1, -1));

        qunty.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        qunty.setText("jTextField1");
        qunty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quntyActionPerformed(evt);
            }
        });
        getContentPane().add(qunty, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 251, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Date added");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 251, 33));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        ButtonConfig.setColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        ButtonConfig.resetColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
      //  new sales().setVisible(true);
       // this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        ButtonConfig.setColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        ButtonConfig.resetColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        setOpacity((float) 0.95);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
        setOpacity((float) 1.0);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void pnmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnmeActionPerformed
        
        desc.grabFocus();
    }//GEN-LAST:event_pnmeActionPerformed

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        
        uprice.grabFocus();
    }//GEN-LAST:event_descActionPerformed

    private void upriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upriceActionPerformed
       
        qunty.grabFocus();
        
    }//GEN-LAST:event_upriceActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to add?");
               if(x == 0){
                   
               
      
        try{
             if(isValidName(pnme.getText()) == !false && isValidNumber(qunty.getText()) ==  !false && isValidNumber1(uprice.getText()) == !false){
                 
//             Connection con = DB.mycon();
//                Statement s1 = con.createStatement();
//             ResultSet rs = s1.executeQuery("SELECT product_id FROM inventory_add ");
//            if(rs.next()){
//                if(rs.getString("product_id")!=null)
//                 id = rs.getString("product_id");
//                
//            
//            if (pid.equals(id)){
//                JOptionPane.showMessageDialog(null, "Product ID already exists");
//            }
//            }
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//            Vector v = new Vector();
//            
//            v.add(pid.getText());
//            v.add(pnme.getText());
//            v.add(desc.getText());
//            v.add(uprice.getText());
//            v.add(qunty.getText());
//            
            String price = uprice.getText();
            String qty = qunty.getText();
            //String total = tot.getText();
            
            double price1 = Double.parseDouble(price);
            double qty1 = Double.parseDouble(qty);
            double
            
            total1 = (price1 * qty1);
            DecimalFormat d1 = new DecimalFormat("#.00");
            //tot.setText(d1.format(total1));
            
           // v.add(tot.getText());
            //dtm.addRow(v);
            
            Connection c = DB.mycon();
            Statement s = c.createStatement();
           
            s.executeUpdate("INSERT INTO inventory_add (product_name,product_description,unit_price,quantity,total_amount, Date) VALUES ('"+ pnme.getText() +"','"+ desc.getText() +"','"+ uprice.getText() +"','" + qunty.getText() + "','"+ total1 + "', '"+convertUtilDateToSqlDate(date.getDate())+"' )");
            
            //pid.setText("");
            pnme.setText("");
            desc.setText("");
            uprice.setText("");
            qunty.setText("");
            date.setCalendar(null);
            //tot.setText("");
            
            loadtable();
            
            //pid.grabFocus();
            
            JOptionPane.showMessageDialog(rootPane, "Successfully added!");
            }else if(x == 1){
               
               //pid.setText("");
               pnme.setText("");
               desc.setText("");
               uprice.setText("");
               qunty.setText("");
               date.setCalendar(null);
               //tot.setText("");
}
        
        }catch (Exception e){
            e.printStackTrace();
        }
        if((validation.correctDate1(date.getDate()))==false){
               
              JOptionPane.showMessageDialog(null, "Error in date");
 
             }
//        Connection c = DB.mycon();
//        Statement s1 = c.createStatement();
//        ResultSet rs = s1.executeQuery("SELECT product_id FROM inventory_add ");
//        while (rs.next()){
//            if (pid.equals(rs)){
//                JOptionPane.showMessageDialog(null, "Product ID already exists");
//            }
//        }
        
               }             
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void quntyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quntyActionPerformed
      
        //tot.grabFocus();
    }//GEN-LAST:event_quntyActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new inventory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(addinventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addinventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addinventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addinventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addinventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField desc;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pnme;
    private javax.swing.JTextField qunty;
    private javax.swing.JTextField uprice;
    // End of variables declaration//GEN-END:variables
}