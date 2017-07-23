/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartpharma;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Mutuelle extends javax.swing.JFrame {
String database = "jdbc:sqlite:C:\\Users\\kouraichi\\Documents\\GitHub\\SmartPharma\\pharmacy.sqlite";

    ResultSet rs = null;
    /**
     * Creates new form Mituelle
     */
    public Mutuelle() {
        initComponents();
        table();
    }
 private void table(){
    
    try{
         Class.forName("org.sqlite.JDBC");
         Connection conn = DriverManager.getConnection(database);
        String sql = "select IDClient, CIN , Nom_Client as 'Nom ', Prenom_Client as 'Prenom',Adresse_Client as 'Adresse', Tel_Client as 'Telephone', Credit , Mutuelle  from Client where Mutuelle = 'Benificier'";
        PreparedStatement pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       
    }
    catch(ClassNotFoundException | SQLException ex){
       JOptionPane.showMessageDialog(null, ex);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mutuelle");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 0));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 255, 716, 172));

        jLabel2.setFont(new java.awt.Font("Zud Juice", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Client");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 89, 32));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 266, 32));

        jButton1.setFont(new java.awt.Font("Vijaya", 0, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/search-icon.png"))); // NOI18N
        jButton1.setText("Rechercher");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, 50));

        jLabel3.setFont(new java.awt.Font("Zud Juice", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 46, 32));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 266, 32));

        jLabel4.setFont(new java.awt.Font("Zud Juice", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prenom");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 75, 32));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 266, 32));

        jLabel5.setFont(new java.awt.Font("Zud Juice", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CIN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 43, 69, 32));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 268, 32));

        jButton2.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Delete-icon.png"))); // NOI18N
        jButton2.setText("Quitter");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 140, 40));

        jButton3.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/add-icon.png"))); // NOI18N
        jButton3.setText("Nouveau");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 150, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 740, 440));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 760, 10));

        jLabel10.setFont(new java.awt.Font("Dancing in the Rainbow", 0, 90)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mutuelle");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 250, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Backgroun5.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, -70, 1130, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
          DefaultTableModel d=(DefaultTableModel) jTable1.getModel();
          
          int rows=d.getRowCount();
if(rows>0)  {
    for(int i=0;i<rows;i++)
d.removeRow(0);
}
     String name1=jTextField2.getText();
    
        String str=null;
        Statement stmt1=null;
        ResultSet rs=null;
        if (name1.equals(""))
               { JOptionPane.showMessageDialog(this,"SVP entrer CIN !");
               table();
            }else{
                        
                        try{
                           Class.forName("org.sqlite.JDBC");
                            Connection conn=DriverManager.getConnection(database);
                            stmt1 =(Statement) conn.createStatement(); 
                            String sql1 = "select IDClient , Nom_Client,Prenom_Client,CIN , Adresse_Client , Tel_Client,Credit,Mutuelle from Client where CIN = '"+name1+"' AND Mutuelle='Benificier' ";
                            rs=stmt1.executeQuery(sql1);
                            String iddd = rs.getString("IDClient");
                           if(iddd!=null){
                            while(rs.next()){
                             String idd= rs.getString("IDClient");
                                String namee= rs.getString("Nom_Client");
                                String prenm= rs.getString("Prenom_Client");
                                String cni = rs.getString("CIN");
                                String adrs= rs.getString("Adresse_Client");
                                String tell= rs.getString("Tel_Client");
                                String cree= rs.getString("Credit");
                                String mutl= rs.getString("Mutuelle");
                                d.addRow(new Object[]{idd,cni,namee,prenm,adrs,tell,cree,mutl});
                                jTextField1.setText(idd);
                                jTextField3.setText(prenm);
                                jTextField4.setText(namee);
                            }
                           rs.close();
                            conn.close();
                           }
                            
                           else{
                                 JOptionPane.showMessageDialog(null, "Client n'existe pas ! ");
                              table();
                            jTextField2.setText("");
                                    }
                            
                            }
        
                        catch(Exception e){
                            
                           
                        }
            
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
    }//GEN-LAST:event_formWindowOpened

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
jButton1.doClick();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      jTextField2.setText("");
      jTextField1.setText("");
      jTextField3.setText("");
      jTextField4.setText("");
      table();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Mutuelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mutuelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mutuelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mutuelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mutuelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
