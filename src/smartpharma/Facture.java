/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartpharma;

import java.awt.Color;
import static java.awt.Color.yellow;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

public class Facture extends javax.swing.JFrame {
 String database = "jdbc:sqlite:C:\\Users\\kouraichi\\Documents\\GitHub\\SmartPharma\\pharmacy.sqlite";
 String id_transfer;
 ResultSet rs = null;
    /**
     * Creates new form Facture
     */
   public Facture() {
        initComponents();
        
    } 
public Facture(String b_id) {
    id_transfer = b_id;
        initComponents();
        
        
    }
 /* private void table(){
    String id=  id_transfer;
    try{
         Class.forName("org.sqlite.JDBC");
         Connection conn = DriverManager.getConnection(database);
        String sql = "select IDLigne as 'Vente N°' , Nom_V as 'Nom Medicament' , Quantite_V as 'Quantite' , Date_ex as 'Date_expiration' , Prix_V as 'Prix' , Montant_t as 'Montant'  from Ligne_Commande where IDFacture = '"+id+"'";
        PreparedStatement pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       
    }
    catch(ClassNotFoundException | SQLException ex){
       JOptionPane.showMessageDialog(null, ex);
        
    }
    
       
    
    
}*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelWelcome1 = new javax.swing.JLabel();
        LabelWelcome2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelWelcome4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LabelDisc = new javax.swing.JLabel();
        AMT1 = new javax.swing.JLabel();
        AMT = new javax.swing.JLabel();
        LabelWelcome3 = new javax.swing.JLabel();
        LabelWelcome6 = new javax.swing.JLabel();
        LabelWelcome7 = new javax.swing.JLabel();
        LabelWelcome8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelWelcome5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facture");
        setLocation(new java.awt.Point(230, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setAlignmentX(0.0F);
        jScrollPane1.setAlignmentY(0.0F);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(550, 830));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFocusable(false);
        jPanel2.setMinimumSize(new java.awt.Dimension(550, 830));
        jPanel2.setPreferredSize(new java.awt.Dimension(580, 840));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Vente N°", "Nom Medicament", "Quantite", "Date_Expiration", "PPV", "Montant(total)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setFont(new Font("Arial",Font.PLAIN, 13));
        jTable1.setOpaque(false);
        jTable1.setRowHeight(22);
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 560, 210));
        jScrollPane2.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("WorstveldSlingExtra2Oblique", 1, 58)); // NOI18N
        jLabel2.setText("Pharmacie Universite");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 400, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 73, 25));

        LabelWelcome1.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        LabelWelcome1.setText("facture de vente ");
        jPanel2.add(LabelWelcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, 40));

        LabelWelcome2.setFont(new java.awt.Font("Tekton Pro Cond", 0, 20)); // NOI18N
        LabelWelcome2.setText("Date");
        jPanel2.add(LabelWelcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 40, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 73, 24));

        LabelWelcome4.setFont(new java.awt.Font("Tekton Pro Cond", 0, 20)); // NOI18N
        LabelWelcome4.setText("Facture N°");
        jPanel2.add(LabelWelcome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("BP . Route N2 120 Selouane NADOR");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 30));

        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 780, 80, 30));

        LabelDisc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(LabelDisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 730, 70, 30));

        AMT1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(AMT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 220, 80));

        AMT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(AMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 680, 70, 30));

        LabelWelcome3.setFont(new java.awt.Font("Tekton Pro Cond", 0, 22)); // NOI18N
        LabelWelcome3.setText("Signature");
        jPanel2.add(LabelWelcome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 80, 30));

        LabelWelcome6.setFont(new java.awt.Font("Tekton Pro Cond", 0, 20)); // NOI18N
        LabelWelcome6.setText("Reduction");
        jPanel2.add(LabelWelcome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 730, -1, 30));

        LabelWelcome7.setFont(new java.awt.Font("Tekton Pro Cond", 0, 22)); // NOI18N
        LabelWelcome7.setText("Total");
        jPanel2.add(LabelWelcome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 680, 40, 30));

        LabelWelcome8.setFont(new java.awt.Font("Tekton Pro Cond", 0, 22)); // NOI18N
        LabelWelcome8.setText("Total payé");
        jPanel2.add(LabelWelcome8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 780, -1, 30));

        jScrollPane1.setViewportView(jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 620, 500));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, 80, 30));

        LabelWelcome5.setFont(new java.awt.Font("Tekton Pro Cond", 0, 22)); // NOI18N
        LabelWelcome5.setForeground(new java.awt.Color(255, 255, 255));
        LabelWelcome5.setText("Total payé");
        getContentPane().add(LabelWelcome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, -1, 30));

        jButton1.setFont(new java.awt.Font("Chaparral Pro Light", 0, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/print.png"))); // NOI18N
        jButton1.setText("Imprimer");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 150, 50));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 10));

        jLabel11.setFont(new java.awt.Font("Dancing in the Rainbow", 0, 80)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Facture");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Backgroun5.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 1000, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        String id=  id_transfer; 
        jLabel3.setText(id); 
         
         try{
             
                Class.forName("org.sqlite.JDBC");
                Connection conn=DriverManager.getConnection(database);
                Statement stmt =conn.createStatement();
                String b="select date() as date";
                ResultSet rs=stmt.executeQuery(b);
                if(rs.next())
                 {
                 String c=rs.getString("date");
                jLabel6.setText(c);
                }
                 stmt.close();
            rs.close();
            conn.close();
        
         }catch(Exception e){
             
         }
         String  str=null;
        Statement stmt=null;
        ResultSet rs=null;   
        String amount;
        String disc;
        String amtbeforedisc;
        
        try{
            
             Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection(database);
            stmt =(Statement) conn.createStatement();
            String sql=" select * from Facture where IDFacture = '"+id+"'  ";
            rs=stmt.executeQuery(sql);
            rs.next();
            {
                amount= rs.getString("Total_PPV");
              disc= rs.getString("reduction");
           amtbeforedisc=rs.getString("total_avreduction");
            jLabel8.setText("Rs. "+amount);
                      jLabel12.setText("Rs. "+amount);
                      LabelDisc.setText(disc+" %");
        AMT.setText(amtbeforedisc);
            }
             stmt.close();
            rs.close();
            conn.close();
        }catch(ClassNotFoundException | SQLException e){
            
        }
        DefaultTableModel d=(DefaultTableModel) jTable1.getModel();
         
        TableColumn column,column1,column2,column3;
     //    TableColumn column1 = jTable1.getColumnModel().getColumn(0);
         //  column1.setPreferredWidth(30);
       //   column = jTable1.getColumnModel().getColumn(3);
         // column.setPreferredWidth(80);
         column = jTable1.getColumnModel().getColumn(4);
        column.setPreferredWidth(15);
         column = jTable1.getColumnModel().getColumn(0);
        column.setPreferredWidth(35);
         column = jTable1.getColumnModel().getColumn(2);
        column.setPreferredWidth(30);
         column = jTable1.getColumnModel().getColumn(3);
        column.setPreferredWidth(65);
 for (int i = 0; i < 7; i++) {
     
   /*   if(i==0){
        column.setPreferredWidth(1);
     } else

  if (i == 1) {
        column.setPreferredWidth(2); //third column is bigger
    } 

  else
    if(i==2){
        column.setPreferredWidth(1);//qty
    }

  
    else 
    
 if(i==3){
        column.setPreferredWidth(2);//batch
 }  else
      if(i==4){
        column.setPreferredWidth(1);//exp
}
 if(i==5){
        column.setPreferredWidth(5);//mrp
 }  else
     if(i==6){
        column.setPreferredWidth(5);//amount
 }  
 if(i==7){
        column.setPreferredWidth(2);
 }  */

        
        int rows=d.getRowCount();
if(rows>0)  {
    for(int i1=0;i1<rows;i1++)
d.removeRow(0);
}

            try{
                 Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection(database);
            stmt =(Statement) conn.createStatement();
             String sql="select * from Ligne_Commande where IDFacture = '"+id+"'";
             
             rs=stmt.executeQuery(sql);
             while(rs.next()){
                 String vno = rs.getString("IDLigne");
                 String name= rs.getString("Nom_V");
                 String qty= rs.getString("Quantite_V");
                 String ppv= rs.getString("Prix_V");
                 String amt= rs.getString("Montant_t");
                 String exp = rs.getString("Date_ex");
                 d.addRow(new Object[]{vno,name,qty,exp,ppv,amt});
             }
             
              stmt.close();
            rs.close();
            conn.close();
            
            }catch(ClassNotFoundException | SQLException e){
                
            }
            


 }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String billno=jLabel3.getText();
        PrinterJob job = PrinterJob.getPrinterJob();
     job.setJobName("Pharmacie FPN N° "+billno);

     job.setPrintable ((Graphics pg, PageFormat pf, int pageNum) -> {
         if (pageNum > 0){
             return Printable.NO_SUCH_PAGE;
         }
         
         Graphics2D g2 = (Graphics2D) pg;
         g2.translate(pf.getImageableX(),pf.getImageableY());
         jPanel2.print(g2);
         return Printable.PAGE_EXISTS;
        });
     boolean ok = job.printDialog();
     if (ok) {
         try {
              job.print();
         } catch (PrinterException ex) {

         }
          
          // TODO add your handling code here:
     }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new Facture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AMT;
    private javax.swing.JLabel AMT1;
    private javax.swing.JLabel LabelDisc;
    private javax.swing.JLabel LabelWelcome1;
    private javax.swing.JLabel LabelWelcome2;
    private javax.swing.JLabel LabelWelcome3;
    private javax.swing.JLabel LabelWelcome4;
    private javax.swing.JLabel LabelWelcome5;
    private javax.swing.JLabel LabelWelcome6;
    private javax.swing.JLabel LabelWelcome7;
    private javax.swing.JLabel LabelWelcome8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
