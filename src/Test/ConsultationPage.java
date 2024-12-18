/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import MyLibs.Date;
import MyLibs.Doctor;
import MyLibs.Patient;
import MyLibs.Specialization;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oracle.jrockit.jfr.parser.ParseException;

/**
 *
 * @author Brey
 */
public class ConsultationPage extends javax.swing.JFrame implements FormCommand{
  String URL = "jdbc:mysql://localhost:3306/doctorquery";
        String USER = "root";
        String PASS = "password";
    /**
     * Creates new form ConsultationPage
     */
        
        
    public void fillCombo(){
        try {
          Connection conn = DriverManager.getConnection(URL, USER, PASS);
          PreparedStatement state = conn.prepareStatement("SELECT Doctor_NAME FROM Doctor");
          ResultSet result = state.executeQuery();
          
          while(result.next()){
              String name = result.getString(1);
              jComboBox1.addItem(name);
          }
          
      } catch (SQLException ex) {
          Logger.getLogger(ConsultationPage.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    public ConsultationPage() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\AUBREY MARIE\\Desktop\\New folder (2)\\CodePrototype_Final_withDB_WithUI\\src\\images\\icons.png");
        this.setIconImage(icon.getImage());
        fillCombo();
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientField = new javax.swing.JTextField();
        PaymentField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        HomeBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PatientField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 224, 260, 30));

        PaymentField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PaymentFieldKeyTyped(evt);
            }
        });
        getContentPane().add(PaymentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 274, 260, 30));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 50, 30));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setText("Consulting Doctor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 170, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel5.setText("Consulting Patient:");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 224, 160, 30));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel6.setText("Payment:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 264, 80, 40));

        clearButton.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 140, 50));

        submit.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 110, 50));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 30)); // NOI18N
        jLabel7.setText("Consultation Form");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, 50));

        HomeBack.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        HomeBack.setText("Home");
        HomeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBackActionPerformed(evt);
            }
        });
        getContentPane().add(HomeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cs project logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 70));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 260, 33));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 260, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Proj_background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        boolean corrects = false; 
        boolean doccorrect = false;
        int docnumber; 
        java.util.Date date = jDateChooser1.getDate();
        String doc = jComboBox1.getItemAt(WIDTH);
        String patient = PatientField.getText();
       // String checkpay = PaymentField.getText();
        String payment = PaymentField.getText();
 
               
                            
           
      // int payment = Integer.parseInt(PaymentField.getText());
      // int payment = 3;
       
       // int payment = Integer.parseInt(PaymentField.getText());
        
        //to check if has filled up all the needed fields
        
      
      if(patient.equals("")){
          JOptionPane.showMessageDialog(null, "Patient's name is required");
      }
      else if(payment.equals("")){
          JOptionPane.showMessageDialog(null, "Payment is required");
      }
      else{
          corrects = true;
      }
      
    
      
      if(corrects == true){
            try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement statement = conn.prepareStatement("SELECT Doctor_NAME,Doctor_ID FROM Doctor");
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                if(result.getString(1).equals(doc)){
                    Patient pat = new Patient();
                    int d;
                    docnumber = jComboBox1.getSelectedIndex();
                    doccorrect = true;
                    
                    int p = Integer.parseInt(payment);
                    
                    pat.InsertData(patient,date,p,docnumber);
                    JOptionPane.showMessageDialog(null, "Consultation recorded");
                    break;
                }
                else{
                   // JOptionPane.showMessageDialog(null, "wala sya dito");
                    doccorrect = false;
                }
                 
            }
            
            if(doccorrect == true){
               // JOptionPane.showMessageDialog(null, "luh");
            }
            else{
                   JOptionPane.showMessageDialog(null, "Doctor not available in this hospital");
            }
            
        }
        catch (SQLException ex){
        }
          
      }
    }//GEN-LAST:event_submitActionPerformed
    private static final Logger LOG = Logger.getLogger(ConsultationPage.class.getName());

    private void HomeBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBackActionPerformed
        // TODO add your handling code here:
        HomePage home = new HomePage();

    home.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    //login.setSize(800, 600);
    home.setVisible(true);
    home.setLocationRelativeTo(null);

    home.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_HomeBackActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        
        PatientField.setText(null);
        PaymentField.setText(null);
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
   
        
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void PaymentFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaymentFieldKeyTyped
     char c = evt.getKeyChar();
     if(!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
         getToolkit().beep();
         evt.consume();
     }
    }//GEN-LAST:event_PaymentFieldKeyTyped

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
            java.util.logging.Logger.getLogger(ConsultationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultationPage().setVisible(true);
            }
        });
    }

    public void execute(){
        this.setVisible(true);
        
       this.pack();
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeBack;
    private javax.swing.JTextField PatientField;
    private javax.swing.JTextField PaymentField;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}


