/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartpharma;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Historique_Factures extends javax.swing.JFrame {
String database = "jdbc:sqlite:C:\\Users\\kouraichi\\Documents\\GitHub\\SmartPharma\\pharmacy.sqlite";

    /** Creates new form Historique_Factures */
    public Historique_Factures() {
        initComponents();
        
    }
    public String get(String iddd){
        String getd;
        getd=iddd;
        return getd;
    }
    private void table(){
        ResultSet rs;
        Statement stmt;
         DefaultTableModel d=(DefaultTableModel) jTable3.getModel();
        try{
            Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection(database);
            stmt =(Statement) conn.createStatement();
            String sql2="select IDFacture as 'N° Facture' ,Total_PPV as 'Montant(total)' , reduction as 'Reduction ' , total_avreduction as 'total payé',Date_Facture  from Facture ";
              PreparedStatement pst=conn.prepareStatement(sql2);
            rs=pst.executeQuery();
        jTable3.setModel(DbUtils.resultSetToTableModel(rs));
               
                
        }catch(ClassNotFoundException | SQLException e){
            
        }
       DefaultTableModel dd=(DefaultTableModel) jTable1.getModel();
       
        int rows=dd.getRowCount();
if(rows>0)  {
    for(int i=0;i<rows;i++)
dd.removeRow(0);
} 
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabelTotalAmount = new javax.swing.JLabel();
        LabelAmount = new javax.swing.JLabel();
        LabelDisc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        LabelDate = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultation des recettes");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setBackground(new java.awt.Color(153, 255, 153));
        jTable3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° Facture", "Montant(total)", "Reduction", "Total payé", "Date Facture"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setRowHeight(25);
        jTable3.setSelectionBackground(new java.awt.Color(255, 255, 0));
        jTable3.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 470, 370));

        jTable1.setBackground(new java.awt.Color(153, 255, 153));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ventes N°", "Nom Medicament", "Quantite", "Prix ", "Montant", "Date expiration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 0));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 750, 370));

        jButton5.setFont(new java.awt.Font("Chaparral Pro Light", 0, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/back-icon.png"))); // NOI18N
        jButton5.setText("Quitter");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 200, 50));

        jButton4.setFont(new java.awt.Font("Chaparral Pro Light", 0, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/remove_from_database_256.png"))); // NOI18N
        jButton4.setText("annuler une facture");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTotalAmount.setBackground(new java.awt.Color(255, 255, 255));
        LabelTotalAmount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(LabelTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 90, 164, 34));

        LabelAmount.setBackground(new java.awt.Color(255, 255, 255));
        LabelAmount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(LabelAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 164, 31));

        LabelDisc.setBackground(new java.awt.Color(255, 255, 255));
        LabelDisc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(LabelDisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, 164, 33));

        jLabel1.setFont(new java.awt.Font("Chaparral Pro Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Montant (Total)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, 40));

        jLabel3.setFont(new java.awt.Font("Chaparral Pro Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reduction ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, -1, 40));

        jLabel4.setFont(new java.awt.Font("Chaparral Pro Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total payé");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 80, 40));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 120, 40));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, 40));

        jButton1.setFont(new java.awt.Font("Chaparral Pro Light", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/stock.png"))); // NOI18N
        jButton1.setText("Afficher toute les Facture");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 50));

        jLabel7.setFont(new java.awt.Font("Chaparral Pro Light", 0, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("N° Facture");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 100, 40));

        jButton2.setFont(new java.awt.Font("Chaparral Pro Light", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/search-icon.png"))); // NOI18N
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 50, 40));

        LabelDate.setBackground(new java.awt.Color(255, 255, 255));
        LabelDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(LabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 164, 34));

        jLabel8.setFont(new java.awt.Font("Chaparral Pro Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date Facture");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 90, 40));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 40, 30));

        jButton3.setFont(new java.awt.Font("Chaparral Pro Light", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/search-icon.png"))); // NOI18N
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 50, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 138));

        jLabel6.setFont(new java.awt.Font("Chaparral Pro Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("N° Client ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1230, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Backgroun5.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 1280, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         String id=  jTextField1.getText();
          String idc  = jTextField2.getText();
          DefaultTableModel d=(DefaultTableModel) jTable1.getModel();
        

int rows=d.getRowCount();
if(rows>0)  {
    for(int i=0;i<rows;i++)
d.removeRow(0);
}

 String  str=null;
        Statement stmt=null;
        Statement stmt1=null;
        ResultSet rs=null;
        String amount;
        String disc;
        String amtbeforedisc;
    
     
            try{
         Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection(database);
            stmt =(Statement) conn.createStatement();
            String sql2="select IDLigne ,Nom_V, Quantite_V , Prix_V, Montant_t , Date_ex  from Ligne_Commande where IDFacture = '"+id+"'";
               rs=stmt.executeQuery(sql2);
                while(rs.next()){
                    String idmm = rs.getString("IDLigne");
                    
                 String name= rs.getString("Nom_V");
                 String qty= rs.getString("Quantite_V");
                 String ppv= rs.getString("Prix_V");
                 String amt= rs.getString("Montant_t");
                 String exp = rs.getString("Date_ex");
                d.addRow(new Object[]{idmm,name,qty,ppv,amt,exp});
               
                }
                String sql1="select * from Facture where IDFacture = '"+id+"'";
             ResultSet rs1=stmt.executeQuery(sql1);
             rs1.next();
             
                  amount= rs1.getString("Total_PPV");
              disc= rs1.getString("reduction");
           amtbeforedisc=rs1.getString("total_avreduction");
         String idff = rs1.getString("IDFacture");
           String date = rs1.getString("Date_Facture");
           LabelTotalAmount.setText("Rs. "+amount);
            LabelAmount.setText("Rs. "+amtbeforedisc);
            LabelDisc.setText(disc+" %");
            LabelDate.setText(date);
             stmt.close();
           
            rs.close();
            conn.close();
            
         }   
           
            catch(Exception e){
             
         }
            
        
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String idc  = jTextField2.getText();
          DefaultTableModel d=(DefaultTableModel) jTable3.getModel();
        DefaultTableModel dd=(DefaultTableModel) jTable1.getModel();

int rows=d.getRowCount();
if(rows>0)  {
    for(int i=0;i<rows;i++)
d.removeRow(0);
}
int rows1 = dd.getRowCount();
if(rows1>0)  {
    for(int i=0;i<rows1;i++)
dd.removeRow(0);
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
          
             String sql1="select * from Facture where IDClient = '"+idc+"'";
             rs=stmt.executeQuery(sql1);
           while(rs.next()){
                amount= rs.getString("Total_PPV");
              disc= rs.getString("reduction");
           amtbeforedisc=rs.getString("total_avreduction");
         String idff = rs.getString("IDFacture");
         String date = rs.getString("Date_Facture");
         d.addRow(new Object[]{idff,amtbeforedisc,disc,amount,date});
               
        }
                stmt.close();
                rs.close();
                conn.close();
               
      
                            }catch(Exception e){
                            }
       
            
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
     
         DefaultTableModel dd=(DefaultTableModel) jTable1.getModel();
         DefaultTableModel d=(DefaultTableModel) jTable3.getModel();
        Statement stmt=null;
        int rows=dd.getRowCount();
        if(rows>0)  {
    for(int i=0;i<rows;i++)
dd.removeRow(0);
}

        ResultSet rs=null;
        try{
             Class.forName("org.sqlite.JDBC");
         Connection conn = DriverManager.getConnection(database);
         int row = jTable3.getSelectedRow();
            String Table_click = (jTable3.getModel().getValueAt(row,0).toString());
             String sql = "select * from Ligne_Commande where IDFacture = '"+Table_click+"'";
             PreparedStatement pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
             while(rs.next()){
                    String idmm = rs.getString("IDLigne");
                 String name= rs.getString("Nom_V");
                 String qty= rs.getString("Quantite_V");
                 String ppv= rs.getString("Prix_V");
                 String amt= rs.getString("Montant_t");
                 String exp = rs.getString("Date_ex");
                dd.addRow(new Object[]{idmm,name,qty,ppv,amt,exp});
             }
              LabelTotalAmount.setText("Rs. "+d.getValueAt(row, 3));
            LabelAmount.setText("Rs. "+d.getValueAt(row, 1));
            LabelDisc.setText(d.getValueAt(row, 2)+" %");
            LabelDate.setText(d.getValueAt(row, 4).toString());
            jTextField1.setText(d.getValueAt(row,0).toString());
            stmt.close();
                rs.close();
               conn.close();
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        DefaultTableModel d=(DefaultTableModel) jTable3.getModel();
        Statement stmt=null;
        Statement stmt1=null;
        ResultSet rs=null;
        int rows=d.getRowCount();
if(rows>0)  {
    for(int i=0;i<rows;i++)
d.removeRow(0);
}
        try{
            Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection(database);
            stmt =(Statement) conn.createStatement();
            String sql2="select IDFacture ,Total_PPV, reduction , total_avreduction,Date_Facture  from Facture ";
               rs=stmt.executeQuery(sql2);
                while(rs.next()){
                    String idmm = rs.getString("IDFacture");
                    
                 String amt= rs.getString("Total_PPV");
                 String red= rs.getString("reduction");
                 String total_p= rs.getString("total_avreduction");
                 String date= rs.getString("Date_Facture");
                
                d.addRow(new Object[]{idmm,amt,red,total_p,date});
               
                }
           rs.close();
          stmt.close();
            conn.close();      
          
        }catch(Exception e){
            
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
jButton3.doClick();
     }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        
        
        String str=null;
        Statement stmt=null;
        ResultSet rs=null;
        String idf = jTextField1.getText();
        if(idf.equals(""))
        {
             JOptionPane.showMessageDialog(null," Selectionner une Facture à partir de tableau .");  
        }
        else{
        try{
            Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection(database);
            String sql1="delete from Facture where IDFacture='"+jTextField1.getText()+"'";
            stmt =(Statement) conn.createStatement();
        stmt.executeUpdate(sql1);
        
        
         JOptionPane.showMessageDialog(null,"   Facture Supprimer  ");  
         
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            
        }
         LabelTotalAmount.setText("");
            LabelAmount.setText("");
            LabelDisc.setText("");
            LabelDate.setText("");
            jTextField1.setText("");
         table();
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
       LabelTotalAmount.setText("");
            LabelAmount.setText("");
            LabelDisc.setText("");
            LabelDate.setText("");
            jTextField1.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Historique_Factures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historique_Factures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historique_Factures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historique_Factures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historique_Factures().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAmount;
    private javax.swing.JLabel LabelDate;
    private javax.swing.JLabel LabelDisc;
    private javax.swing.JLabel LabelTotalAmount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
