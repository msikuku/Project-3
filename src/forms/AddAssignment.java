package forms;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class AddAssignment extends javax.swing.JFrame {
    public String formType, userType;
    private classes.Postgraduate p = new classes.Postgraduate();
    private classes.Undergraduate u = new classes.Undergraduate();
    private classes.Subject sub = new classes.Subject();
    private classes.Assignment a = new classes.Assignment();
    
    private boolean courseBoxReady = false;
    private boolean subjectBoxReady = false;
    
    public AddAssignment(String form, String user) {
        initComponents();
        formType=form;
        userType = user;
        this.setLocationRelativeTo(null); //to get it to the center of the screen
        
        try{
            cmb_assNo.setVisible(false);
            cmb_assNo1.setVisible(false);
            lbl_assNo1.setVisible(false);
            lbl_assno.setVisible(false);
            
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
            
            cmb_batch.setSelectedIndex(-1);
            cmb_batch1.setSelectedIndex(-1);
            cmb_course.setSelectedIndex(-1);
            cmb_course1.setSelectedIndex(-1);
            courseBoxReady =true;
        }
        catch(Exception e){}
    }
    
    private void clear(){
        courseBoxReady = false;
        
        txt_mark.setText("");
        cmb_type.setSelectedIndex(-1);
        cmb_sub.setSelectedIndex(-1);
        cmb_course.setSelectedIndex(-1);
        cmb_batch.setSelectedIndex(-1);
        cmb_assNo.setSelectedIndex(-1);
        
        courseBoxReady =true;
    }
    
    private void clear1(){
        courseBoxReady = false;
        
        txt_mark1.setText("");
        cmb_type1.setSelectedIndex(-1);
        cmb_sub1.setSelectedIndex(-1);
        cmb_course1.setSelectedIndex(-1);
        cmb_batch1.setSelectedIndex(-1);
        cmb_assNo1.setSelectedIndex(-1);
        
        courseBoxReady =true;
    }
    
    private boolean validation(){
        boolean correct = true;
        if(cmb_batch.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select a batch.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_course.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select a course.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_sub.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select a subject.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_type.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select a type", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(txt_mark.getText().isEmpty() || !txt_mark.getText().matches("[0-9]+")){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please enter a valid mark.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        return correct;
    }
    
    private boolean validation1(){
        boolean correct = true;
        if(cmb_batch1.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select a batch.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_course1.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select a course.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_sub1.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select a subject.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_type1.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select a type", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(txt_mark1.getText().isEmpty() || !txt_mark1.getText().matches("[0-9]+")){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please enter a valid mark.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        return correct;
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
        btn_add1 = new javax.swing.JButton();
        lbl_sub1 = new javax.swing.JLabel();
        cmb_sub1 = new javax.swing.JComboBox();
        cmb_batch1 = new javax.swing.JComboBox();
        cmb_type1 = new javax.swing.JComboBox();
        lbl_type1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_mark1 = new javax.swing.JTextField();
        lbl_marks1 = new javax.swing.JLabel();
        cmb_course1 = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        btn_delete1 = new javax.swing.JButton();
        lbl_assNo1 = new javax.swing.JLabel();
        cmb_assNo1 = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lbl_sub = new javax.swing.JLabel();
        cmb_sub = new javax.swing.JComboBox();
        cmb_type = new javax.swing.JComboBox();
        btn_add = new javax.swing.JButton();
        lbl_type = new javax.swing.JLabel();
        txt_mark = new javax.swing.JTextField();
        lbl_marks = new javax.swing.JLabel();
        cmb_batch = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        cmb_course = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        cmb_assNo = new javax.swing.JComboBox();
        lbl_assno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(800, 724));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(234, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 724));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 724));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 724));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn_back.setText("jLabel1");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 60, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Assignment");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 580, 80));

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(234, 255, 255));
        jPanel8.setLayout(null);

        btn_add1.setBackground(new java.awt.Color(255, 255, 255));
        btn_add1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_add1.setForeground(new java.awt.Color(0, 0, 0));
        btn_add1.setText("ADD");
        btn_add1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_add1);
        btn_add1.setBounds(410, 370, 110, 50);

        lbl_sub1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_sub1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_sub1.setText("Subject :");
        jPanel8.add(lbl_sub1);
        lbl_sub1.setBounds(420, 140, 110, 30);

        cmb_sub1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub1ActionPerformed(evt);
            }
        });
        jPanel8.add(cmb_sub1);
        cmb_sub1.setBounds(550, 140, 230, 40);

        cmb_batch1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(cmb_batch1);
        cmb_batch1.setBounds(110, 40, 230, 40);

        cmb_type1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_type1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_type1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lab assignment", "Practical demo", "Project", "Report", "In-class", "Take home" }));
        cmb_type1.setSelectedIndex(-1);
        jPanel8.add(cmb_type1);
        cmb_type1.setBounds(110, 240, 230, 40);

        lbl_type1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_type1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_type1.setText("Type :");
        jPanel8.add(lbl_type1);
        lbl_type1.setBounds(30, 240, 100, 30);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Batch :");
        jPanel8.add(jLabel26);
        jLabel26.setBounds(30, 40, 60, 30);
        jPanel8.add(txt_mark1);
        txt_mark1.setBounds(550, 240, 230, 40);

        lbl_marks1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_marks1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_marks1.setText("Marks allocated : ");
        jPanel8.add(lbl_marks1);
        lbl_marks1.setBounds(420, 240, 140, 30);

        cmb_course1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_course1ActionPerformed(evt);
            }
        });
        jPanel8.add(cmb_course1);
        cmb_course1.setBounds(110, 140, 230, 40);

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Course :");
        jPanel8.add(jLabel32);
        jLabel32.setBounds(30, 140, 60, 30);

        btn_delete1.setBackground(new java.awt.Color(255, 255, 255));
        btn_delete1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_delete1.setForeground(new java.awt.Color(0, 0, 0));
        btn_delete1.setText("DELETE");
        btn_delete1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete1ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_delete1);
        btn_delete1.setBounds(280, 370, 110, 50);

        lbl_assNo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_assNo1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_assNo1.setText("Assignment No :");
        jPanel8.add(lbl_assNo1);
        lbl_assNo1.setBounds(420, 140, 120, 30);

        cmb_assNo1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_assNo1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(cmb_assNo1);
        cmb_assNo1.setBounds(550, 140, 230, 40);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(20, 20, 800, 450);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("     Postgraduate Students     ", jPanel2);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(234, 255, 255));
        jPanel11.setLayout(null);

        lbl_sub.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_sub.setForeground(new java.awt.Color(0, 0, 0));
        lbl_sub.setText("Subject :");
        jPanel11.add(lbl_sub);
        lbl_sub.setBounds(420, 140, 110, 30);

        cmb_sub.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_subActionPerformed(evt);
            }
        });
        jPanel11.add(cmb_sub);
        cmb_sub.setBounds(550, 140, 230, 40);

        cmb_type.setBackground(new java.awt.Color(255, 255, 255));
        cmb_type.setForeground(new java.awt.Color(0, 0, 0));
        cmb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lab assignment", "Practical demo", "Project", "Report", "In-class", "Take home" }));
        cmb_type.setSelectedIndex(-1);
        jPanel11.add(cmb_type);
        cmb_type.setBounds(110, 240, 230, 40);

        btn_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_add.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(0, 0, 0));
        btn_add.setText("ADD");
        btn_add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel11.add(btn_add);
        btn_add.setBounds(410, 370, 110, 50);

        lbl_type.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_type.setForeground(new java.awt.Color(0, 0, 0));
        lbl_type.setText("Type :");
        jPanel11.add(lbl_type);
        lbl_type.setBounds(30, 240, 100, 30);
        jPanel11.add(txt_mark);
        txt_mark.setBounds(550, 240, 230, 40);

        lbl_marks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_marks.setForeground(new java.awt.Color(0, 0, 0));
        lbl_marks.setText("Marks allocated : ");
        jPanel11.add(lbl_marks);
        lbl_marks.setBounds(420, 240, 140, 30);

        cmb_batch.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(cmb_batch);
        cmb_batch.setBounds(110, 40, 230, 40);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Batch :");
        jPanel11.add(jLabel27);
        jLabel27.setBounds(30, 40, 60, 30);

        cmb_course.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_courseActionPerformed(evt);
            }
        });
        jPanel11.add(cmb_course);
        cmb_course.setBounds(110, 140, 230, 40);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Course :");
        jPanel11.add(jLabel33);
        jLabel33.setBounds(30, 140, 60, 30);

        btn_delete.setBackground(new java.awt.Color(255, 255, 255));
        btn_delete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(0, 0, 0));
        btn_delete.setText("DELETE");
        btn_delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel11.add(btn_delete);
        btn_delete.setBounds(280, 370, 110, 50);

        cmb_assNo.setBackground(new java.awt.Color(255, 255, 255));
        cmb_assNo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(cmb_assNo);
        cmb_assNo.setBounds(550, 140, 230, 40);

        lbl_assno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_assno.setForeground(new java.awt.Color(0, 0, 0));
        lbl_assno.setText("Assignment No :");
        jPanel11.add(lbl_assno);
        lbl_assno.setBounds(420, 140, 120, 30);

        jPanel7.add(jPanel11);
        jPanel11.setBounds(20, 20, 800, 450);

        jPanel9.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 500));

        jTabbedPane1.addTab("     Undergraduate Students     ", jPanel9);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 840, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 724));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.hide();
        new SubMenu(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        try{
            if(validation1()){
                a.createAssignment(cmb_batch1.getSelectedItem().toString(), cmb_course1.getSelectedItem().toString(), cmb_sub1.getSelectedItem().toString(), cmb_type1.getSelectedItem().toString(), Integer.parseInt(txt_mark1.getText()));
                if(a.addAssignment()==1){
                    JOptionPane.showMessageDialog(null, "Assignment added successfully.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    clear1();
                }
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
         try{
            if(validation()){
                a.createAssignment(cmb_batch.getSelectedItem().toString(), cmb_course.getSelectedItem().toString(), cmb_sub.getSelectedItem().toString(), cmb_type.getSelectedItem().toString(), Integer.parseInt(txt_mark.getText()));
                if(a.addAssignment()==1){
                    JOptionPane.showMessageDialog(null, "Assignment added successfully.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void cmb_course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_course1ActionPerformed
        try{
            if(courseBoxReady && cmb_course1.getSelectedIndex()!=-1){
                subjectBoxReady = false;
                cmb_sub1.removeAllItems();
                ResultSet rs = sub.getSubIDsByCourse(cmb_course1.getSelectedItem().toString());
                while(rs.next())
                    cmb_sub1.addItem(rs.getString("SUBID"));
                cmb_sub1.setSelectedIndex(-1);
                subjectBoxReady = true;
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmb_course1ActionPerformed

    private void cmb_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_courseActionPerformed
        try{
            if(courseBoxReady && cmb_course.getSelectedIndex()!=-1){
                subjectBoxReady = false;
                cmb_sub.removeAllItems();
                ResultSet rs = sub.getSubIDsByCourse(cmb_course.getSelectedItem().toString());
                while(rs.next())
                    cmb_sub.addItem(rs.getString("SUBID"));
                cmb_sub.setSelectedIndex(-1);
                subjectBoxReady = true;
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmb_courseActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        try{
            txt_mark1.setVisible(false);
            cmb_type1.setVisible(false);
            lbl_marks1.setVisible(false);
            lbl_type1.setVisible(false);
            btn_add1.setEnabled(false);
            
            cmb_assNo1.setVisible(true);
            lbl_assNo1.setVisible(true);
            
            lbl_sub1.setLocation(420, 40);
            cmb_sub1.setLocation(550, 40);
            
            if(cmb_batch1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a batch.", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_course1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a course.", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_assNo1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select an assignment.", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_sub1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a subject.", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
            else{
                if(a.deleteAssignment(cmb_assNo1.getSelectedItem().toString())==1){
                    JOptionPane.showMessageDialog(null, "Assignment deleted successfully.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    clear1();
                    
                    txt_mark1.setVisible(true);
                    cmb_type1.setVisible(true);
                    lbl_marks1.setVisible(true);
                    lbl_type1.setVisible(true);
                    btn_add1.setEnabled(true);
                    
                    cmb_assNo1.setVisible(false);
                    lbl_assNo1.setVisible(false);
                    subjectBoxReady=false;
                }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try{
            txt_mark.setVisible(false);
            cmb_type.setVisible(false);
            lbl_marks.setVisible(false);
            lbl_type.setVisible(false);
            btn_add.setEnabled(false);
            
            cmb_assNo.setVisible(true);
            lbl_assno.setVisible(true);
            
            lbl_sub.setLocation(420, 40);
            cmb_sub.setLocation(550, 40);
            
            if(cmb_batch.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a batch.", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_course.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a course.", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_assNo.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select an assignment.", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_sub.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a subject.", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
            else{
                if(a.deleteAssignment(cmb_assNo.getSelectedItem().toString())==1){
                    JOptionPane.showMessageDialog(null, "Assignment deleted successfully.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    
                    txt_mark.setVisible(true);
                    cmb_type.setVisible(true);
                    lbl_marks.setVisible(true);
                    lbl_type.setVisible(true);
                    btn_add.setEnabled(true);
                    
                    cmb_assNo.setVisible(false);
                    lbl_assno.setVisible(false);
                    
                    subjectBoxReady=false;
                }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void cmb_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub1ActionPerformed
        try{
            if(cmb_batch1.getSelectedIndex()==-1 && subjectBoxReady)
                 JOptionPane.showMessageDialog(null, "Please select a batch.", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
            else if (subjectBoxReady){
                cmb_assNo1.removeAllItems();
                ResultSet rs = a.getAssignmentIDs(cmb_batch1.getSelectedItem().toString(), cmb_sub1.getSelectedItem().toString());
                while(rs.next())
                    cmb_assNo1.addItem(rs.getString("ASSID"));
                cmb_assNo1.setSelectedIndex(-1);
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmb_sub1ActionPerformed

    private void cmb_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_subActionPerformed
        try{
            if(cmb_batch.getSelectedIndex()==-1 && subjectBoxReady)
                 JOptionPane.showMessageDialog(null, "Please select a batch.", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
            else if (subjectBoxReady){
                cmb_assNo.removeAllItems();
                ResultSet rs = a.getAssignmentIDs(cmb_batch.getSelectedItem().toString(), cmb_sub.getSelectedItem().toString());
                while(rs.next())
                    cmb_assNo.addItem(rs.getString("ASSID"));
                cmb_assNo.setSelectedIndex(-1);
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmb_subActionPerformed
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAssignment("ABC", "ABC").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add1;
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_delete1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmb_assNo;
    private javax.swing.JComboBox cmb_assNo1;
    private javax.swing.JComboBox cmb_batch;
    private javax.swing.JComboBox cmb_batch1;
    private javax.swing.JComboBox cmb_course;
    private javax.swing.JComboBox cmb_course1;
    private javax.swing.JComboBox cmb_sub;
    private javax.swing.JComboBox cmb_sub1;
    private javax.swing.JComboBox cmb_type;
    private javax.swing.JComboBox cmb_type1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_assNo1;
    private javax.swing.JLabel lbl_assno;
    private javax.swing.JLabel lbl_marks;
    private javax.swing.JLabel lbl_marks1;
    private javax.swing.JLabel lbl_sub;
    private javax.swing.JLabel lbl_sub1;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JLabel lbl_type1;
    private javax.swing.JTextField txt_mark;
    private javax.swing.JTextField txt_mark1;
    // End of variables declaration//GEN-END:variables
}
