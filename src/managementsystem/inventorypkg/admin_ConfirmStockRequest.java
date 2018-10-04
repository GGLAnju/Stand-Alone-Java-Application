package managementsystem.inventorypkg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package managementsystem.inventory;
import managementsystem.inventory;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import managementsystem.ButtonConfig;
import managementsystem.DB;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class admin_ConfirmStockRequest extends javax.swing.JFrame {

    int xx, xy;

    String idno1 = null;
    String pid1 = null;
    String pname1 = null;
    String qty1 = null;
    String sid1 = null;
    String sname1 = null;
    String semail1 = null;
    String spec1 = null;

    /**
     * Creates new form admin_ConfirmStockRequest
     */
    public admin_ConfirmStockRequest() {
        initComponents();
        loadtable();

    }

    private void loadtable() {

        try {
            Connection c = DB.mycon();
            PreparedStatement pst = null;
            ResultSet rs = null;
            String sql = "SELECT idno, product_id, product_name, quantity, special_requirements,supplier_id,supplier_name,supplier_email FROM stock_requests where status = false";
            pst = c.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 50)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Confirm Stock Request");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 23, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 528, 10));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("<");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Logout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 110));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Product ID", "Product Name", "Quantity Required", "Special Requirements", "Supplier Email"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 1060, 220));

        jButton2.setText("Confirm Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to place order?");
        if (x == 0) {
            try {
                //  if(isValidName(pnme.getText()) == !false && isValidNumber(qty.getText()) ==  !false && isValidName1(snme.getText()) == !false && isValidEmail(semail.getText()) == !false){
                Connection c = DB.mycon();
//            Statement s = c.createStatement();
//            s.executeUpdate("INSERT INTO request_stock (date,product_id,product_name,supplier_id,supplier_name,supplier_email,quantity,requirment) VALUES ('"+ date.getText() +"','" + pid.getText() +"','"+ pnme.getText() +"','" + sid.getText() + "','" + snme.getText() + "','" + semail.getText() + "','" + qty.getText() +"','" + spec.getText() + "')");

//            String supplier = semail.getText();
//            String prodID = pid.getText();
//            //System.out.println(prodID);
//            String prodName = pnme.getText();
//            String quantity = qty.getText();
//            String req = spec.getText();
                final String username = "rwedhamadura@gmail.com";
                final String password = "rajapura123";

                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");

                Session session = null;
                session = session.getInstance(props, new javax.mail.Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

                try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress("rwedhamadura@gmail.com"));
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(semail1));
                    message.setSubject("Request Stock");
                    message.setContent("<body>This message is a request for more "
                            + "stock from the following product. <br><br>"
                            + ""
                            + ""
                            + "Product ID:" + pid1
                            + "<br>Product Name: " + pname1
                            + "<br> Quantity Required: " + qty1
                            + "<br> Special Requirements: " + spec1
                            + ""
                            + "<br><br>"
                            + "Thank you! "
                            + "<br>Rajapura Wedhamadura</body>", "text/html");
                    //System.out.println(prodID);

                    Transport.send(message);
                    System.out.println("Email sent");

                    Statement st = c.createStatement();
                    st.executeUpdate("update stock_requests set status=true where idno=" + idno1 + "");

                    //Connection con = DB.mycon();    
                    // Statement st = c.createStatement();
                    //  ResultSet rs;
                    //      rs = st.executeQuery("delete from stock_requests where product_id ='" + pid1 + "'");
                    loadtable();

                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }

                JOptionPane.showMessageDialog(rootPane, "Order has been placed! Email has ben sent!");

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (x == 1) {
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        int r = jTable1.getSelectedRow();
        idno1 = jTable1.getValueAt(r, 0).toString();
        pid1 = jTable1.getValueAt(r, 1).toString();
        pname1 = jTable1.getValueAt(r, 2).toString();
        qty1 = jTable1.getValueAt(r, 3).toString();
        spec1 = jTable1.getValueAt(r, 4).toString();
        sid1 = jTable1.getValueAt(r, 5).toString();
        sname1 = jTable1.getValueAt(r, 6).toString();
        semail1 = jTable1.getValueAt(r, 7).toString();
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new adminHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        //new loginoptions.setVisible(true);
        
        new loginoptions().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(admin_ConfirmStockRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_ConfirmStockRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_ConfirmStockRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_ConfirmStockRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_ConfirmStockRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
