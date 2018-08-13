package forms;

import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SubMenu extends javax.swing.JFrame {
    public String formType, userType;
    
    public SubMenu(String form, String user) {
        formType = form;
        userType = user;
        initComponents();
        this.setLocationRelativeTo(null); //screen centering
        if(formType.equals("SOC"))
            jLabel6.setText("School of Computing");
        else if(formType.equals("SOB"))
            jLabel6.setText("School of Business");
        else if(formType.equals("SOE"))
            jLabel6.setText("School of Engineering");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_sche = new javax.swing.JButton();
        btn_pay = new javax.swing.JButton();
        btn_res = new javax.swing.JButton();
        btn_stu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(1500, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(234, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(null);

        btn_sche.setBackground(new java.awt.Color(203, 213, 255));
        btn_sche.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_sche.setForeground(java.awt.Color.darkGray);
        btn_sche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/schedule.png"))); // NOI18N
        btn_sche.setText("Schedule Management");
        btn_sche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sche.setIconTextGap(10);
        btn_sche.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_sche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scheActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sche);
        btn_sche.setBounds(1020, 200, 430, 570);

        btn_pay.setBackground(new java.awt.Color(203, 213, 255));
        btn_pay.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_pay.setForeground(java.awt.Color.darkGray);
        btn_pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment.png"))); // NOI18N
        btn_pay.setText("Payment Management");
        btn_pay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pay.setIconTextGap(10);
        btn_pay.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pay);
        btn_pay.setBounds(535, 200, 430, 265);

        btn_res.setBackground(new java.awt.Color(203, 213, 255));
        btn_res.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_res.setForeground(java.awt.Color.darkGray);
        btn_res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/result.png"))); // NOI18N
        btn_res.setText("Results Management");
        btn_res.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_res.setIconTextGap(10);
        btn_res.setMaximumSize(new java.awt.Dimension(100, 116));
        btn_res.setMinimumSize(new java.awt.Dimension(100, 116));
        btn_res.setPreferredSize(new java.awt.Dimension(100, 116));
        btn_res.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resActionPerformed(evt);
            }
        });
        jPanel1.add(btn_res);
        btn_res.setBounds(535, 510, 430, 260);

        btn_stu.setBackground(new java.awt.Color(203, 213, 255));
        btn_stu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_stu.setForeground(java.awt.Color.darkGray);
        btn_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student.png"))); // NOI18N
        btn_stu.setText("Student Management");
        btn_stu.setFocusPainted(false);
        btn_stu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_stu.setIconTextGap(10);
        btn_stu.setMaximumSize(new java.awt.Dimension(100, 116));
        btn_stu.setMinimumSize(new java.awt.Dimension(100, 116));
        btn_stu.setPreferredSize(new java.awt.Dimension(100, 116));
        btn_stu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_stu);
        btn_stu.setBounds(50, 200, 430, 570);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("School of Computing");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 50, 790, 80);

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btn_back.setText("jLabel1");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(50, 70, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        this.hide();
        new Paymetns(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_payActionPerformed

    private void btn_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resActionPerformed
        new ResultsMenu(this, true, formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_resActionPerformed

    private void btn_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stuActionPerformed
        new StudentMenu(this, true, formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_stuActionPerformed

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        if(userType == "admin"){
            this.hide();
            new MainMenu().setVisible(true);
        }
        else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to logout?", "Logout", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
              this.hide();
              new Login().setVisible(true);
            }
        }    
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_scheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scheActionPerformed
        new ScheduleMenu(this, true, formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_scheActionPerformed
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubMenu("ABC", "ABC").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_pay;
    private javax.swing.JButton btn_res;
    private javax.swing.JButton btn_sche;
    private javax.swing.JButton btn_stu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
