/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.Color;
import java.awt.Dimension;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Maxwell
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    
          Connection conn;
        java.sql.Statement statement;
        ResultSet rs;
        PreparedStatement prepared, pt;
        int selectedRow;
    public View() {
              try {
                  initComponents();
                  setTitle("View");
                  setSize(906, 477);
                  setResizable(false);
                  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                  this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
                  getContentPane().setBackground(Color.decode("#1f6850"));
                  String sql = "Select * from USERNAME.DB ORDER BY ID ASC";
                  conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
                  prepared = conn.prepareStatement(sql);
                  rs = prepared.executeQuery();
                  jTable1.setModel(DbUtils.resultSetToTableModel(rs));
              } catch (SQLException ex) {
                  Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        IT301_System_PUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("IT301_System_PU").createEntityManager();
        dbQuery = java.beans.Beans.isDesignTime() ? null : IT301_System_PUEntityManager.createQuery("SELECT d FROM Db d");
        dbList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dbQuery.getResultList();
        dbQuery1 = java.beans.Beans.isDesignTime() ? null : IT301_System_PUEntityManager.createQuery("SELECT d FROM Db d");
        dbList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dbQuery1.getResultList();
        dbQuery2 = java.beans.Beans.isDesignTime() ? null : IT301_System_PUEntityManager.createQuery("SELECT d FROM Db d");
        dbList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dbQuery2.getResultList();
        dbQuery3 = java.beans.Beans.isDesignTime() ? null : IT301_System_PUEntityManager.createQuery("SELECT d FROM Db d");
        dbList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dbQuery3.getResultList();
        dbQuery4 = java.beans.Beans.isDesignTime() ? null : IT301_System_PUEntityManager.createQuery("SELECT d FROM Db d");
        dbList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dbQuery4.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        filter = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, dbList4, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rent}"));
        columnBinding.setColumnName("Rent");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${vehicle}"));
        columnBinding.setColumnName("Vehicle");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${status}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bill}"));
        columnBinding.setColumnName("Bill");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        filter.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAME", "ADDRESS", "PHONE", "VEHICLE", "STATUS" }));
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jLabel7.setText("Search by :");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jButton6.setText("Reset");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
//        int selectedRow = jTable1.getSelectedRow();
//        //        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        theID.setText(jTable1.getModel().getValueAt(selectedRow, 0).toString());
//        theName.setText(jTable1.getModel().getValueAt(selectedRow, 1).toString());
//        theAddress.setText(jTable1.getModel().getValueAt(selectedRow, 2).toString());
//        thePhoneNumber.setText(jTable1.getModel().getValueAt(selectedRow, 3).toString());
//        rentDuration.setValue(jTable1.getModel().getValueAt(selectedRow, 4));
//
//        if((jTable1.getModel().getValueAt(selectedRow, 5).toString()).equals("MITSUBISHI")){
//            theVehicle.setSelectedIndex(0);}
//        if((jTable1.getModel().getValueAt(selectedRow, 5).toString()).equals("TOYOTA")){
//            theVehicle.setSelectedIndex(1);}
//        if((jTable1.getModel().getValueAt(selectedRow, 5).toString()).equals("FORD")){
//            theVehicle.setSelectedIndex(2);}
//        if((jTable1.getModel().getValueAt(selectedRow, 5).toString()).equals("BUGATTI")){
//            theVehicle.setSelectedIndex(3);}
//        if((jTable1.getModel().getValueAt(selectedRow, 5).toString()).equals("LAMBORGHINI")){
//            theVehicle.setSelectedIndex(4);}
//        if((jTable1.getModel().getValueAt(selectedRow, 5).toString()).equals("PORSHE")){
//            theVehicle.setSelectedIndex(5);}

        //        receipt.setText("ID Number : \t\t" + jTable1.getModel().getValueAt(selectedRow, 0).toString() + "\n" + "Name: \t\t" + jTable1.getModel().getValueAt(selectedRow, 1).toString()
            //            + "\nAddress: \t\t" + jTable1.getModel().getValueAt(selectedRow, 2).toString()
            //            + "\nPhone Number: \t " + jTable1.getModel().getValueAt(selectedRow, 3).toString()+ "\n"
            //            + "Rent Duration: \t " +jTable1.getModel().getValueAt(selectedRow, 4).toString() + " days");
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            main m = new main();
            m.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //
        //        String s = search.getText();
        //        if(search.getText().equals("")){
            //        JOptionPane.showMessageDialog(null, "No Input");
            //        }
        //        else{
            //            try {
                //                prepared = (PreparedStatement) conn.prepareStatement("SELECT * FROM USERNAME.DB WHERE NAME LIKE '%?%'");
                //                prepared.setString(0, s);
                //              prepared.setString(1, s);
                //                prepared.setString(2, s);
                //                prepared.executeUpdate();
                //                statement.close();
                //                conn.close();
                //                update_Table();
                //
                //            } catch (SQLException ex) {
                //                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                //                JOptionPane.showMessageDialog(null, "No Information Found");
                //            }
            //
            //        }
        //
        //
        search_Table();

    }//GEN-LAST:event_jButton5ActionPerformed

        private void search_Table(){
     int theFilter = filter.getSelectedIndex();
     String sql = null;
    try{
        

        
    if(theFilter == 0){
     sql = "SELECT * FROM USERNAME.DB WHERE "
            + "UPPER(NAME) LIKE UPPER('%"+ search.getText()+ "%')";}
    
    else if(theFilter == 1){
     sql = "SELECT * FROM USERNAME.DB WHERE "
            + "UPPER(ADDRESS) LIKE UPPER('%"+ search.getText()+ "%')";} 
    
    else if(theFilter == 2){
     sql = "SELECT * FROM USERNAME.DB WHERE "
            + "PHONE LIKE '%"+ search.getText()+ "%'";} 
    

   
   
   else if(theFilter == 3){
     sql = "SELECT * FROM USERNAME.DB WHERE "
            + "UPPER(VEHICLE) LIKE UPPER('%"+ search.getText()+ "%')";} 
    
   else if(theFilter == 4){
     sql = "SELECT * FROM USERNAME.DB WHERE "
            + "UPPER(STATUS) LIKE UPPER('%"+ search.getText()+ "%')";} 
    
   
    
                
//    ID LIKE '%"+ search.getText()+ "%'  OR PHONE LIKE '%"+ search.getText()+ "%' OR RENT LIKE '%"+ search.getText()+ "%' OR VEHICLE LIKE '%"+ search.getText()+ "%' OR ADDRESSLIKE '%"+ search.getText()+ "%'
    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
    prepared = conn.prepareStatement(sql);
    rs = prepared.executeQuery();
    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
    }
    finally{
    try{
    
    rs.close();
    prepared.close();
    
    }
    catch (Exception e){}
    }
    
    
    try{prepared.close();}
    catch(Exception e){}
    }
     
        
        
          
     private void update_Table(){
    try{

    String sql = "Select * from USERNAME.DB ORDER BY ID ASC";
    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
    prepared = conn.prepareStatement(sql);
    rs = prepared.executeQuery();
    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
    }
    finally{
    try{
    
    rs.close();
    prepared.close();
    
    }
    catch (Exception e){}
    }
    
    
    try{prepared.close();}
    catch(Exception e){}
    }
    
    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        // TODO add your handling code here:

        if(filter.getSelectedIndex() == 2 ){

            char c = evt.getKeyChar();
            if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
                evt.consume();

            }

        }
    }//GEN-LAST:event_searchKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        search.setText("");
        update_Table();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager IT301_System_PUEntityManager;
    private java.util.List<system.Db> dbList;
    private java.util.List<system.Db> dbList1;
    private java.util.List<system.Db> dbList2;
    private java.util.List<system.Db> dbList3;
    private java.util.List<system.Db> dbList4;
    private javax.persistence.Query dbQuery;
    private javax.persistence.Query dbQuery1;
    private javax.persistence.Query dbQuery2;
    private javax.persistence.Query dbQuery3;
    private javax.persistence.Query dbQuery4;
    private javax.swing.JComboBox<String> filter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField search;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
