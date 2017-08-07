/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Maxwell
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    Connection conn;
    java.sql.Statement statement, statement1;
    ResultSet rs, ts;
    int id = 0, row, col;
      DateFormat dateFormat = new SimpleDateFormat("M/d/yy");
    double bill;
    PreparedStatement prepared, pt, b;
    public main() throws SQLException{
        initComponents();
        setTitle("Vehicle Renting and Billing System");
        setSize(1201, 629);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        getContentPane().setBackground(Color.decode("#262525"));
        JFormattedTextField editor = ((JSpinner.DefaultEditor)rentDuration.getEditor()).getTextField();
        editor.setEditable(false);
        Calendar aDate = Calendar.getInstance(Locale.ROOT);
        dateChooserCombo1.setMinDate(aDate);
        rentDuration.getEditor().setBackground(Color.decode("#1c1b1b"));
        

       
        
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
       
       
        statement = conn.createStatement();
        pt = conn.prepareStatement("ALTER TABLE USERNAME.DB ALTER COLUMN VEHICLE SET DATA TYPE varchar(50)");
        pt.executeUpdate();
//        pt = conn.prepareStatement("ALTER TABLE USERNAME.DB ALTER COLUMN BILL SET DATA TYPE number(20)");

//        pt = conn.prepareStatement("ALTER TABLE USERNAME.DB ADD BILL DECIMAL(16 , 2)");
//        pt.executeUpdate();
//        pt = conn.prepareStatement("UPDATE USERNAME.DB SET BILL = BILLS");
//        pt.executeUpdate();
//        pt = conn.prepareStatement("ALTER TABLE USERNAME.DB DROP COLUMN BILLS");
//        pt.executeUpdate();
//        pt = conn.prepareStatement("EXEC sp_RENAME 'USERNAME.DB.BILLS', 'BILL', 'COLUMN'");
//        pt.executeUpdate();
//        
        
        
//        
//        b = conn.prepareStatement("ALTER TABLE USERNAME.DB ADD BILL DECIMAL(16, 2)");
//        b.executeUpdate();
//        b = conn.prepareStatement("UPDATE USERNAME.DB SET BILL = BILLS");
//        b.executeUpdate();
//        b = conn.prepareStatement("ALTER TABLE USERNAME.DB DROP COLUMN BILLS");
//        b.executeUpdate();
//        b = conn.prepareStatement("EXEC sp_RENAME 'USERNAME.DB.BILLS', 'BILL', 'COLUMN'");
//        b.executeUpdate();
        
        
        
//        pt = conn.prepareStatement("ALTER TABLE USERNAME.DB RENAME COLUMN BILLS TO BILL");
//        pt.executeUpdate();
//        b = conn.prepareStatement("ALTER TABLE USERNAME.DB ALTER COLUMN BILL SET DATA TYPE integer(50)");
//        b.executeUpdate();
        rs = statement.executeQuery("SELECT ID FROM USERNAME.DB ORDER BY ID DESC");
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        id = jTable1.getRowCount();
        
        
        theID.setEditable(false);
        
//        theID.setText(String.valueOf(id + 1 + 1));
        
        jButton1.setVisible(false);
        
       
        while(rs.next());
        
        if(theName.getText().equals("") || theAddress.getText().equals("") || !(thePhoneNumber.getText().length() >= 11) ){
        theVehicle.setEnabled(false);
       
        }
        else
        theVehicle.setEnabled(true);
        
        //VEHICLE PROBLEM SHOULD BE SHOWING ONLY THE RETURNED VEHICLES
        String query = "SELECT * FROM USERNAME.VEHICLES  WHERE VEHICLE_NAME IN (SELECT VEHICLE FROM USERNAME.DB WHERE STATUS = 'RETURNED') OR VEHICLE_NAME NOT IN (SELECT VEHICLE FROM USERNAME.DB)";
        ResultSet v = statement.executeQuery(query);
        while(v.next()){
        String vehicle = v.getString("VEHICLE_NAME");
        
        theVehicle.addItem(vehicle);
        
        
        
        
        
        
        
        }
        
        
        
       
     
    }
        private JDialog showMessage(String s, String title, String type){
    
            JOptionPane jop = new JOptionPane(s, (type.equals("S")) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);
            JDialog dialog = jop.createDialog(title);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            return dialog;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        theName = new javax.swing.JTextField();
        theAddress = new javax.swing.JTextField();
        thePhoneNumber = new javax.swing.JTextField();
        rentDuration = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        theVehicle = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        theID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(730, 64, 39, 20);

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Address");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(730, 100, 51, 14);

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(730, 120, 90, 25);

        theName.setBackground(new java.awt.Color(240, 240, 240));
        theName.setDisabledTextColor(new java.awt.Color(45, 40, 40));
        theName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                theNameKeyTyped(evt);
            }
        });
        getContentPane().add(theName);
        theName.setBounds(820, 60, 356, 25);

        theAddress.setBackground(new java.awt.Color(240, 240, 240));
        theAddress.setDisabledTextColor(new java.awt.Color(45, 40, 40));
        theAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                theAddressKeyTyped(evt);
            }
        });
        getContentPane().add(theAddress);
        theAddress.setBounds(820, 90, 356, 25);

        thePhoneNumber.setBackground(new java.awt.Color(240, 240, 240));
        thePhoneNumber.setDisabledTextColor(new java.awt.Color(45, 40, 40));
        thePhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                thePhoneNumberKeyTyped(evt);
            }
        });
        getContentPane().add(thePhoneNumber);
        thePhoneNumber.setBounds(820, 120, 356, 25);

        rentDuration.setFont(new java.awt.Font("Vrinda", 0, 16)); // NOI18N
        rentDuration.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        rentDuration.setFocusable(false);
        rentDuration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rentDurationKeyTyped(evt);
            }
        });
        getContentPane().add(rentDuration);
        rentDuration.setBounds(820, 150, 356, 29);

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Rent Duration");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(730, 160, 82, 14);

        theVehicle.setBackground(new java.awt.Color(51, 51, 51));
        theVehicle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                theVehicleItemStateChanged(evt);
            }
        });
        theVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                theVehicleMouseClicked(evt);
            }
        });
        theVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theVehicleActionPerformed(evt);
            }
        });
        getContentPane().add(theVehicle);
        theVehicle.setBounds(820, 190, 356, 28);

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Pick-Up Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(730, 230, 83, 30);

        jButton1.setBackground(new java.awt.Color(28, 27, 27));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Rent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 560, 410, 23);

        receipt.setEditable(false);
        receipt.setColumns(20);
        receipt.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 13)); // NOI18N
        receipt.setRows(5);
        jScrollPane2.setViewportView(receipt);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(730, 400, 443, 190);

        theID.setBackground(new java.awt.Color(240, 240, 240));
        theID.setDisabledTextColor(new java.awt.Color(45, 40, 40));
        theID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                theIDKeyTyped(evt);
            }
        });
        getContentPane().add(theID);
        theID.setBounds(820, 30, 356, 25);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, dbList4, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(730, 30, 44, 25);

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Select Vehicle");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(730, 200, 83, 14);

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(350, 300));
    dateChooserCombo1.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
    dateChooserCombo1.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
        public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
            dateChooserCombo1OnSelectionChange(evt);
        }
    });
    dateChooserCombo1.addCommitListener(new datechooser.events.CommitListener() {
        public void onCommit(datechooser.events.CommitEvent evt) {
            dateChooserCombo1OnCommit(evt);
        }
    });
    getContentPane().add(dateChooserCombo1);
    dateChooserCombo1.setBounds(820, 230, 355, 30);

    jLabel8.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(240, 240, 240));
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel8.setText("Confirm");
    jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 3));
    jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel8MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jLabel8MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jLabel8MouseExited(evt);
        }
    });
    getContentPane().add(jLabel8);
    jLabel8.setBounds(820, 280, 350, 30);

    jLabel9.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(240, 240, 240));
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel9.setText("Reset");
    jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 3));
    jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel9MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jLabel9MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jLabel9MouseExited(evt);
        }
    });
    getContentPane().add(jLabel9);
    jLabel9.setBounds(820, 320, 350, 30);

    jLabel10.setFont(new java.awt.Font("Vrinda", 0, 11)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(240, 240, 240));
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel10.setText("Back");
    jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 3));
    jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel10MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jLabel10MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jLabel10MouseExited(evt);
        }
    });
    getContentPane().add(jLabel10);
    jLabel10.setBounds(820, 360, 350, 30);

    bindingGroup.bind();

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void theVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_theVehicleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {                                         
            main m = new main();
                    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
       
       
        statement = conn.createStatement();
            try {
                rentDuration.setFocusable(false);
                
                String name = theName.getText();
                String address = theAddress.getText();
                String phone = (thePhoneNumber.getText());
                int rent = (int)rentDuration.getValue();
                int val = 0,valCheck = 0;
                String vehicle = theVehicle.getSelectedItem().toString();
                String id = theID.getText();
                String date = dateChooserCombo1.getText();
                if(theName.getText().equals("") || theAddress.getText().equals("") || thePhoneNumber.getText().equals("")){
                    
                    
                    showMessage("Please fill all necessary informations", "Error","E");
                    
                }
                else if(thePhoneNumber.getText().length() != 11){
                    
                JOptionPane.showMessageDialog(null, "Check Phone Number");
                }
              
                
                
                
                
                else
                    // TODO add your handling code here:
                    
                    
                            
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
       
       
        statement = conn.createStatement();
                    
                    
                    prepared = (PreparedStatement) conn.prepareStatement("INSERT INTO USERNAME.DB (ID, NAME, PHONE, RENT, VEHICLE, ADDRESS, STATUS, DATE, BILL) VALUES (?,?,?,?,?,?,?,?,?)");
                  
                ResultSet rset;
                java.sql.Statement s2 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rset = s2.executeQuery("Select ID FROM USERNAME.DB");
                rset.afterLast();

                while(rset.previous()){
                val = rset.getInt("ID");
                valCheck = rset.getInt("ID") + 1;
                break;
                }

       
       
       
                prepared.setInt(1, (val == valCheck) ? val : valCheck);
                prepared.setString(2, name);
                prepared.setLong(3, Long.parseLong(phone));
                prepared.setInt(4, rent);
                prepared.setString(5, vehicle);
                prepared.setString(6, address);
                prepared.setString(7, "SCHEDULED");
                prepared.setString(8, date);
                prepared.setDouble(9, bill);
                
                showMessage("Saved", "Successful", "S");
                prepared.executeUpdate();
                statement.close();
                conn.close();
               
                receipt.setText("ID Number : \t" + String.valueOf(id) + "\n" + "Name: \t" + name + "\nPhone Number: \t " + String.valueOf(phone) + "\n"
                        + "Rent Duration: \t " +String.valueOf(rent) + " day / s" + "\n" + "Vehicle : \t" + theVehicle.getSelectedItem()+ "\nPick Up Date: \t " + date);
                
               
               
               jButton1.setVisible(false);
//               theID.setText(String.valueOf(Integer.valueOf(theID.getText())+1));
                
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
//        update_Table();
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
//        update_Table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void thePhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thePhoneNumberKeyTyped
        // TODO add your handling code here:
                        char c = evt.getKeyChar();
                        
        if(thePhoneNumber.getText().length() >= 11){
        
        thePhoneNumber.setText(thePhoneNumber.getText().substring(0,10));
        theVehicle.setEnabled(true);
        }
        
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            evt.consume();
            
        }
        
        if(!(theName.getText().equals("") || theAddress.getText().equals("") || !(thePhoneNumber.getText().length() >= 10 && !(thePhoneNumber.getText().length() < 10))) ){
        theVehicle.setEnabled(true);
       
        }
                else{
        theVehicle.setEnabled(false);
        }   
        
        
        
    }//GEN-LAST:event_thePhoneNumberKeyTyped

    private void theIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_theIDKeyTyped
        // TODO add your handling code here:
                        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            evt.consume();
            
        }
    }//GEN-LAST:event_theIDKeyTyped

    private void rentDurationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rentDurationKeyTyped
        // TODO add your handling code here:
                        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            evt.consume();
            
        }
    }//GEN-LAST:event_rentDurationKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        //        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        theID.setText(jTable1.getModel().getValueAt(selectedRow, 0).toString());
        theName.setText(jTable1.getModel().getValueAt(selectedRow, 1).toString());
        theAddress.setText(jTable1.getModel().getValueAt(selectedRow, 2).toString());
        thePhoneNumber.setText(jTable1.getModel().getValueAt(selectedRow, 3).toString());
        rentDuration.setValue(jTable1.getModel().getValueAt(selectedRow, 4));

        
//                if((jTable1.getModel().getValueAt(selectedRow, 4).toString()).equals("MITSUBISHI ADVENTURE 2.5 GLX")){
//            theVehicle.setSelectedIndex(0);}
//        if((jTable1.getModel().getValueAt(selectedRow, 4).toString()).equals("MITSUBISHI MIRAGE GLX 1.6")){
//            theVehicle.setSelectedIndex(1);}
//        if((jTable1.getModel().getValueAt(selectedRow, 4).toString()).equals("TOYOTA INNOVA 2.5 E")){
//            theVehicle.setSelectedIndex(2);}
//        if((jTable1.getModel().getValueAt(selectedRow, 4).toString()).equals("TOYOTA HI-ACE COMMUTER 2.8")){
//            theVehicle.setSelectedIndex(3);}
//        if((jTable1.getModel().getValueAt(selectedRow, 4).toString()).equals("TOYOTA HI-ACE GRANDIA 3.0")){
//            theVehicle.setSelectedIndex(4);}
//        if((jTable1.getModel().getValueAt(selectedRow, 4).toString()).equals("TOYOTA HI-ACE SUPER GRANDIA 3.0")){
//            theVehicle.setSelectedIndex(5);}
//        if((jTable1.getModel().getValueAt(selectedRow, 4).toString()).equals("TOYOTA VIOS 1.3 E")){
//            theVehicle.setSelectedIndex(6);}
//        if((jTable1.getModel().getValueAt(selectedRow, 4).toString()).equals("TOYOTA AVANZA 1.5 J")){
//            theVehicle.setSelectedIndex(7);}        
//        if((jTable1.getModel().getValueAt(selectedRow, 4).toString()).equals("HYUNDAI ACCENT 1.6")){
//            theVehicle.setSelectedIndex(8);}
//        if((jTable1.getModel().getValueAt(selectedRow, 4).toString()).equals("HYUNDAI STAREX 2.4")){
//            theVehicle.setSelectedIndex(9);}

        

        //        receipt.setText("ID Number : \t\t" + jTable1.getModel().getValueAt(selectedRow, 0).toString() + "\n" + "Name: \t\t" + jTable1.getModel().getValueAt(selectedRow, 1).toString()
            //            + "\nAddress: \t\t" + jTable1.getModel().getValueAt(selectedRow, 2).toString()
            //            + "\nPhone Number: \t " + jTable1.getModel().getValueAt(selectedRow, 3).toString()+ "\n"
            //            + "Rent Duration: \t " +jTable1.getModel().getValueAt(selectedRow, 4).toString() + " days");
    }//GEN-LAST:event_jTable1MouseClicked

    private void theVehicleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_theVehicleItemStateChanged
        try {
            // TODO add your handling code here:
               conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
       
       
        statement = conn.createStatement();
            
            jButton1.setVisible(false);
            String name = theName.getText();
            String address = theAddress.getText();
            String phone = (thePhoneNumber.getText());
            int rent = (int)rentDuration.getValue();
            String vehicle = theVehicle.getSelectedItem().toString();
            String id = theID.getText();
            int selectedRow = 0;
            int price = 0;
            java.sql.Statement getPrice = conn.createStatement();
       
            String sql = "Select PRICE FROM USERNAME.VEHICLES where VEHICLE_NAME = '"+ vehicle +"'";
            getPrice.executeQuery(sql);
            ResultSet pr = getPrice.getResultSet();
            while(pr.next()){
            price = Integer.valueOf(pr.getString("PRICE"));
            }
            
            
            
            bill = rent * price;
            
//        if(theVehicle.getSelectedIndex() == 0 ){
//            bill = rent * 2000;}
//        else if((theVehicle.getSelectedIndex() == 1 )){
//             bill = rent * 1500;}
//        else if((theVehicle.getSelectedIndex() == 2 )){
//             bill = rent * 2500;}
//        else if((theVehicle.getSelectedIndex() == 3 )){
//            bill = rent * 2500;}
//        else if((theVehicle.getSelectedIndex() == 4 )){
//             bill = rent * 3000;}
//        else if((theVehicle.getSelectedIndex() == 5 )){
//             bill = rent * 3500;}
//        else if((theVehicle.getSelectedIndex() == 6 )){
//             bill = rent * 1500;}
//        else if((theVehicle.getSelectedIndex() == 7 )){
//             bill = rent * 1500;}        
//        else if((theVehicle.getSelectedIndex() == 8 )){
//             bill = rent * 1500;}
//        else if((theVehicle.getSelectedIndex() == 9 )){
//             bill = rent * 2500;}


String date = dateChooserCombo1.getText();




if(theName.getText().equals("") || theAddress.getText().equals("") || thePhoneNumber.getText().equals("")){
    
//    showMessage("Please fill all necessary informations", "Error","E");
    
}

else {
    
    receipt.setText("ID Number : \t" + String.valueOf(id) + "\n" + "Name: \t" + name + "\nPhone Number: \t " + String.valueOf(phone) + "\n"
            + "Rent Duration: \t " +String.valueOf(rent) + " days" + "\n" + "Vehicle : \t" + theVehicle.getSelectedItem()
            + "\nPick Up Date: \t " + date+ "\nTotal Bill: \t P " + bill);
}
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_theVehicleItemStateChanged

    private void theVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theVehicleMouseClicked
        // TODO add your handling code here:
        
        if(!theVehicle.isEnabled()){
            
            showMessage("One TextField was not filled or Phone Number is not Valid","Input Error","E");
        
        }
        
         
    }//GEN-LAST:event_theVehicleMouseClicked

    private void theNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_theNameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
                if(!(theName.getText().equals("") || theAddress.getText().equals("") || !(thePhoneNumber.getText().length() >= 11)) ){
        theVehicle.setEnabled(true);
       
        }
        else
        theVehicle.setEnabled(false);
                
           if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            evt.consume();
            
        }
           
//                   char c = evt.getKeyChar();
        
        if(!Character.isAlphabetic(c) || (c==com.sun.glass.events.KeyEvent.VK_BACKSPACE) || c==com.sun.glass.events.KeyEvent.VK_DELETE){
//            username.setForeground(Color.RED);
            evt.consume();
        }
        
     
    }//GEN-LAST:event_theNameKeyTyped

    private void theAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_theAddressKeyTyped
        // TODO add your handling code here:
        
        
        
                
                if(!(theName.getText().equals("") || theAddress.getText().equals("") || !(thePhoneNumber.getText().length() >= 11)) ){
        theVehicle.setEnabled(true);
       
        }
                else{
        theVehicle.setEnabled(false);
    }   
        
    }//GEN-LAST:event_theAddressKeyTyped

    private void dateChooserCombo1OnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateChooserCombo1OnSelectionChange
        // TODO add your handling code here:
        
              
    }//GEN-LAST:event_dateChooserCombo1OnSelectionChange

    private void dateChooserCombo1OnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChooserCombo1OnCommit
        // TODO add your handling code here:
         String name = theName.getText();
            String address = theAddress.getText();
            String phone = (thePhoneNumber.getText());
            int rent = (int)rentDuration.getValue();
            String vehicle = theVehicle.getSelectedItem().toString();
            String id = theID.getText();
            int selectedRow = 0;
            

            
            
            String date = dateChooserCombo1.getText();
        
            
            
            
            if(theName.getText().equals("") || theAddress.getText().equals("") || thePhoneNumber.getText().equals("")){
           
            showMessage("Please fill all necessary informations", "Error","E");
            
            }
            
            else {
               
                jButton1.setVisible(true);
        receipt.setText("ID Number : \t" + String.valueOf(id) + "\n" + "Name: \t" + name + "\nPhone Number: \t " + String.valueOf(phone) + "\n"  
                    + "Rent Duration: \t " +String.valueOf(rent) + " days" + "\n" + "Vehicle : \t" + theVehicle.getSelectedItem()
                    + "\nPick Up Date: \t " + date+ "\nTotal Bill: \t P " + bill);
            }
        
    }//GEN-LAST:event_dateChooserCombo1OnCommit

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
                        jLabel8.setOpaque(true);
        jLabel8.setForeground(Color.BLACK);
        jLabel8.setBackground(Color.WHITE);
        
//        jLabel7.setBackground(Color.decode("#1c1b1b"));
//        jLabel7.setForeground(Color.WHITE);
//        jLabel7.setOpaque(false);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
                // TODO add your handling code here:
//                jLabel4.setOpaque(true);
//        jLabel4.setForeground(Color.BLACK);
//        jLabel4.setBackground(Color.WHITE);
        
        jLabel8.setBackground(Color.decode("#1c1b1b"));
        jLabel8.setForeground(Color.WHITE);
        jLabel8.setOpaque(false);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
                        jLabel9.setOpaque(true);
        jLabel9.setForeground(Color.BLACK);
        jLabel9.setBackground(Color.WHITE);
        
//        jLabel7.setBackground(Color.decode("#1c1b1b"));
//        jLabel7.setForeground(Color.WHITE);
//        jLabel7.setOpaque(false);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
                // TODO add your handling code here:
//                jLabel4.setOpaque(true);
//        jLabel4.setForeground(Color.BLACK);
//        jLabel4.setBackground(Color.WHITE);
        
        jLabel9.setBackground(Color.decode("#1c1b1b"));
        jLabel9.setForeground(Color.WHITE);
        jLabel9.setOpaque(false);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
                // TODO add your handling code here:
                jLabel10.setOpaque(true);
        jLabel10.setForeground(Color.BLACK);
        jLabel10.setBackground(Color.WHITE);
        
//        jLabel7.setBackground(Color.decode("#1c1b1b"));
//        jLabel7.setForeground(Color.WHITE);
//        jLabel7.setOpaque(false);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
                // TODO add your handling code here:
//                jLabel4.setOpaque(true);
//        jLabel4.setForeground(Color.BLACK);
//        jLabel4.setBackground(Color.WHITE);
        
        jLabel10.setBackground(Color.decode("#1c1b1b"));
        jLabel10.setForeground(Color.WHITE);
        jLabel10.setOpaque(false);
        
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
            statement = conn.createStatement();
             

            
           
        Calendar aDate = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
   
            
            
            String name = theName.getText();
            String address = theAddress.getText();
            String phone = (thePhoneNumber.getText());
            int rent = (int)rentDuration.getValue();
            String vehicle = theVehicle.getSelectedItem().toString();
            String id = theID.getText();
            int selectedRow = 0;
            
            
            int price = 0;
            String dateChecker = null;
            String vehicleChecker =null;   
            int dayChecker = 0;
//        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RentingSystemDB", "username", "password");
       String date = dateChooserCombo1.getText();
        
                                      c.setTime(new Date());
        c.add(Calendar.DATE, dayChecker);
        String output = dateFormat.format(c.getTime());
       
            java.sql.Statement gettheDates = conn.createStatement();
            String valid = "Select * from USERNAME.DB WHERE DATE BETWEEN '" + date +"' AND '"+output+"' AND VEHICLE = '"+vehicle+"' AND STATUS IN ('NOT RETURNED', 'SCHEDULED', 'ON USE', 'ONHOLD')";
            gettheDates.executeQuery(valid);
            ResultSet dateValid = gettheDates.getResultSet();
            while(dateValid.next()){
            dateChecker = dateValid.getString("DATE");
            vehicleChecker = dateValid.getString("VEHICLE");
            dayChecker = dateValid.getInt("RENT");
            }
       
 
            
//            JOptionPane.showMessageDialog(null, dateChecker + vehicleChecker + dayChecker);
            
            

            



        
            java.sql.Statement getPrice = conn.createStatement();
       
            String sql = "Select PRICE FROM USERNAME.VEHICLES where VEHICLE_NAME = '"+ vehicle +"'";
            getPrice.executeQuery(sql);
            ResultSet pr = getPrice.getResultSet();
            while(pr.next()){
                price = Integer.valueOf(pr.getString("PRICE"));
            }
            
            
            
            bill = rent * price;
            
            

            if(date.equals(dateChecker) && vehicle.equals(vehicleChecker) || date.equals(dayChecker) ){
                
            showMessage("Another Client Has Already Scheduled The Vehicle.\n Please Change the Vehicle","Overlapping Detected","E");
            receipt.setText("");
            }
            
            
            else if(theName.getText().equals("") || theAddress.getText().equals("") || thePhoneNumber.getText().equals("")){
    
    showMessage("Please fill all necessary informations", "Error","E");
    
}



else {
    
    jButton1.setVisible(true);
    receipt.setText("ID Number : \t" + String.valueOf(id) + "\n" + "Name: \t" + name + "\nPhone Number: \t " + String.valueOf(phone) + "\n"
            + "Rent Duration: \t " +String.valueOf(rent) + " day / s" + "\n" + "Vehicle : \t" + theVehicle.getSelectedItem()
            + "\nPick Up Date: \t " + date+ "\nReturn Date: \t"+ output +"\nTotal Bill: \t P " + bill);
}
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
         theName.setText("");
        theAddress.setText("");
        thePhoneNumber.setText("");
        rentDuration.setValue(1);
         theVehicle.setSelectedIndex(0);
        receipt.setText("");
        theVehicle.setEnabled(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
                HomePage h = new HomePage();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new main().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager IT301_System_PUEntityManager;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea receipt;
    private javax.swing.JSpinner rentDuration;
    private javax.swing.JTextField theAddress;
    private javax.swing.JTextField theID;
    private javax.swing.JTextField theName;
    private javax.swing.JTextField thePhoneNumber;
    private javax.swing.JComboBox<String> theVehicle;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
