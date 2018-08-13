package forms;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Paymetns extends javax.swing.JFrame {
    private String formType, userType;
    private String sid;
    private int semester, year;
    
    private boolean indexComboBoxReady=false;
    private boolean batchComboBoxReady=false;
    private boolean courseBoxReady = false;
    
    private classes.Postgraduate p = new classes.Postgraduate();
    private classes.Undergraduate u = new classes.Undergraduate();
    private classes.Enrolment e = new classes.Enrolment();
    
    public Paymetns(String form, String user) {
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
        btn_pay1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_fName1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_lName1 = new javax.swing.JTextField();
        cmb_index1 = new javax.swing.JComboBox();
        cmb_batch1 = new javax.swing.JComboBox();
        jPanel19 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lab_sub11 = new javax.swing.JLabel();
        lab_sub21 = new javax.swing.JLabel();
        lab_sub31 = new javax.swing.JLabel();
        lab_sub41 = new javax.swing.JLabel();
        lab_amnt11 = new javax.swing.JLabel();
        lab_amnt21 = new javax.swing.JLabel();
        lab_amnt31 = new javax.swing.JLabel();
        lab_amnt41 = new javax.swing.JLabel();
        lab_totalSentence1 = new javax.swing.JLabel();
        lab_total1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cmb_course1 = new javax.swing.JComboBox();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        btn_pay = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txt_fName = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_lName = new javax.swing.JTextField();
        cmb_index = new javax.swing.JComboBox();
        cmb_batch = new javax.swing.JComboBox();
        jPanel20 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lab_sub1 = new javax.swing.JLabel();
        lab_sub2 = new javax.swing.JLabel();
        lab_sub3 = new javax.swing.JLabel();
        lab_sub4 = new javax.swing.JLabel();
        lab_amnt1 = new javax.swing.JLabel();
        lab_amnt2 = new javax.swing.JLabel();
        lab_amnt3 = new javax.swing.JLabel();
        lab_amnt4 = new javax.swing.JLabel();
        lab_totalSentence = new javax.swing.JLabel();
        lab_total = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cmb_course = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();

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
        jLabel6.setText("Payment Management");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 10, 580, 80);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(234, 255, 255));
        jPanel8.setLayout(null);

        btn_pay1.setBackground(new java.awt.Color(255, 255, 255));
        btn_pay1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_pay1.setForeground(new java.awt.Color(0, 0, 0));
        btn_pay1.setText("PAY");
        btn_pay1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_pay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay1ActionPerformed(evt);
            }
        });
        jPanel8.add(btn_pay1);
        btn_pay1.setBounds(346, 650, 110, 50);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Batch :");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(25, 30, 60, 30);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Index No. :");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(560, 30, 110, 30);

        jPanel14.setBackground(new java.awt.Color(237, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Detials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("First Name : ");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        txt_fName1.setForeground(new java.awt.Color(102, 102, 102));
        txt_fName1.setCaretColor(new java.awt.Color(102, 102, 102));
        txt_fName1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txt_fName1.setEnabled(false);
        jPanel14.add(txt_fName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 260, 40));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Last Name : ");
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 110, 30));

        txt_lName1.setForeground(new java.awt.Color(102, 102, 102));
        txt_lName1.setCaretColor(new java.awt.Color(102, 102, 102));
        txt_lName1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txt_lName1.setEnabled(false);
        jPanel14.add(txt_lName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 260, 40));

        jPanel8.add(jPanel14);
        jPanel14.setBounds(20, 90, 760, 80);

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
        jPanel8.add(cmb_batch1);
        cmb_batch1.setBounds(110, 30, 120, 40);

        jPanel19.setBackground(new java.awt.Color(237, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Subject 3 :");
        jPanel19.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 90, 30));

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Subject 1 :");
        jPanel19.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 30));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Subject 2 :");
        jPanel19.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 90, 30));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Subject 4 :");
        jPanel19.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 90, 30));

        lab_sub11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_sub11.setForeground(new java.awt.Color(0, 0, 0));
        lab_sub11.setText("Subject 1");
        lab_sub11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel19.add(lab_sub11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 240, 30));

        lab_sub21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_sub21.setForeground(new java.awt.Color(0, 0, 0));
        lab_sub21.setText("Subject 2 ");
        lab_sub21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel19.add(lab_sub21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 240, 30));

        lab_sub31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_sub31.setForeground(new java.awt.Color(0, 0, 0));
        lab_sub31.setText("Subject 3 ");
        lab_sub31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel19.add(lab_sub31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 240, 30));

        lab_sub41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_sub41.setForeground(new java.awt.Color(0, 0, 0));
        lab_sub41.setText("Subject 4 ");
        lab_sub41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel19.add(lab_sub41, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 240, 30));

        lab_amnt11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_amnt11.setForeground(new java.awt.Color(0, 0, 0));
        lab_amnt11.setText("Amount 1 ");
        lab_amnt11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel19.add(lab_amnt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 100, 30));

        lab_amnt21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_amnt21.setForeground(new java.awt.Color(0, 0, 0));
        lab_amnt21.setText("Amount 2 ");
        lab_amnt21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel19.add(lab_amnt21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 100, 30));

        lab_amnt31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_amnt31.setForeground(new java.awt.Color(0, 0, 0));
        lab_amnt31.setText("Amount 3 ");
        lab_amnt31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel19.add(lab_amnt31, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 100, 30));

        lab_amnt41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_amnt41.setForeground(new java.awt.Color(0, 0, 0));
        lab_amnt41.setText("Amount 4 ");
        lab_amnt41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel19.add(lab_amnt41, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 100, 30));

        lab_totalSentence1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_totalSentence1.setForeground(new java.awt.Color(0, 0, 0));
        lab_totalSentence1.setText("Total Amount for the semeseter 1");
        jPanel19.add(lab_totalSentence1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 240, 30));

        lab_total1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_total1.setForeground(new java.awt.Color(0, 0, 0));
        lab_total1.setText("000");
        lab_total1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel19.add(lab_total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 100, 30));

        jPanel8.add(jPanel19);
        jPanel19.setBounds(20, 190, 760, 430);

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
        cmb_course1.setBounds(380, 30, 120, 40);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(20, 13, 800, 720);

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
        jTable1.setEnabled(false);
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        jTabbedPane1.addTab("     Postgraduate Students     ", jPanel2);

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(234, 255, 255));
        jPanel13.setLayout(null);

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
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        jPanel13.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 800, 720);

        jPanel10.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 13, 800, 720));

        jPanel15.setBackground(new java.awt.Color(234, 255, 255));
        jPanel15.setLayout(null);

        btn_pay.setBackground(new java.awt.Color(255, 255, 255));
        btn_pay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_pay.setForeground(new java.awt.Color(0, 0, 0));
        btn_pay.setText("PAY");
        btn_pay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        jPanel15.add(btn_pay);
        btn_pay.setBounds(346, 650, 110, 50);

        jPanel16.setBackground(new java.awt.Color(237, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("First Name : ");
        jPanel16.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        txt_fName.setForeground(new java.awt.Color(102, 102, 102));
        txt_fName.setCaretColor(new java.awt.Color(102, 102, 102));
        txt_fName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txt_fName.setEnabled(false);
        jPanel16.add(txt_fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 260, 40));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Last Name : ");
        jPanel16.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 110, 30));

        txt_lName.setForeground(new java.awt.Color(102, 102, 102));
        txt_lName.setCaretColor(new java.awt.Color(102, 102, 102));
        txt_lName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txt_lName.setEnabled(false);
        jPanel16.add(txt_lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 260, 40));

        jPanel15.add(jPanel16);
        jPanel16.setBounds(20, 90, 760, 80);

        cmb_index.setBackground(new java.awt.Color(255, 255, 255));
        cmb_index.setForeground(new java.awt.Color(0, 0, 0));
        cmb_index.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_indexActionPerformed(evt);
            }
        });
        jPanel15.add(cmb_index);
        cmb_index.setBounds(655, 30, 120, 40);

        cmb_batch.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.add(cmb_batch);
        cmb_batch.setBounds(110, 30, 120, 40);

        jPanel20.setBackground(new java.awt.Color(237, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Subject 3 :");
        jPanel20.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 90, 30));

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Subject 1 :");
        jPanel20.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 30));

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Subject 2 :");
        jPanel20.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 90, 30));

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Subject 4 :");
        jPanel20.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 90, 30));

        lab_sub1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_sub1.setForeground(new java.awt.Color(0, 0, 0));
        lab_sub1.setText("Subject 1");
        lab_sub1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel20.add(lab_sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 240, 30));

        lab_sub2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_sub2.setForeground(new java.awt.Color(0, 0, 0));
        lab_sub2.setText("Subject 2 ");
        lab_sub2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel20.add(lab_sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 240, 30));

        lab_sub3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_sub3.setForeground(new java.awt.Color(0, 0, 0));
        lab_sub3.setText("Subject 3 ");
        lab_sub3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel20.add(lab_sub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 240, 30));

        lab_sub4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_sub4.setForeground(new java.awt.Color(0, 0, 0));
        lab_sub4.setText("Subject 4 ");
        lab_sub4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel20.add(lab_sub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 240, 30));

        lab_amnt1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_amnt1.setForeground(new java.awt.Color(0, 0, 0));
        lab_amnt1.setText("Amount 1 ");
        lab_amnt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel20.add(lab_amnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 100, 30));

        lab_amnt2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_amnt2.setForeground(new java.awt.Color(0, 0, 0));
        lab_amnt2.setText("Amount 2 ");
        lab_amnt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel20.add(lab_amnt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 100, 30));

        lab_amnt3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_amnt3.setForeground(new java.awt.Color(0, 0, 0));
        lab_amnt3.setText("Amount 3 ");
        lab_amnt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel20.add(lab_amnt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 100, 30));

        lab_amnt4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_amnt4.setForeground(new java.awt.Color(0, 0, 0));
        lab_amnt4.setText("Amount 4 ");
        lab_amnt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel20.add(lab_amnt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 100, 30));

        lab_totalSentence.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_totalSentence.setForeground(new java.awt.Color(0, 0, 0));
        lab_totalSentence.setText("Total Amount for the semeseter 1");
        jPanel20.add(lab_totalSentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 240, 30));

        lab_total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab_total.setForeground(new java.awt.Color(0, 0, 0));
        lab_total.setText("000");
        lab_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel20.add(lab_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 100, 30));

        jPanel15.add(jPanel20);
        jPanel20.setBounds(20, 190, 760, 430);

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Batch :");
        jPanel15.add(jLabel25);
        jLabel25.setBounds(25, 30, 60, 30);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Course :");
        jPanel15.add(jLabel26);
        jLabel26.setBounds(290, 30, 110, 30);

        cmb_course.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_courseActionPerformed(evt);
            }
        });
        jPanel15.add(cmb_course);
        cmb_course.setBounds(380, 30, 120, 40);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Index No. :");
        jPanel15.add(jLabel27);
        jLabel27.setBounds(560, 30, 110, 30);

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

    private void clear(){
        indexComboBoxReady=false;
        batchComboBoxReady=false;
        
        lab_sub1.setText("Subject 1");
        lab_sub2.setText("Subject 2");
        lab_sub3.setText("Subject 3");
        lab_sub4.setText("Subject 4");
        
        lab_amnt1.setText("Amount 1");
        lab_amnt2.setText("Amount 2");
        lab_amnt3.setText("Amount 3");
        lab_amnt4.setText("Amount 4");
        
        lab_total.setText("000");
        indexComboBoxReady=true;
        batchComboBoxReady=true;
    }
    
    private void clear1(){
        indexComboBoxReady=false;
        batchComboBoxReady=false;
        
        lab_sub11.setText("Subject 1");
        lab_sub21.setText("Subject 2");
        lab_sub31.setText("Subject 3");
        lab_sub41.setText("Subject 4");
        
        lab_amnt11.setText("Amount 1");
        lab_amnt21.setText("Amount 2");
        lab_amnt31.setText("Amount 3");
        lab_amnt41.setText("Amount 4");
        
        lab_total1.setText("000");
        indexComboBoxReady=true;
        batchComboBoxReady=true;
    }
    
    private void cmb_index1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_index1ActionPerformed
        try {
            clear1();
            btn_pay1.setEnabled(true);
            txt_fName1.setText("");
            txt_lName1.setText("");
            
            if(indexComboBoxReady){
                ResultSet rs = p.viewStudent((String)cmb_index1.getSelectedItem());
            
                if(rs.next()){
                    txt_fName1.setText(rs.getString("FNAME"));
                    txt_lName1.setText(rs.getString("LNAME"));
                }
                
                classes.Enrolment e = new classes.Enrolment();
                DefaultTableModel model = e.viewEnrolmentTable((String)cmb_index1.getSelectedItem());
                
                jTable1.setModel(model);
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
            clear();
            btn_pay.setEnabled(true);
            txt_fName.setText("");
            txt_lName.setText("");
            
            if(indexComboBoxReady){
                ResultSet rs = u.viewStudent((String)cmb_index.getSelectedItem());
            
                if(rs.next()){
                    txt_fName.setText(rs.getString("FNAME"));
                    txt_lName.setText(rs.getString("LNAME"));
                }
                
                DefaultTableModel model = e.viewEnrolmentTable((String)cmb_index.getSelectedItem());
                
                jTable.setModel(model);
            }
        }
        
        catch (SQLException s) {
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmb_indexActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        try{
            btn_pay.setEnabled(true);
            lab_sub1.setText("Subject 1");
            lab_sub2.setText("Subject 2");
            lab_sub3.setText("Subject 3");
            lab_sub4.setText("Subject 4");
            lab_amnt1.setText("");
            lab_amnt2.setText("");
            lab_amnt3.setText("");
            lab_amnt4.setText("");
            double tot=0;
            
            int row=jTable.rowAtPoint(evt.getPoint());
            sid=jTable.getValueAt(row,0).toString();
            String paid=jTable.getValueAt(row,3).toString();
            semester=Integer.parseInt(jTable.getValueAt(row,2).toString());
            year=Integer.parseInt(jTable.getValueAt(row,1).toString());
            
            classes.Subject s=new classes.Subject();
            
            if(paid.equals("YES"))
                btn_pay.setEnabled(false);
            else
                btn_pay.setEnabled(true);
            
            ResultSet rss, rs[] = e.viewEnrolment(sid);
            
            if(rs[semester-1].next()){
                if(rs[semester-1].getInt("YEA")==year){
                    lab_sub1.setText(rs[semester-1].getString("SUBID"));
                    rss = s.viewSubject(rs[semester-1].getString("SUBID"));
                    if(rss.next())
                        lab_amnt1.setText(rss.getString("VALUE"));
                }
            }
            
            if(rs[semester-1].next()){
                if(rs[semester-1].getInt("YEA")==year){
                    lab_sub2.setText(rs[semester-1].getString("SUBID"));
                    rss = s.viewSubject(rs[semester-1].getString("SUBID"));
                    if(rss.next())
                        lab_amnt2.setText(rss.getString("VALUE"));
                }
            }
            
            if(rs[semester-1].next()){
                if(rs[semester-1].getInt("YEA")==year){
                    lab_sub3.setText(rs[semester-1].getString("SUBID"));
                    rss = s.viewSubject(rs[semester-1].getString("SUBID"));
                    if(rss.next())
                        lab_amnt3.setText(rss.getString("VALUE"));
                }
            }
            
            if(rs[semester-1].next()){
                if(rs[semester-1].getInt("YEA")==year){
                    lab_sub4.setText(rs[semester-1].getString("SUBID"));
                    rss = s.viewSubject(rs[semester-1].getString("SUBID"));
                    if(rss.next())
                        lab_amnt4.setText(rss.getString("VALUE"));
                }
            }
                
                if(!lab_amnt1.getText().equals(""))
                    tot+=Double.parseDouble(lab_amnt1.getText());
                if(!lab_amnt2.getText().equals(""))
                    tot+=Double.parseDouble(lab_amnt2.getText());
                if(!lab_amnt3.getText().equals(""))
                    tot+=Double.parseDouble(lab_amnt3.getText());
                if(!lab_amnt4.getText().equals(""))
                    tot+=Double.parseDouble(lab_amnt4.getText());
                
                tot=tot+50000;
                
                lab_total.setText(Double.toString(tot));
        }
        catch(NullPointerException np){
            JOptionPane.showMessageDialog(null, "Please select a record with valid data.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            btn_pay1.setEnabled(true);
            lab_sub11.setText("Subject 1");
            lab_sub21.setText("Subject 2");
            lab_sub31.setText("Subject 3");
            lab_sub41.setText("Subject 4");
            lab_amnt11.setText("");
            lab_amnt21.setText("");
            lab_amnt31.setText("");
            lab_amnt41.setText("");
            double tot=0;
            
            int row=jTable1.rowAtPoint(evt.getPoint());
            sid=jTable1.getValueAt(row,0).toString();
            String paid=jTable1.getValueAt(row,3).toString();
            semester=Integer.parseInt(jTable1.getValueAt(row,2).toString());
            year=Integer.parseInt(jTable1.getValueAt(row,1).toString());
            
            classes.Subject s=new classes.Subject();
            
            if(paid.equals("YES")){
                btn_pay1.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Student has already paid for this semester.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
            else
                btn_pay1.setEnabled(true);
            
            ResultSet rss, rs[] = e.viewEnrolment(sid);
            
            if(rs[semester-1].next()){
                if(rs[semester-1].getInt("YEA")==year){
                    lab_sub11.setText(rs[semester-1].getString("SUBID"));
                    rss = s.viewSubject(rs[semester-1].getString("SUBID"));
                    if(rss.next())
                        lab_amnt11.setText(rss.getString("VALUE"));
                }
            }
            
            if(rs[semester-1].next()){
                if(rs[semester-1].getInt("YEA")==year){
                    lab_sub21.setText(rs[semester-1].getString("SUBID"));
                    rss = s.viewSubject(rs[semester-1].getString("SUBID"));
                    if(rss.next())
                        lab_amnt21.setText(rss.getString("VALUE"));
                }
            }
            
            if(rs[semester-1].next()){
                if(rs[semester-1].getInt("YEA")==year){
                    lab_sub31.setText(rs[semester-1].getString("SUBID"));
                    rss = s.viewSubject(rs[semester-1].getString("SUBID"));
                    if(rss.next())
                        lab_amnt31.setText(rss.getString("VALUE"));
                }
            }
            
            if(rs[semester-1].next()){
                if(rs[semester-1].getInt("YEA")==year){
                    lab_sub41.setText(rs[semester-1].getString("SUBID"));
                    rss = s.viewSubject(rs[semester-1].getString("SUBID"));
                    if(rss.next())
                        lab_amnt41.setText(rss.getString("VALUE"));
                }
            }
                
                if(!lab_amnt11.getText().equals(""))
                    tot+=Double.parseDouble(lab_amnt11.getText());
                if(!lab_amnt21.getText().equals(""))
                    tot+=Double.parseDouble(lab_amnt21.getText());
                if(!lab_amnt31.getText().equals(""))
                    tot+=Double.parseDouble(lab_amnt31.getText());
                if(!lab_amnt41.getText().equals(""))
                    tot+=Double.parseDouble(lab_amnt41.getText());
                
                tot=tot+50000;
                
                lab_total1.setText(Double.toString(tot));;
        }
        catch(NullPointerException np){
            JOptionPane.showMessageDialog(null, "Please select a record with valid data.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        try{
            if(cmb_batch.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a batch", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_course.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a course", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_index.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a student", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(lab_sub1.getText().equals("Subject 1"))
                JOptionPane.showMessageDialog(null, "Please select a semester from the table", "Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                if(e.pay(sid, Integer.toString(year), Integer.toString(semester))==1){
                    JOptionPane.showMessageDialog(null, "Payment recorded successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    cmb_indexActionPerformed(evt);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_payActionPerformed

    private void btn_pay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay1ActionPerformed
        try{
            if(cmb_batch1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a batch", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_course1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a course", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(cmb_index1.getSelectedIndex()==-1)
                JOptionPane.showMessageDialog(null, "Please select a student", "Information", JOptionPane.INFORMATION_MESSAGE);
            else if(lab_sub11.getText().equals("Subject 1"))
                JOptionPane.showMessageDialog(null, "Please select a semester from the table", "Information", JOptionPane.INFORMATION_MESSAGE);
            else{
                if(e.pay(sid, Integer.toString(year), Integer.toString(semester))==1){
                    JOptionPane.showMessageDialog(null, "Payment recorded successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    cmb_index1ActionPerformed(evt);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_pay1ActionPerformed

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
                new Paymetns("ABC", "ABC").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_pay;
    private javax.swing.JButton btn_pay1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmb_batch;
    private javax.swing.JComboBox cmb_batch1;
    private javax.swing.JComboBox cmb_course;
    private javax.swing.JComboBox cmb_course1;
    private javax.swing.JComboBox cmb_index;
    private javax.swing.JComboBox cmb_index1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lab_amnt1;
    private javax.swing.JLabel lab_amnt11;
    private javax.swing.JLabel lab_amnt2;
    private javax.swing.JLabel lab_amnt21;
    private javax.swing.JLabel lab_amnt3;
    private javax.swing.JLabel lab_amnt31;
    private javax.swing.JLabel lab_amnt4;
    private javax.swing.JLabel lab_amnt41;
    private javax.swing.JLabel lab_sub1;
    private javax.swing.JLabel lab_sub11;
    private javax.swing.JLabel lab_sub2;
    private javax.swing.JLabel lab_sub21;
    private javax.swing.JLabel lab_sub3;
    private javax.swing.JLabel lab_sub31;
    private javax.swing.JLabel lab_sub4;
    private javax.swing.JLabel lab_sub41;
    private javax.swing.JLabel lab_total;
    private javax.swing.JLabel lab_total1;
    private javax.swing.JLabel lab_totalSentence;
    private javax.swing.JLabel lab_totalSentence1;
    private javax.swing.JTextField txt_fName;
    private javax.swing.JTextField txt_fName1;
    private javax.swing.JTextField txt_lName;
    private javax.swing.JTextField txt_lName1;
    // End of variables declaration//GEN-END:variables
}
