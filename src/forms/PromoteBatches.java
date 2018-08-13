package forms;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class PromoteBatches extends javax.swing.JFrame {
    private String formType, userType;
    private String sid;
    private int semester, year;
    
    private boolean batchComboBoxReady=false;
    private boolean courseBoxReady = false;
    
    private classes.Postgraduate p = new classes.Postgraduate();
    private classes.Undergraduate u = new classes.Undergraduate();
    private classes.Enrolment e = new classes.Enrolment();
    
    public PromoteBatches(String form, String user) {
        initComponents();
        formType=form;
        userType=user;
        this.setLocationRelativeTo(null); //to get it to the center of the screen
        
        try{
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
            }
            
            ResultSet rs = p.getDistinctBatchesFromFac(formType);
            while(rs.next())
                cmb_batch1.addItem(rs.getString("BATCH"));
            
            rs = u.getDistinctBatchesFromFac(formType);
            while(rs.next())
                cmb_batch.addItem(rs.getString("BATCH"));
            
            cmb_batch1.setSelectedIndex(-1);
            cmb_batch.setSelectedIndex(-1);
            batchComboBoxReady=true;
            
            cmb_course1.setSelectedIndex(-1);
            cmb_course.setSelectedIndex(-1);
            courseBoxReady=true;
        }
        catch(Exception e){}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cmb_batch1 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        cmb_course1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_promote1 = new javax.swing.JButton();
        btn_demote1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        btn_promote = new javax.swing.JButton();
        cmb_batch = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cmb_course = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btn_demote = new javax.swing.JButton();

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
        jLabel6.setText("Promote Batches");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 10, 580, 80);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(234, 255, 255));
        jPanel8.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Batch :");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(20, 20, 60, 30);

        cmb_batch1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_batch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_batch1ActionPerformed(evt);
            }
        });
        jPanel8.add(cmb_batch1);
        cmb_batch1.setBounds(100, 20, 120, 40);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Course :");
        jPanel8.add(jLabel20);
        jLabel20.setBounds(280, 20, 110, 30);

        cmb_course1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_course1ActionPerformed(evt);
            }
        });
        jPanel8.add(cmb_course1);
        cmb_course1.setBounds(370, 20, 120, 40);

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
        jTable1.setEnabled(false);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        jPanel8.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 1580, 630);

        btn_promote1.setBackground(new java.awt.Color(255, 255, 255));
        btn_promote1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_promote1.setForeground(new java.awt.Color(0, 0, 0));
        btn_promote1.setText("PROMOTE");
        btn_promote1.setToolTipText("");
        btn_promote1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_promote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_promote1ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_promote1);
        btn_promote1.setBounds(880, 15, 340, 50);

        btn_demote1.setBackground(new java.awt.Color(255, 255, 255));
        btn_demote1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_demote1.setForeground(new java.awt.Color(0, 0, 0));
        btn_demote1.setText("DEMOTE");
        btn_demote1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_demote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_demote1ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_demote1);
        btn_demote1.setBounds(1260, 15, 340, 50);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(20, 13, 1620, 730);

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

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(234, 255, 255));
        jPanel15.setLayout(null);

        btn_promote.setBackground(new java.awt.Color(255, 255, 255));
        btn_promote.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_promote.setForeground(new java.awt.Color(0, 0, 0));
        btn_promote.setText("PROMOTE");
        btn_promote.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_promote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_promoteActionPerformed(evt);
            }
        });
        jPanel15.add(btn_promote);
        btn_promote.setBounds(880, 15, 340, 50);

        cmb_batch.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch.setForeground(new java.awt.Color(0, 0, 0));
        cmb_batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_batchActionPerformed(evt);
            }
        });
        jPanel15.add(cmb_batch);
        cmb_batch.setBounds(100, 20, 120, 40);

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Batch :");
        jPanel15.add(jLabel25);
        jLabel25.setBounds(20, 20, 60, 30);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Course :");
        jPanel15.add(jLabel26);
        jLabel26.setBounds(280, 20, 110, 30);

        cmb_course.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_courseActionPerformed(evt);
            }
        });
        jPanel15.add(cmb_course);
        cmb_course.setBounds(370, 20, 120, 40);

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
        jScrollPane2.setViewportView(jTable);

        jPanel15.add(jScrollPane2);
        jScrollPane2.setBounds(20, 80, 1580, 630);

        btn_demote.setBackground(new java.awt.Color(255, 255, 255));
        btn_demote.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_demote.setForeground(new java.awt.Color(0, 0, 0));
        btn_demote.setText("DEMOTE");
        btn_demote.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_demote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_demoteActionPerformed(evt);
            }
        });
        jPanel15.add(btn_demote);
        btn_demote.setBounds(1260, 15, 340, 50);

        jPanel10.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 1620, 730));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void btn_promoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_promoteActionPerformed
        try{
            if(cmb_batch.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a batch", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_course.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a course", "Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to promote this batch to the next year?", "QUESTION", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    year=Integer.parseInt(jTable.getValueAt(0, 4).toString());
                    if(year==4)
                        year=0;
                    else
                        year++;
                    if(u.changeYear(cmb_batch.getSelectedItem().toString(), cmb_course.getSelectedItem().toString(), year)==1){
                        JOptionPane.showMessageDialog(null, "Stdents promoted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                        cmb_courseActionPerformed(evt);
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Please select a batch and a course with students", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_promoteActionPerformed

    private void btn_promote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_promote1ActionPerformed
        try{
            if(cmb_batch1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a batch", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_course1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a course", "Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to promote this batch to the next year?", "QUESTION", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    year=Integer.parseInt(jTable1.getValueAt(0, 4).toString());
                    if(year==4)
                        year=0;
                    else
                        year++;
                    if(p.changeYear(cmb_batch1.getSelectedItem().toString(), cmb_course1.getSelectedItem().toString(), year)==1){
                        JOptionPane.showMessageDialog(null, "Stdents promoted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                        cmb_course1ActionPerformed(evt);
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Please select a batch and a course with students", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_promote1ActionPerformed

    private void cmb_course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_course1ActionPerformed
        try{
            if(courseBoxReady && cmb_batch1.getSelectedIndex()==-1){
                JOptionPane.showMessageDialog(null, "Please select a batch.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if(courseBoxReady && cmb_course1.getSelectedIndex()!=-1){
                jTable1.setModel(u.viewStudents(cmb_batch1.getSelectedItem().toString(), cmb_course1.getSelectedItem().toString()));
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmb_course1ActionPerformed

    private void cmb_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_courseActionPerformed
        try{
            if(courseBoxReady && cmb_batch.getSelectedIndex()==-1){
                JOptionPane.showMessageDialog(null, "Please select a batch.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if(courseBoxReady && cmb_course.getSelectedIndex()!=-1){
                jTable.setModel(u.viewStudents(cmb_batch.getSelectedItem().toString(), cmb_course.getSelectedItem().toString()));
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmb_courseActionPerformed

    private void cmb_batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_batchActionPerformed
        if(batchComboBoxReady)
            cmb_course.setSelectedIndex(-1);
    }//GEN-LAST:event_cmb_batchActionPerformed

    private void cmb_batch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_batch1ActionPerformed
        if(batchComboBoxReady)
            cmb_course1.setSelectedIndex(-1);
    }//GEN-LAST:event_cmb_batch1ActionPerformed

    private void btn_demote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_demote1ActionPerformed
        try{
            if(cmb_batch1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a batch", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_course1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a course", "Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to demote this batch to the previous year?", "QUESTION", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    year=Integer.parseInt(jTable1.getValueAt(0, 4).toString());
                    if(year!=0)
                        year--;
                    else
                        year=4;
                    if(p.changeYear(cmb_batch1.getSelectedItem().toString(), cmb_course1.getSelectedItem().toString(), year)==1){
                        JOptionPane.showMessageDialog(null, "Stdents demoted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                        cmb_course1ActionPerformed(evt);
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Please select a batch and a course with students", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_demote1ActionPerformed

    private void btn_demoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_demoteActionPerformed
        try{
            if(cmb_batch.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a batch", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_course.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a course", "Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to demote this batch to the previous year?", "QUESTION", dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    year=Integer.parseInt(jTable.getValueAt(0, 4).toString());
                    if(year!=0)
                        year--;
                    else
                        year=4;
                    if(u.changeYear(cmb_batch.getSelectedItem().toString(), cmb_course.getSelectedItem().toString(), year)==1){
                        JOptionPane.showMessageDialog(null, "Stdents demoted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                        cmb_courseActionPerformed(evt);
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Please select a batch and a course with students", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_demoteActionPerformed
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromoteBatches("ABC", "ABC").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_demote;
    private javax.swing.JButton btn_demote1;
    private javax.swing.JButton btn_promote;
    private javax.swing.JButton btn_promote1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmb_batch;
    private javax.swing.JComboBox cmb_batch1;
    private javax.swing.JComboBox cmb_course;
    private javax.swing.JComboBox cmb_course1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
