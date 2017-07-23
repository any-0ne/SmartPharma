/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartpharma;

import java.awt.HeadlessException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ajoute_medicament extends javax.swing.JFrame {
String database="jdbc:sqlite:C:\\Users\\kouraichi\\Documents\\GitHub\\SmartPharma\\pharmacy.sqlite";
    /**
     * Creates new form ajoute_medicament
     */
    public ajoute_medicament() {
        initComponents();
        Fillcombo();
        Fillcombo1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void Fillcombo(){
        ResultSet rs=null;
        try{
             Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection(database);
           String sql = "select * from famille_Medicament" ;
           PreparedStatement pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           
           while(rs.next()){
               String name= rs.getString("nom_FamilleMedicament");
               jComboBox1.addItem(name);
           }
        }
        catch(Exception e){
            
        }
        
    }
    private void Fillcombo1(){
        ResultSet rs=null;
        try{
             Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection(database);
           String sql = "select * from Fournisseur" ;
           PreparedStatement pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           
           while(rs.next()){
               String name= rs.getString("Nom_F");
               jComboBox3.addItem(name);
           }
        }
        catch(Exception e){
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Chaparral Pro Light", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Famille Medicament  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, -1, 23));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 227, 30));

        jLabel3.setFont(new java.awt.Font("Chaparral Pro Light", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom Medicament ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 23));

        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 227, 28));
        jComboBox1.getAccessibleContext().setAccessibleParent(this);

        jLabel4.setFont(new java.awt.Font("Chaparral Pro Light", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TVA           ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 23));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 227, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crème", "dermiques", "Comprimé", "injectable", "inhalées", "gélule", "rectales", "orales" }));
        jComboBox2.setBorder(null);
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 227, 28));

        jLabel5.setFont(new java.awt.Font("Chaparral Pro Light", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Form         ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 90, 27));

        jLabel6.setFont(new java.awt.Font("Chaparral Pro Light", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantité");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 90, 23));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 227, 30));

        jComboBox3.setEditable(true);
        jComboBox3.setBorder(null);
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 227, 28));

        jLabel7.setFont(new java.awt.Font("Chaparral Pro Light", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date d'Expiration            ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, 27));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 227, 30));

        jLabel8.setFont(new java.awt.Font("Chaparral Pro Light", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prix de vente          ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 140, 30));

        jButton2.setFont(new java.awt.Font("Chaparral Pro Light", 0, 22)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete small.png"))); // NOI18N
        jButton2.setText("Quitter");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 170, 50));

        save.setFont(new java.awt.Font("Chaparral Pro Light", 0, 22)); // NOI18N
        save.setForeground(new java.awt.Color(0, 0, 204));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/save.png"))); // NOI18N
        save.setText("Enregistrer");
        save.setOpaque(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 170, 50));
        save.getAccessibleContext().setAccessibleParent(this);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 100, 30));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", " " }));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 80, 30));

        jLabel11.setFont(new java.awt.Font("Chaparral Pro Light", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fournisseur             ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, 27));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("...");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 910, 370));

        jLabel10.setFont(new java.awt.Font("Dancing in the Rainbow", 0, 90)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gestion de Medicaments");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 650, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 930, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Backgroun5.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        String ss = jTextField1.getText();
        String name = ss.toUpperCase();
        String TTVA = jTextField2.getText();
        Integer date = 1 ;
       Integer month=null;
        String monthstr=(String) jComboBox4.getSelectedItem();//
        String annee=(String) jComboBox5.getSelectedItem();//
        String qty = jTextField3.getText();
        String pprix = jTextField4.getText();
        String fforme = (String)jComboBox2.getSelectedItem();
       String idfamille = (String)jComboBox1.getSelectedItem();
        
       if("January".equals(monthstr))
           month=1;
        else
           if("February".equals(monthstr))
          month=2;
        else
                 if("March".equals(monthstr))
          month=3;
        else
                       if("April".equals(monthstr))
          month=4;
        else
                             if("May".equals(monthstr))
          month=5;
        else
                                   if("June".equals(monthstr))
          month=6;
        else
                                         if("July".equals(monthstr))
          month=7;
        else
                                              if("August".equals(monthstr))
          month=8;
        else
                                                   if("September".equals(monthstr))
          month=9;
        else
                                                         if("October".equals(monthstr))
          month=10;
        else
                                                               if("November".equals(monthstr))
          month=11;
        else
                                                                     if("December".equals(monthstr))
          month=12;
        
        

            String str=null;
            Statement stmt=null;
            ResultSet rs=null;

            try{
                 Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection(database);
                    stmt =(Statement) conn.createStatement();
                    /* InputStream imgg = new FileInputStream(new File(s)); */
    String sql = " insert into Medicament (Nom_M,Prix,TVA,Quantite_stock,Form,Date_expiration,IdFamille) values('"+name+"','"+pprix+"', '"+TTVA+"', '"+qty+"', '"+fforme+"', '"+annee+"-"+month+"-"+date+"',(SELECT IdFamille from Famille_Medicament WHERE nom_FamilleMedicament = '"+idfamille+"'))";
                    
                    
                    stmt.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(null, "l'Enregistrement a été ajouter avec succès ! ");
               
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    
                    
                    
                    rs.close();
                    conn.close();
                    
             
             
             
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e){  
                
                JOptionPane.showMessageDialog(null,e);
                
            }
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Famille_Medicament fmf= new Famille_Medicament();
        fmf.setVisible(true);
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
            java.util.logging.Logger.getLogger(ajoute_medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajoute_medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajoute_medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajoute_medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajoute_medicament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
/*private ImageIcon format= null ; 
private String s;
String filename=null;
int sss=0;
byte[] medicament_image=null;*/
}
