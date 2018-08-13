package forms;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Schedule extends javax.swing.JFrame {
    private String formType, userType;
    private classes.Schedule s = new classes.Schedule();
    private classes.Postgraduate p = new classes.Postgraduate();
    private classes.Undergraduate u = new classes.Undergraduate();
    private classes.Subject sub = new classes.Subject();
    
    private String batch=null, subject=null;
    
    private boolean courseComboBoxReady = false;
    private boolean toComboBoxReady = false;
    private boolean fromComboBoxReady = false;
    private boolean venueComboBoxReady = false;
    private boolean dayComboBoxReady = false;
    
    private classes.Lecturer lec = new classes.Lecturer();
    
    public Schedule(String form, String user) {
        initComponents();
        formType=form;
        userType=user;
        this.setLocationRelativeTo(null); //to get it to the center of the screen
        
        s.setFaculty(formType);
        
        if(s.viewUGScheduleTable(formType)!=null)
            jTable.setModel(s.viewUGScheduleTable(formType));
        
        if(s.viewPGScheduleTable(formType)!=null)
            jTable1.setModel(s.viewPGScheduleTable(formType));
        
        try{
            ResultSet rs = p.getDistinctBatchesFromFac(formType);
            while(rs.next())
                cmb_batch1.addItem(rs.getString("BATCH"));
            
            rs = u.getDistinctBatchesFromFac(formType);
            while(rs.next())
                cmb_batch.addItem(rs.getString("BATCH"));
        }
        catch(Exception e){}
                
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
        cmb_batch1.setSelectedIndex(-1);
        cmb_batch.setSelectedIndex(-1);
        courseComboBoxReady = true;
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
        btn_delete1 = new javax.swing.JButton();
        cmb_batch1 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cmb_day1 = new javax.swing.JComboBox();
        cmb_to1 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmb_venue1 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cmb_sub1 = new javax.swing.JComboBox();
        cmb_from1 = new javax.swing.JComboBox();
        cmb_course1 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        btn_add1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btn_update = new javax.swing.JPanel();
        cmb_batch = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        cmb_day = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cmb_venue = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cmb_sub = new javax.swing.JComboBox();
        cmb_course = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        cmb_from = new javax.swing.JComboBox();
        cmb_to = new javax.swing.JComboBox();
        btn_delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();

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
        jLabel6.setText("Schedule");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 10, 580, 80);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(null);

        btn_save1.setBackground(new java.awt.Color(234, 255, 255));
        btn_save1.setLayout(null);

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
        btn_save1.add(btn_delete1);
        btn_delete1.setBounds(220, 650, 100, 50);

        cmb_batch1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_batch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_batch1ActionPerformed(evt);
            }
        });
        btn_save1.add(cmb_batch1);
        cmb_batch1.setBounds(140, 30, 230, 40);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Batch :");
        btn_save1.add(jLabel17);
        jLabel17.setBounds(30, 30, 110, 30);

        cmb_day1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_day1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_day1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Saturday", "Sunday" }));
        cmb_day1.setSelectedIndex(-1);
        cmb_day1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_day1ActionPerformed(evt);
            }
        });
        btn_save1.add(cmb_day1);
        cmb_day1.setBounds(140, 300, 230, 40);

        cmb_to1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_to1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_to1ActionPerformed(evt);
            }
        });
        btn_save1.add(cmb_to1);
        cmb_to1.setBounds(140, 480, 230, 40);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Venue :");
        btn_save1.add(jLabel21);
        jLabel21.setBounds(30, 570, 110, 30);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("From :");
        btn_save1.add(jLabel18);
        jLabel18.setBounds(30, 390, 110, 30);

        cmb_venue1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_venue1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_venue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_venue1ActionPerformed(evt);
            }
        });
        btn_save1.add(cmb_venue1);
        cmb_venue1.setBounds(140, 570, 230, 40);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Day :");
        btn_save1.add(jLabel22);
        jLabel22.setBounds(30, 300, 110, 30);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Subject :");
        btn_save1.add(jLabel20);
        jLabel20.setBounds(30, 210, 110, 30);

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("To :");
        btn_save1.add(jLabel23);
        jLabel23.setBounds(30, 480, 110, 30);

        cmb_sub1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub1ActionPerformed(evt);
            }
        });
        btn_save1.add(cmb_sub1);
        cmb_sub1.setBounds(140, 210, 230, 40);

        cmb_from1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_from1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_from1.setSelectedIndex(-1);
        cmb_from1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_from1ActionPerformed(evt);
            }
        });
        btn_save1.add(cmb_from1);
        cmb_from1.setBounds(140, 390, 230, 40);

        cmb_course1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_course1ActionPerformed(evt);
            }
        });
        btn_save1.add(cmb_course1);
        cmb_course1.setBounds(140, 120, 230, 40);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Course :");
        btn_save1.add(jLabel19);
        jLabel19.setBounds(30, 120, 110, 30);

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
        btn_save1.add(btn_add1);
        btn_add1.setBounds(90, 650, 100, 50);

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
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
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);

        jPanel14.add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 1180, 720);

        jPanel7.add(jPanel14);
        jPanel14.setBounds(460, 13, 1180, 720);

        btn_update.setBackground(new java.awt.Color(234, 255, 255));
        btn_update.setLayout(null);

        cmb_batch.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch.setForeground(new java.awt.Color(0, 0, 0));
        cmb_batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_batchActionPerformed(evt);
            }
        });
        btn_update.add(cmb_batch);
        cmb_batch.setBounds(140, 30, 230, 40);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Batch :");
        btn_update.add(jLabel27);
        jLabel27.setBounds(30, 30, 110, 30);

        cmb_day.setBackground(new java.awt.Color(255, 255, 255));
        cmb_day.setForeground(new java.awt.Color(0, 0, 0));
        cmb_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        cmb_day.setSelectedIndex(-1);
        cmb_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_dayActionPerformed(evt);
            }
        });
        btn_update.add(cmb_day);
        cmb_day.setBounds(140, 300, 230, 40);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Venue :");
        btn_update.add(jLabel33);
        jLabel33.setBounds(30, 570, 110, 30);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("From :");
        btn_update.add(jLabel31);
        jLabel31.setBounds(30, 390, 110, 30);

        cmb_venue.setBackground(new java.awt.Color(255, 255, 255));
        cmb_venue.setForeground(new java.awt.Color(0, 0, 0));
        cmb_venue.setSelectedIndex(-1);
        cmb_venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_venueActionPerformed(evt);
            }
        });
        btn_update.add(cmb_venue);
        cmb_venue.setBounds(140, 570, 230, 40);

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Day :");
        btn_update.add(jLabel34);
        jLabel34.setBounds(30, 300, 110, 30);

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Subject :");
        btn_update.add(jLabel32);
        jLabel32.setBounds(30, 210, 110, 30);

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("To :");
        btn_update.add(jLabel35);
        jLabel35.setBounds(30, 480, 110, 30);

        cmb_sub.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_subActionPerformed(evt);
            }
        });
        btn_update.add(cmb_sub);
        cmb_sub.setBounds(140, 210, 230, 40);

        cmb_course.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_courseActionPerformed(evt);
            }
        });
        btn_update.add(cmb_course);
        cmb_course.setBounds(140, 120, 230, 40);

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Course :");
        btn_update.add(jLabel36);
        jLabel36.setBounds(30, 120, 110, 30);

        cmb_from.setBackground(new java.awt.Color(255, 255, 255));
        cmb_from.setForeground(new java.awt.Color(0, 0, 0));
        cmb_from.setSelectedIndex(-1);
        cmb_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_fromActionPerformed(evt);
            }
        });
        btn_update.add(cmb_from);
        cmb_from.setBounds(140, 390, 230, 40);

        cmb_to.setBackground(new java.awt.Color(255, 255, 255));
        cmb_to.setForeground(new java.awt.Color(0, 0, 0));
        cmb_to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_toActionPerformed(evt);
            }
        });
        btn_update.add(cmb_to);
        cmb_to.setBounds(140, 480, 230, 40);

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
        btn_update.add(btn_delete);
        btn_delete.setBounds(220, 650, 100, 50);

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
        btn_update.add(btn_add);
        btn_add.setBounds(90, 650, 100, 50);

        jPanel7.add(btn_update);
        btn_update.setBounds(25, 13, 410, 720);

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
        else if(cmb_day.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select a day.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_venue.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select the venue.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_from.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select the starting time.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_to.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select the finishin time.", "Input Error", JOptionPane.ERROR_MESSAGE);
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
        else if(cmb_day1.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select a day.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_venue1.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select the venue.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_from1.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select the starting time.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(cmb_to1.getSelectedIndex()==-1){
            correct=false;
            JOptionPane.showMessageDialog(null, "Please select the finishin time.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        return correct;
    }
    
    private void clear(){
        courseComboBoxReady = false;
        toComboBoxReady = false;
        fromComboBoxReady = false;
        venueComboBoxReady = false;
        dayComboBoxReady = false;
        
        cmb_venue.setSelectedIndex(-1);
        cmb_to.setSelectedIndex(-1);
        cmb_from.setSelectedIndex(-1);
        cmb_day.setSelectedIndex(-1);
        cmb_sub.setSelectedIndex(-1);
        cmb_course.setSelectedIndex(-1);
        cmb_batch.setSelectedIndex(-1);
        
        courseComboBoxReady = true;
    }
    
    private void clear1(){
        courseComboBoxReady = false;
        toComboBoxReady = false;
        fromComboBoxReady = false;
        venueComboBoxReady = false;
        dayComboBoxReady = false;
        
        cmb_venue1.setSelectedIndex(-1);
        cmb_to1.setSelectedIndex(-1);
        cmb_from1.setSelectedIndex(-1);
        cmb_day1.setSelectedIndex(-1);
        cmb_sub1.setSelectedIndex(-1);
        cmb_course1.setSelectedIndex(-1);
        cmb_batch1.setSelectedIndex(-1);
        
        courseComboBoxReady = true;
    }
    
    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.hide();
        new SubMenu(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this record?", "DELETE", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            try{
                if(batch==null || subject==null)
                    JOptionPane.showMessageDialog(null, "Please select a valid record from the table.", "Information", JOptionPane.INFORMATION_MESSAGE);
                
                else if(s.deleteSchedule(batch, subject)==1){
                    JOptionPane.showMessageDialog(null, "Schedule record deleted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    batch=null;
                    subject=null;
                    jTable1.setModel(s.viewPGScheduleTable(formType));
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void cmb_course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_course1ActionPerformed
        try{
            if(cmb_batch1.getSelectedIndex()==-1 && courseComboBoxReady){
                JOptionPane.showMessageDialog(null, "Please select a batch.", "Information", JOptionPane.INFORMATION_MESSAGE);
                cmb_course1.setSelectedIndex(-1);
            }
            else if(courseComboBoxReady){
                s.setCourse(cmb_course1.getSelectedItem().toString());
                cmb_sub1.removeAllItems();
                ResultSet rs = sub.getSubIDsByCourse(cmb_course1.getSelectedItem().toString());
                while(rs.next())
                    cmb_sub1.addItem(rs.getString("SUBID"));
                cmb_sub1.setSelectedIndex(-1);
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmb_course1ActionPerformed

    private void cmb_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_courseActionPerformed
        try{
            if(cmb_batch.getSelectedIndex()==-1 && courseComboBoxReady){
                JOptionPane.showMessageDialog(null, "Please select a batch.", "Information", JOptionPane.INFORMATION_MESSAGE);
                cmb_course.setSelectedIndex(-1);
            }
            else if(courseComboBoxReady){
                s.setCourse(cmb_course.getSelectedItem().toString());
                cmb_sub.removeAllItems();
                ResultSet rs = sub.getSubIDsByCourse(cmb_course.getSelectedItem().toString());
                while(rs.next())
                    cmb_sub.addItem(rs.getString("SUBID"));
                cmb_sub.setSelectedIndex(-1);
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_cmb_courseActionPerformed

    private void cmb_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_dayActionPerformed
        try{
            if(cmb_sub.getSelectedIndex()==-1 && dayComboBoxReady){
                JOptionPane.showMessageDialog(this, "Please select the subject.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                cmb_day.setSelectedIndex(-1);
            }
            else if(dayComboBoxReady){
                fromComboBoxReady = false;
                cmb_from.removeAllItems();
                cmb_from.addItem("08:00");
                cmb_from.addItem("08:30");
                cmb_from.addItem("09:00");
                cmb_from.addItem("09:30");
                cmb_from.addItem("10:00");
                cmb_from.addItem("10:30");
                cmb_from.addItem("11:00");
                cmb_from.addItem("11:30");
                cmb_from.addItem("12:00");
                cmb_from.addItem("12:30");
                cmb_from.addItem("13:00");
                cmb_from.addItem("13:30");
                cmb_from.addItem("14:00");
                cmb_from.addItem("14:30");
                cmb_from.addItem("15:00");
                cmb_from.addItem("15:30");
                cmb_from.addItem("16:00");
            
                /***** deleting contradicting times due to lectures *****/
                s.setDay(cmb_day.getSelectedItem().toString());
                jTable.setModel(s.viewUGScheduleByDayCourseAndBatch(cmb_batch.getSelectedItem().toString(), cmb_course.getSelectedItem().toString(),cmb_day.getSelectedItem().toString()));

                ResultSet rs = s.viewScheduleByDay();
                int indexFrom, indexTo;
                
                while(rs.next()){
                    cmb_from.setSelectedItem(rs.getString("FROMTIME"));
                    indexFrom=cmb_from.getSelectedIndex();
                    
                    cmb_from.setSelectedItem(rs.getString("TOTIME"));
                    indexTo=cmb_from.getSelectedIndex();
                    
                    for(int i=indexFrom; i<indexTo; i++)
                        cmb_from.removeItemAt(indexFrom);
                }
                
                /***** deleting lecturer busy hours *****/
                String lecId=sub.getLecIdBySubject(cmb_sub.getSelectedItem().toString());
                if(lecId!=null && !lecId.equals("")){
                    ResultSet rs1 = lec.getSubjectsByLecID(lecId);

                    ResultSet times; 
                    while(rs1.next()){
                        times = s.viewScheduleBySubjectAndDay(rs1.getString("SUBID"));
                        if(times.next()){
                            cmb_from.setSelectedItem(times.getString("FROMTIME"));
                            indexFrom=cmb_from.getSelectedIndex();

                            cmb_from.setSelectedItem(times.getString("TOTIME"));
                            indexTo=cmb_from.getSelectedIndex();

                            for(int i=indexFrom; i<indexTo; i++)
                            cmb_from.removeItemAt(indexFrom);
                        }
                    }
                }
                
                fromComboBoxReady = true;
                cmb_from.setSelectedIndex(-1);
            }
        }
        
        catch(Exception e){
        
        e.printStackTrace();}
    }//GEN-LAST:event_cmb_dayActionPerformed

    private void cmb_day1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_day1ActionPerformed
        try{
            if(cmb_sub1.getSelectedIndex()==-1 && dayComboBoxReady){
                JOptionPane.showMessageDialog(this, "Please select the subject.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                cmb_day1.setSelectedIndex(-1);
            }
            else if(dayComboBoxReady){
                fromComboBoxReady = false;
                cmb_from1.removeAllItems();
                cmb_from1.addItem("08:00");
                cmb_from1.addItem("08:30");
                cmb_from1.addItem("09:00");
                cmb_from1.addItem("09:30");
                cmb_from1.addItem("10:00");
                cmb_from1.addItem("10:30");
                cmb_from1.addItem("11:00");
                cmb_from1.addItem("11:30");
                cmb_from1.addItem("12:00");
                cmb_from1.addItem("12:30");
                cmb_from1.addItem("13:00");
                cmb_from1.addItem("13:30");
                cmb_from1.addItem("14:00");
                cmb_from1.addItem("14:30");
                cmb_from1.addItem("15:00");
                cmb_from1.addItem("15:30");
                cmb_from1.addItem("16:00");
                
                /***** deleting contradicting times due to lectures *****/
                s.setDay(cmb_day1.getSelectedItem().toString());
                jTable1.setModel(s.viewUGScheduleByDayCourseAndBatch(cmb_batch1.getSelectedItem().toString(), cmb_course1.getSelectedItem().toString(),cmb_day1.getSelectedItem().toString()));

                ResultSet rs = s.viewScheduleByDay();
                int indexFrom, indexTo;
                
                while(rs.next()){
                    cmb_from1.setSelectedItem(rs.getString("FROMTIME"));
                    indexFrom=cmb_from1.getSelectedIndex();
                    
                    cmb_from1.setSelectedItem(rs.getString("TOTIME"));
                    indexTo=cmb_from1.getSelectedIndex();
                    
                    for(int i=indexFrom; i<indexTo; i++)
                        cmb_from1.removeItemAt(indexFrom);
                }
                
                /***** deleting lecturer busy hours *****/
                String lecId=sub.getLecIdBySubject(cmb_sub1.getSelectedItem().toString());
                if(lecId!=null && !lecId.equals("")){
                    ResultSet rs1 = lec.getSubjectsByLecID(lecId);

                    ResultSet times; 
                    while(rs1.next()){
                        times = s.viewScheduleBySubjectAndDay(rs1.getString("SUBID"));
                        if(times.next()){
                            cmb_from1.setSelectedItem(times.getString("FROMTIME"));
                            indexFrom=cmb_from1.getSelectedIndex();

                            cmb_from1.setSelectedItem(times.getString("TOTIME"));
                            indexTo=cmb_from1.getSelectedIndex();

                            for(int i=indexFrom; i<indexTo; i++)
                                cmb_from1.removeItemAt(indexFrom);
                        }
                    }
                }
                fromComboBoxReady = true;
                cmb_from1.setSelectedIndex(-1);
            }
        }
        catch(Exception e){
            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_cmb_day1ActionPerformed

    private void cmb_to1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_to1ActionPerformed
        if(cmb_from1.getSelectedIndex()==-1 && toComboBoxReady){
            JOptionPane.showMessageDialog(this, "Please select the starting time.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            cmb_to1.setSelectedIndex(-1);
        }
        else
            if(cmb_to1.getSelectedIndex()!=-1 && toComboBoxReady){
                cmb_venue1.removeAllItems();
                if(formType.equals("SOC")){
                    cmb_venue1.addItem("SOC-HALL-A");
                    cmb_venue1.addItem("SOC-HALL-B");
                    cmb_venue1.addItem("SOC-HALL-C");
                    cmb_venue1.addItem("SOC-HALL-D");
                    cmb_venue1.addItem("SOC-HALL-E");
                    cmb_venue1.addItem("SOC-HALL-F");
                    cmb_venue1.addItem("SOC-HALL-G");
                    cmb_venue1.addItem("SOC-HALL-H");
                    cmb_venue1.addItem("SOC-LAB-A");
                    cmb_venue1.addItem("SOC-LAB-B");
                    cmb_venue1.addItem("SOC-LAB-C");
                    cmb_venue1.addItem("SOC-LAB-D");
                }
                else if(formType.equals("SOB")){
                    cmb_venue1.addItem("SOB-HALL-A");
                    cmb_venue1.addItem("SOB-HALL-B");
                    cmb_venue1.addItem("SOB-HALL-C");
                    cmb_venue1.addItem("SOB-HALL-D");
                    cmb_venue1.addItem("SOB-HALL-E");
                    cmb_venue1.addItem("SOB-HALL-F");
                    cmb_venue1.addItem("SOB-HALL-G");
                    cmb_venue1.addItem("SOB-HALL-H");
                    cmb_venue1.addItem("SOB-LAB-A");
                    cmb_venue1.addItem("SOB-LAB-B");
                    cmb_venue1.addItem("SOB-LAB-C");
                    cmb_venue1.addItem("SOB-LAB-D");
                }
                else if(formType.equals("SOE")){
                    cmb_venue1.addItem("SOE-HALL-A");
                    cmb_venue1.addItem("SOE-HALL-B");
                    cmb_venue1.addItem("SOE-HALL-C");
                    cmb_venue1.addItem("SOE-HALL-D");
                    cmb_venue1.addItem("SOE-HALL-E");
                    cmb_venue1.addItem("SOE-HALL-F");
                    cmb_venue1.addItem("SOE-HALL-G");
                    cmb_venue1.addItem("SOE-HALL-H");
                    cmb_venue1.addItem("SOE-LAB-A");
                    cmb_venue1.addItem("SOE-LAB-B");
                    cmb_venue1.addItem("SOE-LAB-C");
                    cmb_venue1.addItem("SOE-LAB-D");
                }
                
                cmb_venue1.setSelectedIndex(-1);
                venueComboBoxReady = true;
                
                s.setTo(cmb_to1.getSelectedItem().toString());
                
                /***** deleting hall contradictions *****/
                ResultSet rs = s.getHalls(formType);
                int fromTimeSet = Integer.parseInt(cmb_from1.getSelectedItem().toString().substring(0,2));
                int toTimeSet = Integer.parseInt(cmb_to1.getSelectedItem().toString().substring(0,2));
                
                try {
                    while(rs.next()){
                        int fromTime = Integer.parseInt(rs.getString("FROMTIME").substring(0,2));
                        int toTime = Integer.parseInt(rs.getString("TOTIME").substring(0,2));
                        
                        if((fromTime>fromTimeSet && fromTimeSet<toTimeSet) || (toTime>fromTimeSet && toTime<toTimeSet))
                            cmb_venue1.removeItem(rs.getString("VENUE"));
                    }
                } 
                catch (SQLException ex) {
                    Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }//GEN-LAST:event_cmb_to1ActionPerformed

    private void cmb_from1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_from1ActionPerformed
        if(cmb_day1.getSelectedIndex()==-1 && fromComboBoxReady){
            JOptionPane.showMessageDialog(this, "Please select a day", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            cmb_from1.setSelectedIndex(-1);
        }
        else if(cmb_from1.getSelectedIndex()!=-1 && fromComboBoxReady){
            try {
                toComboBoxReady=false;
                cmb_to1.removeAllItems();
                cmb_to1.addItem("08:00");
                cmb_to1.addItem("08:30");
                cmb_to1.addItem("09:00");
                cmb_to1.addItem("09:30");
                cmb_to1.addItem("10:00");
                cmb_to1.addItem("10:30");
                cmb_to1.addItem("11:00");
                cmb_to1.addItem("11:30");
                cmb_to1.addItem("12:00");
                cmb_to1.addItem("12:30");
                cmb_to1.addItem("13:00");
                cmb_to1.addItem("13:30");
                cmb_to1.addItem("14:00");
                cmb_to1.addItem("14:30");
                cmb_to1.addItem("15:00");
                cmb_to1.addItem("15:30");
                cmb_to1.addItem("16:00");
                cmb_to1.addItem("16:30");
                cmb_to1.addItem("17:00");
                
                s.setFrom(cmb_from1.getSelectedItem().toString());
                
                int indexFrom, indexTo;
                ResultSet rs = s.viewScheduleByDay();
                
                while(rs.next()){
                    cmb_to1.setSelectedItem(rs.getString("FROMTIME"));
                    indexFrom=cmb_to1.getSelectedIndex();
                    
                    cmb_to1.setSelectedItem(rs.getString("TOTIME"));
                    indexTo=cmb_to1.getSelectedIndex();
                    
                    for(int i=indexFrom; i<indexTo; i++)
                        cmb_to1.removeItemAt(indexFrom);
                }
                
                for(int i=0; i<=cmb_from1.getSelectedIndex()+1; i++){
                    cmb_to1.removeItemAt(0);
                }
                
                toComboBoxReady=true;
                cmb_to1.setSelectedIndex(-1);
            } 
            
            catch (SQLException ex) {
                Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmb_from1ActionPerformed

    private void cmb_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_fromActionPerformed
        if(cmb_day.getSelectedIndex()==-1 && fromComboBoxReady){
            JOptionPane.showMessageDialog(this, "Please select a day", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            cmb_from.setSelectedIndex(-1);
        }
        else if(cmb_from.getSelectedIndex()!=-1 && fromComboBoxReady){
            toComboBoxReady=false;
            cmb_to.addItem("08:00");
            cmb_to.addItem("08:30");
            cmb_to.addItem("09:00");
            cmb_to.addItem("09:30");
            cmb_to.addItem("10:00");
            cmb_to.addItem("10:30");
            cmb_to.addItem("11:00");
            cmb_to.addItem("11:30");
            cmb_to.addItem("12:00");
            cmb_to.addItem("12:30");
            cmb_to.addItem("13:00");
            cmb_to.addItem("13:30");
            cmb_to.addItem("14:00");
            cmb_to.addItem("14:30");
            cmb_to.addItem("15:00");
            cmb_to.addItem("15:30");
            cmb_to.addItem("16:00");
            cmb_to.addItem("16:30");
            cmb_to.addItem("17:00");

            s.setFrom(cmb_from.getSelectedItem().toString());
            
            int indexFrom, indexTo;
                ResultSet rs = s.viewScheduleByDay();
                
            try {
                while(rs.next()){
                    cmb_to.setSelectedItem(rs.getString("FROMTIME"));
                    indexFrom=cmb_to.getSelectedIndex();
                    
                    cmb_to.setSelectedItem(rs.getString("TOTIME"));
                    indexTo=cmb_to.getSelectedIndex();
                    
                    for(int i=indexFrom; i<indexTo; i++)
                        cmb_to.removeItemAt(indexFrom);
                }
                
                for(int i=0; i<=cmb_from.getSelectedIndex()+1; i++){
                    cmb_to.removeItemAt(0);
                }
                
                toComboBoxReady=true;
                cmb_to.setSelectedIndex(-1);
                
            } catch (SQLException ex) {
                Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmb_fromActionPerformed

    private void cmb_toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_toActionPerformed
        if(cmb_from.getSelectedIndex()==-1 && toComboBoxReady){
            JOptionPane.showMessageDialog(this, "Please select the starting time.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            cmb_to.setSelectedIndex(-1);
        }
        else
            if(cmb_to.getSelectedIndex()!=-1  && toComboBoxReady){
                cmb_venue.removeAllItems();
                if(formType.equals("SOC")){
                    cmb_venue.addItem("SOC-HALL-A");
                    cmb_venue.addItem("SOC-HALL-B");
                    cmb_venue.addItem("SOC-HALL-C");
                    cmb_venue.addItem("SOC-HALL-D");
                    cmb_venue.addItem("SOC-HALL-E");
                    cmb_venue.addItem("SOC-HALL-F");
                    cmb_venue.addItem("SOC-HALL-G");
                    cmb_venue.addItem("SOC-HALL-H");
                    cmb_venue.addItem("SOC-LAB-A");
                    cmb_venue.addItem("SOC-LAB-B");
                    cmb_venue.addItem("SOC-LAB-C");
                    cmb_venue.addItem("SOC-LAB-D");
                }
                else if(formType.equals("SOB")){
                    cmb_venue.addItem("SOB-HALL-A");
                    cmb_venue.addItem("SOB-HALL-B");
                    cmb_venue.addItem("SOB-HALL-C");
                    cmb_venue.addItem("SOB-HALL-D");
                    cmb_venue.addItem("SOB-HALL-E");
                    cmb_venue.addItem("SOB-HALL-F");
                    cmb_venue.addItem("SOB-HALL-G");
                    cmb_venue.addItem("SOB-HALL-H");
                    cmb_venue.addItem("SOB-LAB-A");
                    cmb_venue.addItem("SOB-LAB-B");
                    cmb_venue.addItem("SOB-LAB-C");
                    cmb_venue.addItem("SOB-LAB-D");
                }
                else if(formType.equals("SOE")){
                    cmb_venue.addItem("SOE-HALL-A");
                    cmb_venue.addItem("SOE-HALL-B");
                    cmb_venue.addItem("SOE-HALL-C");
                    cmb_venue.addItem("SOE-HALL-D");
                    cmb_venue.addItem("SOE-HALL-E");
                    cmb_venue.addItem("SOE-HALL-F");
                    cmb_venue.addItem("SOE-HALL-G");
                    cmb_venue.addItem("SOE-HALL-H");
                    cmb_venue.addItem("SOE-LAB-A");
                    cmb_venue.addItem("SOE-LAB-B");
                    cmb_venue.addItem("SOE-LAB-C");
                    cmb_venue.addItem("SOE-LAB-D");
                }
                
                cmb_venue.setSelectedIndex(-1);
                venueComboBoxReady = true;
                
                s.setTo(cmb_to.getSelectedItem().toString());
            
                /***** deleting hall contradictions *****/
                ResultSet rs = s.getHalls(formType);
                int fromTimeSet = Integer.parseInt(cmb_from.getSelectedItem().toString().substring(0,2));
                int toTimeSet = Integer.parseInt(cmb_to.getSelectedItem().toString().substring(0,2));
                
                try {
                    while(rs.next()){
                        int fromTime = Integer.parseInt(rs.getString("FROMTIME").substring(0,2));
                        int toTime = Integer.parseInt(rs.getString("TOTIME").substring(0,2));
                        
                        if((fromTime>fromTimeSet && fromTimeSet<toTimeSet) || (toTime>fromTimeSet && toTime<toTimeSet))
                            cmb_venue.removeItem(rs.getString("VENUE"));
                    }
                } 
                catch (SQLException ex) {
                    Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_cmb_toActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        try{
            int count=0, val=1;
            if(validation1()){
                count+=s.addPGSchedule();
                if(cmb_venue1.getSelectedItem().toString().substring(4,7).equals("LAB")){
                    int nos=s.getNumberOfStudentsInBacthAndCourse();
                    if(nos>40){
                        int dialogButton = JOptionPane.YES_NO_OPTION;
                        int dialogResult = JOptionPane.showConfirmDialog (null, "Student limit in the lab exceeds. Would you like to allocate labs for others?", "DELETE", dialogButton);
                        if(dialogResult == JOptionPane.YES_OPTION){
                            nos-=40;
                            while(nos>0){
                                val++;
                                for(int i=0; i<cmb_venue1.getItemCount(); i++){
                                    cmb_venue1.setSelectedIndex(i);
                                    if(cmb_venue1.getSelectedItem().toString().substring(4,7).equals("LAB"))
                                        break;
                                }
                                s.setVenue(cmb_venue1.getSelectedItem().toString());
                                count+=s.addPGSchedule();
                                cmb_venue1.removeItemAt(cmb_venue1.getSelectedIndex());
                                nos-=40;
                            }
                        }
                    }
                }
                
                if(count==val){
                    JOptionPane.showMessageDialog(null, "Schedule added successfully.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    clear1();
                    jTable1.setModel(s.viewPGScheduleTable(formType));
                }
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this record?", "DELETE", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            try{
                if(batch==null || subject==null)
                    JOptionPane.showMessageDialog(null, "Please select a valid record from the table.", "Information", JOptionPane.INFORMATION_MESSAGE);
                
                else if(s.deleteSchedule(batch, subject)==1){
                    JOptionPane.showMessageDialog(null, "Schedule record deleted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    batch=null;
                    subject=null;
                    jTable.setModel(s.viewUGScheduleTable(formType));
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try{
            int count=0, val=1;
            if(validation()){
                count+=s.addUGSchedule();
                if(cmb_venue.getSelectedItem().toString().substring(4,7).equals("LAB")){
                    int nos=s.getNumberOfStudentsInBacthAndCourse();
                    if(nos>40){
                        int dialogButton = JOptionPane.YES_NO_OPTION;
                        int dialogResult = JOptionPane.showConfirmDialog (null, "Student limit in the lab exceeds. Would you like to allocate labs for others?", "DELETE", dialogButton);
                        if(dialogResult == JOptionPane.YES_OPTION){
                            nos-=40;
                            while(nos>0){
                                val++;
                                for(int i=0; i<cmb_venue.getItemCount(); i++){
                                    cmb_venue.setSelectedIndex(i);
                                    if(cmb_venue.getSelectedItem().toString().substring(4,7).equals("LAB"))
                                        break;
                                }
                                s.setVenue(cmb_venue.getSelectedItem().toString());
                                count+=s.addUGSchedule();
                                cmb_venue.removeItemAt(cmb_venue.getSelectedIndex());
                                nos-=40;
                            }
                        }
                    }
                }
                
                if(count==val){
                    JOptionPane.showMessageDialog(null, "Schedule added successfully.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    jTable.setModel(s.viewUGScheduleTable(formType));
                }
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row=jTable1.rowAtPoint(evt.getPoint());
            batch=jTable1.getValueAt(row,0).toString();
            subject=jTable1.getValueAt(row,1).toString();
        }
        catch(NullPointerException np){
            JOptionPane.showMessageDialog(null, "Please select a record with valid data.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        try{
            int row=jTable.rowAtPoint(evt.getPoint());
            batch=jTable.getValueAt(row,0).toString();
            subject=jTable.getValueAt(row,1).toString();
        }
        catch(NullPointerException np){
            JOptionPane.showMessageDialog(null, "Please select a record with valid data.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void cmb_batch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_batch1ActionPerformed
        if(cmb_batch1.getSelectedIndex()!=-1)
            s.setBatch(cmb_batch1.getSelectedItem().toString());
    }//GEN-LAST:event_cmb_batch1ActionPerformed

    private void cmb_batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_batchActionPerformed
        if(cmb_batch.getSelectedIndex()!=-1)
            s.setBatch(cmb_batch.getSelectedItem().toString());
    }//GEN-LAST:event_cmb_batchActionPerformed

    private void cmb_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_subActionPerformed
        if(cmb_sub.getSelectedIndex()!=-1){
            s.setSubject(cmb_sub.getSelectedItem().toString());
            dayComboBoxReady=true;
        }
    }//GEN-LAST:event_cmb_subActionPerformed

    private void cmb_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub1ActionPerformed
        if(cmb_sub1.getSelectedIndex()!=-1){
            s.setSubject(cmb_sub1.getSelectedItem().toString());
            dayComboBoxReady=true;
        }
    }//GEN-LAST:event_cmb_sub1ActionPerformed

    private void cmb_venueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_venueActionPerformed
        if(cmb_to.getSelectedIndex()==-1 && venueComboBoxReady){
            JOptionPane.showMessageDialog(this, "Please select the time", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            cmb_venue.setSelectedIndex(-1);
        }
        else if(cmb_venue.getSelectedIndex()!=-1 && venueComboBoxReady)
            s.setVenue(cmb_venue.getSelectedItem().toString());
    }//GEN-LAST:event_cmb_venueActionPerformed

    private void cmb_venue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_venue1ActionPerformed
        if(cmb_to1.getSelectedIndex()==-1 && venueComboBoxReady){
            JOptionPane.showMessageDialog(this, "Please select the time", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            cmb_venue1.setSelectedIndex(-1);
        }
        else if(cmb_venue1.getSelectedIndex()!=-1 && venueComboBoxReady)
            s.setVenue(cmb_venue1.getSelectedItem().toString());
    }//GEN-LAST:event_cmb_venue1ActionPerformed
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Schedule("ABC", "ABC").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add1;
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_delete1;
    private javax.swing.JPanel btn_save1;
    private javax.swing.JPanel btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cmb_batch;
    private javax.swing.JComboBox cmb_batch1;
    private javax.swing.JComboBox cmb_course;
    private javax.swing.JComboBox cmb_course1;
    private javax.swing.JComboBox cmb_day;
    private javax.swing.JComboBox cmb_day1;
    private javax.swing.JComboBox cmb_from;
    private javax.swing.JComboBox cmb_from1;
    private javax.swing.JComboBox cmb_sub;
    private javax.swing.JComboBox cmb_sub1;
    private javax.swing.JComboBox cmb_to;
    private javax.swing.JComboBox cmb_to1;
    private javax.swing.JComboBox cmb_venue;
    private javax.swing.JComboBox cmb_venue1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
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
