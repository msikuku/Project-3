package forms;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ViewResults extends javax.swing.JFrame {
    private String formType, userType;
    
    private boolean batchComboBoxReady = false;
    private boolean subComboBoxReady = false;
    private boolean courseBoxReady = false;
    
    private classes.Performance p = new classes.Performance();
    private classes.Postgraduate pg = new classes.Postgraduate();
    private classes.Undergraduate ug = new classes.Undergraduate();
    private classes.Subject sub = new classes.Subject();
    
    public ViewResults(String form, String user) {
        initComponents();
        formType=form;
        userType=user;
        this.setLocationRelativeTo(null); //to get it to the center of the screen
        
        if(formType=="SOC"){
            cmb_course1.addItem("PDCN");
            cmb_course1.addItem("MSCCS");
            cmb_course1.addItem("MSCSE");
            
            cmb_course.addItem("CS");
            cmb_course.addItem("SE");
            cmb_course.addItem("IS");
        }
        
        else if(formType=="SOB"){
            cmb_course1.addItem("PGDBM");
            cmb_course1.addItem("PDBM");
            cmb_course1.addItem("MBA");

            cmb_course.addItem("BA");
            cmb_course.addItem("BM");
        }

        else if(formType=="SOE"){
            cmb_course1.addItem("BE");
            cmb_course1.addItem("BAI");
            cmb_course1.addItem("CHE");

            cmb_course.addItem("MSCE");
            cmb_course.addItem("MUD");
            
            btn_4thYear.setVisible(false);
        }
        
        cmb_course.setSelectedIndex(-1);
        cmb_course1.setSelectedIndex(-1);
        courseBoxReady =true;
        
        ResultSet rs = pg.getDistinctBatchesFromFac(formType);
        try {
            while(rs.next())
                cmb_batch1.addItem(rs.getString("BATCH"));
            
            rs = ug.getDistinctBatchesFromFac(formType);
            while(rs.next())
                cmb_batch.addItem(rs.getString("BATCH"));
            
            cmb_batch.setSelectedIndex(-1);
            cmb_batch1.setSelectedIndex(-1);
            batchComboBoxReady = true;
            
        } catch (SQLException ex) {
            Logger.getLogger(AddResults.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_save1 = new javax.swing.JPanel();
        cmb_sub1 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cmb_batch1 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        cmb_course1 = new javax.swing.JComboBox();
        btn_pass1 = new javax.swing.JButton();
        btn_fail1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btn_save2 = new javax.swing.JPanel();
        btn_pass = new javax.swing.JButton();
        btn_fail = new javax.swing.JButton();
        btn_4thYear = new javax.swing.JButton();
        cmb_batch = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cmb_course = new javax.swing.JComboBox();
        cmb_sub = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(1500, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(234, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(null);

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn_back.setText("jLabel1");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(30, 20, 60, 60);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("View Results");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 10, 580, 80);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(null);

        btn_save1.setBackground(new java.awt.Color(234, 255, 255));
        btn_save1.setLayout(null);

        cmb_sub1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub1ActionPerformed(evt);
            }
        });
        btn_save1.add(cmb_sub1);
        cmb_sub1.setBounds(130, 200, 230, 40);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Subject :");
        btn_save1.add(jLabel17);
        jLabel17.setBounds(40, 200, 110, 30);

        cmb_batch1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch1.setForeground(new java.awt.Color(0, 0, 0));
        btn_save1.add(cmb_batch1);
        cmb_batch1.setBounds(130, 30, 230, 40);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Course :");
        btn_save1.add(jLabel26);
        jLabel26.setBounds(40, 115, 60, 30);

        cmb_course1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_course1ActionPerformed(evt);
            }
        });
        btn_save1.add(cmb_course1);
        cmb_course1.setBounds(130, 115, 230, 40);

        btn_pass1.setBackground(new java.awt.Color(255, 255, 255));
        btn_pass1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_pass1.setForeground(new java.awt.Color(0, 0, 0));
        btn_pass1.setText("Pass Students");
        btn_pass1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pass1ActionPerformed(evt);
            }
        });
        btn_save1.add(btn_pass1);
        btn_pass1.setBounds(40, 320, 320, 50);

        btn_fail1.setBackground(new java.awt.Color(255, 255, 255));
        btn_fail1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_fail1.setForeground(new java.awt.Color(0, 0, 0));
        btn_fail1.setText("Fail Students");
        btn_fail1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_fail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fail1ActionPerformed(evt);
            }
        });
        btn_save1.add(btn_fail1);
        btn_fail1.setBounds(40, 455, 320, 50);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Batch :");
        btn_save1.add(jLabel28);
        jLabel28.setBounds(40, 30, 60, 30);

        jPanel6.add(btn_save1);
        btn_save1.setBounds(25, 13, 410, 720);

        jPanel11.setBackground(new java.awt.Color(234, 255, 255));
        jPanel11.setLayout(null);

        jTable1.setBackground(new java.awt.Color(213, 213, 255));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
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
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        jPanel11.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1180, 720);

        jPanel6.add(jPanel11);
        jPanel11.setBounds(460, 13, 1180, 720);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1658, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("     Postgraduate Students     ", jPanel2);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(null);

        btn_save2.setBackground(new java.awt.Color(234, 255, 255));
        btn_save2.setLayout(null);

        btn_pass.setBackground(new java.awt.Color(255, 255, 255));
        btn_pass.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_pass.setForeground(new java.awt.Color(0, 0, 0));
        btn_pass.setText("Pass Students");
        btn_pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_passActionPerformed(evt);
            }
        });
        btn_save2.add(btn_pass);
        btn_pass.setBounds(40, 320, 320, 50);

        btn_fail.setBackground(new java.awt.Color(255, 255, 255));
        btn_fail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_fail.setForeground(new java.awt.Color(0, 0, 0));
        btn_fail.setText("Fail Students");
        btn_fail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_fail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_failActionPerformed(evt);
            }
        });
        btn_save2.add(btn_fail);
        btn_fail.setBounds(40, 455, 320, 50);

        btn_4thYear.setBackground(new java.awt.Color(255, 255, 255));
        btn_4thYear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_4thYear.setForeground(new java.awt.Color(0, 0, 0));
        btn_4thYear.setText("4th Year Selected Students");
        btn_4thYear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_4thYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4thYearActionPerformed(evt);
            }
        });
        btn_save2.add(btn_4thYear);
        btn_4thYear.setBounds(40, 590, 320, 50);

        cmb_batch.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch.setForeground(new java.awt.Color(0, 0, 0));
        btn_save2.add(cmb_batch);
        cmb_batch.setBounds(130, 30, 230, 40);

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Batch :");
        btn_save2.add(jLabel29);
        jLabel29.setBounds(40, 30, 60, 30);

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Course :");
        btn_save2.add(jLabel30);
        jLabel30.setBounds(40, 115, 60, 30);

        cmb_course.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_courseActionPerformed(evt);
            }
        });
        btn_save2.add(cmb_course);
        cmb_course.setBounds(130, 115, 230, 40);

        cmb_sub.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_subActionPerformed(evt);
            }
        });
        btn_save2.add(cmb_sub);
        cmb_sub.setBounds(130, 200, 230, 40);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Subject :");
        btn_save2.add(jLabel18);
        jLabel18.setBounds(40, 200, 110, 30);

        jPanel7.add(btn_save2);
        btn_save2.setBounds(25, 13, 410, 720);

        jPanel14.setBackground(new java.awt.Color(234, 255, 255));
        jPanel14.setLayout(null);

        jTable.setBackground(new java.awt.Color(213, 213, 255));
        jTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(51, 51, 51));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable.setRowHeight(30);
        jScrollPane3.setViewportView(jTable);

        jPanel14.add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 1180, 720);

        jPanel7.add(jPanel14);
        jPanel14.setBounds(460, 13, 1180, 720);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1658, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("     Undergraduate Students     ", jPanel9);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 100, 1660, 790);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.hide();
        new SubMenu(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pass1ActionPerformed
        if(cmb_batch1.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this, "Please select a batch", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        else if(cmb_course1.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this, "Please select a course", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        else if(cmb_sub1.getSelectedIndex()==-1)
            jTable1.setModel(pg.viewPassStudents(cmb_batch1.getSelectedItem().toString(), cmb_course1.getSelectedItem().toString()));
        else
            jTable1.setModel(p.viewPassStudentsBySubject(cmb_batch1.getSelectedItem().toString(), cmb_sub1.getSelectedItem().toString()));
    }//GEN-LAST:event_btn_pass1ActionPerformed

    private void btn_fail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fail1ActionPerformed
        if(cmb_batch1.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this, "Please select a batch", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        else if(cmb_course1.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this, "Please select a course", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        else if(cmb_sub1.getSelectedIndex()==-1)
            jTable1.setModel(pg.viewFailStudents(cmb_batch1.getSelectedItem().toString(), cmb_course1.getSelectedItem().toString()));
        else
            jTable1.setModel(p.viewFailStudentsBySubject(cmb_batch1.getSelectedItem().toString(), cmb_sub1.getSelectedItem().toString()));
    }//GEN-LAST:event_btn_fail1ActionPerformed

    private void btn_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_passActionPerformed
        if(cmb_batch.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this, "Please select a batch", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        else if(cmb_course.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this, "Please select a course", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        else if(cmb_sub.getSelectedIndex()==-1)
            jTable.setModel(ug.viewPassStudents(cmb_batch.getSelectedItem().toString(), cmb_course.getSelectedItem().toString(), formType));
        else
            jTable.setModel(p.viewPassStudentsBySubject(cmb_batch.getSelectedItem().toString(), cmb_sub.getSelectedItem().toString()));
    }//GEN-LAST:event_btn_passActionPerformed

    private void btn_failActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_failActionPerformed
        if(cmb_batch.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this, "Please select a batch", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        else if(cmb_course.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this, "Please select a course", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        else if(cmb_sub.getSelectedIndex()==-1)
            jTable.setModel(ug.viewFailStudents(cmb_batch.getSelectedItem().toString(), cmb_course.getSelectedItem().toString(), formType));
        else
            jTable.setModel(p.viewFailStudentsBySubject(cmb_batch.getSelectedItem().toString(), cmb_sub.getSelectedItem().toString()));
    }//GEN-LAST:event_btn_failActionPerformed

    private void btn_4thYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4thYearActionPerformed
        if(cmb_batch.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this, "Please select a batch", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        else if(cmb_course.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(this, "Please select a course", "Input Error", JOptionPane.INFORMATION_MESSAGE);
        else
            jTable.setModel(p.viewTop40(cmb_batch.getSelectedItem().toString(), cmb_course.getSelectedItem().toString()));
    }//GEN-LAST:event_btn_4thYearActionPerformed

    private void cmb_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_courseActionPerformed
        try{
            if(courseBoxReady && cmb_course.getSelectedIndex()!=-1){
                subComboBoxReady = false;
                cmb_sub.removeAllItems();
                ResultSet rs = sub.getSubIDsByCourse(cmb_course.getSelectedItem().toString());
                while(rs.next())
                    cmb_sub.addItem(rs.getString("SUBID"));
                cmb_sub.setSelectedIndex(-1);
                subComboBoxReady = true;
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmb_courseActionPerformed

    private void cmb_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_subActionPerformed
        try{
            if(subComboBoxReady && cmb_sub.getSelectedIndex()!=-1){
                jTable.setModel(p.viewResults(cmb_batch.getSelectedItem().toString(), cmb_sub.getSelectedItem().toString()));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmb_subActionPerformed

    private void cmb_course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_course1ActionPerformed
        try{
            if(courseBoxReady && cmb_course1.getSelectedIndex()!=-1){
                subComboBoxReady = false;
                cmb_sub1.removeAllItems();
                ResultSet rs = sub.getSubIDsByCourse(cmb_course1.getSelectedItem().toString());
                while(rs.next())
                    cmb_sub1.addItem(rs.getString("SUBID"));
                cmb_sub1.setSelectedIndex(-1);
                subComboBoxReady = true;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmb_course1ActionPerformed

    private void cmb_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub1ActionPerformed
        try{
            if(subComboBoxReady && cmb_sub1.getSelectedIndex()!=-1){
                jTable1.setModel(p.viewResults(cmb_batch1.getSelectedItem().toString(), cmb_sub1.getSelectedItem().toString()));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmb_sub1ActionPerformed
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewResults("ABC", "ABC").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_4thYear;
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_fail;
    private javax.swing.JButton btn_fail1;
    private javax.swing.JButton btn_pass;
    private javax.swing.JButton btn_pass1;
    private javax.swing.JPanel btn_save1;
    private javax.swing.JPanel btn_save2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cmb_batch;
    private javax.swing.JComboBox cmb_batch1;
    private javax.swing.JComboBox cmb_course;
    private javax.swing.JComboBox cmb_course1;
    private javax.swing.JComboBox cmb_sub;
    private javax.swing.JComboBox cmb_sub1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
