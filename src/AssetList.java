
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Vector;
import MyClasses.Database;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.lang.NullPointerException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class AssetList extends javax.swing.JFrame {
         Database db = new Database();
          Database db2 = new Database();
    /**
     * Creates new form AssetList
     */
    public AssetList() {
        initComponents();
        showAssembleAsset();
        showDirectAsset();
        ShowOndayTBLDetails();
        ShowAnydayTBLDetails();
        Date();
       // showPrice();
       
    }
    
    public void showDirectAsset(){
    
         try  { db.connection();   
          ResultSet rs1;
    String sql = "SELECT AssetNo,AssetName,purchased_date,Life_Time,price FROM direct_purchased";
     rs1 = db.selectQuery(sql);
 
        
    while(rs1.next())
        
    {  String AssetNo = rs1.getString("AssetNo");
       String AssetName = rs1.getString("AssetName");
       String PurchasedDate = rs1.getString("purchased_date");
       String price = rs1.getString("price");
       String category = "Direct purchased";
       String lifeTime = rs1.getString("Life_Time");
       
       
       Object[] content = {AssetNo,AssetName,PurchasedDate,category,lifeTime,price};
       
       DefaultTableModel model =  (DefaultTableModel) JTable1.getModel();
       
       model.addRow(content);
      
    }}
       
  catch(Exception e){
  JOptionPane.showMessageDialog(null, e.getMessage());
  
     }
      }
    
    public void showAssembleAsset(){
    
         try{  db.connection();   
     ResultSet rs1;
    String sql = "SELECT AssetNo,AssetName,DateOfAssemble,Life_Time,totalPrice FROM assemble_asset";
     rs1 = db.selectQuery(sql);
 
        
    while(rs1.next())                           
    {  String AssetNo = rs1.getString("AssetNo");
       String AssetName = rs1.getString("AssetName");
       String AssembledDate = rs1.getString("DateOfAssemble");
       String category = "Assembled Asset";
       String lifeTime = rs1.getString("Life_Time");
       String totPrice = rs1.getString("totalPrice");
       
       Object[] content = {AssetNo,AssetName,AssembledDate,category,lifeTime,totPrice};
       DefaultTableModel model =  (DefaultTableModel) JTable1.getModel();
       model.addRow(content);
    
    
      }
    
  }
  catch(Exception e){
  JOptionPane.showMessageDialog(null, e.getMessage());
  
     }
      }
    
     public void Date(){
         int rows = jTbleOnday.getRowCount();
       for(int row = 0; row<rows; row++){
        String pattern = "yyyy-MM-30";
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
       String date = simpleDateFormat.format(new Date());
       
       DefaultTableModel model =  (DefaultTableModel)jTbleOnday.getModel();
        model.setValueAt(date, row, 2);
       }
     }
   
     
      public void ShowOndayTBLDetails(){
      int rows = JTable1.getRowCount();
      for(int row = 0; row<rows; row++)
     { 
       String AssetNo = (String)JTable1.getValueAt(row, 0);
       String AssetName = (String)JTable1.getValueAt(row, 1);
       
        DefaultTableModel model =  (DefaultTableModel)jTbleOnday.getModel();
                
                 Object[] content = {AssetNo, AssetName};
       
                 model.addRow(content);
     
     
        }}
      
       public void ShowAnydayTBLDetails(){
      int rows = JTable1.getRowCount();
      for(int row = 0; row<rows; row++)
     { 
       String AssetNo = (String)JTable1.getValueAt(row, 0);
       String AssetName = (String)JTable1.getValueAt(row, 1);
       
        DefaultTableModel model =  (DefaultTableModel)jTbleAnyday.getModel();
                
                 Object[] content = {AssetNo, AssetName};
       
                 model.addRow(content);
     
     
        }}
    /**
     *
     * @param AssetNo
     * @param AssetName
     * @param PurchasedDate
     * @param price
     * @param category
     */
      /* AssetList(String AssetNo, String AssetName, String PurchasedDate, String price, String category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
     
    
     } 
   public void showAssembledAssetList(String va1,String va2,String va3,String va4,String va5)
    {     initComponents();
    
         
          this.AssetNo=va1;
          this.AssetName=va2;
          this.PurchasedDate=va3;
          this.category=va4;
          this.price=va5;
          va4="Assemble Asset";
    
           AddDataToTable();
   
     
       }
    
    void AddDataToTable(){
    
     DefaultTbaleModel dt = (DefaultTbaleModel) JTable1.getModel();
      
     Vector v = new Vector(); 
     
     v.add(AssetNo);
     v.add(AssetName);
     v.add(PurchasedDate);
     v.add(category);
     v.add(price);
     
     dt.addRow(v);
     
    
    
        }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable1 = new javax.swing.JTable();
        btnCalTotDep = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        btnAssemble1 = new javax.swing.JButton();
        btnDirect1 = new javax.swing.JButton();
        btnAssetList = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbleAnyday = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbleOnday = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        DteChoser1 = new com.toedter.calendar.JDateChooser();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCalTotDep2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("ASSET LIST");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 10, 280, 50);

        JTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AssetNo ", "AssetName", "Date", "Category", "Life Time", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 140, 850, 260);

        btnCalTotDep.setBackground(new java.awt.Color(0, 153, 153));
        btnCalTotDep.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCalTotDep.setText("Calculate Total Depreciate");
        btnCalTotDep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalTotDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalTotDepActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalTotDep);
        btnCalTotDep.setBounds(40, 770, 210, 50);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 0, 204));

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(153, 153, 153));
        Logout.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        btnAssemble1.setBackground(new java.awt.Color(153, 153, 153));
        btnAssemble1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssemble1.setText("Assemble Asset List");
        btnAssemble1.setActionCommand("Assemble Asset list");
        btnAssemble1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssemble1ActionPerformed(evt);
            }
        });

        btnDirect1.setBackground(new java.awt.Color(153, 153, 153));
        btnDirect1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDirect1.setText("Direct Purchased List");
        btnDirect1.setActionCommand("");
        btnDirect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirect1ActionPerformed(evt);
            }
        });

        btnAssetList.setBackground(new java.awt.Color(153, 153, 153));
        btnAssetList.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssetList.setText("Dispose Asset");
        btnAssetList.setActionCommand("");
        btnAssetList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssetListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnAssemble1)
                .addGap(102, 102, 102)
                .addComponent(btnDirect1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(btnAssetList, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnAssetList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnAssemble1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnDirect1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 70, 1320, 40);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Save Asset List");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(900, 140, 150, 60);

        jTbleAnyday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AssetNo", "Asset Name", "Depreciate Amount"
            }
        ));
        jScrollPane2.setViewportView(jTbleAnyday);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(740, 500, 540, 250);

        jTbleOnday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AssetNo", "Asset Name", "DepriciateDate", "Depreciate Amount"
            }
        ));
        jScrollPane3.setViewportView(jTbleOnday);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(40, 500, 570, 250);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Select a Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(880, 450, 120, 30);
        getContentPane().add(DteChoser1);
        DteChoser1.setBounds(1030, 440, 250, 40);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(510, 770, 100, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(1140, 770, 140, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Total Depreciate Amount");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(910, 770, 240, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("Total Depreciate Amount");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 760, 230, 50);

        btnCalTotDep2.setBackground(new java.awt.Color(0, 153, 153));
        btnCalTotDep2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCalTotDep2.setText("Calculate Total Depreciate");
        btnCalTotDep2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalTotDep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalTotDep2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalTotDep2);
        btnCalTotDep2.setBounds(700, 770, 210, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appvantage-digital-automotive-solutions-business-intelligence.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1310, 870);

        setSize(new java.awt.Dimension(1321, 908));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        new signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void btnCalTotDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalTotDepActionPerformed
        DefaultTableModel model =  (DefaultTableModel)JTable1.getModel();
        int rows = JTable1.getRowCount();
        try{
       for(int row=0;row<=rows;row++){
       
        String lifetime = (String) model.getValueAt(row, 4);
    int lifetimei = Integer.parseInt(lifetime );
    String price =  (String) model.getValueAt(row, 5);
    double pricei = Double.parseDouble(price);
    String date =  (String)model.getValueAt(row, 2);
    DefaultTableModel model2 =  (DefaultTableModel)jTbleOnday.getModel();
    String Depdate = (String)model2.getValueAt(row, 2);
    
    DateFormat formatter;
    Date dd1;
    Date dd2;
    formatter = new SimpleDateFormat("yyyy-MM-dd");
   
    dd1 = (Date)formatter.parse(date);
    dd2 = (Date)formatter.parse(Depdate);  
    
     long diff = dd2.getTime() - dd1.getTime();
   
   long sec = diff / 1000 % 60;
   long min = diff/(60*1000) % 60;
   long hours = diff /(60*60*1000);
   long days = hours/24;
   long months = days/30;
   //JOptionPane.showMessageDialog(null,days );
   
     double amt;
      double tot = 0.0;
      
       amt =((pricei/(lifetimei*365))*days) ;
    double roundAmt = Math.round(amt*100)/100;
    String roundAmtS = String.valueOf(roundAmt);
    
     tot=tot+roundAmt;
     model2.setValueAt(roundAmtS, row, 3);
     
     String tots = String.valueOf(tot);
    jTextField4.setText(tots);
       }
         
        
        
        }
        
         catch(Exception e)
     { //JOptionPane.showMessageDialog(this,e.getMessage());
       
     }      
    }//GEN-LAST:event_btnCalTotDepActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             db.connection();
             String txtVAlue = jTextField4.getText();
              
             if("".equals(txtVAlue)){
                 JOptionPane.showMessageDialog(null,"Please Calculate On Month Depreciation");
             }
             else{
        try{
        int rows = JTable1.getRowCount();
       
        for(int row = 0; row<rows; row++)
     { 
       String AssetNo = (String)JTable1.getValueAt(row, 0);
       String AssetName = (String)JTable1.getValueAt(row, 1);
       String date = (String)JTable1.getValueAt(row, 2);  
       String category = (String)JTable1.getValueAt(row, 3);
       String price = (String)JTable1.getValueAt(row, 5);
       String DepDate = (String)jTbleOnday.getValueAt(row, 2);
       String DepAmt = (String)jTbleOnday.getValueAt(row, 3);
       String DepAmount = String.valueOf(DepAmt) ;
       
     //  String wrkngPRogNo = jTextField2.getText();
       String sql = "INSERT INTO depreciated_assetlist(AssetNo,AssetName,Date,Category,price,Depreciate_Date,Depreciate_Amt) VALUES('"+AssetNo+"','"+AssetName+"','"+date+"','"+category+"','"+price+"','"+DepDate+"','"+DepAmount+"')";
      
    
         int i = db.updateQuery(sql);
       
        if(i>0)
      //  {JOptionPane.showMessageDialog(null,"Successfully added!");
           
          
       // }
       if(i<0)
        { JOptionPane.showMessageDialog(null,"Not entered");
        }
        
         } 
         for(int row = 0; row<rows; row++){
         
          String AssetNo = (String)JTable1.getValueAt(row, 0);
       String AssetName = (String)JTable1.getValueAt(row, 1);
       String date = (String)JTable1.getValueAt(row, 2);  
       String category = (String)JTable1.getValueAt(row, 3);
       String price = (String)JTable1.getValueAt(row, 5);
         
          String sql = "INSERT INTO assets_header_table(AssetNo,AssetName,Date,Category,price) VALUES('"+AssetNo+"','"+AssetName+"','"+date+"','"+category+"','"+price+"')";
         int i = db.updateQuery(sql);
           if(i<0)
        { JOptionPane.showMessageDialog(null,"Not entered");
        }
         
         }
        
        
    JOptionPane.showMessageDialog(null,"Successfully added!");
        
        }
       catch(Exception e)
       { JOptionPane.showMessageDialog(this,e.getMessage());
       
       }}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAssemble1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssemble1ActionPerformed
        new AssembledAssetList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssemble1ActionPerformed

    private void btnDirect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirect1ActionPerformed
        new DirectPurchasedAssetList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDirect1ActionPerformed

    private void btnAssetListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssetListActionPerformed
        new dispose().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssetListActionPerformed

    private void btnCalTotDep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalTotDep2ActionPerformed
        DefaultTableModel model =  (DefaultTableModel)JTable1.getModel();
        int rows = JTable1.getRowCount();
        try{
       for(int row=0;row<=rows;row++){
       
        String lifetime = (String) model.getValueAt(row, 4);
    int lifetimei = Integer.parseInt(lifetime );
    String price =  (String) model.getValueAt(row, 5);
    double pricei = Double.parseDouble(price);
    String date =  (String)model.getValueAt(row, 2);
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       String Depdate = sdf.format(DteChoser1.getDate());
       
    DefaultTableModel model2 =  (DefaultTableModel)jTbleAnyday.getModel();
   // String Depdatei = (String)model2.getValueAt(row, 2);
    
    DateFormat formatter;
    Date dd1;
    Date dd2;
    formatter = new SimpleDateFormat("yyyy-MM-dd");
   
    dd1 = (Date)formatter.parse(date);
    dd2 = (Date)formatter.parse(Depdate);  
    
     long diff = dd2.getTime() - dd1.getTime();
   
   long sec = diff / 1000 % 60;
   long min = diff/(60*1000) % 60;
   long hours = diff /(60*60*1000);
   long days = hours/24;
   long months = days/30;
   //JOptionPane.showMessageDialog(null,days );
   
     double amt;
      double tot = 0.0;
      
       amt =((pricei/(lifetimei*365))*days) ;
    double roundAmt = Math.round(amt*100)/100;
    String roundAmtS = String.valueOf(roundAmt);
    
     
     model2.setValueAt(roundAmtS, row, 2);
     tot=tot+roundAmt;
     String tots = String.valueOf(tot);
    jTextField3.setText(tots);
       }
         
        
        
        }
        
         catch(Exception e)
     { //JOptionPane.showMessageDialog(this,e.getMessage());
       
     }      
    }//GEN-LAST:event_btnCalTotDep2ActionPerformed

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
            java.util.logging.Logger.getLogger(AssetList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssetList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssetList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssetList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssetList().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DteChoser1;
    public javax.swing.JTable JTable1;
    private javax.swing.JButton Logout;
    private javax.swing.JButton btnAssemble1;
    private javax.swing.JButton btnAssetList;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalTotDep;
    private javax.swing.JButton btnCalTotDep2;
    private javax.swing.JButton btnDirect1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTbleAnyday;
    private javax.swing.JTable jTbleOnday;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
