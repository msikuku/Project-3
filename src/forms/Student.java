package forms;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Student extends javax.swing.JFrame {
    public String formType, userType;
        
    public Student(String form, String user) {
        initComponents();
        formType=form;
        userType=user;
        this.setLocationRelativeTo(null); //to get it to the center of the screen
        
        Calendar calendar = Calendar.getInstance();
        cmb_batch1.setSelectedIndex(cmb_batch1.getItemCount()-1); //setting index to the last index
        double curYear = Double.parseDouble(Integer.toString(calendar.get(Calendar.YEAR)).substring(2)+".2");
        double maxYear = Double.parseDouble((String) cmb_batch1.getItemAt(cmb_batch1.getSelectedIndex()));
        while(curYear > maxYear){
            maxYear+=1;
            cmb_batch1.addItem(maxYear+0.1);
            cmb_batch1.addItem(maxYear+0.2);
            cmb_year.addItem(calendar.get(Calendar.YEAR));
            
            cmb_batch.addItem(maxYear+0.1);
            cmb_batch.addItem(maxYear+0.2);
        }//comparing today's yeas with the last value stored in the combo box
        cmb_batch1.setSelectedIndex(-1);
        
        lbl_ssid.setVisible(false);
        lbl_ssid1.setVisible(false);
        
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
        jLabel16 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_fName1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_lName1 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txt_addNo1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_addStreet1 = new javax.swing.JTextField();
        txt_addCity1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txt_mobNo1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_resNo1 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txt_institute = new javax.swing.JTextField();
        cmb_year = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_field = new javax.swing.JTextField();
        txt_type = new javax.swing.JTextField();
        cmb_batch1 = new javax.swing.JComboBox();
        cmb_course1 = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        lbl_sid1 = new javax.swing.JLabel();
        lbl_ssid1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_addNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_addStreet = new javax.swing.JTextField();
        txt_addCity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_rank = new javax.swing.JTextField();
        cmb_res1 = new javax.swing.JComboBox();
        cmb_sub1 = new javax.swing.JComboBox();
        cmb_sub2 = new javax.swing.JComboBox();
        cmb_res2 = new javax.swing.JComboBox();
        cmb_sub3 = new javax.swing.JComboBox();
        cmb_res3 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_fName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_lName = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_mobNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_resNo = new javax.swing.JTextField();
        cmb_course = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        cmb_batch = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        lbl_sid = new javax.swing.JLabel();
        lbl_ssid = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
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
        jLabel6.setText("Student Management");
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

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Batch :");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(30, 30, 60, 30);

        jPanel14.setBackground(new java.awt.Color(237, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("First Name : ");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));
        jPanel14.add(txt_fName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 40));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Last Name : ");
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 110, 30));
        jPanel14.add(txt_lName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 40));

        jPanel8.add(jPanel14);
        jPanel14.setBounds(20, 90, 760, 80);

        jPanel15.setBackground(new java.awt.Color(237, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Add. No. :");
        jPanel15.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));
        jPanel15.add(txt_addNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 80, 40));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Add. Street :");
        jPanel15.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 30));
        jPanel15.add(txt_addStreet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 120, 40));
        jPanel15.add(txt_addCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 120, 40));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Add. City :");
        jPanel15.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 110, 30));

        jPanel8.add(jPanel15);
        jPanel15.setBounds(20, 200, 760, 80);

        jPanel16.setBackground(new java.awt.Color(237, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Mobile No. :");
        jPanel16.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));
        jPanel16.add(txt_mobNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 40));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Residence No. :");
        jPanel16.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 110, 30));
        jPanel16.add(txt_resNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 40));

        jPanel8.add(jPanel16);
        jPanel16.setBounds(20, 310, 760, 80);

        jPanel17.setBackground(new java.awt.Color(237, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Qualifications", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Field");
        jPanel17.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 90, 30));
        jPanel17.add(txt_institute, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 370, 40));

        cmb_year.setBackground(new java.awt.Color(255, 255, 255));
        cmb_year.setForeground(new java.awt.Color(0, 0, 0));
        cmb_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));
        cmb_year.setSelectedItem(null);
        jPanel17.add(cmb_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 40));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Institute :");
        jPanel17.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Year");
        jPanel17.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 30));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Type");
        jPanel17.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 90, 30));
        jPanel17.add(txt_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 230, 40));
        jPanel17.add(txt_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 130, 40));

        jPanel8.add(jPanel17);
        jPanel17.setBounds(20, 420, 760, 170);

        cmb_batch1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_batch1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15.1", "15.2", "16.1", "16.2", "17.1", "17.2", "18.1", "18.2" }));
        cmb_batch1.setSelectedIndex(-1);
        cmb_batch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_batch1ActionPerformed(evt);
            }
        });
        jPanel8.add(cmb_batch1);
        cmb_batch1.setBounds(90, 30, 80, 40);

        cmb_course1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_course1ActionPerformed(evt);
            }
        });
        jPanel8.add(cmb_course1);
        cmb_course1.setBounds(280, 30, 190, 40);

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Course :");
        jPanel8.add(jLabel29);
        jLabel29.setBounds(210, 30, 60, 30);

        lbl_sid1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_sid1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_sid1.setText("            ");
        jPanel8.add(lbl_sid1);
        lbl_sid1.setBounds(610, 30, 170, 30);

        lbl_ssid1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_ssid1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ssid1.setText("Student ID : ");
        jPanel8.add(lbl_ssid1);
        lbl_ssid1.setBounds(520, 30, 85, 30);

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

        jPanel12.setBackground(new java.awt.Color(237, 255, 255));
        jPanel12.setLayout(null);

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
        jPanel12.add(btn_delete);
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
        jPanel12.add(btn_update);
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
        jPanel12.add(btn_add);
        btn_add.setBounds(130, 640, 110, 50);

        jPanel3.setBackground(new java.awt.Color(237, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Add. No. :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));
        jPanel3.add(txt_addNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 80, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Add. Street :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, 30));
        jPanel3.add(txt_addStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 120, 40));
        jPanel3.add(txt_addCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 120, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Add. City :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 110, 30));

        jPanel12.add(jPanel3);
        jPanel3.setBounds(20, 200, 760, 80);

        jPanel4.setBackground(new java.awt.Color(237, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "A/L Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Subject 3");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 90, 30));
        jPanel4.add(txt_rank, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, 40));

        cmb_res1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_res1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_res1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "S", "F", "AB" }));
        cmb_res1.setSelectedItem(null);
        jPanel4.add(cmb_res1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 50, 40));

        cmb_sub1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Physics", "Combined Maths", "Chemistry", "ICT", "Biology", "Accounting", "Econ", "Business studies", "Sinhala", "Logic", "Political Science", "Geography", "Buddhist Civilization", "English Literature", "Japanese", "History", "Dancing", "Other", "Drama" }));
        cmb_sub1.setSelectedItem(null);
        cmb_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub1ActionPerformed(evt);
            }
        });
        jPanel4.add(cmb_sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 40));

        cmb_sub2.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub2.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Physics", "Combined Maths", "Chemistry", "ICT", "Biology", "Accounting", "Econ", "Business studies", "Sinhala", "Logic", "Political Science", "Geography", "Buddhist Civilization", "English Literature", "Japanese", "History", "Dancing", "Other", "Drama" }));
        cmb_sub2.setSelectedItem(null);
        cmb_sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub2ActionPerformed(evt);
            }
        });
        jPanel4.add(cmb_sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 130, 40));

        cmb_res2.setBackground(new java.awt.Color(255, 255, 255));
        cmb_res2.setForeground(new java.awt.Color(0, 0, 0));
        cmb_res2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "S", "F", "AB" }));
        cmb_res2.setSelectedItem(null);
        jPanel4.add(cmb_res2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 50, 40));

        cmb_sub3.setBackground(new java.awt.Color(255, 255, 255));
        cmb_sub3.setForeground(new java.awt.Color(0, 0, 0));
        cmb_sub3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Physics", "Combined Maths", "Chemistry", "ICT", "Biology", "Accounting", "Econ", "Business studies", "Sinhala", "Logic", "Political Science", "Geography", "Buddhist Civilization", "English Literature", "Japanese", "History", "Dancing", "Other", "Drama" }));
        cmb_sub3.setSelectedItem(null);
        cmb_sub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sub3ActionPerformed(evt);
            }
        });
        jPanel4.add(cmb_sub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 130, 40));

        cmb_res3.setBackground(new java.awt.Color(255, 255, 255));
        cmb_res3.setForeground(new java.awt.Color(0, 0, 0));
        cmb_res3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "S", "F", "AB" }));
        cmb_res3.setSelectedItem(null);
        jPanel4.add(cmb_res3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 50, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Island Rank :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Subject 1");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 30));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Subject 2");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 90, 30));

        jPanel12.add(jPanel4);
        jPanel4.setBounds(20, 420, 760, 170);

        jPanel5.setBackground(new java.awt.Color(237, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("First Name : ");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));
        jPanel5.add(txt_fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Last Name : ");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 110, 30));
        jPanel5.add(txt_lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 40));

        jPanel12.add(jPanel5);
        jPanel5.setBounds(20, 90, 760, 80);

        jPanel7.setBackground(new java.awt.Color(237, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Mobile No. :");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));
        jPanel7.add(txt_mobNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Residence No. :");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 110, 30));
        jPanel7.add(txt_resNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 40));

        jPanel12.add(jPanel7);
        jPanel7.setBounds(20, 310, 760, 80);

        cmb_course.setBackground(new java.awt.Color(255, 255, 255));
        cmb_course.setForeground(new java.awt.Color(0, 0, 0));
        cmb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_courseActionPerformed(evt);
            }
        });
        jPanel12.add(cmb_course);
        cmb_course.setBounds(280, 30, 190, 40);

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Course :");
        jPanel12.add(jLabel30);
        jLabel30.setBounds(210, 30, 60, 30);

        cmb_batch.setBackground(new java.awt.Color(255, 255, 255));
        cmb_batch.setForeground(new java.awt.Color(0, 0, 0));
        cmb_batch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15.1", "15.2", "16.1", "16.2", "17.1", "17.2", "18.1", "18.2" }));
        cmb_batch.setSelectedItem(null);
        cmb_batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_batchActionPerformed(evt);
            }
        });
        jPanel12.add(cmb_batch);
        cmb_batch.setBounds(90, 30, 80, 40);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Batch :");
        jPanel12.add(jLabel31);
        jLabel31.setBounds(30, 30, 60, 30);

        lbl_sid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_sid.setForeground(new java.awt.Color(0, 0, 0));
        lbl_sid.setText("            ");
        jPanel12.add(lbl_sid);
        lbl_sid.setBounds(610, 30, 170, 30);

        lbl_ssid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_ssid.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ssid.setText("Student ID : ");
        jPanel12.add(lbl_ssid);
        lbl_ssid.setBounds(520, 30, 85, 30);

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 800, 720));

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
        jTable.setEnabled(false);
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

    private boolean inputValidation1(){
        boolean correct = true;
        try{
            if(cmb_batch1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a batch.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_course1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a course.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_fName1.getText().isEmpty() || !txt_fName1.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid first name.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_lName1.getText().isEmpty() || !txt_lName1.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid last name.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_addNo1.getText().isEmpty()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter the address number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_addStreet1.getText().isEmpty()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter the address street.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_addCity1.getText().isEmpty()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter the address city.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_mobNo1.getText().isEmpty() || txt_mobNo1.getText().length()!=10 || !txt_mobNo1.getText().matches("[0-9]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter valid mobile number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_resNo1.getText().isEmpty() || txt_resNo1.getText().length()!=10 || !txt_resNo1.getText().matches("[0-9]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter valid residence number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_institute.getText().isEmpty() || !txt_institute.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid institute.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_year.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a year.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_field.getText().isEmpty() || !txt_field.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid field.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_type.getText().isEmpty() || !txt_type.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid type.", "Input Error", JOptionPane.ERROR_MESSAGE);
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
            if(cmb_batch.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a batch.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_course.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select a course.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_fName.getText().isEmpty() || !txt_fName.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid first name.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_lName.getText().isEmpty() || !txt_lName.getText().matches("[a-zA-Z ]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid last name.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_addNo.getText().isEmpty()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter the address number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_addStreet.getText().isEmpty()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter the address street.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_addCity.getText().isEmpty()){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter the address city.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_mobNo.getText().isEmpty() || txt_mobNo.getText().length()!=10 || !txt_mobNo.getText().matches("[0-9]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter valid mobile number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_resNo.getText().isEmpty() || txt_resNo.getText().length()!=10 || !txt_resNo.getText().matches("[0-9]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter valid residence number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txt_rank.getText().isEmpty() || !txt_rank.getText().matches("[0-9]+")){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please enter a valid rank.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_sub1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select subject 1.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_res1.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select result for subject 1.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_sub2.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select subject 2.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_res2.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select result for subject 2.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_sub3.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select subject 3.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(cmb_res3.getSelectedIndex()==-1){
                correct=false;
                JOptionPane.showMessageDialog(null, "Please select result for subject 3.", "Input Error", JOptionPane.ERROR_MESSAGE);
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
        lbl_sid1.setText("");
        cmb_course1.setSelectedIndex(-1);
        txt_fName1.setText("");
        txt_lName1.setText("");
        txt_addNo1.setText("");
        txt_addStreet1.setText("");
        txt_addCity1.setText("");
        txt_mobNo1.setText("");
        txt_resNo1.setText("");
        cmb_batch1.setSelectedIndex(-1);
        txt_institute.setText("");
        txt_field.setText("");
        txt_type.setText("");
        cmb_year.setSelectedIndex(-1);
        
        btn_update1.setEnabled(false);
        btn_delete1.setEnabled(false);
        btn_add1.setEnabled(true);
    }
    
    private void clear(){             
        lbl_sid.setText("");
        cmb_course.setSelectedIndex(-1);
        txt_fName.setText("");
        txt_lName.setText("");
        txt_addNo.setText("");
        txt_addStreet.setText("");
        txt_addCity.setText("");
        txt_mobNo.setText("");
        txt_resNo.setText("");
        cmb_batch.setSelectedIndex(-1);
        txt_rank.setText("");
        cmb_sub1.setSelectedIndex(-1);
        cmb_res1.setSelectedIndex(-1);
        cmb_sub2.setSelectedIndex(-1);
        cmb_res2.setSelectedIndex(-1);
        cmb_sub3.setSelectedIndex(-1);
        cmb_res3.setSelectedIndex(-1);
        
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_add.setEnabled(true);
    }
    
    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.hide();
        new SubMenu(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void cmb_batch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_batch1ActionPerformed
        try{
            classes.Postgraduate pg = new classes.Postgraduate();
            
            if(cmb_course1.getSelectedIndex()!=-1){
                DefaultTableModel model = pg.viewStudentsByBatchAndCourse((String) cmb_batch1.getSelectedItem(), (String) cmb_course1.getSelectedItem());
                if(model != null)
                    jTable1.setModel(model);
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmb_batch1ActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        classes.Postgraduate pg = new classes.Postgraduate();
        int val=0;
        
        try{
            if(inputValidation1()){
                pg.createStudent(formType, (String)cmb_batch1.getSelectedItem(), (String)cmb_course1.getSelectedItem(), txt_fName1.getText(), txt_lName1.getText(), txt_addNo1.getText(), txt_addStreet1.getText(), txt_addCity1.getText(), txt_mobNo1.getText(), txt_resNo1.getText(), txt_institute.getText(), (String)cmb_year.getSelectedItem(), txt_field.getText(), txt_type.getText());
                val=pg.addStudent();
                
                if(val==2){
                    JOptionPane.showMessageDialog(null, "New student added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear1();
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        classes.Undergraduate ug = new classes.Undergraduate();
        int val=0;
        
        try{
            if(inputValidation()){
                ug.createStudent(formType, (String)cmb_batch.getSelectedItem(), (String)cmb_course.getSelectedItem(), txt_fName.getText(), txt_lName.getText(), txt_addNo.getText(), txt_addStreet.getText(), txt_addCity.getText(), txt_mobNo.getText(), txt_resNo.getText(), txt_rank.getText(), (String)cmb_sub1.getSelectedItem(), (String)cmb_res1.getSelectedItem(), (String)cmb_sub2.getSelectedItem(), (String)cmb_res2.getSelectedItem(), (String)cmb_sub3.getSelectedItem(), (String)cmb_res3.getSelectedItem());
                val=ug.addStudent();
                
                if(val==2){
                    JOptionPane.showMessageDialog(null, "New student added successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
        classes.Postgraduate pg = new classes.Postgraduate();
        int val=0;
        
        try{
            if(inputValidation1()){
                pg.createStudent(formType, (String)cmb_batch1.getSelectedItem(), (String)cmb_course1.getSelectedItem(), txt_fName1.getText(), txt_lName1.getText(), txt_addNo1.getText(), txt_addStreet1.getText(), txt_addCity1.getText(), txt_mobNo1.getText(), txt_resNo1.getText(), txt_institute.getText(), (String)cmb_year.getSelectedItem(), txt_field.getText(), txt_type.getText());
                val=pg.updateStudent(lbl_sid1.getText());
                
                if(val==2){
                    JOptionPane.showMessageDialog(null, "Student record updated successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear1();
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        classes.Undergraduate ug = new classes.Undergraduate();
        int val=0;
        
        try{
            if(inputValidation()){
                ug.createStudent(formType, (String)cmb_batch.getSelectedItem(), (String)cmb_course.getSelectedItem(), txt_fName.getText(), txt_lName.getText(), txt_addNo.getText(), txt_addStreet.getText(), txt_addCity.getText(), txt_mobNo.getText(), txt_resNo.getText(), txt_rank.getText(), (String)cmb_sub1.getSelectedItem(), (String)cmb_res1.getSelectedItem(), (String)cmb_sub2.getSelectedItem(), (String)cmb_res2.getSelectedItem(), (String)cmb_sub3.getSelectedItem(), (String)cmb_res3.getSelectedItem());
                val=ug.updateStudent(lbl_sid.getText());
                
                if(val==2){
                    JOptionPane.showMessageDialog(null, "Student record updated successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        classes.Postgraduate pg = new classes.Postgraduate();
        int val=0;
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this record?", "DELETE", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            try{
                val=pg.deleteStudent(lbl_sid1.getText());
                
                if(val==2){
                    JOptionPane.showMessageDialog(null, "Student record deleted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear1();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        classes.Undergraduate ug = new classes.Undergraduate();
        int val=0;
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this record?", "DELETE", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
          try{
                val=ug.deleteStudent(lbl_sid.getText());
                
                if(val==2){
                    JOptionPane.showMessageDialog(null, "Student record deleted successfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void cmb_course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_course1ActionPerformed
        try{
            classes.Postgraduate pg = new classes.Postgraduate();
            
            if(cmb_batch1.getSelectedIndex()!=-1){
                DefaultTableModel model = pg.viewStudentsByBatchAndCourse((String) cmb_batch1.getSelectedItem(), (String) cmb_course1.getSelectedItem());
                if(model != null)
                    jTable1.setModel(model);
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmb_course1ActionPerformed

    private void cmb_batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_batchActionPerformed
        try{
            classes.Undergraduate ug = new classes.Undergraduate();
            
            if(cmb_batch.getSelectedIndex()!=-1){
                DefaultTableModel model = ug.viewStudentsByBatchAndCourse((String) cmb_batch.getSelectedItem(), (String) cmb_course.getSelectedItem());
                if(model != null)
                    jTable.setModel(model);
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmb_batchActionPerformed

    private void cmb_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_courseActionPerformed
        try{
            classes.Undergraduate ug = new classes.Undergraduate();
            
            if(cmb_batch.getSelectedIndex()!=-1){
                DefaultTableModel model = ug.viewStudentsByBatchAndCourse((String) cmb_batch.getSelectedItem(), (String) cmb_course.getSelectedItem());
                if(model != null)
                    jTable.setModel(model);
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmb_courseActionPerformed

    private void cmb_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub1ActionPerformed
        cmb_sub2.removeItem(cmb_sub1.getSelectedItem());
        cmb_sub3.removeItem(cmb_sub1.getSelectedItem());
    }//GEN-LAST:event_cmb_sub1ActionPerformed

    private void cmb_sub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub2ActionPerformed
        cmb_sub1.removeItem(cmb_sub2.getSelectedItem());
        cmb_sub3.removeItem(cmb_sub2.getSelectedItem());
    }//GEN-LAST:event_cmb_sub2ActionPerformed

    private void cmb_sub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sub3ActionPerformed
        cmb_sub1.removeItem(cmb_sub3.getSelectedItem());
        cmb_sub2.removeItem(cmb_sub3.getSelectedItem());
    }//GEN-LAST:event_cmb_sub3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        btn_update1.setEnabled(true);
        btn_delete1.setEnabled(true);
        btn_add1.setEnabled(false);
        
        try{
            int row=jTable1.rowAtPoint(evt.getPoint());
            String sid=jTable1.getValueAt(row,0).toString();
            
            classes.Postgraduate pg = new classes.Postgraduate();
            
            ResultSet rs = pg.viewStudent(sid);
            
            if(rs.next()){
                lbl_ssid1.setVisible(true);
                lbl_sid1.setText(sid);
                cmb_course1.setSelectedItem(rs.getString("COURSE"));
                txt_fName1.setText(rs.getString("FNAME"));
                txt_lName1.setText(rs.getString("LNAME"));
                txt_addNo1.setText(rs.getString("ADDNO"));
                txt_addStreet1.setText(rs.getString("ADDSTREET"));
                txt_addCity1.setText(rs.getString("ADDCITY"));
                txt_mobNo1.setText(rs.getString("TELMOBILE"));
                txt_resNo1.setText(rs.getString("TELRESIDENCE"));
                cmb_batch1.setSelectedItem(rs.getString("BATCH"));
                txt_institute.setText(rs.getString("INSTITUTE"));
                txt_field.setText(rs.getString("FIELD"));
                txt_type.setText(rs.getString("TYPE"));
                cmb_year.setSelectedItem(rs.getString("YEAROFCOMPLETION"));
            }
        }
        catch(NullPointerException np){
            JOptionPane.showMessageDialog(null, "Please select a record with valid data.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_add.setEnabled(false);
        
        try{
            int row=jTable.rowAtPoint(evt.getPoint());
            String sid=jTable.getValueAt(row,0).toString();
            
            classes.Undergraduate ug = new classes.Undergraduate();
            
            ResultSet rs = ug.viewStudent(sid);
            
            if(rs.next()){
                lbl_ssid.setVisible(true);
                lbl_sid.setText(sid);
                cmb_course.setSelectedItem(rs.getString("COURSE"));
                txt_fName.setText(rs.getString("FNAME"));
                txt_lName.setText(rs.getString("LNAME"));
                txt_addNo.setText(rs.getString("ADDNO"));
                txt_addStreet.setText(rs.getString("ADDSTREET"));
                txt_addCity.setText(rs.getString("ADDCITY"));
                txt_mobNo.setText(rs.getString("TELMOBILE"));
                txt_resNo.setText(rs.getString("TELRESIDENCE"));
                cmb_batch.setSelectedItem(rs.getString("BATCH"));
                txt_rank.setText(rs.getString("RANK"));
                cmb_sub1.setSelectedItem(rs.getString("SUBJECT1"));
                cmb_res1.setSelectedItem(rs.getString("RES1"));
                cmb_sub2.setSelectedItem(rs.getString("SUBJECT2"));
                cmb_res2.setSelectedItem(rs.getString("RES2"));
                cmb_sub3.setSelectedItem(rs.getString("SUBJECT3"));
                cmb_res3.setSelectedItem(rs.getString("RES3"));
            }
        }
        catch(NullPointerException np){
            JOptionPane.showMessageDialog(null, "Please select a record with valid data.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error occured. Please try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTableMouseClicked
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student("ABC", "ABC").setVisible(true);
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
    private javax.swing.JComboBox cmb_batch;
    private javax.swing.JComboBox cmb_batch1;
    private javax.swing.JComboBox cmb_course;
    private javax.swing.JComboBox cmb_course1;
    private javax.swing.JComboBox cmb_res1;
    private javax.swing.JComboBox cmb_res2;
    private javax.swing.JComboBox cmb_res3;
    private javax.swing.JComboBox cmb_sub1;
    private javax.swing.JComboBox cmb_sub2;
    private javax.swing.JComboBox cmb_sub3;
    private javax.swing.JComboBox cmb_year;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_sid;
    private javax.swing.JLabel lbl_sid1;
    private javax.swing.JLabel lbl_ssid;
    private javax.swing.JLabel lbl_ssid1;
    private javax.swing.JTextField txt_addCity;
    private javax.swing.JTextField txt_addCity1;
    private javax.swing.JTextField txt_addNo;
    private javax.swing.JTextField txt_addNo1;
    private javax.swing.JTextField txt_addStreet;
    private javax.swing.JTextField txt_addStreet1;
    private javax.swing.JTextField txt_fName;
    private javax.swing.JTextField txt_fName1;
    private javax.swing.JTextField txt_field;
    private javax.swing.JTextField txt_institute;
    private javax.swing.JTextField txt_lName;
    private javax.swing.JTextField txt_lName1;
    private javax.swing.JTextField txt_mobNo;
    private javax.swing.JTextField txt_mobNo1;
    private javax.swing.JTextField txt_rank;
    private javax.swing.JTextField txt_resNo;
    private javax.swing.JTextField txt_resNo1;
    private javax.swing.JTextField txt_type;
    // End of variables declaration//GEN-END:variables
}
