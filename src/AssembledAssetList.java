import MyClasses.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class AssembledAssetList extends javax.swing.JFrame {
            Database db = new Database();
           
    /**      
     * Creates new form AssembledAssetList
     */
    public AssembledAssetList() {
        initComponents();
        showTable();
         showPrice();
         ShowAnydayTBLDetails();
         ShowOndayTBLDetails();
          Date();

         
    }
  public void showTable(){

 try{  db.connection();   
     ResultSet rs1;
    String sql = "SELECT AssetNo,AssetName,DateOfAssemble,Life_Time FROM assemble_asset";
     rs1 = db.selectQuery(sql);
  
 
        
    while(rs1.next())                           
    {  String AssetNo = rs1.getString("AssetNo");
       String AssetName = rs1.getString("AssetName");
       String AssembledDate = rs1.getString("DateOfAssemble");
       String lifeTime = rs1.getString("Life_Time");
     
       Object[] content = {AssetNo,AssetName,AssembledDate,lifeTime};
       DefaultTableModel model =  (DefaultTableModel) jTable2.getModel();
       model.addRow(content);
    
    }
  }
  catch(Exception e){
  JOptionPane.showMessageDialog(null, e.getMessage());
  
     }
      }
   
  public void showPrice() {
      /////////Get price to the table//////////////
      try{
       int rows = jTable2.getRowCount();
         for(int row = 0; row<rows; row++){
     String AssetNo = (String)jTable2.getValueAt(row, 0);
         db.connection();   
     ResultSet rs1;
    String sql =  String.format("SELECT totalPrice FROM assemble_asset WHERE AssetNo = '%s'", AssetNo);
     rs1 = db.selectQuery(sql);
     
     while(rs1.next()){
          
      
         String priceV = rs1.getString("totalPrice");
  
       DefaultTableModel model =  (DefaultTableModel) jTable2.getModel();
       model.setValueAt(priceV,row, 4);
     } 
         }
 
              
  }
    catch(Exception e){
  JOptionPane.showMessageDialog(null, e.getMessage());
  
     }}
  
   public void ShowAnydayTBLDetails(){
      int rows = jTable2.getRowCount();
      for(int row = 0; row<rows; row++)
     { 
       String AssetNo = (String)jTable2.getValueAt(row, 0);
       String AssetName = (String)jTable2.getValueAt(row, 1);
       
        DefaultTableModel model =  (DefaultTableModel)jTbleAnyday.getModel();
                
                 Object[] content = {AssetNo, AssetName};
       
                 model.addRow(content);
     
     
        }}
  
    public void Date(){
         int rows = jTbleOnday.getRowCount();
       for(int row = 0; row<rows; row++){
        String pattern = "yyyy-MM-30";
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
       String date = simpleDateFormat.format(new java.util.Date());
       
       DefaultTableModel model =  (DefaultTableModel)jTbleOnday.getModel();
        model.setValueAt(date, row, 2);
       }
     }
      
      public void ShowOndayTBLDetails(){
      int rows = jTable2.getRowCount();
      for(int row = 0; row<rows; row++)
     { 
       String AssetNo = (String)jTable2.getValueAt(row, 0);
       String AssetName = (String)jTable2.getValueAt(row, 1);
       
        DefaultTableModel model =  (DefaultTableModel)jTbleOnday.getModel();
                
                 Object[] content = {AssetNo, AssetName};
       
                 model.addRow(content);
     
     
        }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAssetList = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAssemble = new javax.swing.JButton();
        btnDirect1 = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnAssetList1 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        btnAssemble1 = new javax.swing.JButton();
        btnDirect2 = new javax.swing.JButton();
        Logout1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAssetList2 = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        btnAssemble2 = new javax.swing.JButton();
        btnDirect3 = new javax.swing.JButton();
        Logout2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnAssetList3 = new javax.swing.JButton();
        btnBack3 = new javax.swing.JButton();
        btnAssemble3 = new javax.swing.JButton();
        btnDirect4 = new javax.swing.JButton();
        Logout3 = new javax.swing.JButton();
        btnBack4 = new javax.swing.JButton();
        btnBack5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnAssetList4 = new javax.swing.JButton();
        btnBack6 = new javax.swing.JButton();
        Logout4 = new javax.swing.JButton();
        btnAssemble5 = new javax.swing.JButton();
        btnDirect6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbleOnday = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTbleAnyday = new javax.swing.JTable();
        btnCalDep = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        btnCalDep2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DteChoser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setForeground(new java.awt.Color(102, 0, 204));
        jPanel1.setLayout(null);

        btnAssetList.setBackground(new java.awt.Color(0, 153, 0));
        btnAssetList.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssetList.setText("Asset List");
        btnAssetList.setActionCommand("");
        btnAssetList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssetListActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssetList);
        btnAssetList.setBounds(380, 0, 140, 40);

        btnBack.setBackground(new java.awt.Color(0, 153, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(10, 0, 90, 40);

        btnAssemble.setBackground(new java.awt.Color(0, 153, 0));
        btnAssemble.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssemble.setText("Assemble Asset");
        btnAssemble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssembleActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssemble);
        btnAssemble.setBounds(100, 0, 140, 40);

        btnDirect1.setBackground(new java.awt.Color(0, 153, 0));
        btnDirect1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDirect1.setText("Direct Purchased");
        btnDirect1.setActionCommand("");
        btnDirect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirect1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDirect1);
        btnDirect1.setBounds(240, 0, 143, 40);

        Logout.setBackground(new java.awt.Color(0, 153, 0));
        Logout.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout);
        Logout.setBounds(520, 0, 90, 40);

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setForeground(new java.awt.Color(102, 0, 204));
        jPanel2.setLayout(null);

        btnAssetList1.setBackground(new java.awt.Color(0, 153, 0));
        btnAssetList1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssetList1.setText("Asset List");
        btnAssetList1.setActionCommand("");
        btnAssetList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssetList1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAssetList1);
        btnAssetList1.setBounds(380, 0, 140, 40);

        btnBack1.setBackground(new java.awt.Color(0, 153, 0));
        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack1);
        btnBack1.setBounds(10, 0, 90, 40);

        btnAssemble1.setBackground(new java.awt.Color(0, 153, 0));
        btnAssemble1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssemble1.setText("Assemble Asset");
        btnAssemble1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssemble1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAssemble1);
        btnAssemble1.setBounds(100, 0, 140, 40);

        btnDirect2.setBackground(new java.awt.Color(0, 153, 0));
        btnDirect2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDirect2.setText("Direct Purchased");
        btnDirect2.setActionCommand("");
        btnDirect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirect2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDirect2);
        btnDirect2.setBounds(240, 0, 143, 40);

        Logout1.setBackground(new java.awt.Color(0, 153, 0));
        Logout1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Logout1.setText("Logout");
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });
        jPanel2.add(Logout1);
        Logout1.setBounds(520, 0, 90, 40);

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));
        jPanel3.setForeground(new java.awt.Color(102, 0, 204));
        jPanel3.setLayout(null);

        btnAssetList2.setBackground(new java.awt.Color(0, 153, 0));
        btnAssetList2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssetList2.setText("Asset List");
        btnAssetList2.setActionCommand("");
        btnAssetList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssetList2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAssetList2);
        btnAssetList2.setBounds(380, 0, 140, 40);

        btnBack2.setBackground(new java.awt.Color(0, 153, 0));
        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack2);
        btnBack2.setBounds(10, 0, 90, 40);

        btnAssemble2.setBackground(new java.awt.Color(0, 153, 0));
        btnAssemble2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssemble2.setText("Assemble Asset");
        btnAssemble2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssemble2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAssemble2);
        btnAssemble2.setBounds(100, 0, 140, 40);

        btnDirect3.setBackground(new java.awt.Color(0, 153, 0));
        btnDirect3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDirect3.setText("Direct Purchased");
        btnDirect3.setActionCommand("");
        btnDirect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirect3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnDirect3);
        btnDirect3.setBounds(240, 0, 143, 40);

        Logout2.setBackground(new java.awt.Color(0, 153, 0));
        Logout2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Logout2.setText("Logout");
        Logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout2ActionPerformed(evt);
            }
        });
        jPanel3.add(Logout2);
        Logout2.setBounds(520, 0, 90, 40);

        jPanel4.setBackground(new java.awt.Color(153, 153, 0));
        jPanel4.setForeground(new java.awt.Color(102, 0, 204));
        jPanel4.setLayout(null);

        btnAssetList3.setBackground(new java.awt.Color(0, 153, 0));
        btnAssetList3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssetList3.setText("Asset List");
        btnAssetList3.setActionCommand("");
        btnAssetList3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssetList3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnAssetList3);
        btnAssetList3.setBounds(380, 0, 140, 40);

        btnBack3.setBackground(new java.awt.Color(0, 153, 0));
        btnBack3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack3.setText("Back");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack3);
        btnBack3.setBounds(10, 0, 90, 40);

        btnAssemble3.setBackground(new java.awt.Color(0, 153, 0));
        btnAssemble3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssemble3.setText("Assemble Asset");
        btnAssemble3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssemble3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnAssemble3);
        btnAssemble3.setBounds(100, 0, 140, 40);

        btnDirect4.setBackground(new java.awt.Color(0, 153, 0));
        btnDirect4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDirect4.setText("Direct Purchased");
        btnDirect4.setActionCommand("");
        btnDirect4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirect4ActionPerformed(evt);
            }
        });
        jPanel4.add(btnDirect4);
        btnDirect4.setBounds(240, 0, 143, 40);

        Logout3.setBackground(new java.awt.Color(0, 153, 0));
        Logout3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Logout3.setText("Logout");
        Logout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout3ActionPerformed(evt);
            }
        });
        jPanel4.add(Logout3);
        Logout3.setBounds(520, 0, 90, 40);

        btnBack4.setBackground(new java.awt.Color(0, 153, 0));
        btnBack4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack4.setText("Back");
        btnBack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack4ActionPerformed(evt);
            }
        });

        btnBack5.setBackground(new java.awt.Color(0, 153, 0));
        btnBack5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack5.setText("Back");
        btnBack5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Assembled Asset List");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, -20, 410, 90);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asset No", "Asset Name", "Date of Assembling", "Life Time", "Price"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(210, 190, 790, 150);

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Further Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 120, 170, 50);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setForeground(new java.awt.Color(102, 0, 204));
        jPanel5.setLayout(null);

        btnAssetList4.setBackground(new java.awt.Color(153, 153, 153));
        btnAssetList4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssetList4.setText("Asset List");
        btnAssetList4.setActionCommand("");
        btnAssetList4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssetList4ActionPerformed(evt);
            }
        });
        jPanel5.add(btnAssetList4);
        btnAssetList4.setBounds(780, 0, 140, 40);

        btnBack6.setBackground(new java.awt.Color(153, 153, 153));
        btnBack6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack6.setText("Back");
        btnBack6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack6ActionPerformed(evt);
            }
        });
        jPanel5.add(btnBack6);
        btnBack6.setBounds(10, 0, 90, 40);

        Logout4.setBackground(new java.awt.Color(153, 153, 153));
        Logout4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Logout4.setText("Logout");
        Logout4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout4ActionPerformed(evt);
            }
        });
        jPanel5.add(Logout4);
        Logout4.setBounds(1040, 0, 90, 40);

        btnAssemble5.setBackground(new java.awt.Color(153, 153, 153));
        btnAssemble5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssemble5.setText("Assemble Asset List");
        btnAssemble5.setActionCommand("Assemble Asset list");
        btnAssemble5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssemble5ActionPerformed(evt);
            }
        });
        jPanel5.add(btnAssemble5);
        btnAssemble5.setBounds(210, 0, 163, 40);

        btnDirect6.setBackground(new java.awt.Color(153, 153, 153));
        btnDirect6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDirect6.setText("Direct Purchased List");
        btnDirect6.setActionCommand("");
        btnDirect6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirect6ActionPerformed(evt);
            }
        });
        jPanel5.add(btnDirect6);
        btnDirect6.setBounds(480, 0, 190, 40);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 60, 1300, 40);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Total Depreciate Amount");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 660, 220, 30);

        jTbleOnday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AssetNo", "Asset Name", "DepriciateDate", "Depreciate Amount"
            }
        ));
        jScrollPane3.setViewportView(jTbleOnday);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 440, 570, 210);

        jTbleAnyday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AssetNo", "Asset Name", "Depreciate Amount"
            }
        ));
        jScrollPane4.setViewportView(jTbleAnyday);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(690, 440, 510, 210);

        btnCalDep.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnCalDep.setText("Calculate Total Depreciate");
        btnCalDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalDepActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalDep);
        btnCalDep.setBounds(20, 660, 210, 50);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(490, 660, 100, 30);

        btnCalDep2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnCalDep2.setText("Calculate Total Depreciate");
        btnCalDep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalDep2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalDep2);
        btnCalDep2.setBounds(690, 660, 210, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Total Depreciate Amount");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(910, 650, 210, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(1110, 660, 90, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Select a Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(820, 380, 120, 30);
        getContentPane().add(DteChoser1);
        DteChoser1.setBounds(950, 370, 250, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/construction-wallpaper-7.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1310, 740);

        setSize(new java.awt.Dimension(1337, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            new AssembleFurtherDet().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAssetListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssetListActionPerformed
        new AssetList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssetListActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new AssetType().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssembleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssembleActionPerformed
        new AssembleAsset().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssembleActionPerformed

    private void btnDirect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirect1ActionPerformed
        new DirectPurchasedAsset().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDirect1ActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        new signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void btnAssetList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssetList1ActionPerformed
        new AssetList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssetList1ActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        new AssetType().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnAssemble1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssemble1ActionPerformed
        new AssembleAsset().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssemble1ActionPerformed

    private void btnDirect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirect2ActionPerformed
        new DirectPurchasedAsset().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDirect2ActionPerformed

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
        new signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logout1ActionPerformed

    private void btnAssetList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssetList2ActionPerformed
        new AssetList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssetList2ActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        new AssetType().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnAssemble2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssemble2ActionPerformed
        new AssembleAsset().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssemble2ActionPerformed

    private void btnDirect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirect3ActionPerformed
        new DirectPurchasedAsset().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDirect3ActionPerformed

    private void Logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout2ActionPerformed
        new signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logout2ActionPerformed

    private void btnAssetList3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssetList3ActionPerformed
        new AssetList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssetList3ActionPerformed

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        new AssetType().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack3ActionPerformed

    private void btnAssemble3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssemble3ActionPerformed
        new AssembleAsset().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssemble3ActionPerformed

    private void btnDirect4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirect4ActionPerformed
        new DirectPurchasedAsset().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDirect4ActionPerformed

    private void Logout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout3ActionPerformed
        new signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logout3ActionPerformed

    private void btnBack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack4ActionPerformed
        new AssetType().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack4ActionPerformed

    private void btnBack5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack5ActionPerformed
        new AssetType().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack5ActionPerformed

    private void btnAssetList4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssetList4ActionPerformed
        new AssetList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssetList4ActionPerformed

    private void btnBack6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack6ActionPerformed
        new admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack6ActionPerformed

    private void Logout4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout4ActionPerformed
        new signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logout4ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnCalDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalDepActionPerformed

           DefaultTableModel model =  (DefaultTableModel)jTable2.getModel();
        int rows = jTable2.getRowCount();
           double tot = 0.0;
        try{
       for(int row=0;row<=rows;row++){
       
        String lifetime = (String) model.getValueAt(row, 3);
    int lifetimei = Integer.parseInt(lifetime );
    String price =  (String) model.getValueAt(row, 4);
    double pricei = Double.parseDouble(price);
    String date =  (String)model.getValueAt(row, 2);
    DefaultTableModel model2 =  (DefaultTableModel)jTbleOnday.getModel();
    String Depdate = (String)model2.getValueAt(row, 2);
    
    DateFormat formatter;
    java.util.Date dd1;
    java.util.Date dd2;
    formatter = new SimpleDateFormat("yyyy-MM-dd");
   
    dd1 = (java.util.Date)formatter.parse(date);
    dd2 = (java.util.Date)formatter.parse(Depdate);  
    
     long diff = dd2.getTime() - dd1.getTime();
   
   long sec = diff / 1000 % 60;
   long min = diff/(60*1000) % 60;
   long hours = diff /(60*60*1000);
   long days = hours/24;
   long months = days/30;
   //JOptionPane.showMessageDialog(null,days );
   
     double amt;
   
      
       amt =((pricei/(lifetimei*365))*days) ;
    double roundAmt = Math.round(amt*100)/100;
    String roundAmtS = String.valueOf(roundAmt);
    
     
     model2.setValueAt(roundAmtS, row, 3);
     tot=tot+roundAmt;
     String tots = String.valueOf(tot);
   jTextField2.setText(tots);
       }
         
        
        
        }
        
         catch(Exception e)
     { //JOptionPane.showMessageDialog(this,e.getMessage());
       
     }  
         db.connection();
           
        try{
        int rown= jTable2.getRowCount();
       
        for(int row = 0; row<rown; row++)
     { 
       String AssetNo = (String)jTable2.getValueAt(row, 0);
       String AssetName = (String)jTable2.getValueAt(row, 1);
       String date = (String)jTable2.getValueAt(row, 2); 
       String lifeTime = (String)jTable2.getValueAt(row, 3); 
       String price = (String)jTable2.getValueAt(row, 4);
       String DepDate = (String)jTbleOnday.getValueAt(row, 2);
       String DepAmt = (String)jTbleOnday.getValueAt(row, 3);
       String DepAmount = String.valueOf(DepAmt) ;
       String Category = "Direct Purchased";
       
     //  String wrkngPRogNo = jTextField2.getText();
       String sql = "INSERT INTO depreciated_assembled_assetlist(AssetNo,AssetName,category,totprice,DateOfAssemble,Life_Time,Depreciate_Date,Depriciated_Amt) VALUES('"+AssetNo+"','"+AssetName+"','"+Category+"','"+price+"','"+date+"','"+lifeTime+"','"+DepDate+"','"+DepAmount+"')";
      
    
         int i = db.updateQuery(sql);
       
        if(i<0)
        { JOptionPane.showMessageDialog(null,"Not entered");
           
            }
        }
         JOptionPane.showMessageDialog(null,"Successfully added!");}
         catch(Exception e)
     { JOptionPane.showMessageDialog(this,e.getMessage());
       
     } 
    }//GEN-LAST:event_btnCalDepActionPerformed

    private void btnCalDep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalDep2ActionPerformed

             DefaultTableModel model =  (DefaultTableModel)jTable2.getModel();
        int rows = jTable2.getRowCount();
           double tot = 0.0;
        try{
       for(int row=0;row<=rows;row++){
       
        String lifetime = (String) model.getValueAt(row, 3);
    int lifetimei = Integer.parseInt(lifetime );
    String price =  (String) model.getValueAt(row, 4);
    double pricei = Double.parseDouble(price);
    String date =  (String)model.getValueAt(row, 2);
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       String Depdate = sdf.format(DteChoser1.getDate());
       
    DefaultTableModel model2 =  (DefaultTableModel)jTbleAnyday.getModel();
   // String Depdatei = (String)model2.getValueAt(row, 2);
    
    DateFormat formatter;
    java.util.Date dd1;
    java.util.Date dd2;
    formatter = new SimpleDateFormat("yyyy-MM-dd");
   
    dd1 = (java.util.Date)formatter.parse(date);
    dd2 = (java.util.Date)formatter.parse(Depdate);  
    
     long diff = dd2.getTime() - dd1.getTime();
   
   long sec = diff / 1000 % 60;
   long min = diff/(60*1000) % 60;
   long hours = diff /(60*60*1000);
   long days = hours/24;
   long months = days/30;
   //JOptionPane.showMessageDialog(null,days );
   
     double amt;
     
      
       amt =((pricei/(lifetimei*365))*days) ;
    double roundAmt = Math.round(amt*100)/100;
    String roundAmtS = String.valueOf(roundAmt);
    
     
     model2.setValueAt(roundAmtS, row, 2);
     tot=tot+roundAmt;
     String tots = String.valueOf(tot);
    jTextField1.setText(tots);
       }
         
        
        
        }
        
         catch(Exception e)
     { //JOptionPane.showMessageDialog(this,e.getMessage());
       
     }      
    }//GEN-LAST:event_btnCalDep2ActionPerformed

    private void btnAssemble5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssemble5ActionPerformed
        new AssembledAssetList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAssemble5ActionPerformed

    private void btnDirect6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirect6ActionPerformed
        new DirectPurchasedAssetList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDirect6ActionPerformed

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
            java.util.logging.Logger.getLogger(AssembledAssetList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssembledAssetList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssembledAssetList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssembledAssetList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssembledAssetList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DteChoser1;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Logout1;
    private javax.swing.JButton Logout2;
    private javax.swing.JButton Logout3;
    private javax.swing.JButton Logout4;
    private javax.swing.JButton btnAssemble;
    private javax.swing.JButton btnAssemble1;
    private javax.swing.JButton btnAssemble2;
    private javax.swing.JButton btnAssemble3;
    private javax.swing.JButton btnAssemble5;
    private javax.swing.JButton btnAssetList;
    private javax.swing.JButton btnAssetList1;
    private javax.swing.JButton btnAssetList2;
    private javax.swing.JButton btnAssetList3;
    private javax.swing.JButton btnAssetList4;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnBack4;
    private javax.swing.JButton btnBack5;
    private javax.swing.JButton btnBack6;
    private javax.swing.JButton btnCalDep;
    private javax.swing.JButton btnCalDep2;
    private javax.swing.JButton btnDirect1;
    private javax.swing.JButton btnDirect2;
    private javax.swing.JButton btnDirect3;
    private javax.swing.JButton btnDirect4;
    private javax.swing.JButton btnDirect6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTbleAnyday;
    private javax.swing.JTable jTbleOnday;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
