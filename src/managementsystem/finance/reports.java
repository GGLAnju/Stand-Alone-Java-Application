/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementsystem.finance;

//import javax.swing.text.Document;
import com.itextpdf.text.BaseColor;
import managementsystem.ButtonConfig;
import managementsystem.Finance;
import managementsystem.Home;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.util.*;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import managementsystem.DB;
import java.awt.Desktop;
import java.awt.Font;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author KALINDU
 */
public class reports extends javax.swing.JFrame {

    /**
     * Creates new form reports
     */
    
    int xx,xy;
    
    public reports() {
        initComponents();
        jLabel14.setVisible(false);
        date();
        time();
       
    }
    
    
      public void date() {
        new javax.swing.Timer(0, (ActionEvent e) -> {
            Date ddate = Calendar.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            String Date = dateFormat.format(ddate);
            date.setText(Date);
        }).start();;

    }
        
        
    public void time() {
        new javax.swing.Timer(0, (ActionEvent e) -> {

            Date date = Calendar.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            String strDate = dateFormat.format(date);
            time.setText(strDate);
        }).start();;

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
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
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

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 100)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("reports");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 520, 10));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("<");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managementsystem/Images/finance/reports.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 0, 192, 160));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("go back to finance menu");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 160));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(210, 210, 210));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setPreferredSize(new java.awt.Dimension(209, 192));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("income ");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managementsystem/Images/finance/income.png"))); // NOI18N
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 150));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 370, -1));

        jPanel7.setBackground(new java.awt.Color(210, 210, 210));
        jPanel7.setPreferredSize(new java.awt.Dimension(209, 192));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("costs");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managementsystem/Images/finance/costs.png"))); // NOI18N
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 150));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 370, -1));

        jPanel8.setBackground(new java.awt.Color(210, 210, 210));
        jPanel8.setPreferredSize(new java.awt.Dimension(209, 192));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("cheques");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managementsystem/Images/finance/cheque.png"))); // NOI18N
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 13, -1, 144));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 370, -1));

        jPanel3.setBackground(new java.awt.Color(210, 210, 210));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managementsystem/finance/images/home.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel2.setText("home");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 115, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("create your pdfs in here");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        time.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        time.setForeground(new java.awt.Color(0, 102, 102));
        time.setText("jLabel14");
        jPanel2.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 510, -1, -1));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(0, 102, 102));
        date.setText("jLabel15");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 480, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1190, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        
        
        
        String src= null;
        String income = null;   
        String date = null;
        
        try {
        Connection c = DB.mycon();
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT source, amount, date FROM income ");
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Income_Report.pdf"));
        document.open();          
        document.add(new Paragraph("Incomes",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD)));
        document.add(new Paragraph("  "));
        document.add(new Paragraph(new Date().toString()));
        document.add(new Paragraph("The following report shows the incomes in Rajapura Wedhamadura"));
        document.add(new Paragraph("____________________________________________________________________________"));
        document.add(new Paragraph("  "));
        PdfPTable table = new PdfPTable(3);
        table.setWidthPercentage(110);
        PdfPCell cell=new PdfPCell(new Paragraph("Income Details"));
        cell.setColspan(3);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setBackgroundColor(BaseColor.GRAY);
        table.addCell(cell);
        PdfPCell cell1 = new PdfPCell(new Paragraph("source"));
        cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell1);
        PdfPCell cell2 = new PdfPCell(new Paragraph("amount"));
        cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell2);
        PdfPCell cell3 = new PdfPCell(new Paragraph("date"));
        cell3.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell3);
//        table.addCell("source");
//        table.addCell("amount");
//        table.addCell("date");
        
        
        
        
           
        while (rs.next()) {
            src = (rs.getString("source"));
            income = (rs.getString("amount"));
            date = (rs.getString("date"));
           

            table.addCell(src);
            table.addCell(income);
            table.addCell(date);

            //document.add(table);

        }
        document.add(table);
        Image image = Image.getInstance("raja_1.png");
        document.add(image);
        document.close();
        int x = JOptionPane.showConfirmDialog(rootPane, "Report Saved. Do you want to open?");
        if (x==0){
            try{
               
               Desktop.getDesktop().open(new File("C:/Users/KALINDU/Documents/NetBeansProjects/ManagementSystem/Income_Report.pdf"));

            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error!");
            }
        
        
        }else if(x==1) {
            JOptionPane.showMessageDialog(null, "Report Saved to HDD!");  
        } 

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error!");
        e.printStackTrace();
    }
        
      
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
        ButtonConfig.resetColor(jPanel6);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        // TODO add your handling code here:
        ButtonConfig.resetColor2(jPanel6);
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        
        //String idno = null;
        String source = null;   
        String amount = null;
        String date = null;
        try {
        Connection c = DB.mycon();
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT source, amount, date FROM costs");
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Cost_Report.pdf"));
        document.open();          
        document.add(new Paragraph("Costs",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD)));
        document.add(new Paragraph("  "));
        document.add(new Paragraph(new Date().toString()));
        document.add(new Paragraph("The following report shows the pending cheques in Rajapura Wedhamadura"));
        document.add(new Paragraph("____________________________________________________________________________"));
        document.add(new Paragraph("  "));
        PdfPTable table = new PdfPTable(3);
        table.setWidthPercentage(110);
        PdfPCell cell=new PdfPCell(new Paragraph("Cost Details"));
        cell.setColspan(3);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setBackgroundColor(BaseColor.GRAY);
        table.addCell(cell);      
//        PdfPCell cell1=new PdfPCell(new Paragraph("idno"));
//        cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
//        table.addCell(cell1);
        PdfPCell cell2=new PdfPCell(new Paragraph("source"));
        cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell2);
        PdfPCell cell3 = new PdfPCell(new Paragraph("amount"));
        cell3.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell3);
        PdfPCell cell4 = new PdfPCell(new Paragraph("date"));
        cell4.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell4);
           
        while (rs.next()) {
            //idno = (rs.getString("idno"));
            source = (rs.getString("source"));
            amount = (rs.getString("amount"));
            date = (rs.getString("date"));

            //table.addCell(idno);
            table.addCell(source);
            table.addCell(amount);
            table.addCell(date);
                               
        }
        document.add(table);
        Image image = Image.getInstance("raja_1.png");
        document.add(image);
        document.close();
        int x = JOptionPane.showConfirmDialog(rootPane, "Report Saved. Do you want to open?");
        if (x==0){
            try{
               
               Desktop.getDesktop().open(new File("C:/Users/KALINDU/Documents/NetBeansProjects/ManagementSystem/Cost_Report.pdf"));

            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error!");
            }
        
        
        }else if(x==1) {
            JOptionPane.showMessageDialog(null, "Report Saved to HDD!");  
        }
        

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error!");
        e.printStackTrace();
    }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
        ButtonConfig.resetColor(jPanel7);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
        ButtonConfig.resetColor2(jPanel7);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here;
        String cheque_id = null;
        String bank = null;   
        String income = null;
        String account_type = null;
        String account_number = null;
        String date = null;
        try {
        Connection c = DB.mycon();
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT cheque_id,bank,income,account_type,account_number,date FROM finance_cheq");
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("‪Cheque_Report.pdf"));
        document.open();          
        document.add(new Paragraph("Pending Cheques",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD)));
        document.add(new Paragraph("  "));
        document.add(new Paragraph(new Date().toString()));
        document.add(new Paragraph("The following report shows the pending cheques in Rajapura Wedhamadura"));
        document.add(new Paragraph("____________________________________________________________________________"));
        document.add(new Paragraph("   "));
        PdfPTable table = new PdfPTable(6);
        table.setWidthPercentage(105);
        PdfPCell cell=new PdfPCell(new Paragraph("Cheque Details"));
        cell.setColspan(6);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setBackgroundColor(BaseColor.GRAY);
        table.addCell(cell);
        PdfPCell cell1=new PdfPCell(new Paragraph("cheque id"));
        cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell1);
        PdfPCell cell2=new PdfPCell(new Paragraph("bank"));
        cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell2);
        PdfPCell cell3=new PdfPCell(new Paragraph("income"));
        cell3.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell3);
        PdfPCell cell4=new PdfPCell(new Paragraph("account type"));
        cell4.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell4);
//        PdfPCell cell5=new PdfPCell(new Paragraph("account name"));
//        cell5.setBackgroundColor(BaseColor.LIGHT_GRAY);
//        table.addCell(cell5);
        PdfPCell cell6=new PdfPCell(new Paragraph("account number"));
        cell6.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell6);
        PdfPCell cell7=new PdfPCell(new Paragraph("date"));
        cell7.setBackgroundColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell7);
        //table.addCell("cheque id");
        //table.addCell("bank");
        //table.addCell("income");
//        table.addCell("account type");
//        table.addCell("account number");
//        table.addCell("date");
//        
        
        
           
        while (rs.next()) {
            
            cheque_id = (rs.getString("cheque_id"));
            bank = (rs.getString("bank"));
            income = (rs.getString("income"));
            account_type = (rs.getString("account_type"));
            account_number = (rs.getString("account_number"));
            date=(rs.getString("date"));

            table.addCell(cheque_id);
            table.addCell(bank);
            table.addCell(income);
            table.addCell(account_type);
            table.addCell(account_number);
            table.addCell(date);
           

        }
        document.add(table);
        Image image = Image.getInstance("raja_1.png");
        document.add(image);
        document.close();
        
        int x = JOptionPane.showConfirmDialog(rootPane, "Report Saved. Do you want to open?");
        if (x==0){
            try{
             
               Desktop.getDesktop().open(new File("C:/Users/KALINDU/Documents/NetBeansProjects/ManagementSystem/Cheque_Report.pdf"));

            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error!");
            }
        
        
        }else if(x==1) {
            JOptionPane.showMessageDialog(null, "Report Saved to HDD!");  
        } 

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error!");
        e.printStackTrace();
    }
        
      
 
       
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        // TODO add your handling code here:
        ButtonConfig.resetColor(jPanel8);
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        // TODO add your handling code here:
        ButtonConfig.resetColor2(jPanel8);
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        ButtonConfig.resetColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        ButtonConfig.resetColor2(jPanel3);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        new Finance().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        ButtonConfig.setColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        ButtonConfig.resetColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        new Finance().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
        ButtonConfig.setColor(jPanel5);
        jLabel14.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
        ButtonConfig.resetColor(jPanel5);
        jLabel14.setVisible(false);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        setOpacity((float)0.95);
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
        setOpacity((float)1.0);
    }//GEN-LAST:event_jPanel1MouseReleased

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
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
