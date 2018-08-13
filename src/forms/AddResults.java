package forms;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import email.SendMailUsingAuthentication;
import javax.mail.MessagingException;

public class AddResults extends javax.swing.JFrame {
    private String formType, userType;
    private classes.Performance p = new classes.Performance();
    private classes.Postgraduate pg = new classes.Postgraduate();
    private classes.Undergraduate ug = new classes.Undergraduate();
    private classes.Subject sub = new classes.Subject();
    
    private boolean batchComboBoxReady = false;
    private boolean subComboBoxReady = false;
    private boolean assComboBoxReady = false;
    private boolean courseBoxReady = false;
    
    public AddResults(String form, String user) {
        initComponents();
        formType=form;
        userType = user;
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
        pnl1 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        rbt_exam1 = new javax.swing.JRadioButton();
        rbt_ass1 = new javax.swing.JRadioButton();
        cmb_assNo1 = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        cmb_sub1 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cmb_batch1 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        cmb_batch2 = new javax.swing.JComboBox();
        btn_save1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        cmb_course1 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        rbt_examba = new javax.swing.JLabel();
        rbt_exam = new javax.swing.JRadioButton();
        rbt_ass = new javax.swing.JRadioButton();
        cmb_assNo = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmb_sub = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        cmb_batch = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        cmb_batch6 = new javax.swing.JComboBox();
        btn_save = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        cmb_course = new javax.swing.JComboBox();

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
        jLabel6.setText("Add Results");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 10, 580, 80);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(null);

        pnl1.setBackground(new java.awt.Color(234, 255, 255));
        pnl1.setLayout(null);

        jPanel19.setBackground(new java.awt.Color(237, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assignment/Exam Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel19.setForeground(new java.awt.Color(0, 0, 0));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Assignment : ");
        jPanel19.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 30));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Examination : ");
        jPanel19.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 30));

        rbt_exam1.setBackground(new java.awt.Color(234, 255, 255));
        buttonGroup1.add(rbt_exam1);
        rbt_exam1.setForeground(new java.awt.Color(0, 0, 0));
        rbt_exam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_exam1ActionPerformed(evt);
            }
        });
        jPanel19.add(rbt_exam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 96, -1, -1));

        rbt_ass1.setBackground(new java.awt.Color(234, 255, 255));
        buttonGroup1.add(rbt_ass1);
        rbt_ass1.setForeground(new java.awt.Color(0, 0, 0));
        rbt_ass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_ass1ActionPerformed(evt);
            }
        });
        jPanel19.add(rbt_ass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 36, -1, -1));

        cmb_assNo1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_assNo1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_assNo1.setEnabled(false);
        cmb_assNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_assNo1ActionPerformed(evt);
            }
        });
        jPanel19.add(cmb_assNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 230, 40));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Assignment No. :");
        jPanel19.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 130, 30));

        pnl1.add(jPanel19);
        jPanel19.setBounds(20, 280, 760, 150);

        cmb_sub1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub1ActionPerformed(evt);
            }
        });
        pnl1.add(cmb_sub1);
        cmb_sub1.setBounds(110, 160, 230, 40);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Subject :");
        pnl1.add(jLabel17);
        jLabel17.setBounds(30, 160, 110, 30);

        cmb_batch1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch1.setForeground(new java.awt.Color(0, 0, 0));
        pnl1.add(cmb_batch1);
        cmb_batch1.setBounds(110, 50, 230, 40);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Batch :");
        pnl1.add(jLabel26);
        jLabel26.setBounds(30, 50, 60, 30);

        cmb_batch2.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch2.setForeground(new java.awt.Color(0, 0, 0));
        pnl1.add(cmb_batch2);
        cmb_batch2.setBounds(110, 50, 230, 40);

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
        pnl1.add(btn_save1);
        btn_save1.setBounds(340, 650, 110, 50);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Add marks in the marks column of the table. Changes you make in other columns will not be saved.");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl1.add(jLabel28);
        jLabel28.setBounds(20, 460, 760, 30);

        cmb_course1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_course1ActionPerformed(evt);
            }
        });
        pnl1.add(cmb_course1);
        cmb_course1.setBounds(540, 50, 230, 40);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Course :");
        pnl1.add(jLabel19);
        jLabel19.setBounds(450, 50, 110, 30);

        jPanel6.add(pnl1);
        pnl1.setBounds(20, 13, 800, 720);

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
        jScrollPane2.setViewportView(jTable);

        jPanel13.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 800, 720);

        jPanel10.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 13, 800, 720));

        jPanel12.setBackground(new java.awt.Color(234, 255, 255));
        jPanel12.setLayout(null);

        jPanel20.setBackground(new java.awt.Color(237, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assignment/Exam Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel20.setForeground(new java.awt.Color(0, 0, 0));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Assignment : ");
        jPanel20.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 30));

        rbt_examba.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbt_examba.setForeground(new java.awt.Color(0, 0, 0));
        rbt_examba.setText("Examination : ");
        jPanel20.add(rbt_examba, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 30));

        rbt_exam.setBackground(new java.awt.Color(234, 255, 255));
        buttonGroup2.add(rbt_exam);
        rbt_exam.setForeground(new java.awt.Color(0, 0, 0));
        rbt_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_examActionPerformed(evt);
            }
        });
        jPanel20.add(rbt_exam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 96, -1, -1));

        rbt_ass.setBackground(new java.awt.Color(234, 255, 255));
        buttonGroup2.add(rbt_ass);
        rbt_ass.setForeground(new java.awt.Color(0, 0, 0));
        rbt_ass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_assActionPerformed(evt);
            }
        });
        jPanel20.add(rbt_ass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 36, -1, -1));

        cmb_assNo.setBackground(new java.awt.Color(255, 255, 255));
        cmb_assNo.setForeground(new java.awt.Color(0, 0, 0));
        cmb_assNo.setEnabled(false);
        cmb_assNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_assNoActionPerformed(evt);
            }
        });
        jPanel20.add(cmb_assNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 230, 40));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Assignment No. :");
        jPanel20.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 130, 30));

        jPanel12.add(jPanel20);
        jPanel20.setBounds(20, 280, 760, 150);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Subject :");
        jPanel12.add(jLabel27);
        jLabel27.setBounds(30, 160, 100, 30);

        cmb_sub.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_subActionPerformed(evt);
            }
        });
        jPanel12.add(cmb_sub);
        cmb_sub.setBounds(110, 160, 230, 40);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Course :");
        jPanel12.add(jLabel18);
        jLabel18.setBounds(450, 50, 110, 30);

        cmb_batch.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(cmb_batch);
        cmb_batch.setBounds(110, 50, 230, 40);

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Batch :");
        jPanel12.add(jLabel30);
        jLabel30.setBounds(30, 50, 60, 30);

        cmb_batch6.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(cmb_batch6);
        cmb_batch6.setBounds(110, 50, 230, 40);

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
        jPanel12.add(btn_save);
        btn_save.setBounds(340, 650, 110, 50);

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Add marks in the marks column of the table. Changes you make in other columns will not be saved.");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jLabel32);
        jLabel32.setBounds(20, 460, 760, 30);

        cmb_course.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_courseActionPerformed(evt);
            }
        });
        jPanel12.add(cmb_course);
        cmb_course.setBounds(540, 50, 230, 40);

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 800, 720));

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

    private void clear(){
        batchComboBoxReady = false;
        subComboBoxReady = false;
        assComboBoxReady = false;
    
        cmb_sub.setSelectedIndex(-1);
        cmb_course.setSelectedIndex(-1);
        cmb_batch.setSelectedIndex(-1);
        cmb_assNo.setSelectedIndex(-1);
        rbt_ass.setSelected(false);
        rbt_exam.setSelected(false);
        jTable.setModel(new DefaultTableModel());
        
        batchComboBoxReady = true;
    }
    
    private void clear1(){
        batchComboBoxReady = false;
        subComboBoxReady = false;
        assComboBoxReady = false;
        
        cmb_sub1.setSelectedIndex(-1);
        cmb_course1.setSelectedIndex(-1);
        cmb_batch1.setSelectedIndex(-1);
        cmb_assNo1.setSelectedIndex(-1);
        rbt_ass1.setSelected(false);
        rbt_exam1.setSelected(false);
        jTable1.setModel(new DefaultTableModel());
        
        batchComboBoxReady = true;
    }
    
    private boolean validation(){
        try{
            boolean correct = true;
            if(cmb_batch.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a batch.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_sub.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a subject.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(!rbt_ass.isSelected() & !rbt_exam.isSelected()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a type", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(rbt_ass.isSelected() && cmb_assNo.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select an assignment.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }

            int cutOff=0;            
            if(cmb_assNo.getSelectedIndex()!=-1 && rbt_ass.isSelected())
                cutOff=new classes.Assignment().getAllocatedMarkForAssignment(cmb_assNo.getSelectedItem().toString());
            else if(rbt_exam.isSelected())
                cutOff=new classes.Subject().getAllocatedMarkForSubject(cmb_sub.getSelectedItem().toString(), cmb_batch.getSelectedItem().toString());
            
            for(int i=0; i<jTable.getRowCount(); i++){
                if(!jTable.getValueAt(i,3).toString().matches("[0-9]+")){
                    correct=false;
                    JOptionPane.showMessageDialog(null, "Please enter a valid mark. \nError occured in row "+(i+1), "Input Error", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                
                else if(Integer.parseInt(jTable.getValueAt(i,3).toString())>cutOff){
                    correct=false;
                    JOptionPane.showMessageDialog(null, "Assigned maximum value for this is "+cutOff+"\nError occured in row "+(i+1), "Invalid Mark", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }

            return correct;
        }
        catch(Exception e){
            return false;
        }
    }
    
    private boolean validation1(){
        try{
            boolean correct = true;
            if(cmb_batch1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a batch.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_sub1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a subject.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(!rbt_ass1.isSelected() & !rbt_exam1.isSelected()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a type", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(rbt_ass1.isSelected() && cmb_assNo1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select an assignment.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }

            int cutOff=0;            
            if(cmb_assNo1.getSelectedIndex()!=-1 && rbt_ass1.isSelected())
                cutOff=new classes.Assignment().getAllocatedMarkForAssignment(cmb_assNo1.getSelectedItem().toString());
            else if(rbt_exam1.isSelected())
                cutOff=new classes.Subject().getAllocatedMarkForSubject(cmb_sub1.getSelectedItem().toString(), cmb_batch1.getSelectedItem().toString());
            
            for(int i=0; i<jTable1.getRowCount(); i++){
                if(!jTable1.getValueAt(i,3).toString().matches("[0-9]+")){
                    correct=false;
                    JOptionPane.showMessageDialog(null, "Please enter a valid mark. \nError occured in row "+(i+1), "Input Error", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                
                else if(Integer.parseInt(jTable1.getValueAt(i,3).toString())>cutOff){
                    correct=false;
                    JOptionPane.showMessageDialog(null, "Assigned maximum value for this is "+cutOff+"\nError occured in row "+(i+1), "Invalid Mark", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }

            return correct;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.hide();
        new SubMenu(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save1ActionPerformed
        validation1();
        try{
            if(validation1()){
                String sub_assId="";
                
                String emailMsgTxt = "";
                String emailSubjectTxt = "";
                String emailFromAddress = SendMailUsingAuthentication.SMTP_AUTH_USER;
                String emailToAddress = "nimesha1996@gmail.com";
                
                if(rbt_ass1.isSelected()){
                    sub_assId=cmb_assNo1.getSelectedItem().toString();
                    emailMsgTxt = "'s result for the assignment "+sub_assId+" of the subject "+cmb_sub1.getSelectedItem().toString()+ "is ";
                    emailSubjectTxt = sub_assId+" Results";
                    
                    for(int i=0; i<jTable1.getRowCount(); i++){
                        emailMsgTxt=jTable1.getValueAt(i,2).toString()+emailMsgTxt+jTable1.getValueAt(i,3).toString();
                        //emailToAddress = jTable1.getValueAt(i,0).toString()+"@nsbm.lk";
                        
                        SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
                        smtpMailSender.postMail(emailToAddress, emailSubjectTxt, emailMsgTxt, emailFromAddress);

                        p.addAssignmentMarks(sub_assId, jTable1.getValueAt(i,2).toString(), jTable1.getValueAt(i,3).toString());
                        
                        emailMsgTxt = "'s result for the assignment "+sub_assId+" of the subject "+cmb_sub1.getSelectedItem().toString()+ "is ";
                        emailSubjectTxt = sub_assId+" Results";
                    }
                }
                else if(rbt_exam1.isSelected()){
                    sub_assId=cmb_sub1.getSelectedItem().toString();
                    emailMsgTxt = "'s result of the subject "+sub_assId+ " = ";
                    emailSubjectTxt = sub_assId+" Results";
                    //emailToAddress = jTable1.getValueAt(i,0).toString()+"@nsbm.lk";
                    
                    for(int i=0; i<jTable1.getRowCount(); i++){
                        char result=p.addExamMarks(sub_assId, jTable1.getValueAt(i,2).toString(), jTable1.getValueAt(i,3).toString());
                        
                        emailMsgTxt=jTable1.getValueAt(i,2).toString()+emailMsgTxt+result;
                        emailMsgTxt+=". Your new GPA = "+pg.getGpa(jTable1.getValueAt(i,2).toString());
                        emailMsgTxt+=". Your new Number of Credits = "+pg.getCredits(jTable1.getValueAt(i,2).toString());
                        SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
                        smtpMailSender.postMail(emailToAddress, emailSubjectTxt, emailMsgTxt, emailFromAddress);
                        
                        emailMsgTxt = "'s result of the subject "+sub_assId+ " = ";
                        emailSubjectTxt = sub_assId+" Results";
                    }
                }
                 
                
                JOptionPane.showMessageDialog(null, "Results saved and emails sent successfully.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                clear1();
            }
        }
        
        catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Emails could not be sent. Please check your internet connection", "ERROR", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_save1ActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try{
            if(validation()){
                String sub_assId="";
                
                String emailMsgTxt = "";
                String emailSubjectTxt = "";
                String emailFromAddress = SendMailUsingAuthentication.SMTP_AUTH_USER;
                String emailToAddress = "nimesha1996@gmail.com";
                
                if(rbt_ass.isSelected()){
                    sub_assId=cmb_assNo.getSelectedItem().toString();
                    emailMsgTxt = "'s result for the assignment "+sub_assId+" of the subject "+cmb_sub.getSelectedItem().toString()+ "is ";
                    emailSubjectTxt = sub_assId+" Results";
                    
                    for(int i=0; i<jTable.getRowCount(); i++){
                        emailMsgTxt=jTable.getValueAt(i,2).toString()+emailMsgTxt+jTable.getValueAt(i,3).toString();
                        //emailToAddress = jTable.getValueAt(i,0).toString()+"@nsbm.lk";
                        
                        SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
                        smtpMailSender.postMail(emailToAddress, emailSubjectTxt, emailMsgTxt, emailFromAddress);

                        p.addAssignmentMarks(sub_assId, jTable.getValueAt(i,2).toString(), jTable.getValueAt(i,3).toString());
                        
                        emailMsgTxt = "'s result for the assignment "+sub_assId+" of the subject "+cmb_sub.getSelectedItem().toString()+ "is ";
                        emailSubjectTxt = sub_assId+" Results";
                    } 
                }
                else if(rbt_exam.isSelected()){
                    sub_assId=cmb_sub.getSelectedItem().toString();
                    emailMsgTxt = "'s result of the subject "+sub_assId+ " = ";
                    emailSubjectTxt = sub_assId+" Results";
                    
                    for(int i=0; i<jTable.getRowCount(); i++){
                        char result=p.addExamMarks(sub_assId, jTable.getValueAt(i,2).toString(), jTable.getValueAt(i,3).toString());
                        //emailToAddress = jTable.getValueAt(i,0).toString()+"@nsbm.lk";
                        
                        emailMsgTxt=jTable.getValueAt(i,2).toString()+emailMsgTxt+result;
                        emailMsgTxt+=". Your new GPA = "+ug.getGpa(jTable.getValueAt(i,2).toString());
                        emailMsgTxt+=". Your new Number of Credits = "+ug.getCredits(jTable.getValueAt(i,2).toString());
                        SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
                        smtpMailSender.postMail(emailToAddress, emailSubjectTxt, emailMsgTxt, emailFromAddress);
                        
                        emailMsgTxt = "'s result of the subject "+sub_assId+ " = ";
                        emailSubjectTxt = sub_assId+" Results";
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Results saved and emails sent successfully.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                clear();
            }
        }
        
        catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Emails could not be sent. Please check your internet connection", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void rbt_ass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_ass1ActionPerformed
        cmb_assNo1.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_rbt_ass1ActionPerformed

    private void rbt_assActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_assActionPerformed
        cmb_assNo.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_rbt_assActionPerformed

    private void rbt_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_examActionPerformed
        cmb_assNo.setEnabled(false);
        
        if(cmb_batch.getSelectedIndex()==-1 && cmb_sub.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(null, "Please select a batch and a subject", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
        
        else if(!p.isMarkingCompleted(cmb_sub.getSelectedItem().toString(), cmb_batch.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Please add assignment marks firts", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            rbt_ass.doClick();
        }
        
        else
            jTable.setModel( ug.viewStudentsByBatchAndAss_Sub(cmb_batch.getSelectedItem().toString(), cmb_sub.getSelectedItem().toString()) );
    }//GEN-LAST:event_rbt_examActionPerformed

    private void rbt_exam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_exam1ActionPerformed
        cmb_assNo1.setEnabled(false);
        if(cmb_batch1.getSelectedIndex()==-1 && cmb_sub1.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(null, "Please select a batch and a subject", "INPUT ERROR", JOptionPane.INFORMATION_MESSAGE);
        
        else if(!p.isMarkingCompleted(cmb_sub1.getSelectedItem().toString(), cmb_batch1.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Please add assignment marks firts", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            rbt_ass1.doClick();
        }
        
        else
            
            jTable1.setModel( pg.viewStudentsByBatchAndAss_Sub(cmb_batch1.getSelectedItem().toString(), cmb_sub1.getSelectedItem().toString()) );
    }//GEN-LAST:event_rbt_exam1ActionPerformed

    private void cmb_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub1ActionPerformed
        try {
            if(subComboBoxReady){
                assComboBoxReady = false;
                cmb_assNo1.removeAllItems();
                if(rbt_exam1.isSelected())
                    jTable1.setModel( pg.viewStudentsByBatchAndAss_Sub(cmb_batch1.getSelectedItem().toString(), cmb_sub1.getSelectedItem().toString()) );

                classes.Assignment a = new classes.Assignment();
                ResultSet rs = a.getAssignmentIDs(cmb_batch1.getSelectedItem().toString(), cmb_sub1.getSelectedItem().toString());

                while(rs.next()){
                    cmb_assNo1.addItem(rs.getString("ASSID"));
                }
                cmb_assNo1.setSelectedIndex(-1);
                assComboBoxReady=true;
                rbt_exam1.doClick();
            } 
        }
            
        catch (SQLException ex) {
            Logger.getLogger(AddResults.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (Exception e) {
            Logger.getLogger(AddResults.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_cmb_sub1ActionPerformed

    private void cmb_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_subActionPerformed
        try {
            if(subComboBoxReady){
                assComboBoxReady = false;
                cmb_assNo.removeAllItems();
                if(rbt_exam.isSelected())
                    jTable.setModel( ug.viewStudentsByBatchAndAss_Sub(cmb_batch.getSelectedItem().toString(), cmb_sub.getSelectedItem().toString()) );

                classes.Assignment a = new classes.Assignment();
                ResultSet rs = a.getAssignmentIDs(cmb_batch.getSelectedItem().toString(), cmb_sub.getSelectedItem().toString());

                while(rs.next()){
                    cmb_assNo.addItem(rs.getString("ASSID"));
                }
                cmb_assNo.setSelectedIndex(-1);
                assComboBoxReady=true;
                rbt_exam.doClick();
            } 
        }
            
        catch (SQLException ex) {
            Logger.getLogger(AddResults.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (Exception e) {
            Logger.getLogger(AddResults.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_cmb_subActionPerformed

    private void cmb_assNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_assNoActionPerformed
        try {
            if(assComboBoxReady){
                jTable.setModel( ug.viewStudentsByBatchAndAss_Sub(cmb_batch.getSelectedItem().toString(), cmb_assNo.getSelectedItem().toString()) );
            } 
        }
        
        catch (Exception e) {
            Logger.getLogger(AddResults.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_cmb_assNoActionPerformed

    private void cmb_assNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_assNo1ActionPerformed
        try {
            if(assComboBoxReady){
                jTable1.setModel( pg.viewStudentsByBatchAndAss_Sub(cmb_batch1.getSelectedItem().toString(), cmb_assNo1.getSelectedItem().toString()) );
            } 
        }
        
        catch (Exception e) {
            Logger.getLogger(AddResults.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_cmb_assNo1ActionPerformed

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
        catch(Exception e){}
    }//GEN-LAST:event_cmb_course1ActionPerformed

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
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddResults("ABC", "ABC").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_save1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cmb_assNo;
    private javax.swing.JComboBox cmb_assNo1;
    private javax.swing.JComboBox cmb_batch;
    private javax.swing.JComboBox cmb_batch1;
    private javax.swing.JComboBox cmb_batch2;
    private javax.swing.JComboBox cmb_batch6;
    private javax.swing.JComboBox cmb_course;
    private javax.swing.JComboBox cmb_course1;
    private javax.swing.JComboBox cmb_sub;
    private javax.swing.JComboBox cmb_sub1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnl1;
    private javax.swing.JRadioButton rbt_ass;
    private javax.swing.JRadioButton rbt_ass1;
    private javax.swing.JRadioButton rbt_exam;
    private javax.swing.JRadioButton rbt_exam1;
    private javax.swing.JLabel rbt_examba;
    // End of variables declaration//GEN-END:variables
}
