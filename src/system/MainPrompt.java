/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Maxwell
 */
public class MainPrompt extends javax.swing.JFrame {

    /**
     * Creates new form MainPrompt
     
     */    
            Connection conn;
        Statement statement;
    public MainPrompt() throws SQLException {
        initComponents();
        initComponents();
        setTitle("Login");
        setSize(328, 500);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        getContentPane().setBackground(Color.decode("#2d30b7"));
        
        
        
               
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        un = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cb = new javax.swing.JCheckBox();
        position1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        un.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unKeyPressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");

        pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwKeyPressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/Webp.net-resizeimage.png"))); // NOI18N

        cb.setForeground(new java.awt.Color(240, 240, 240));
        cb.setText("Show Password");
        cb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMouseClicked(evt);
            }
        });
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        position1.setForeground(new java.awt.Color(240, 240, 240));
        position1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Admin" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(position1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pw)
                                .addComponent(un)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9))))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(position1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            main m = new main();
            Connection conn;
            PreparedStatement ps,prepared;
            
            try {
                // TODO add your handling code here:
                
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
                
                ps = conn.prepareStatement("SELECT USERNAME, PASSWORD, POSITION FROM USERNAME.MANAGEMENT WHERE USERNAME = ? AND PASSWORD = ? AND POSITION = ?");
                ps.setString(1, un.getText());
                ps.setString(2, pw.getText());
                ps.setString(3, position1.getSelectedItem().toString());
                ResultSet rs = ps.executeQuery();
                if(rs.next()){m.setVisible(true);
                this.setVisible(false);}
                
                else{
                    showMessage("Incorrect Username || Password","Information Error","E");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Prompt.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MainPrompt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    
        private JDialog showMessage(String s, String title, String type){
    
            JOptionPane jop = new JOptionPane(s, (type.equals("S")) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);
            JDialog dialog = jop.createDialog(title);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            return dialog;
    }
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try {
                main m = new main();
                Connection conn;
                PreparedStatement ps,prepared;
                
                try {
                    // TODO add your handling code here:
                    
                    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
                    
                    ps = conn.prepareStatement("SELECT USERNAME, PASSWORD, POSITION FROM USERNAME.MANAGEMENT WHERE USERNAME = ? AND PASSWORD = ? AND POSITION = ?");
                    ps.setString(1, un.getText());
                    ps.setString(2, pw.getText());
                    ps.setString(3, position1.getSelectedItem().toString());
                    ResultSet rs = ps.executeQuery();
                    if(rs.next()){m.setVisible(true);
                    this.setVisible(false);}
                    
                    else{
                        showMessage("Incorrect Username || Password","Information Error","E");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Prompt.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainPrompt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton1KeyPressed

    private void unKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyPressed
        // TODO add your handling code here:

        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try {
                main m = new main();
                Connection conn;
                PreparedStatement ps,prepared;
                
                try {
                    // TODO add your handling code here:
                    
                    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
                    
                    ps = conn.prepareStatement("SELECT USERNAME, PASSWORD, POSITION FROM USERNAME.MANAGEMENT WHERE USERNAME = ? AND PASSWORD = ? AND POSITION = ?");
                    ps.setString(1, un.getText());
                    ps.setString(2, pw.getText());
                    ps.setString(3, position1.getSelectedItem().toString());
                    
                    ResultSet rs = ps.executeQuery();
                    if(rs.next()){m.setVisible(true);
                    this.setVisible(false);}
                    
                    else{
                        showMessage("Incorrect Username || Password","Information Error","E");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Prompt.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainPrompt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_unKeyPressed

    private void pwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try {
                main m = new main();
                Connection conn;
                PreparedStatement ps,prepared;
                
                try {
                    // TODO add your handling code here:
                    
                    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
                    
                    ps = conn.prepareStatement("SELECT USERNAME, PASSWORD, POSITION FROM USERNAME.MANAGEMENT WHERE USERNAME = ? AND PASSWORD = ? AND POSITION = ?");
                    ps.setString(1, un.getText());
                    ps.setString(2, pw.getText());
                    ps.setString(3, position1.getSelectedItem().toString());
                    ResultSet rs = ps.executeQuery();
                    if(rs.next()){m.setVisible(true);
                    this.setVisible(false);}
                    
                    else{
                        showMessage("Incorrect Username || Password","Information Error","E");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Prompt.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainPrompt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pwKeyPressed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
     if(cb.isSelected()){
            System.out.print("wfefewfewfew");
            pw.setEchoChar((char)0);
            
        }
     else if(!cb.isSelected()){
            pw.setEchoChar('*');
        }
    }//GEN-LAST:event_cbActionPerformed

    private void cbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMouseClicked
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_cbMouseClicked

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
            java.util.logging.Logger.getLogger(MainPrompt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPrompt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPrompt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPrompt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainPrompt().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainPrompt.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> position1;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
