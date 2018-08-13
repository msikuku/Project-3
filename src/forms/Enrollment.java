package forms;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.lang.String;
import java.sql.SQLException;

public class Enrollment extends javax.swing.JFrame {
    private String formType, userType;
    private boolean subComboBoxReady=false;
    private boolean indexComboBoxReady=false;
    private boolean batchComboBoxReady=false;
    private boolean courseBoxReady = false;
    
    private int year, month;
    private int stuYear;
    
    private classes.Postgraduate p = new classes.Postgraduate();
    private classes.Undergraduate u = new classes.Undergraduate();
    
    public Enrollment(String form, String user) {
        initComponents();
        formType=form;
        userType = user;
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
            
            Calendar calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH)+1; //month starts with 0
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
        btn_update1 = new javax.swing.JButton();
        btn_add1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_fName1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_lName1 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        cmb_sub241 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cmb_sub211 = new javax.swing.JComboBox();
        cmb_sub221 = new javax.swing.JComboBox();
        cmb_sub231 = new javax.swing.JComboBox();
        cmb_index1 = new javax.swing.JComboBox();
        cmb_batch1 = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        cmb_sub141 = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cmb_sub111 = new javax.swing.JComboBox();
        cmb_sub121 = new javax.swing.JComboBox();
        cmb_sub131 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        cmb_course1 = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btn_update = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_fName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_lName = new javax.swing.JTextField();
        cmb_index = new javax.swing.JComboBox();
        cmb_batch = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        cmb_sub14 = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cmb_sub11 = new javax.swing.JComboBox();
        cmb_sub12 = new javax.swing.JComboBox();
        cmb_sub13 = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        cmb_sub24 = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cmb_sub21 = new javax.swing.JComboBox();
        cmb_sub22 = new javax.swing.JComboBox();
        cmb_sub23 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmb_course = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(877, 915));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(234, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(875, 916));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn_back.setText("jLabel1");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Enrolment Management");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 580, 80));

        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(234, 255, 255));
        jPanel8.setLayout(null);

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
        jPanel8.add(btn_update1);
        btn_update1.setBounds(450, 640, 110, 50);

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
        btn_add1.setBounds(240, 640, 110, 50);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Batch :");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(20, 30, 60, 30);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Index No. : ");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(560, 30, 110, 30);

        jPanel14.setBackground(new java.awt.Color(237, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("First Name : ");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        txt_fName1.setForeground(new java.awt.Color(51, 51, 51));
        txt_fName1.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_fName1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_fName1.setEnabled(false);
        jPanel14.add(txt_fName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 260, 40));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Last Name : ");
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 110, 30));

        txt_lName1.setForeground(new java.awt.Color(51, 51, 51));
        txt_lName1.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_lName1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_lName1.setEnabled(false);
        jPanel14.add(txt_lName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 260, 40));

        jPanel8.add(jPanel14);
        jPanel14.setBounds(20, 90, 760, 80);

        jPanel17.setBackground(new java.awt.Color(237, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel17.setEnabled(false);
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Subject 3 :");
        jPanel17.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 30));

        cmb_sub241.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub241.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub241.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub241ActionPerformed(evt);
            }
        });
        jPanel17.add(cmb_sub241, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 260, 40));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Subject 1 :");
        jPanel17.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Subject 2 :");
        jPanel17.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 90, 30));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Subject 4 :");
        jPanel17.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 90, 30));

        cmb_sub211.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub211.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub211ActionPerformed(evt);
            }
        });
        jPanel17.add(cmb_sub211, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 260, 40));

        cmb_sub221.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub221.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub221ActionPerformed(evt);
            }
        });
        jPanel17.add(cmb_sub221, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 260, 40));

        cmb_sub231.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub231.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub231ActionPerformed(evt);
            }
        });
        jPanel17.add(cmb_sub231, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 260, 40));

        jPanel8.add(jPanel17);
        jPanel17.setBounds(20, 440, 760, 180);

        cmb_index1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_index1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_index1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_index1ActionPerformed(evt);
            }
        });
        jPanel8.add(cmb_index1);
        cmb_index1.setBounds(655, 30, 120, 40);

        cmb_batch1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_batch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_batch1ActionPerformed(evt);
            }
        });
        jPanel8.add(cmb_batch1);
        cmb_batch1.setBounds(100, 30, 120, 40);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Semester 2 :");
        jPanel8.add(jLabel33);
        jLabel33.setBounds(20, 415, 130, 24);

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Semester 1 :");
        jPanel8.add(jLabel34);
        jLabel34.setBounds(20, 185, 130, 24);

        jPanel19.setBackground(new java.awt.Color(237, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel19.setEnabled(false);
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Subject 3 :");
        jPanel19.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 30));

        cmb_sub141.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub141.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub141ActionPerformed(evt);
            }
        });
        jPanel19.add(cmb_sub141, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 260, 40));

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Subject 1 :");
        jPanel19.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Subject 2 :");
        jPanel19.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 90, 30));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Subject 4 :");
        jPanel19.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 90, 30));

        cmb_sub111.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub111.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub111ActionPerformed(evt);
            }
        });
        jPanel19.add(cmb_sub111, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 260, 40));

        cmb_sub121.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub121.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub121ActionPerformed(evt);
            }
        });
        jPanel19.add(cmb_sub121, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 260, 40));

        cmb_sub131.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub131.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub131ActionPerformed(evt);
            }
        });
        jPanel19.add(cmb_sub131, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 260, 40));

        jPanel8.add(jPanel19);
        jPanel19.setBounds(20, 210, 760, 180);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Course :");
        jPanel8.add(jLabel20);
        jLabel20.setBounds(290, 30, 110, 30);

        cmb_course1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_course1ActionPerformed(evt);
            }
        });
        jPanel8.add(cmb_course1);
        cmb_course1.setBounds(370, 30, 120, 40);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(20, 13, 800, 720);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("     Postgraduate Students     ", jPanel2);

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(237, 255, 255));
        jPanel12.setLayout(null);

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
        jPanel12.add(btn_update);
        btn_update.setBounds(450, 640, 110, 50);

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
        jPanel12.add(btn_add);
        btn_add.setBounds(240, 640, 110, 50);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Batch :");
        jPanel12.add(jLabel2);
        jLabel2.setBounds(20, 30, 60, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Index No. : ");
        jPanel12.add(jLabel4);
        jLabel4.setBounds(560, 30, 110, 30);

        jPanel5.setBackground(new java.awt.Color(237, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("First Name : ");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        txt_fName.setForeground(new java.awt.Color(51, 51, 51));
        txt_fName.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_fName.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_fName.setEnabled(false);
        jPanel5.add(txt_fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 260, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Last Name : ");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 110, 30));

        txt_lName.setForeground(new java.awt.Color(51, 51, 51));
        txt_lName.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_lName.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txt_lName.setEnabled(false);
        jPanel5.add(txt_lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 260, 40));

        jPanel12.add(jPanel5);
        jPanel5.setBounds(20, 90, 760, 80);

        cmb_index.setBackground(new java.awt.Color(255, 255, 255));
        cmb_index.setForeground(new java.awt.Color(0, 0, 0));
        cmb_index.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_indexActionPerformed(evt);
            }
        });
        jPanel12.add(cmb_index);
        cmb_index.setBounds(655, 30, 120, 40);

        cmb_batch.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch.setForeground(new java.awt.Color(0, 0, 0));
        cmb_batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_batchActionPerformed(evt);
            }
        });
        jPanel12.add(cmb_batch);
        cmb_batch.setBounds(100, 30, 120, 40);

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Semester 1 :");
        jPanel12.add(jLabel39);
        jLabel39.setBounds(20, 185, 130, 24);

        jPanel20.setBackground(new java.awt.Color(237, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel20.setEnabled(false);
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Subject 3 :");
        jPanel20.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 30));

        cmb_sub14.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub14.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub14ActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_sub14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 260, 40));

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Subject 1 :");
        jPanel20.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Subject 2 :");
        jPanel20.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 90, 30));

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Subject 4 :");
        jPanel20.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 90, 30));

        cmb_sub11.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub11.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub11ActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_sub11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 260, 40));

        cmb_sub12.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub12.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub12ActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_sub12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 260, 40));

        cmb_sub13.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub13.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub13ActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_sub13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 260, 40));

        jPanel12.add(jPanel20);
        jPanel20.setBounds(20, 210, 760, 180);

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Semester 2 :");
        jPanel12.add(jLabel44);
        jLabel44.setBounds(20, 415, 130, 24);

        jPanel18.setBackground(new java.awt.Color(237, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel18.setEnabled(false);
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Subject 3 :");
        jPanel18.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 30));

        cmb_sub24.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub24.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub24ActionPerformed(evt);
            }
        });
        jPanel18.add(cmb_sub24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 260, 40));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Subject 1 :");
        jPanel18.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Subject 2 :");
        jPanel18.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 90, 30));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Subject 4 :");
        jPanel18.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 90, 30));

        cmb_sub21.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub21.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub21ActionPerformed(evt);
            }
        });
        jPanel18.add(cmb_sub21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 260, 40));

        cmb_sub22.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub22.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub22ActionPerformed(evt);
            }
        });
        jPanel18.add(cmb_sub22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 260, 40));

        cmb_sub23.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub23.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub23ActionPerformed(evt);
            }
        });
        jPanel18.add(cmb_sub23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 260, 40));

        jPanel12.add(jPanel18);
        jPanel18.setBounds(20, 440, 760, 180);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Course :");
        jPanel12.add(jLabel5);
        jLabel5.setBounds(290, 30, 110, 30);

        cmb_course.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_courseActionPerformed(evt);
            }
        });
        jPanel12.add(cmb_course);
        cmb_course.setBounds(370, 30, 120, 40);

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 800, 720));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("     Undergraduate Students     ", jPanel9);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 840, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 915));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private  void clear(){
        batchComboBoxReady=false;
        courseBoxReady=false;
        
        cmb_sub11.setSelectedIndex(-1);
        cmb_sub12.setSelectedIndex(-1);
        cmb_sub13.setSelectedIndex(-1);
        cmb_sub14.setSelectedIndex(-1);
        cmb_sub21.setSelectedIndex(-1);
        cmb_sub22.setSelectedIndex(-1);
        cmb_sub23.setSelectedIndex(-1);
        cmb_sub24.setSelectedIndex(-1);
        
        cmb_batch.setSelectedIndex(-1);
        cmb_course1.setSelectedIndex(-1);
        cmb_index.setSelectedIndex(-1);
        
        batchComboBoxReady=true;
        courseBoxReady=true;
        
        txt_fName.setText("");
        txt_lName.setText("");
    }
    
    private  void clear1(){
        batchComboBoxReady=false;
        courseBoxReady=false;
        
        cmb_sub111.setSelectedIndex(-1);
        cmb_sub121.setSelectedIndex(-1);
        cmb_sub131.setSelectedIndex(-1);
        cmb_sub141.setSelectedIndex(-1);
        cmb_sub211.setSelectedIndex(-1);
        cmb_sub221.setSelectedIndex(-1);
        cmb_sub231.setSelectedIndex(-1);
        cmb_sub241.setSelectedIndex(-1);
        
        cmb_batch1.setSelectedIndex(-1);
        cmb_course1.setSelectedIndex(-1);
        cmb_index1.setSelectedIndex(-1);
        
        batchComboBoxReady=true;
        courseBoxReady=true;
        
        txt_fName1.setText("");
        txt_lName1.setText("");
    }
    
    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.hide();
        new SubMenu(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void cmb_batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_batchActionPerformed
        try {
            indexComboBoxReady=false;
            if(cmb_batch.getSelectedIndex()!=-1 && batchComboBoxReady){
                cmb_sub11.setEnabled(true);
                cmb_sub12.setEnabled(true);
                cmb_sub13.setEnabled(true);
                cmb_sub14.setEnabled(true);
                
                cmb_sub21.setEnabled(true);
                cmb_sub22.setEnabled(true);
                cmb_sub23.setEnabled(true);
                cmb_sub24.setEnabled(true);
                
                String intake = (String)cmb_batch.getSelectedItem();
                if((  intake.substring(3).equals("1") && (month>=1 && month<=4)  ) || (  intake.substring(3).equals("2") && (month>=6 && month<=9))  ){
                    JOptionPane.showMessageDialog(this, "You cannot edit semester 1 subjects at the moment", "Reminder", JOptionPane.INFORMATION_MESSAGE);
                    cmb_sub11.setEnabled(false);
                    cmb_sub12.setEnabled(false);
                    cmb_sub13.setEnabled(false);
                    cmb_sub14.setEnabled(false);
                }
                else if((  intake.substring(3).equals("1") && (month>=6 && month<=9)  ) || (  intake.substring(3).equals("2") && (month>=1 && month<=4))  ){
                    JOptionPane.showMessageDialog(this, "You cannot edit semester 2 subjects at the moment", "Reminder", JOptionPane.INFORMATION_MESSAGE);
                    cmb_sub21.setEnabled(false);
                    cmb_sub22.setEnabled(false);
                    cmb_sub23.setEnabled(false);
                    cmb_sub24.setEnabled(false);
                }
            }
                
            indexComboBoxReady=true;
            cmb_index.setSelectedIndex(-1);
        } 
        
        catch (Exception e) {}
    }//GEN-LAST:event_cmb_batchActionPerformed

    private void cmb_batch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_batch1ActionPerformed
        try {
            indexComboBoxReady=false;
            if(cmb_batch1.getSelectedIndex()!=-1 && batchComboBoxReady){
                cmb_sub111.setEnabled(true);
                cmb_sub121.setEnabled(true);
                cmb_sub131.setEnabled(true);
                cmb_sub141.setEnabled(true);
                    
                cmb_sub211.setEnabled(true);
                cmb_sub221.setEnabled(true);
                cmb_sub231.setEnabled(true);
                cmb_sub241.setEnabled(true);
                    
                String intake = (String)cmb_batch1.getSelectedItem();
                if((  intake.substring(3).equals("1") && (month>=1 && month<=4)  ) || (  intake.substring(3).equals("2") && (month>=6 && month<=9)  )){
                    JOptionPane.showMessageDialog(this, "You cannot edit semester 1 subjects at the moment", "Reminder", JOptionPane.INFORMATION_MESSAGE);
                    cmb_sub111.setEnabled(false);
                    cmb_sub121.setEnabled(false);
                    cmb_sub131.setEnabled(false);
                    cmb_sub141.setEnabled(false);
                }
                else if((  intake.substring(3).equals("1") && (month>=6 && month<=9)  ) || (  intake.substring(3).equals("2") && (month>=1 && month<=4))  ){
                    JOptionPane.showMessageDialog(this, "You cannot edit semester 2 subjects at the moment", "Reminder", JOptionPane.INFORMATION_MESSAGE);
                    cmb_sub211.setEnabled(false);
                    cmb_sub221.setEnabled(false);
                    cmb_sub231.setEnabled(false);
                    cmb_sub241.setEnabled(false);
                }
            }

            indexComboBoxReady=true;
            cmb_index1.setSelectedIndex(-1);
        } 
        
        catch (Exception e) {}
    }//GEN-LAST:event_cmb_batch1ActionPerformed

    private void cmb_index1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_index1ActionPerformed
        try {
            txt_fName1.setText("");
            txt_lName1.setText("");
            subComboBoxReady=false;
            if(indexComboBoxReady){
                ResultSet rs = p.viewStudent((String)cmb_index1.getSelectedItem());
                cmb_sub111.removeAllItems();
                cmb_sub121.removeAllItems();
                cmb_sub131.removeAllItems();
                cmb_sub141.removeAllItems();
                    
                cmb_sub211.removeAllItems();
                cmb_sub221.removeAllItems();
                cmb_sub231.removeAllItems();
                cmb_sub241.removeAllItems();
                
                if(rs.next()){
                    txt_fName1.setText(rs.getString("FNAME"));
                    txt_lName1.setText(rs.getString("LNAME"));
                    stuYear=rs.getInt("YEA");
                }
                
                classes.Subject s = new classes.Subject();
                ResultSet rs1 = s.getOptionalSubjectsByStudent(stuYear, formType, rs.getString("course"));
                
                while(rs1.next()){
                    cmb_sub111.addItem(rs1.getString("SUBID"));
                    cmb_sub121.addItem(rs1.getString("SUBID"));
                    cmb_sub131.addItem(rs1.getString("SUBID"));
                    cmb_sub141.addItem(rs1.getString("SUBID"));
                    cmb_sub211.addItem(rs1.getString("SUBID"));
                    cmb_sub221.addItem(rs1.getString("SUBID"));
                    cmb_sub231.addItem(rs1.getString("SUBID"));
                    cmb_sub241.addItem(rs1.getString("SUBID"));
                }
                
                cmb_sub111.setSelectedIndex(-1);
                cmb_sub121.setSelectedIndex(-1);
                cmb_sub131.setSelectedIndex(-1);
                cmb_sub141.setSelectedIndex(-1);
                cmb_sub211.setSelectedIndex(-1);
                cmb_sub221.setSelectedIndex(-1);
                cmb_sub231.setSelectedIndex(-1);
                cmb_sub241.setSelectedIndex(-1);
                
                subComboBoxReady=true;
                
                classes.Enrolment e = new classes.Enrolment();
                ResultSet rs2[]=e.viewEnrolment((String)cmb_index1.getSelectedItem());
                
                if(rs2[0].next()){
                    if(rs2[0].getInt("YEA")==stuYear)
                        btn_add1.setEnabled(false);

                    cmb_sub111.setSelectedItem(rs2[0].getString("SUB1"));
                    cmb_sub121.setSelectedItem(rs2[0].getString("SUB2"));
                    cmb_sub131.setSelectedItem(rs2[0].getString("SUB3"));
                    cmb_sub141.setSelectedItem(rs2[0].getString("SUB4"));
                }
                
                if(rs2[1].next()){
                    cmb_sub211.setSelectedItem(rs2[1].getString("SUB1"));
                    cmb_sub221.setSelectedItem(rs2[1].getString("SUB2"));
                    cmb_sub231.setSelectedItem(rs2[1].getString("SUB3"));
                    cmb_sub241.setSelectedItem(rs2[1].getString("SUB4"));
                }
            }
        }
        
        catch (SQLException s) {
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmb_index1ActionPerformed

    private void cmb_indexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_indexActionPerformed
        try {
            txt_fName.setText("");
            txt_lName.setText("");
            subComboBoxReady=false;
            if(indexComboBoxReady){
                ResultSet rs = u.viewStudent((String)cmb_index.getSelectedItem());
                cmb_sub11.removeAllItems();
                cmb_sub12.removeAllItems();
                cmb_sub13.removeAllItems();
                cmb_sub14.removeAllItems();
                    
                cmb_sub21.removeAllItems();
                cmb_sub22.removeAllItems();
                cmb_sub23.removeAllItems();
                cmb_sub24.removeAllItems();
                
                if(rs.next()){
                    txt_fName.setText(rs.getString("FNAME"));
                    txt_lName.setText(rs.getString("LNAME"));
                    stuYear=rs.getInt("YEA");
                }
                
                classes.Subject s = new classes.Subject();
                ResultSet rs1 = s.getOptionalSubjectsByStudent(stuYear, formType, rs.getString("course"));
                
                while(rs1.next()){
                    cmb_sub11.addItem(rs1.getString("SUBID"));
                    cmb_sub12.addItem(rs1.getString("SUBID"));
                    cmb_sub13.addItem(rs1.getString("SUBID"));
                    cmb_sub14.addItem(rs1.getString("SUBID"));
                    cmb_sub21.addItem(rs1.getString("SUBID"));
                    cmb_sub22.addItem(rs1.getString("SUBID"));
                    cmb_sub23.addItem(rs1.getString("SUBID"));
                    cmb_sub24.addItem(rs1.getString("SUBID"));
                }
                
                cmb_sub11.setSelectedIndex(-1);
                cmb_sub12.setSelectedIndex(-1);
                cmb_sub13.setSelectedIndex(-1);
                cmb_sub14.setSelectedIndex(-1);
                cmb_sub21.setSelectedIndex(-1);
                cmb_sub22.setSelectedIndex(-1);
                cmb_sub23.setSelectedIndex(-1);
                cmb_sub24.setSelectedIndex(-1);
            
                subComboBoxReady=true;
                
                classes.Enrolment e = new classes.Enrolment();
                ResultSet rs2[]=e.viewEnrolment((String)cmb_index.getSelectedItem());
                
                if(rs2[0].next()){
                    if(rs2[0].getInt("YEA")==stuYear)
                        btn_add.setEnabled(false);

                    cmb_sub11.setSelectedItem(rs2[0].getString("SUB1"));
                    cmb_sub12.setSelectedItem(rs2[0].getString("SUB2"));
                    cmb_sub13.setSelectedItem(rs2[0].getString("SUB3"));
                    cmb_sub14.setSelectedItem(rs2[0].getString("SUB4"));
                }
                
                if(rs2[1].next()){
                    cmb_sub21.setSelectedItem(rs2[1].getString("SUB1"));
                    cmb_sub22.setSelectedItem(rs2[1].getString("SUB2"));
                    cmb_sub23.setSelectedItem(rs2[1].getString("SUB3"));
                    cmb_sub24.setSelectedItem(rs2[1].getString("SUB4"));
                }
            }
        } 
        
        catch (Exception e) {}
    }//GEN-LAST:event_cmb_indexActionPerformed

    private void cmb_sub111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub111ActionPerformed
        if(subComboBoxReady){
            cmb_sub121.removeItem(cmb_sub111.getSelectedItem());
            cmb_sub131.removeItem(cmb_sub111.getSelectedItem());
            cmb_sub141.removeItem(cmb_sub111.getSelectedItem());
            cmb_sub211.removeItem(cmb_sub111.getSelectedItem());
            cmb_sub221.removeItem(cmb_sub111.getSelectedItem());
            cmb_sub231.removeItem(cmb_sub111.getSelectedItem());
            cmb_sub241.removeItem(cmb_sub111.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub111ActionPerformed

    private void cmb_sub121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub121ActionPerformed
         if(subComboBoxReady){
            cmb_sub111.removeItem(cmb_sub121.getSelectedItem());
            cmb_sub131.removeItem(cmb_sub121.getSelectedItem());
            cmb_sub141.removeItem(cmb_sub121.getSelectedItem());
            cmb_sub211.removeItem(cmb_sub121.getSelectedItem());
            cmb_sub221.removeItem(cmb_sub121.getSelectedItem());
            cmb_sub231.removeItem(cmb_sub121.getSelectedItem());
            cmb_sub241.removeItem(cmb_sub121.getSelectedItem());
         }
    }//GEN-LAST:event_cmb_sub121ActionPerformed

    private void cmb_sub131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub131ActionPerformed
        if(subComboBoxReady){
            cmb_sub111.removeItem(cmb_sub131.getSelectedItem());
            cmb_sub121.removeItem(cmb_sub131.getSelectedItem());
            cmb_sub141.removeItem(cmb_sub131.getSelectedItem());
            cmb_sub211.removeItem(cmb_sub131.getSelectedItem());
            cmb_sub221.removeItem(cmb_sub131.getSelectedItem());
            cmb_sub231.removeItem(cmb_sub131.getSelectedItem());
            cmb_sub241.removeItem(cmb_sub131.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub131ActionPerformed

    private void cmb_sub141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub141ActionPerformed
        if(subComboBoxReady){
            cmb_sub111.removeItem(cmb_sub141.getSelectedItem());
            cmb_sub131.removeItem(cmb_sub141.getSelectedItem());
            cmb_sub121.removeItem(cmb_sub141.getSelectedItem());
            cmb_sub211.removeItem(cmb_sub141.getSelectedItem());
            cmb_sub221.removeItem(cmb_sub141.getSelectedItem());
            cmb_sub231.removeItem(cmb_sub141.getSelectedItem());
            cmb_sub241.removeItem(cmb_sub141.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub141ActionPerformed

    private void cmb_sub211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub211ActionPerformed
        if(subComboBoxReady){
            cmb_sub111.removeItem(cmb_sub211.getSelectedItem());
            cmb_sub131.removeItem(cmb_sub211.getSelectedItem());
            cmb_sub141.removeItem(cmb_sub211.getSelectedItem());
            cmb_sub121.removeItem(cmb_sub211.getSelectedItem());
            cmb_sub221.removeItem(cmb_sub211.getSelectedItem());
            cmb_sub231.removeItem(cmb_sub211.getSelectedItem());
            cmb_sub241.removeItem(cmb_sub211.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub211ActionPerformed

    private void cmb_sub231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub231ActionPerformed
        if(subComboBoxReady){
            cmb_sub111.removeItem(cmb_sub231.getSelectedItem());
            cmb_sub131.removeItem(cmb_sub231.getSelectedItem());
            cmb_sub141.removeItem(cmb_sub231.getSelectedItem());
            cmb_sub121.removeItem(cmb_sub231.getSelectedItem());
            cmb_sub221.removeItem(cmb_sub231.getSelectedItem());
            cmb_sub211.removeItem(cmb_sub231.getSelectedItem());
            cmb_sub241.removeItem(cmb_sub231.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub231ActionPerformed

    private void cmb_sub221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub221ActionPerformed
        if(subComboBoxReady){
            cmb_sub111.removeItem(cmb_sub221.getSelectedItem());
            cmb_sub131.removeItem(cmb_sub221.getSelectedItem());
            cmb_sub141.removeItem(cmb_sub221.getSelectedItem());
            cmb_sub121.removeItem(cmb_sub221.getSelectedItem());
            cmb_sub211.removeItem(cmb_sub221.getSelectedItem());
            cmb_sub231.removeItem(cmb_sub221.getSelectedItem());
            cmb_sub241.removeItem(cmb_sub221.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub221ActionPerformed

    private void cmb_sub241ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub241ActionPerformed
        if(subComboBoxReady){
            cmb_sub111.removeItem(cmb_sub241.getSelectedItem());
            cmb_sub131.removeItem(cmb_sub241.getSelectedItem());
            cmb_sub141.removeItem(cmb_sub241.getSelectedItem());
            cmb_sub121.removeItem(cmb_sub241.getSelectedItem());
            cmb_sub221.removeItem(cmb_sub241.getSelectedItem());
            cmb_sub231.removeItem(cmb_sub241.getSelectedItem());
            cmb_sub211.removeItem(cmb_sub241.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub241ActionPerformed

    private void cmb_sub11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub11ActionPerformed
        if(subComboBoxReady){
            cmb_sub12.removeItem(cmb_sub11.getSelectedItem());
            cmb_sub13.removeItem(cmb_sub11.getSelectedItem());
            cmb_sub14.removeItem(cmb_sub11.getSelectedItem());
            cmb_sub21.removeItem(cmb_sub11.getSelectedItem());
            cmb_sub22.removeItem(cmb_sub11.getSelectedItem());
            cmb_sub23.removeItem(cmb_sub11.getSelectedItem());
            cmb_sub24.removeItem(cmb_sub11.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub11ActionPerformed

    private void cmb_sub12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub12ActionPerformed
        if(subComboBoxReady){
            cmb_sub11.removeItem(cmb_sub12.getSelectedItem());
            cmb_sub13.removeItem(cmb_sub12.getSelectedItem());
            cmb_sub14.removeItem(cmb_sub12.getSelectedItem());
            cmb_sub21.removeItem(cmb_sub12.getSelectedItem());
            cmb_sub22.removeItem(cmb_sub12.getSelectedItem());
            cmb_sub23.removeItem(cmb_sub12.getSelectedItem());
            cmb_sub24.removeItem(cmb_sub12.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub12ActionPerformed

    private void cmb_sub13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub13ActionPerformed
        if(subComboBoxReady){
            cmb_sub11.removeItem(cmb_sub13.getSelectedItem());
            cmb_sub12.removeItem(cmb_sub13.getSelectedItem());
            cmb_sub14.removeItem(cmb_sub13.getSelectedItem());
            cmb_sub21.removeItem(cmb_sub13.getSelectedItem());
            cmb_sub22.removeItem(cmb_sub13.getSelectedItem());
            cmb_sub23.removeItem(cmb_sub13.getSelectedItem());
            cmb_sub24.removeItem(cmb_sub13.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub13ActionPerformed

    private void cmb_sub14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub14ActionPerformed
        if(subComboBoxReady){
            cmb_sub11.removeItem(cmb_sub14.getSelectedItem());
            cmb_sub13.removeItem(cmb_sub14.getSelectedItem());
            cmb_sub12.removeItem(cmb_sub14.getSelectedItem());
            cmb_sub21.removeItem(cmb_sub14.getSelectedItem());
            cmb_sub22.removeItem(cmb_sub14.getSelectedItem());
            cmb_sub23.removeItem(cmb_sub14.getSelectedItem());
            cmb_sub24.removeItem(cmb_sub14.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub14ActionPerformed

    private void cmb_sub21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub21ActionPerformed
        if(subComboBoxReady){
            cmb_sub11.removeItem(cmb_sub21.getSelectedItem());
            cmb_sub13.removeItem(cmb_sub21.getSelectedItem());
            cmb_sub14.removeItem(cmb_sub21.getSelectedItem());
            cmb_sub12.removeItem(cmb_sub21.getSelectedItem());
            cmb_sub22.removeItem(cmb_sub21.getSelectedItem());
            cmb_sub23.removeItem(cmb_sub21.getSelectedItem());
            cmb_sub24.removeItem(cmb_sub21.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub21ActionPerformed

    private void cmb_sub22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub22ActionPerformed
        if(subComboBoxReady){
            cmb_sub11.removeItem(cmb_sub22.getSelectedItem());
            cmb_sub13.removeItem(cmb_sub22.getSelectedItem());
            cmb_sub14.removeItem(cmb_sub22.getSelectedItem());
            cmb_sub12.removeItem(cmb_sub22.getSelectedItem());
            cmb_sub21.removeItem(cmb_sub22.getSelectedItem());
            cmb_sub23.removeItem(cmb_sub22.getSelectedItem());
            cmb_sub24.removeItem(cmb_sub22.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub22ActionPerformed

    private void cmb_sub23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub23ActionPerformed
        if(subComboBoxReady){
            cmb_sub11.removeItem(cmb_sub23.getSelectedItem());
            cmb_sub13.removeItem(cmb_sub23.getSelectedItem());
            cmb_sub14.removeItem(cmb_sub23.getSelectedItem());
            cmb_sub12.removeItem(cmb_sub23.getSelectedItem());
            cmb_sub22.removeItem(cmb_sub23.getSelectedItem());
            cmb_sub21.removeItem(cmb_sub23.getSelectedItem());
            cmb_sub24.removeItem(cmb_sub23.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub23ActionPerformed

    private void cmb_sub24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub24ActionPerformed
        if(subComboBoxReady){
            cmb_sub11.removeItem(cmb_sub24.getSelectedItem());
            cmb_sub13.removeItem(cmb_sub24.getSelectedItem());
            cmb_sub14.removeItem(cmb_sub24.getSelectedItem());
            cmb_sub12.removeItem(cmb_sub24.getSelectedItem());
            cmb_sub22.removeItem(cmb_sub24.getSelectedItem());
            cmb_sub23.removeItem(cmb_sub24.getSelectedItem());
            cmb_sub21.removeItem(cmb_sub24.getSelectedItem());
        }
    }//GEN-LAST:event_cmb_sub24ActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        try{
            String sem1[] = {"","","",""};
            String sem2[] = {"","","",""};
            
            if(cmb_batch1.getSelectedIndex()==-1 || cmb_index1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(this, "Please select a student to proceed", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_sub111.getSelectedIndex()==-1 && cmb_sub211.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(this, "Please select at least one subject to proceed", "Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                classes.Enrolment e = new classes.Enrolment();
                
                if(cmb_sub111.getSelectedIndex()!=-1)
                    sem1[0]=(String)cmb_sub111.getSelectedItem();
                if(cmb_sub121.getSelectedIndex()!=-1)
                    sem1[1]=(String)cmb_sub121.getSelectedItem();
                if(cmb_sub131.getSelectedIndex()!=-1)
                    sem1[2]=(String)cmb_sub131.getSelectedItem();
                if(cmb_sub141.getSelectedIndex()!=-1)
                    sem1[3]=(String)cmb_sub141.getSelectedItem();
                
                if(cmb_sub211.getSelectedIndex()!=-1)
                    sem1[0]=(String)cmb_sub211.getSelectedItem();
                if(cmb_sub221.getSelectedIndex()!=-1)
                    sem1[1]=(String)cmb_sub221.getSelectedItem();
                if(cmb_sub231.getSelectedIndex()!=-1)
                    sem1[2]=(String)cmb_sub231.getSelectedItem();
                if(cmb_sub241.getSelectedIndex()!=-1)
                    sem1[3]=(String)cmb_sub241.getSelectedItem();
                
                e.createEnrolment(sem1, sem2, (String)cmb_index1.getSelectedItem(), stuYear);
                if(e.addEnrolment()==2){
                    JOptionPane.showMessageDialog(this, "Enrolment added succesffully", "Information", JOptionPane.INFORMATION_MESSAGE);
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
            String sem1[] = {"","","",""};
            String sem2[] = {"","","",""};
            
            if(cmb_batch.getSelectedIndex()==-1 || cmb_index.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(this, "Please select a student to proceed", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_sub11.getSelectedIndex()==-1 && cmb_sub21.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(this, "Please select at least one subject to proceed", "Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                classes.Enrolment e = new classes.Enrolment();
                
                if(cmb_sub11.getSelectedIndex()!=-1)
                    sem1[0]=(String)cmb_sub11.getSelectedItem();
                if(cmb_sub12.getSelectedIndex()!=-1)
                    sem1[1]=(String)cmb_sub12.getSelectedItem();
                if(cmb_sub13.getSelectedIndex()!=-1)
                    sem1[2]=(String)cmb_sub13.getSelectedItem();
                if(cmb_sub14.getSelectedIndex()!=-1)
                    sem1[3]=(String)cmb_sub14.getSelectedItem();
                
                if(cmb_sub21.getSelectedIndex()!=-1)
                    sem1[0]=(String)cmb_sub21.getSelectedItem();
                if(cmb_sub22.getSelectedIndex()!=-1)
                    sem1[1]=(String)cmb_sub22.getSelectedItem();
                if(cmb_sub23.getSelectedIndex()!=-1)
                    sem1[2]=(String)cmb_sub23.getSelectedItem();
                if(cmb_sub24.getSelectedIndex()!=-1)
                    sem1[3]=(String)cmb_sub24.getSelectedItem();
                
                e.createEnrolment(sem1, sem2, (String)cmb_index.getSelectedItem(), stuYear);
                if(e.addEnrolment()==2){
                    JOptionPane.showMessageDialog(this, "Enrolment added succesffully", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
        try{
            String sem1[] = {"","","",""};
            String sem2[] = {"","","",""};
            
            if(cmb_batch1.getSelectedIndex()==-1 || cmb_index1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(this, "Please select a student to proceed", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_sub111.getSelectedIndex()==-1 && cmb_sub211.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(this, "Please select at least one subject to proceed", "Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                classes.Enrolment e = new classes.Enrolment();
                
                if(cmb_sub111.getSelectedIndex()!=-1)
                    sem1[0]=(String)cmb_sub111.getSelectedItem();
                if(cmb_sub121.getSelectedIndex()!=-1)
                    sem1[1]=(String)cmb_sub121.getSelectedItem();
                if(cmb_sub131.getSelectedIndex()!=-1)
                    sem1[2]=(String)cmb_sub131.getSelectedItem();
                if(cmb_sub141.getSelectedIndex()!=-1)
                    sem1[3]=(String)cmb_sub141.getSelectedItem();
                
                if(cmb_sub211.getSelectedIndex()!=-1)
                    sem1[0]=(String)cmb_sub211.getSelectedItem();
                if(cmb_sub221.getSelectedIndex()!=-1)
                    sem1[1]=(String)cmb_sub221.getSelectedItem();
                if(cmb_sub231.getSelectedIndex()!=-1)
                    sem1[2]=(String)cmb_sub231.getSelectedItem();
                if(cmb_sub241.getSelectedIndex()!=-1)
                    sem1[3]=(String)cmb_sub241.getSelectedItem();
                
                e.createEnrolment(sem1, sem2, (String)cmb_index1.getSelectedItem(), stuYear);
                if(e.updateEnrolment()==2){
                    JOptionPane.showMessageDialog(this, "Enrolment updated succesffully", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear1();
                }
                else{
                    JOptionPane.showMessageDialog(this, "This student does not have prevoous enrolment results to update", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try{
            String sem1[] = {"","","",""};
            String sem2[] = {"","","",""};
            
            if(cmb_batch.getSelectedIndex()==-1 || cmb_index.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(this, "Please select a student to proceed", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_sub11.getSelectedIndex()==-1 && cmb_sub21.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(this, "Please select at least one subject to proceed", "Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                classes.Enrolment e = new classes.Enrolment();
                
                if(cmb_sub11.getSelectedIndex()!=-1)
                    sem1[0]=(String)cmb_sub11.getSelectedItem();
                if(cmb_sub12.getSelectedIndex()!=-1)
                    sem1[1]=(String)cmb_sub12.getSelectedItem();
                if(cmb_sub13.getSelectedIndex()!=-1)
                    sem1[2]=(String)cmb_sub13.getSelectedItem();
                if(cmb_sub14.getSelectedIndex()!=-1)
                    sem1[3]=(String)cmb_sub14.getSelectedItem();
                
                if(cmb_sub21.getSelectedIndex()!=-1)
                    sem1[0]=(String)cmb_sub21.getSelectedItem();
                if(cmb_sub22.getSelectedIndex()!=-1)
                    sem1[1]=(String)cmb_sub22.getSelectedItem();
                if(cmb_sub23.getSelectedIndex()!=-1)
                    sem1[2]=(String)cmb_sub23.getSelectedItem();
                if(cmb_sub24.getSelectedIndex()!=-1)
                    sem1[3]=(String)cmb_sub24.getSelectedItem();
                
                e.createEnrolment(sem1, sem2, (String)cmb_index.getSelectedItem(), stuYear);
                if(e.updateEnrolment()==2){
                    JOptionPane.showMessageDialog(this, "Enrolment added succesffully", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
                else{
                    JOptionPane.showMessageDialog(this, "This student does not have prevoous enrolment results to update", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void cmb_course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_course1ActionPerformed
        try{
            if(courseBoxReady && cmb_batch1.getSelectedIndex()==-1){
                JOptionPane.showMessageDialog(null, "Please select a batch.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if(courseBoxReady && cmb_course1.getSelectedIndex()!=-1){
                indexComboBoxReady = false;
                cmb_index1.removeAllItems();
                ResultSet rs = p.getStudentIdsFromBatchAndCourse(cmb_batch1.getSelectedItem().toString(), cmb_course1.getSelectedItem().toString());
                while(rs.next())
                    cmb_index1.addItem(rs.getString("SID"));
                cmb_index1.setSelectedIndex(-1);
                indexComboBoxReady = true;
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
                indexComboBoxReady = false;
                cmb_index.removeAllItems();
                ResultSet rs = u.getStudentIdsFromBatchAndCourse(cmb_batch.getSelectedItem().toString(), cmb_course.getSelectedItem().toString());
                while(rs.next())
                    cmb_index.addItem(rs.getString("SID"));
                cmb_index.setSelectedIndex(-1);
                indexComboBoxReady = true;
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmb_courseActionPerformed
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enrollment("ABC", "ABC").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add1;
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_update1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmb_batch;
    private javax.swing.JComboBox cmb_batch1;
    private javax.swing.JComboBox cmb_course;
    private javax.swing.JComboBox cmb_course1;
    private javax.swing.JComboBox cmb_index;
    private javax.swing.JComboBox cmb_index1;
    private javax.swing.JComboBox cmb_sub11;
    private javax.swing.JComboBox cmb_sub111;
    private javax.swing.JComboBox cmb_sub12;
    private javax.swing.JComboBox cmb_sub121;
    private javax.swing.JComboBox cmb_sub13;
    private javax.swing.JComboBox cmb_sub131;
    private javax.swing.JComboBox cmb_sub14;
    private javax.swing.JComboBox cmb_sub141;
    private javax.swing.JComboBox cmb_sub21;
    private javax.swing.JComboBox cmb_sub211;
    private javax.swing.JComboBox cmb_sub22;
    private javax.swing.JComboBox cmb_sub221;
    private javax.swing.JComboBox cmb_sub23;
    private javax.swing.JComboBox cmb_sub231;
    private javax.swing.JComboBox cmb_sub24;
    private javax.swing.JComboBox cmb_sub241;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txt_fName;
    private javax.swing.JTextField txt_fName1;
    private javax.swing.JTextField txt_lName;
    private javax.swing.JTextField txt_lName1;
    // End of variables declaration//GEN-END:variables
}
