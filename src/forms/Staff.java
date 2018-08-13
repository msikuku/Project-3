package forms;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Staff extends javax.swing.JFrame {
    private String formType, userType;
    private boolean comboBoxClear = false;
    public Staff(String form, String user) {
        initComponents();
        formType=form;
        userType=user;
        this.setLocationRelativeTo(null); //to get it to the center of the screen
        
        classes.Subject s = new classes.Subject();
        ResultSet rsAll = s.getSubIDsByFaculty(formType); //to get all subIds for instructors
        ResultSet rsWithoutLecs = s.getSubIDsByFacultyWithoutLecturers(formType); //to get subIds without lecturers to add lecturers
        
        String subId;
        try{
            while(rsAll.next()){
                subId=rsAll.getString("SUBID");
                cmb_sub1.addItem(subId);
                cmb_sub2.addItem(subId);
                cmb_sub3.addItem(subId);
                cmb_sub4.addItem(subId);
                cmb_sub5.addItem(subId);
                cmb_sub6.addItem(subId);
            }
            
            while(rsWithoutLecs.next()){
                subId=rsWithoutLecs.getString("SUBID");
                cmb_sub11.addItem(subId);
                cmb_sub21.addItem(subId);
                cmb_sub31.addItem(subId);
                cmb_sub41.addItem(subId);
                cmb_sub51.addItem(subId);
                cmb_sub61.addItem(subId);
            }
            
            cmb_sub1.setSelectedIndex(-1);
            cmb_sub2.setSelectedIndex(-1);
            cmb_sub3.setSelectedIndex(-1);
            cmb_sub4.setSelectedIndex(-1);
            cmb_sub5.setSelectedIndex(-1);
            cmb_sub6.setSelectedIndex(-1);
            cmb_sub11.setSelectedIndex(-1);
            cmb_sub21.setSelectedIndex(-1);
            cmb_sub31.setSelectedIndex(-1);
            cmb_sub41.setSelectedIndex(-1);
            cmb_sub51.setSelectedIndex(-1);
            cmb_sub61.setSelectedIndex(-1);
            
            comboBoxClear=true; //to avoid the combo boxes being cleared each time when an item adds
            
            classes.Lecturer l = new classes.Lecturer();
            classes.Instructor i = new classes.Instructor();
            
            DefaultTableModel model = l.viewLecturers(formType);
                if(model != null)
                    jTableLec.setModel(model);
                
            model = i.viewInstructors(formType);
                if(model != null)
                    jTableIns.setModel(model);
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
        btn_delete1 = new javax.swing.JButton();
        btn_update1 = new javax.swing.JButton();
        btn_add1 = new javax.swing.JButton();
        lbl_sid1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_fName1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_lName1 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txt_mobNo1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_resNo1 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        cmb_sub21 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmb_sub31 = new javax.swing.JComboBox();
        cmb_sub11 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        cmb_sub51 = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cmb_sub61 = new javax.swing.JComboBox();
        cmb_sub41 = new javax.swing.JComboBox();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLec = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableIns = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        lbl_sid = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txt_fName = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_lName = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        txt_mobNo = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_resNo = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        cmb_sub2 = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cmb_sub3 = new javax.swing.JComboBox();
        cmb_sub1 = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        cmb_sub5 = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cmb_sub6 = new javax.swing.JComboBox();
        cmb_sub4 = new javax.swing.JComboBox();

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
        jLabel6.setText("Staff Management");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(590, 10, 520, 80);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(234, 255, 255));
        jPanel8.setLayout(null);

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
        jPanel8.add(btn_delete1);
        btn_delete1.setBounds(550, 640, 110, 50);

        btn_update1.setBackground(new java.awt.Color(255, 255, 255));
        btn_update1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_update1.setForeground(new java.awt.Color(0, 0, 0));
        btn_update1.setText("UPDATE");
        btn_update1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_update1.setEnabled(false);
        btn_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update1ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_update1);
        btn_update1.setBounds(340, 640, 110, 50);

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
        btn_add1.setBounds(130, 640, 110, 50);

        lbl_sid1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_sid1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(lbl_sid1);
        lbl_sid1.setBounds(30, 30, 150, 30);

        jPanel14.setBackground(new java.awt.Color(237, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("First Name : ");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));
        jPanel14.add(txt_fName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 40));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Last Name : ");
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 30));
        jPanel14.add(txt_lName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 40));

        jPanel8.add(jPanel14);
        jPanel14.setBounds(20, 90, 760, 80);

        jPanel16.setBackground(new java.awt.Color(237, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Mobile No. :");
        jPanel16.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));
        jPanel16.add(txt_mobNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 40));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Residence No. :");
        jPanel16.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 30));
        jPanel16.add(txt_resNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 40));

        jPanel8.add(jPanel16);
        jPanel16.setBounds(20, 200, 760, 80);

        jPanel17.setBackground(new java.awt.Color(237, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lecturing Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Subject 3 :");
        jPanel17.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 90, 30));

        cmb_sub21.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub21.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub21ActionPerformed(evt);
            }
        });
        jPanel17.add(cmb_sub21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 40));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Subject 1 :");
        jPanel17.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Subject 2 :");
        jPanel17.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 90, 30));

        cmb_sub31.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub31.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub31ActionPerformed(evt);
            }
        });
        jPanel17.add(cmb_sub31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 125, 190, 40));

        cmb_sub11.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub11.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub11ActionPerformed(evt);
            }
        });
        jPanel17.add(cmb_sub11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 40));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Subject 6 :");
        jPanel17.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 90, 30));

        cmb_sub51.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub51.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub51ActionPerformed(evt);
            }
        });
        jPanel17.add(cmb_sub51, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 190, 40));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Subject 4 :");
        jPanel17.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 125, -1, 30));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Subject 5 :");
        jPanel17.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 30));

        cmb_sub61.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub61.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub61ActionPerformed(evt);
            }
        });
        jPanel17.add(cmb_sub61, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 190, 40));

        cmb_sub41.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub41.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub41ActionPerformed(evt);
            }
        });
        jPanel17.add(cmb_sub41, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 125, 190, 40));

        jPanel8.add(jPanel17);
        jPanel17.setBounds(20, 310, 760, 290);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(20, 13, 800, 720);

        jPanel11.setBackground(new java.awt.Color(234, 255, 255));
        jPanel11.setLayout(null);

        jTableLec.setBackground(new java.awt.Color(213, 213, 255));
        jTableLec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTableLec.setForeground(new java.awt.Color(51, 51, 51));
        jTableLec.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableLec.setEnabled(false);
        jTableLec.setRowHeight(30);
        jTableLec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLec);

        jPanel11.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 800, 720);

        jPanel6.add(jPanel11);
        jPanel11.setBounds(840, 13, 800, 720);

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

        jTabbedPane1.addTab("                Lecturer                ", jPanel2);

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(234, 255, 255));
        jPanel13.setLayout(null);

        jTableIns.setBackground(new java.awt.Color(213, 213, 255));
        jTableIns.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTableIns.setForeground(new java.awt.Color(51, 51, 51));
        jTableIns.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableIns.setEnabled(false);
        jTableIns.setRowHeight(30);
        jTableIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableIns);

        jPanel13.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 800, 720);

        jPanel10.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 13, 800, 720));

        jPanel15.setBackground(new java.awt.Color(234, 255, 255));
        jPanel15.setLayout(null);

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
        jPanel15.add(btn_delete);
        btn_delete.setBounds(550, 640, 110, 50);

        btn_update.setBackground(new java.awt.Color(255, 255, 255));
        btn_update.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(0, 0, 0));
        btn_update.setText("UPDATE");
        btn_update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_update.setEnabled(false);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel15.add(btn_update);
        btn_update.setBounds(340, 640, 110, 50);

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
        jPanel15.add(btn_add);
        btn_add.setBounds(130, 640, 110, 50);

        lbl_sid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_sid.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.add(lbl_sid);
        lbl_sid.setBounds(30, 30, 150, 30);

        jPanel18.setBackground(new java.awt.Color(237, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("First Name : ");
        jPanel18.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));
        jPanel18.add(txt_fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 40));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Last Name : ");
        jPanel18.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 30));
        jPanel18.add(txt_lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 40));

        jPanel15.add(jPanel18);
        jPanel18.setBounds(20, 90, 760, 80);

        jPanel19.setBackground(new java.awt.Color(237, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Mobile No. :");
        jPanel19.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));
        jPanel19.add(txt_mobNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 40));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Residence No. :");
        jPanel19.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 30));
        jPanel19.add(txt_resNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 40));

        jPanel15.add(jPanel19);
        jPanel19.setBounds(20, 200, 760, 80);

        jPanel20.setBackground(new java.awt.Color(237, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instructing Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Subject 3 :");
        jPanel20.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 90, 30));

        cmb_sub2.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub2.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub2ActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 40));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Subject 1 :");
        jPanel20.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Subject 2 :");
        jPanel20.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 90, 30));

        cmb_sub3.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub3.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub3ActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_sub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 125, 190, 40));

        cmb_sub1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub1ActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 40));

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Subject 6 :");
        jPanel20.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 90, 30));

        cmb_sub5.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub5.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub5ActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_sub5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 190, 40));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Subject 4 :");
        jPanel20.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 125, -1, 30));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Subject 5 :");
        jPanel20.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 30));

        cmb_sub6.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub6.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub6ActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_sub6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 190, 40));

        cmb_sub4.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub4.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub4ActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_sub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 125, 190, 40));

        jPanel15.add(jPanel20);
        jPanel20.setBounds(20, 310, 760, 290);

        jPanel10.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 800, 720));

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

        jTabbedPane1.addTab("               Instructor               ", jPanel9);

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
    private boolean inputValidation(){
        boolean correct = true;
        try{
            if(txt_fName.getText().isEmpty() || !txt_fName.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid first name.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_lName.getText().isEmpty() || !txt_lName.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid last name.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_mobNo.getText().isEmpty() || txt_mobNo.getText().length()!=10 || !txt_mobNo.getText().matches("[0-9]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter valid mobile number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_resNo.getText().isEmpty() || txt_resNo.getText().length()!=10 || !txt_resNo.getText().matches("[0-9]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter valid residence number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_sub1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select at least one subject.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }

            return correct;
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }
    
    private void clear(){
        try{
            txt_fName.setText("");
            txt_lName.setText("");
            txt_mobNo.setText("");
            txt_resNo.setText("");
            
            cmb_sub1.setSelectedIndex(-1);
            cmb_sub2.setSelectedIndex(-1);
            cmb_sub3.setSelectedIndex(-1);
            cmb_sub4.setSelectedIndex(-1);
            cmb_sub5.setSelectedIndex(-1);
            cmb_sub6.setSelectedIndex(-1);
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private void clear1(){
        try{
            txt_fName1.setText("");
            txt_lName1.setText("");
            txt_mobNo1.setText("");
            txt_resNo1.setText("");
            
            cmb_sub11.setSelectedIndex(-1);
            cmb_sub21.setSelectedIndex(-1);
            cmb_sub31.setSelectedIndex(-1);
            cmb_sub41.setSelectedIndex(-1);
            cmb_sub51.setSelectedIndex(-1);
            cmb_sub61.setSelectedIndex(-1);
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private boolean inputValidation1(){
        boolean correct = true;
        try{
            if(txt_fName1.getText().isEmpty() || !txt_fName1.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid first name.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_lName1.getText().isEmpty() || !txt_lName1.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid last name.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_mobNo1.getText().isEmpty() || txt_mobNo1.getText().length()!=10 || !txt_mobNo1.getText().matches("[0-9]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter valid mobile number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_resNo1.getText().isEmpty() || txt_resNo1.getText().length()!=10 || !txt_resNo1.getText().matches("[0-9]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter valid residence number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_sub11.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select at least one subject.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }

            return correct;
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.hide();
        new SubMenu(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void cmb_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub1ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub2.removeItem(cmb_sub1.getSelectedItem());
            cmb_sub3.removeItem(cmb_sub1.getSelectedItem());
            cmb_sub4.removeItem(cmb_sub1.getSelectedItem());
            cmb_sub5.removeItem(cmb_sub1.getSelectedItem());
            cmb_sub6.removeItem(cmb_sub1.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub1ActionPerformed

    private void cmb_sub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub2ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub1.removeItem(cmb_sub2.getSelectedItem());
            cmb_sub3.removeItem(cmb_sub2.getSelectedItem());
            cmb_sub4.removeItem(cmb_sub2.getSelectedItem());
            cmb_sub5.removeItem(cmb_sub2.getSelectedItem());
            cmb_sub6.removeItem(cmb_sub2.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub2ActionPerformed

    private void cmb_sub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub3ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub2.removeItem(cmb_sub3.getSelectedItem());
            cmb_sub1.removeItem(cmb_sub3.getSelectedItem());
            cmb_sub4.removeItem(cmb_sub3.getSelectedItem());
            cmb_sub5.removeItem(cmb_sub3.getSelectedItem());
            cmb_sub6.removeItem(cmb_sub3.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub3ActionPerformed

    private void cmb_sub4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub4ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub2.removeItem(cmb_sub4.getSelectedItem());
            cmb_sub3.removeItem(cmb_sub4.getSelectedItem());
            cmb_sub1.removeItem(cmb_sub4.getSelectedItem());
            cmb_sub5.removeItem(cmb_sub4.getSelectedItem());
            cmb_sub6.removeItem(cmb_sub4.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub4ActionPerformed

    private void cmb_sub5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub5ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub2.removeItem(cmb_sub5.getSelectedItem());
            cmb_sub3.removeItem(cmb_sub5.getSelectedItem());
            cmb_sub4.removeItem(cmb_sub5.getSelectedItem());
            cmb_sub1.removeItem(cmb_sub5.getSelectedItem());
            cmb_sub6.removeItem(cmb_sub5.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub5ActionPerformed

    private void cmb_sub6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub6ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub2.removeItem(cmb_sub6.getSelectedItem());
            cmb_sub3.removeItem(cmb_sub6.getSelectedItem());
            cmb_sub4.removeItem(cmb_sub6.getSelectedItem());
            cmb_sub5.removeItem(cmb_sub6.getSelectedItem());
            cmb_sub1.removeItem(cmb_sub6.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub6ActionPerformed

    private void cmb_sub11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub11ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub21.removeItem(cmb_sub11.getSelectedItem());
            cmb_sub31.removeItem(cmb_sub11.getSelectedItem());
            cmb_sub41.removeItem(cmb_sub11.getSelectedItem());
            cmb_sub51.removeItem(cmb_sub11.getSelectedItem());
            cmb_sub61.removeItem(cmb_sub11.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub11ActionPerformed

    private void cmb_sub21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub21ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub11.removeItem(cmb_sub21.getSelectedItem());
            cmb_sub31.removeItem(cmb_sub21.getSelectedItem());
            cmb_sub41.removeItem(cmb_sub21.getSelectedItem());
            cmb_sub51.removeItem(cmb_sub21.getSelectedItem());
            cmb_sub61.removeItem(cmb_sub21.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub21ActionPerformed

    private void cmb_sub31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub31ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub21.removeItem(cmb_sub31.getSelectedItem());
            cmb_sub11.removeItem(cmb_sub31.getSelectedItem());
            cmb_sub41.removeItem(cmb_sub31.getSelectedItem());
            cmb_sub51.removeItem(cmb_sub31.getSelectedItem());
            cmb_sub61.removeItem(cmb_sub31.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub31ActionPerformed

    private void cmb_sub41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub41ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub21.removeItem(cmb_sub41.getSelectedItem());
            cmb_sub31.removeItem(cmb_sub41.getSelectedItem());
            cmb_sub11.removeItem(cmb_sub41.getSelectedItem());
            cmb_sub51.removeItem(cmb_sub41.getSelectedItem());
            cmb_sub61.removeItem(cmb_sub41.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub41ActionPerformed

    private void cmb_sub51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub51ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub21.removeItem(cmb_sub51.getSelectedItem());
            cmb_sub31.removeItem(cmb_sub51.getSelectedItem());
            cmb_sub41.removeItem(cmb_sub51.getSelectedItem());
            cmb_sub11.removeItem(cmb_sub51.getSelectedItem());
            cmb_sub61.removeItem(cmb_sub51.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub51ActionPerformed

    private void cmb_sub61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub61ActionPerformed
        if(comboBoxClear)
        {
            cmb_sub21.removeItem(cmb_sub61.getSelectedItem());
            cmb_sub31.removeItem(cmb_sub61.getSelectedItem());
            cmb_sub41.removeItem(cmb_sub61.getSelectedItem());
            cmb_sub51.removeItem(cmb_sub61.getSelectedItem());
            cmb_sub11.removeItem(cmb_sub61.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub61ActionPerformed

    private void jTableLecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLecMouseClicked
        btn_update1.setEnabled(true);
        btn_delete1.setEnabled(true);
        
        comboBoxClear =false; //adding into combo boxes below
        
        try{
            btn_add1.setEnabled(false);
            int row=jTableLec.rowAtPoint(evt.getPoint());
            String staffID=jTableLec.getValueAt(row,0).toString();
            
            classes.Lecturer l = new classes.Lecturer();
            
            ResultSet rs = l.viewLecturer(staffID);
            
            if(rs.next()){
                lbl_sid1.setText("Staff ID : "+rs.getString("STAFFID"));
                txt_fName1.setText(rs.getString("FNAME"));
                txt_lName1.setText(rs.getString("LNAME"));
                txt_mobNo1.setText(rs.getString("TELMOB"));
                txt_resNo1.setText(rs.getString("TELRES"));
                cmb_sub11.addItem(rs.getString("SUBID"));
                cmb_sub11.setSelectedItem(rs.getString("SUBID"));
            }
            
            if(rs.next()){
                cmb_sub21.addItem(rs.getString("SUBID"));
                cmb_sub21.setSelectedItem(rs.getString("SUBID"));
            }
            if(rs.next()){
                cmb_sub31.addItem(rs.getString("SUBID"));
                cmb_sub31.setSelectedItem(rs.getString("SUBID"));
            }
            if(rs.next()){
                cmb_sub41.addItem(rs.getString("SUBID"));
                cmb_sub41.setSelectedItem(rs.getString("SUBID"));
            }
            if(rs.next()){
                cmb_sub51.addItem(rs.getString("SUBID"));
                cmb_sub51.setSelectedItem(rs.getString("SUBID"));
            }
            if(rs.next()){
                cmb_sub61.addItem(rs.getString("SUBID"));
                cmb_sub61.setSelectedItem(rs.getString("SUBID"));
            }
            
            comboBoxClear =true;
        }
        catch(NullPointerException np){
            JOptionPane.showMessageDialog(null, "Please select a record with valid data.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTableLecMouseClicked

    private void jTableInsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInsMouseClicked
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);
        
        comboBoxClear =false; //adding into combo boxes below
        
        try{
            btn_add.setEnabled(false);
            int row=jTableIns.rowAtPoint(evt.getPoint());
            String staffID=jTableIns.getValueAt(row,0).toString();
            classes.Instructor i = new classes.Instructor();
            
            ResultSet rs = i.viewInstructor(staffID);
            
            if(rs.next()){
                lbl_sid.setText("Staff ID : "+rs.getString("STAFFID"));
                txt_fName.setText(rs.getString("FNAME"));
                txt_lName.setText(rs.getString("LNAME"));
                txt_mobNo.setText(rs.getString("TELMOB"));
                txt_resNo.setText(rs.getString("TELRES"));
                cmb_sub1.addItem(rs.getString("SUBID"));
                cmb_sub1.setSelectedItem(rs.getString("SUBID"));
            }
            
            if(rs.next()){
                cmb_sub2.addItem(rs.getString("SUBID"));
                cmb_sub2.setSelectedItem(rs.getString("SUBID"));
            }
            if(rs.next()){
                cmb_sub3.addItem(rs.getString("SUBID"));
                cmb_sub3.setSelectedItem(rs.getString("SUBID"));
            }
            if(rs.next()){
                cmb_sub4.addItem(rs.getString("SUBID"));
                cmb_sub4.setSelectedItem(rs.getString("SUBID"));
            }
            if(rs.next()){
                cmb_sub5.addItem(rs.getString("SUBID"));
                cmb_sub5.setSelectedItem(rs.getString("SUBID"));
            }
            if(rs.next()){
                cmb_sub6.addItem(rs.getString("SUBID"));
                cmb_sub6.setSelectedItem(rs.getString("SUBID"));
            }
            
            comboBoxClear =true;
        }
        catch(NullPointerException np){
            JOptionPane.showMessageDialog(null, "Please select a record with valid data.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTableInsMouseClicked

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        classes.Instructor i = new classes.Instructor();
        int val=1, count;
        String subs[]={"","","","","",""};
        
        try{
            if(inputValidation()){
                if(cmb_sub1.getSelectedIndex()!=-1){
                    subs[0]=(String)cmb_sub1.getSelectedItem();
                    val+=1;
                }
                if(cmb_sub2.getSelectedIndex()!=-1){
                    subs[1]=(String)cmb_sub2.getSelectedItem();
                    val+=1;
                }
                if(cmb_sub3.getSelectedIndex()!=-1){
                    subs[2]=(String)cmb_sub3.getSelectedItem();
                    val+=1;
                }
                if(cmb_sub4.getSelectedIndex()!=-1){
                    subs[3]=(String)cmb_sub4.getSelectedItem();
                    val+=1;
                }
                if(cmb_sub5.getSelectedIndex()!=-1){
                    subs[4]=(String)cmb_sub5.getSelectedItem();
                    val+=1;
                }
                if(cmb_sub6.getSelectedIndex()!=-1){
                    subs[5]=(String)cmb_sub6.getSelectedItem();
                    val+=1;
                }
                
                i.createStaff(txt_fName.getText(), txt_lName.getText(), txt_mobNo.getText(), txt_resNo.getText(), "INS", formType, subs);
                count=i.addStaff();
                
                if(val==count){
                    JOptionPane.showMessageDialog(null, "New instructor added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    
                    DefaultTableModel model = i.viewInstructors(formType);
                    if(model != null)
                        jTableIns.setModel(model);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        classes.Lecturer l = new classes.Lecturer();
        int val=1, count;
        String subs[]={"","","","","",""};
        
        try{
            if(inputValidation1()){
                if(cmb_sub11.getSelectedIndex()!=-1){
                    subs[0]=(String)cmb_sub11.getSelectedItem();
                    val+=1;
                }
                if(cmb_sub21.getSelectedIndex()!=-1){
                    subs[1]=(String)cmb_sub21.getSelectedItem();
                    val+=1;
                }
                if(cmb_sub31.getSelectedIndex()!=-1){
                    subs[2]=(String)cmb_sub31.getSelectedItem();
                    val+=1;
                }
                if(cmb_sub41.getSelectedIndex()!=-1){
                    subs[3]=(String)cmb_sub41.getSelectedItem();
                    val+=1;
                }
                if(cmb_sub51.getSelectedIndex()!=-1){
                    subs[4]=(String)cmb_sub51.getSelectedItem();
                    val+=1;
                }
                if(cmb_sub61.getSelectedIndex()!=-1){
                    subs[5]=(String)cmb_sub61.getSelectedItem();
                    val+=1;
                }
                
                l.createStaff(txt_fName1.getText(), txt_lName1.getText(), txt_mobNo1.getText(), txt_resNo1.getText(), "LEC", formType, subs);
                count=l.addStaff();
                
                if(val==count){
                    JOptionPane.showMessageDialog(null, "New Lecturer added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    
                    DefaultTableModel model = l.viewLecturers(formType);
                    if(model != null)
                        jTableLec.setModel(model);
                }   
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        classes.Lecturer l = new classes.Lecturer();
        int val=0;
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this record?", "DELETE", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            try{
                val=l.deleteStaff(lbl_sid1.getText().substring(11));
                
                if(val==1){
                    JOptionPane.showMessageDialog(null, "Lecturer record deleted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear1();
                    
                    DefaultTableModel model = l.viewLecturers(formType);
                    if(model != null)
                        jTableLec.setModel(model);
                    
                    btn_update1.setEnabled(false);
                    btn_delete1.setEnabled(false);
                    btn_add.setEnabled(true);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        classes.Instructor i = new classes.Instructor();
        int val=0;
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this record?", "DELETE", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            try{
                val=i.deleteStaff(lbl_sid.getText().substring(11));
                
                if(val==1){
                    JOptionPane.showMessageDialog(null, "Instructor record deleted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    
                    DefaultTableModel model = i.viewInstructors(formType);
                    if(model != null)
                        jTableIns.setModel(model);
                    
                    btn_update.setEnabled(false);
                    btn_delete.setEnabled(false);
                    btn_add.setEnabled(true);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
        classes.Lecturer l = new classes.Lecturer();
        int count;
        String subs[]={"","","","","",""};
        
        try{
            if(inputValidation1()){
                if(cmb_sub11.getSelectedIndex()!=-1){
                    subs[0]=(String)cmb_sub11.getSelectedItem();
                }
                if(cmb_sub21.getSelectedIndex()!=-1){
                    subs[1]=(String)cmb_sub21.getSelectedItem();
                }
                if(cmb_sub31.getSelectedIndex()!=-1){
                    subs[2]=(String)cmb_sub31.getSelectedItem();
                }
                if(cmb_sub41.getSelectedIndex()!=-1){
                    subs[3]=(String)cmb_sub41.getSelectedItem();
                }
                if(cmb_sub51.getSelectedIndex()!=-1){
                    subs[4]=(String)cmb_sub51.getSelectedItem();
                }
                if(cmb_sub61.getSelectedIndex()!=-1){
                    subs[5]=(String)cmb_sub61.getSelectedItem();
                }
                
                l.createStaff(txt_fName1.getText(), txt_lName1.getText(), txt_mobNo1.getText(), txt_resNo1.getText(), "LEC", formType, subs);                
                count=l.updateStaff(lbl_sid1.getText().substring(11));
                if(count==1){
                    JOptionPane.showMessageDialog(null, "Lecturer record updated successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    
                    DefaultTableModel model = l.viewLecturers(formType);
                    if(model != null)
                        jTableLec.setModel(model);
                    
                    btn_update1.setEnabled(false);
                    btn_delete1.setEnabled(false);
                    btn_add1.setEnabled(true);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
         classes.Instructor i = new classes.Instructor();
        int count;
        String subs[]={"","","","","",""};
        
        try{
            if(inputValidation()){
                if(cmb_sub1.getSelectedIndex()!=-1){
                    subs[0]=(String)cmb_sub1.getSelectedItem();
                }
                if(cmb_sub2.getSelectedIndex()!=-1){
                    subs[1]=(String)cmb_sub2.getSelectedItem();
                }
                if(cmb_sub3.getSelectedIndex()!=-1){
                    subs[2]=(String)cmb_sub3.getSelectedItem();
                }
                if(cmb_sub4.getSelectedIndex()!=-1){
                    subs[3]=(String)cmb_sub4.getSelectedItem();
                }
                if(cmb_sub5.getSelectedIndex()!=-1){
                    subs[4]=(String)cmb_sub5.getSelectedItem();
                }
                if(cmb_sub6.getSelectedIndex()!=-1){
                    subs[5]=(String)cmb_sub6.getSelectedItem();
                }
                
                i.createStaff(txt_fName.getText(), txt_lName.getText(), txt_mobNo.getText(), txt_resNo.getText(), "INS", formType, subs);
                count=i.updateStaff(lbl_sid.getText().substring(11));
                
                if(count==1){
                    JOptionPane.showMessageDialog(null, "Instructor record updated successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    
                    DefaultTableModel model = i.viewInstructors(formType);
                        if(model != null)
                            jTableIns.setModel(model);
                    
                    btn_update.setEnabled(false);
                    btn_delete.setEnabled(false);
                    btn_add.setEnabled(true);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff("ABC", "ABC").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add1;
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_delete1;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_update1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmb_sub1;
    private javax.swing.JComboBox cmb_sub11;
    private javax.swing.JComboBox cmb_sub2;
    private javax.swing.JComboBox cmb_sub21;
    private javax.swing.JComboBox cmb_sub3;
    private javax.swing.JComboBox cmb_sub31;
    private javax.swing.JComboBox cmb_sub4;
    private javax.swing.JComboBox cmb_sub41;
    private javax.swing.JComboBox cmb_sub5;
    private javax.swing.JComboBox cmb_sub51;
    private javax.swing.JComboBox cmb_sub6;
    private javax.swing.JComboBox cmb_sub61;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableIns;
    private javax.swing.JTable jTableLec;
    private javax.swing.JLabel lbl_sid;
    private javax.swing.JLabel lbl_sid1;
    private javax.swing.JTextField txt_fName;
    private javax.swing.JTextField txt_fName1;
    private javax.swing.JTextField txt_lName;
    private javax.swing.JTextField txt_lName1;
    private javax.swing.JTextField txt_mobNo;
    private javax.swing.JTextField txt_mobNo1;
    private javax.swing.JTextField txt_resNo;
    private javax.swing.JTextField txt_resNo1;
    // End of variables declaration//GEN-END:variables
}
