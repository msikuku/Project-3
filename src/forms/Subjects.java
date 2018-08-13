package forms;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Subjects extends javax.swing.JFrame {
    private String formType, userType;
    private boolean comboBoxReady=false;
    
    public Subjects(String form, String user) {
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
        }
        
        lbl_subNo.setVisible(false);
        cmb_subNo.setVisible(false);
        
        lbl_subNo1.setVisible(false);
        cmb_subNo1.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btn_update1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cmb_subNo1 = new javax.swing.JComboBox();
        cmb_credits1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbl_subNo1 = new javax.swing.JLabel();
        txt_title1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btn_delete1 = new javax.swing.JButton();
        txt_value1 = new javax.swing.JTextField();
        cmb_year1 = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        cmb_course1 = new javax.swing.JComboBox();
        btn_save1 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        rbt_comp1 = new javax.swing.JRadioButton();
        rbt_opt1 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btn_update = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        cmb_subNo = new javax.swing.JComboBox();
        cmb_credits = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lbl_subNo = new javax.swing.JLabel();
        txt_title = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        txt_value = new javax.swing.JTextField();
        cmb_year = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        cmb_course = new javax.swing.JComboBox();
        btn_save = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        rbt_comp = new javax.swing.JRadioButton();
        rbt_opt = new javax.swing.JRadioButton();

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
        jLabel6.setText("Manage Subjects");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 580, 80));

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(234, 255, 255));
        jPanel11.setLayout(null);

        btn_update1.setBackground(new java.awt.Color(255, 255, 255));
        btn_update1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_update1.setForeground(new java.awt.Color(0, 0, 0));
        btn_update1.setText("UPDATE");
        btn_update1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update1ActionPerformed(evt);
            }
        });
        jPanel11.add(btn_update1);
        btn_update1.setBounds(345, 410, 110, 50);

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Title :");
        jPanel11.add(jLabel24);
        jLabel24.setBounds(440, 230, 110, 30);

        cmb_subNo1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_subNo1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_subNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_subNo1ActionPerformed(evt);
            }
        });
        jPanel11.add(cmb_subNo1);
        cmb_subNo1.setBounds(540, 140, 230, 40);

        cmb_credits1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_credits1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_credits1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cmb_credits1.setSelectedIndex(-1);
        jPanel11.add(cmb_credits1);
        cmb_credits1.setBounds(120, 320, 230, 40);

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Credits :");
        jPanel11.add(jLabel25);
        jLabel25.setBounds(30, 320, 100, 30);

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Year :");
        jPanel11.add(jLabel35);
        jLabel35.setBounds(30, 230, 60, 30);

        lbl_subNo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_subNo1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_subNo1.setText("Subject No :");
        jPanel11.add(lbl_subNo1);
        lbl_subNo1.setBounds(440, 140, 140, 30);
        jPanel11.add(txt_title1);
        txt_title1.setBounds(540, 230, 230, 40);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Value :");
        jPanel11.add(jLabel28);
        jLabel28.setBounds(440, 320, 140, 30);

        btn_delete1.setBackground(new java.awt.Color(255, 255, 255));
        btn_delete1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_delete1.setForeground(new java.awt.Color(0, 0, 0));
        btn_delete1.setText("DELETE");
        btn_delete1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_delete1.setEnabled(false);
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete1ActionPerformed(evt);
            }
        });
        jPanel11.add(btn_delete1);
        btn_delete1.setBounds(480, 410, 110, 50);
        jPanel11.add(txt_value1);
        txt_value1.setBounds(540, 320, 230, 40);

        cmb_year1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_year1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_year1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));
        cmb_year1.setSelectedIndex(-1);
        jPanel11.add(cmb_year1);
        cmb_year1.setBounds(120, 230, 230, 40);

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Course :");
        jPanel11.add(jLabel37);
        jLabel37.setBounds(30, 140, 140, 30);

        cmb_course1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_course1ActionPerformed(evt);
            }
        });
        jPanel11.add(cmb_course1);
        cmb_course1.setBounds(120, 140, 230, 40);

        btn_save1.setBackground(new java.awt.Color(255, 255, 255));
        btn_save1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_save1.setForeground(new java.awt.Color(0, 0, 0));
        btn_save1.setText("SAVE");
        btn_save1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save1ActionPerformed(evt);
            }
        });
        jPanel11.add(btn_save1);
        btn_save1.setBounds(210, 410, 110, 50);

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Optional :");
        jPanel11.add(jLabel36);
        jLabel36.setBounds(30, 50, 67, 19);

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Compulsory :");
        jPanel11.add(jLabel38);
        jLabel38.setBounds(210, 50, 91, 19);

        rbt_comp1.setBackground(new java.awt.Color(234, 255, 255));
        buttonGroup1.add(rbt_comp1);
        rbt_comp1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(rbt_comp1);
        rbt_comp1.setBounds(320, 45, 28, 28);

        rbt_opt1.setBackground(new java.awt.Color(234, 255, 255));
        buttonGroup1.add(rbt_opt1);
        rbt_opt1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(rbt_opt1);
        rbt_opt1.setBounds(120, 45, 28, 28);

        jPanel6.add(jPanel11);
        jPanel11.setBounds(20, 20, 800, 480);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("     Postgraduate Subjects     ", jPanel2);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(234, 255, 255));
        jPanel10.setLayout(null);

        btn_update.setBackground(new java.awt.Color(255, 255, 255));
        btn_update.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(0, 0, 0));
        btn_update.setText("UPDATE");
        btn_update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel10.add(btn_update);
        btn_update.setBounds(345, 410, 110, 50);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Title :");
        jPanel10.add(jLabel21);
        jLabel21.setBounds(440, 230, 110, 30);

        cmb_subNo.setBackground(new java.awt.Color(255, 255, 255));
        cmb_subNo.setForeground(new java.awt.Color(0, 0, 0));
        cmb_subNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_subNoActionPerformed(evt);
            }
        });
        jPanel10.add(cmb_subNo);
        cmb_subNo.setBounds(540, 140, 230, 40);

        cmb_credits.setBackground(new java.awt.Color(255, 255, 255));
        cmb_credits.setForeground(new java.awt.Color(0, 0, 0));
        cmb_credits.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cmb_credits.setSelectedIndex(-1);
        jPanel10.add(cmb_credits);
        cmb_credits.setBounds(120, 320, 230, 40);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Credits :");
        jPanel10.add(jLabel22);
        jLabel22.setBounds(30, 320, 100, 30);

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Year :");
        jPanel10.add(jLabel32);
        jLabel32.setBounds(30, 230, 60, 30);

        lbl_subNo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_subNo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_subNo.setText("Subject No :");
        jPanel10.add(lbl_subNo);
        lbl_subNo.setBounds(440, 140, 140, 30);
        jPanel10.add(txt_title);
        txt_title.setBounds(540, 230, 230, 40);

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Value :");
        jPanel10.add(jLabel23);
        jLabel23.setBounds(440, 320, 140, 30);

        btn_delete.setBackground(new java.awt.Color(255, 255, 255));
        btn_delete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(0, 0, 0));
        btn_delete.setText("DELETE");
        btn_delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_delete.setEnabled(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel10.add(btn_delete);
        btn_delete.setBounds(480, 410, 110, 50);
        jPanel10.add(txt_value);
        txt_value.setBounds(540, 320, 230, 40);

        cmb_year.setBackground(new java.awt.Color(255, 255, 255));
        cmb_year.setForeground(new java.awt.Color(0, 0, 0));
        cmb_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cmb_year.setSelectedIndex(-1);
        jPanel10.add(cmb_year);
        cmb_year.setBounds(120, 230, 230, 40);

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Course :");
        jPanel10.add(jLabel34);
        jLabel34.setBounds(30, 140, 140, 30);

        cmb_course.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_courseActionPerformed(evt);
            }
        });
        jPanel10.add(cmb_course);
        cmb_course.setBounds(120, 140, 230, 40);

        btn_save.setBackground(new java.awt.Color(255, 255, 255));
        btn_save.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_save.setForeground(new java.awt.Color(0, 0, 0));
        btn_save.setText("SAVE");
        btn_save.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel10.add(btn_save);
        btn_save.setBounds(210, 410, 110, 50);

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Optional :");
        jPanel10.add(jLabel39);
        jLabel39.setBounds(30, 50, 67, 19);

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Compulsory :");
        jPanel10.add(jLabel40);
        jLabel40.setBounds(210, 50, 91, 19);

        rbt_comp.setBackground(new java.awt.Color(234, 255, 255));
        buttonGroup1.add(rbt_comp);
        rbt_comp.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(rbt_comp);
        rbt_comp.setBounds(320, 45, 28, 28);

        rbt_opt.setBackground(new java.awt.Color(234, 255, 255));
        buttonGroup1.add(rbt_opt);
        rbt_opt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(rbt_opt);
        rbt_opt.setBounds(120, 45, 28, 28);

        jPanel7.add(jPanel10);
        jPanel10.setBounds(20, 20, 800, 480);

        jPanel9.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        jTabbedPane1.addTab("     Undergraduate Subjects     ", jPanel9);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 840, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 724));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean inputValidation1(){
        boolean correct = true;
        try{
            if(cmb_course1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select the course.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_subNo1.getSelectedIndex()==-1 && cmb_subNo1.isVisible()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select the subject number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_year1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select the year.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_title1.getText().isEmpty() || !txt_title1.getText().matches("[a-zA-Z0-9 ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid title.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_credits1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select the number of credits.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_value1.getText().isEmpty() || !txt_value1.getText().matches("[0-9.]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            
            else if(!rbt_comp1.isSelected() && !rbt_opt1.isSelected()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select the type.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }

            return correct;
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }
    
    private boolean inputValidation(){
        boolean correct = true;
        try{
            if(cmb_course.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select the course.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_subNo.getSelectedIndex()==-1 && cmb_subNo.isVisible()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select the subject number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_year.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select the year.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_title.getText().isEmpty() || !txt_title.getText().matches("[a-zA-Z0-9 ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid title.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_credits.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select the number of credits.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_value.getText().isEmpty() || !txt_value.getText().matches("[0-9.]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(!rbt_comp.isSelected() && !rbt_opt.isSelected()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select the type.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }

            return correct;
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }
    
    private void clear1(){
        cmb_course1.setSelectedIndex(-1);
        cmb_subNo1.setSelectedIndex(-1);
        cmb_year1.setSelectedIndex(-1);
        txt_title1.setText("");
        cmb_credits1.setSelectedIndex(-1);
        txt_value1.setText("");
        rbt_comp1.setSelected(false);
        rbt_opt1.setSelected(false);
    }
    
    private void clear(){   
        cmb_course.setSelectedIndex(-1);
        cmb_subNo.setSelectedIndex(-1);
        cmb_year.setSelectedIndex(-1);
        txt_title.setText("");
        cmb_credits.setSelectedIndex(-1);
        txt_value.setText("");
        rbt_comp.setSelected(false);
        rbt_opt.setSelected(false);
    }
    
    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.hide();
        new SubMenu(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        lbl_subNo.setVisible(true);
        cmb_subNo.setVisible(true);
        btn_delete.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Please select a course.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        classes.Subject s = new classes.Subject();
        int val=0;
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this record?", "DELETE", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
          try{
                val=s.deleteSubject((String)cmb_subNo.getSelectedItem());
                
                if(val==1){
                    JOptionPane.showMessageDialog(null, "Subject deleted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        classes.Subject s = new classes.Subject();
        int val=0;
        String type="";
        
        try{
            if(inputValidation()){
                if(rbt_comp.isSelected())
                    type="COMP";
                else if(rbt_opt.isSelected())
                    type="OPT";
                
                s.createSubject((String)cmb_course.getSelectedItem(), (String)cmb_year.getSelectedItem(), txt_title.getText(), (String)cmb_credits.getSelectedItem(), txt_value.getText(), formType, type);
                if(cmb_subNo.isVisible()){ //to update
                    val=s.updateSubject((String)cmb_subNo.getSelectedItem());
                    if(val==1){
                        JOptionPane.showMessageDialog(null, "Subject details successfully updated.", "Information", JOptionPane.INFORMATION_MESSAGE);
                        clear();
                    }
                }
                
                else{ //to add
                    val=s.addSubject();
                    if(val==1){
                        JOptionPane.showMessageDialog(null, "New subject added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                        clear();
                    }
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
        lbl_subNo1.setVisible(true);
        cmb_subNo1.setVisible(true);
        btn_delete1.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Please select a course.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        classes.Subject s = new classes.Subject();
        int val=0;
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this record?", "DELETE", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
          try{
                val=s.deleteSubject((String)cmb_subNo1.getSelectedItem());
                
                if(val==1){
                    JOptionPane.showMessageDialog(null, "Subject deleted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save1ActionPerformed
        classes.Subject s = new classes.Subject();
        int val=0;
        String type="";
        
        try{
            if(inputValidation1()){
                
                if(rbt_comp1.isSelected())
                    type="COMP";
                else if(rbt_opt1.isSelected())
                    type="OPT";
                
                s.createSubject((String)cmb_course1.getSelectedItem(), (String)cmb_year1.getSelectedItem(), txt_title1.getText(), (String)cmb_credits1.getSelectedItem(), txt_value1.getText(), formType, type);
                
                if(cmb_subNo1.isVisible()){ //to update
                    val=s.updateSubject((String)cmb_subNo1.getSelectedItem());
                    if(val==1){
                        JOptionPane.showMessageDialog(null, "Subject details successfully updated.", "Information", JOptionPane.INFORMATION_MESSAGE);
                        clear1();
                    }
                }
                
                else{ //to add
                    val=s.addSubject();
                    if(val==1){
                        JOptionPane.showMessageDialog(null, "New subject added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                        clear1();
                    }
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_save1ActionPerformed

    private void cmb_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_courseActionPerformed
        classes.Subject s = new classes.Subject();
        ResultSet rs = s.getSubIDsByCourse((String)cmb_course.getSelectedItem());
        comboBoxReady=false;
        
        try{
            cmb_subNo.removeAllItems();
            while(rs.next())
                cmb_subNo.addItem(rs.getString("subId"));
            
            cmb_subNo.setSelectedIndex(-1); //to make the cmb_subNo action performed function work   
            
            cmb_year.setSelectedIndex(-1);
            txt_title.setText("");
            cmb_credits.setSelectedIndex(-1);
            txt_value.setText("");
            comboBoxReady=true;
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmb_courseActionPerformed

    private void cmb_course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_course1ActionPerformed
        classes.Subject s = new classes.Subject();
        ResultSet rs = s.getSubIDsByCourse((String)cmb_course1.getSelectedItem());
        comboBoxReady=false;
        
        try{
            cmb_subNo1.removeAllItems();
            while(rs.next())
                cmb_subNo1.addItem(rs.getString("subId"));
            
            cmb_subNo1.setSelectedIndex(-1);  //to make the cmb_subNo1 action performed function work
            
            cmb_year1.setSelectedIndex(-1);
            txt_title1.setText("");
            cmb_credits1.setSelectedIndex(-1);
            txt_value1.setText("");
            comboBoxReady=true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmb_course1ActionPerformed

    private void cmb_subNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_subNoActionPerformed
        if(comboBoxReady && cmb_subNo.getSelectedIndex()!=-1){
            cmb_course.setEnabled(false);
            cmb_year.setEnabled(false);
            
            try{
                classes.Subject s = new classes.Subject();
                ResultSet rs = s.viewSubject((String)cmb_subNo.getSelectedItem());
                
                if(rs.next()){
                    cmb_year.setSelectedItem(rs.getString("YEA"));
                    cmb_credits.setSelectedItem(rs.getString("CREDITS"));
                    txt_title.setText(rs.getString("TITLE"));
                    txt_value.setText(rs.getString("VALUE"));
                    
                    if(rs.getString("TYPE").equals("COMP"))
                        rbt_comp.setSelected(true);
                    else if(rs.getString("TYPE").equals("OPT"))
                        rbt_opt.setSelected(true);
                }
            }
            catch(SQLException s){
                JOptionPane.showMessageDialog(null, "Database error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
                s.printStackTrace();;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cmb_subNoActionPerformed

    private void cmb_subNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_subNo1ActionPerformed
        if(comboBoxReady && cmb_subNo1.getSelectedIndex()!=-1){
            cmb_course1.setEnabled(false);
            cmb_year1.setEnabled(false);
            int selected = cmb_subNo1.getSelectedIndex();
            
            try{
                classes.Subject s = new classes.Subject();
                ResultSet rs = s.viewSubject((String)cmb_subNo1.getSelectedItem());
                
                if(rs.next()){
                    cmb_year1.setSelectedItem(rs.getString("YEA"));
                    cmb_credits1.setSelectedItem(rs.getString("CREDITS"));
                    txt_title1.setText(rs.getString("TITLE"));
                    txt_value1.setText(rs.getString("VALUE"));
                    if(rs.getString("TYPE").equals("COMP"))
                        rbt_comp1.setSelected(true);
                    else if(rs.getString("TYPE").equals("OPT"))
                        rbt_opt1.setSelected(true);
                }
            }
            catch(SQLException s){
                JOptionPane.showMessageDialog(null, "Database error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
    }//GEN-LAST:event_cmb_subNo1ActionPerformed
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subjects("ABC", "ABC").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_delete1;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_save1;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_update1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cmb_course;
    private javax.swing.JComboBox cmb_course1;
    private javax.swing.JComboBox cmb_credits;
    private javax.swing.JComboBox cmb_credits1;
    private javax.swing.JComboBox cmb_subNo;
    private javax.swing.JComboBox cmb_subNo1;
    private javax.swing.JComboBox cmb_year;
    private javax.swing.JComboBox cmb_year1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_subNo;
    private javax.swing.JLabel lbl_subNo1;
    private javax.swing.JRadioButton rbt_comp;
    private javax.swing.JRadioButton rbt_comp1;
    private javax.swing.JRadioButton rbt_opt;
    private javax.swing.JRadioButton rbt_opt1;
    private javax.swing.JTextField txt_title;
    private javax.swing.JTextField txt_title1;
    private javax.swing.JTextField txt_value;
    private javax.swing.JTextField txt_value1;
    // End of variables declaration//GEN-END:variables
}
