import MyClasses.Database;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import java.io.FileOutputStream;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.print.PrinterException;
import java.io.*;
import java.text.MessageFormat;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.*;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;

import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Reports extends javax.swing.JFrame {
                Database db = new Database();
    /**
     * Creates new form Reports
     */
    public Reports() {
        initComponents();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DirectPurcasedLBL = new javax.swing.JLabel();
        AssembledLBL = new javax.swing.JLabel();
        depassetlist = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Monthly Reports");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 0, 410, 90);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 120, 920, 10);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        DirectPurcasedLBL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DirectPurcasedLBL.setText("Monthly Direct Purchased Depreciation Report");
        DirectPurcasedLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DirectPurcasedLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DirectPurcasedLBLMouseClicked(evt);
            }
        });
        jPanel2.add(DirectPurcasedLBL);
        DirectPurcasedLBL.setBounds(140, 50, 420, 50);

        AssembledLBL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AssembledLBL.setText("Monthly Assembled Asset Depreciation Report");
        AssembledLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AssembledLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssembledLBLMouseClicked(evt);
            }
        });
        jPanel2.add(AssembledLBL);
        AssembledLBL.setBounds(140, 130, 420, 50);

        depassetlist.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        depassetlist.setText("Monthly Fixed Asset Depreciation Report");
        depassetlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depassetlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depassetlistMouseClicked(evt);
            }
        });
        jPanel2.add(depassetlist);
        depassetlist.setBounds(140, 210, 420, 50);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Monthly Working Progress Report");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(140, 290, 360, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 120, 920, 360);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 40, 100, 30);

        setSize(new java.awt.Dimension(935, 534));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DirectPurcasedLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DirectPurcasedLBLMouseClicked
     
       try{
     Document document = new Document();
          PdfWriter.getInstance(document,new FileOutputStream("data2.pdf"));
          document.open();
          document.add(new Paragraph("                                                       Alerics Diary Products (PVT).LTD                                           "));
           document.add(new Paragraph("                                                 Monthly Direct Purchased Depreciation Report                                         "));
            document.add(new Paragraph("                       DATE : 2019/06/30 ")); 
          document.add(new Paragraph("")); 
  
         
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
           document.add(new Paragraph("------------------------------------------------------------------------------------------------------------------------")); 
            document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
    document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
          PdfPTable tab=new PdfPTable(8);
          tab.addCell("AssetNo");
          tab.addCell("AssetName");
          tab.addCell("Date");
          tab.addCell("Category");
          tab.addCell("Life Time");
          tab.addCell("Price");
          tab.addCell("Depreciate Date");
          tab.addCell("Depreciate Amt");
          
          
 
   
           db.connection();   
          ResultSet rs1;
    String sql = "SELECT * FROM depriciated_direct_assetlist";
     rs1 = db.selectQuery(sql);
           while(rs1.next())
        
    {  String AssetNo = rs1.getString("AssetNo");
       String AssetName = rs1.getString("AssetName");
       String Date = rs1.getString("purchased_date");
       String price = rs1.getString("price");
       String category = rs1.getString("category");
       String lifeTime = rs1.getString("Life_Time");
       String DepDate = rs1.getString("Depriciate_Date");
       String DepAmt = rs1.getString("Depriciate_Amt");
            
   String value1= AssetNo;
   String value2= AssetName;
   String value3=Date;
   String value4=category;
   String value5=lifeTime;
    String value6=price;
     String value7=DepDate;
      String value8=DepAmt;
    
   
   
   tab.addCell(value1);
   tab.addCell(value2);
   tab.addCell(value3);
   tab.addCell(value4);
   tab.addCell(value5);
   tab.addCell(value6);
   tab.addCell(value7);
   tab.addCell(value8);
    }
  // }
   document.add(tab);
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("                                                                                                        Mr.Yasiru Senanayake    ")); 
   document.add(new Paragraph("                                                                                                        Asssets Manager    ")); 
   document.add(new Paragraph("                                                                                                        Alerics diary products PVT.LTD ")); 
   document.add(new Paragraph("")); 
   document.close();
   File myFile = new File("D:\\UpdatedFinalViva\\data2.pdf");
                        Desktop.getDesktop().open(myFile);

          

          
    
    
            
          
         
    
        }
        catch(Exception e){
  JOptionPane.showMessageDialog(null, e.getMessage());
  
     }
        
        


    }//GEN-LAST:event_DirectPurcasedLBLMouseClicked

    private void AssembledLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssembledLBLMouseClicked

           try{
     Document document = new Document();
          PdfWriter.getInstance(document,new FileOutputStream("data3.pdf"));
          document.open();
          document.add(new Paragraph("                                                       Alerics Diary Products (PVT).LTD                                           "));
           document.add(new Paragraph("                                                   Monthly Depreciated Assembled Asset Report                                         "));
            document.add(new Paragraph("                       DATE : 2019/06/30 ")); 
          document.add(new Paragraph("")); 
  
         
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
           document.add(new Paragraph("------------------------------------------------------------------------------------------------------------------------")); 
            document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
    document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
          PdfPTable tab=new PdfPTable(8);
          tab.addCell("Asset No");
          tab.addCell("Asset Name            ");
          tab.addCell("Date");
          tab.addCell("Category                       ");
          tab.addCell("Life Time");
          tab.addCell("Price   ");
          tab.addCell("Depreciate Date            ");
          tab.addCell("Depreciate Amt           ");
          
          
 
   
           db.connection();   
          ResultSet rs1;
    String sql = "SELECT * FROM depreciated_assembled_assetlist";
     rs1 = db.selectQuery(sql);
           while(rs1.next())
        
    {  String AssetNo = rs1.getString("AssetNo");
       String AssetName = rs1.getString("AssetName");
       String Date = rs1.getString("DateOfAssemble");
       String price = rs1.getString("totprice");
       String category = rs1.getString("category");
       String lifeTime = rs1.getString("Life_Time");
       String DepDate = rs1.getString("Depreciate_Date");
       String DepAmt = rs1.getString("Depriciated_Amt");
            
   String value1= AssetNo;
   String value2= AssetName;
   String value3=Date;
   String value4=category;
   String value5=lifeTime;
    String value6=price;
     String value7=DepDate;
      String value8=DepAmt;
    
   
   
   tab.addCell(value1);
   tab.addCell(value2);
   tab.addCell(value3);
   tab.addCell(value4);
   tab.addCell(value5);
   tab.addCell(value6);
   tab.addCell(value7);
   tab.addCell(value8);
    }
  // }
   document.add(tab);
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("                                                                                                        Mr.Yasiru Senanayake    ")); 
   document.add(new Paragraph("                                                                                                        Asssets Manager    ")); 
   document.add(new Paragraph("                                                                                                        Alerics diary products PVT.LTD ")); 
   document.add(new Paragraph("")); 
   document.close();
   File myFile = new File("D:\\UpdatedFinalViva\\data3.pdf");
                        Desktop.getDesktop().open(myFile);

          

          
    
    
            
          
         
    
        }
        catch(Exception e){
  JOptionPane.showMessageDialog(null, e.getMessage());
  
     }
        
        
        
    }//GEN-LAST:event_AssembledLBLMouseClicked

    private void depassetlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depassetlistMouseClicked
       
         try{
     Document document = new Document();
          PdfWriter.getInstance(document,new FileOutputStream("data3.pdf"));
          document.open();
          document.add(new Paragraph("                                                       Alerics Diary Products (PVT).LTD                                           "));
           document.add(new Paragraph("                                                     Monthly Depreciated AssetList Report                                         "));
            document.add(new Paragraph("                       DATE : 2019/06/30 ")); 
          document.add(new Paragraph("")); 
  
         
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
           document.add(new Paragraph("------------------------------------------------------------------------------------------------------------------------")); 
            document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
    document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
          PdfPTable tab=new PdfPTable(7);
          tab.addCell("Asset No");
          tab.addCell("Asset Name            ");
          tab.addCell("Date");
          tab.addCell("Category                       ");
          tab.addCell("Price   ");
          tab.addCell("Depreciate Date            ");
          tab.addCell("Depreciate Amt           ");
          
          
 
   
           db.connection();   
          ResultSet rs1;
    String sql = "SELECT * FROM depreciated_assetlist";
     rs1 = db.selectQuery(sql);
           while(rs1.next())
        
    {  String AssetNo = rs1.getString("AssetNo");
       String AssetName = rs1.getString("AssetName");
       String Date = rs1.getString("Date");
       String category = rs1.getString("Category");
       String price = rs1.getString("price");
       String DepDate = rs1.getString("Depreciate_Date");
       String DepAmt = rs1.getString("Depreciate_Amt");
      
            
   String value1= AssetNo;
   String value2= AssetName;
   String value3=Date;
   String value4=category;
    String value5=price;
     String value6=DepDate;
      String value7=DepAmt;
    
   
   
   tab.addCell(value1);
   tab.addCell(value2);
   tab.addCell(value3);
   tab.addCell(value4);
   tab.addCell(value5);
   tab.addCell(value6);
   tab.addCell(value7);
  
    }
  // }
   document.add(tab);
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("                                                                                                        Mr.Yasiru Senanayake    ")); 
   document.add(new Paragraph("                                                                                                        Asssets Manager    ")); 
   document.add(new Paragraph("                                                                                                        Alerics diary products PVT.LTD ")); 
   document.add(new Paragraph("")); 
   document.close();
   File myFile = new File("D:\\UpdatedFinalViva\\data3.pdf");
                        Desktop.getDesktop().open(myFile);

          

          
    
    
            
          
         
    
        }
        catch(Exception e){
  JOptionPane.showMessageDialog(null, e.getMessage());
  
     }
        
    }//GEN-LAST:event_depassetlistMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

         try{
     Document document = new Document();
          PdfWriter.getInstance(document,new FileOutputStream("data4.pdf"));
          document.open();
          document.add(new Paragraph("                                                       Alerics Diary Products (PVT).LTD                                           "));
           document.add(new Paragraph("                                                       Monthly Working Progress Report                                         "));
            document.add(new Paragraph("                       DATE : 2019/06/30 ")); 
          document.add(new Paragraph("")); 
  
         
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
           document.add(new Paragraph("------------------------------------------------------------------------------------------------------------------------")); 
            document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
    document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
          PdfPTable tab=new PdfPTable(8);
          tab.addCell("Asset No");
          tab.addCell("Asset Name            ");
          tab.addCell("Category");
          tab.addCell("Life Time                       ");
          tab.addCell("Startingdate           ");
          tab.addCell("HoldDate         ");
           tab.addCell("SatusOfTheAsset         ");
            tab.addCell("totprice        ");
          
          
 
   
           db.connection();   
          ResultSet rs1;
    String sql = "SELECT * FROM working_progress";
     rs1 = db.selectQuery(sql);
           while(rs1.next())
        
    {  String AssetNo = rs1.getString("AssetNo");
       String AssetName = rs1.getString("AssetName");
       String category = rs1.getString("category");
       String lifeTime = rs1.getString("LifeTime");
       String startingDate = rs1.getString("Startingdate");
       String HoldDate = rs1.getString("HoldDate");
       String status = rs1.getString("SatusOfTheAsset");
       String tot = rs1.getString("totprice");
            
   String value1= AssetNo;
   String value2= AssetName;
   String value3=category;
   String value4=lifeTime;
   String value5=startingDate;
    String value6=HoldDate;
     String value7= status;
      String value8=tot;
    
   
   
   tab.addCell(value1);
   tab.addCell(value2);
   tab.addCell(value3);
   tab.addCell(value4);
   tab.addCell(value5);
   tab.addCell(value6);
   tab.addCell(value7);
   tab.addCell(value8);
    }
  // }
   document.add(tab);
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("")); 
   document.add(new Paragraph("                                                                                                        Mr.Yasiru Senanayake    ")); 
   document.add(new Paragraph("                                                                                                        Asssets Manager    ")); 
   document.add(new Paragraph("                                                                                                        Alerics diary products PVT.LTD ")); 
   document.add(new Paragraph("")); 
   document.close();
   File myFile = new File("D:\\UpdatedFinalViva\\data4.pdf");
                        Desktop.getDesktop().open(myFile);

          

          
    
    
            
          
         
    
        }
        catch(Exception e){
  JOptionPane.showMessageDialog(null, e.getMessage());
  
     }
        
        
        
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssembledLBL;
    private javax.swing.JLabel DirectPurcasedLBL;
    private javax.swing.JLabel depassetlist;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}