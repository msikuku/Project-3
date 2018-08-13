package forms;

public class ScheduleMenu extends javax.swing.JDialog {

    public String formType, userType;
    
    public ScheduleMenu(java.awt.Frame parent, boolean modal, String form, String user) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null); //to get it to the center of the screen
        formType = form;
        userType = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_manageSchedule = new javax.swing.JButton();
        btn_manageSubjects = new javax.swing.JButton();
        btn_manageStaff = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(null);

        btn_manageSchedule.setBackground(new java.awt.Color(203, 213, 255));
        btn_manageSchedule.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_manageSchedule.setForeground(java.awt.Color.darkGray);
        btn_manageSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addSchedule.png"))); // NOI18N
        btn_manageSchedule.setText("Manage Schedule");
        btn_manageSchedule.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_manageSchedule.setIconTextGap(10);
        btn_manageSchedule.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_manageSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageScheduleActionPerformed(evt);
            }
        });
        jPanel1.add(btn_manageSchedule);
        btn_manageSchedule.setBounds(830, 150, 360, 310);

        btn_manageSubjects.setBackground(new java.awt.Color(203, 213, 255));
        btn_manageSubjects.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_manageSubjects.setForeground(java.awt.Color.darkGray);
        btn_manageSubjects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addSubject.png"))); // NOI18N
        btn_manageSubjects.setText("Manage Subjects");
        btn_manageSubjects.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_manageSubjects.setIconTextGap(10);
        btn_manageSubjects.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_manageSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageSubjectsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_manageSubjects);
        btn_manageSubjects.setBounds(430, 150, 360, 310);

        btn_manageStaff.setBackground(new java.awt.Color(203, 213, 255));
        btn_manageStaff.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_manageStaff.setForeground(java.awt.Color.darkGray);
        btn_manageStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addStaff.png"))); // NOI18N
        btn_manageStaff.setText("Manage Staff");
        btn_manageStaff.setFocusPainted(false);
        btn_manageStaff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_manageStaff.setIconTextGap(10);
        btn_manageStaff.setMaximumSize(new java.awt.Dimension(100, 116));
        btn_manageStaff.setMinimumSize(new java.awt.Dimension(100, 116));
        btn_manageStaff.setPreferredSize(new java.awt.Dimension(100, 116));
        btn_manageStaff.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_manageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageStaffActionPerformed(evt);
            }
        });
        jPanel1.add(btn_manageStaff);
        btn_manageStaff.setBounds(30, 150, 360, 310);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Schedule Menu");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 40, 800, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_manageSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageSubjectsActionPerformed
        this.hide();
        this.getParent().hide();
        new Subjects(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_manageSubjectsActionPerformed

    private void btn_manageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageStaffActionPerformed
        this.hide();
        this.getParent().hide();
        new Staff(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_manageStaffActionPerformed

    private void btn_manageScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageScheduleActionPerformed
        this.hide();
        this.getParent().hide();
        new Schedule(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_manageScheduleActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScheduleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ScheduleMenu dialog = new ScheduleMenu(new javax.swing.JFrame(), true, "ABC", "ABC");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_manageSchedule;
    private javax.swing.JButton btn_manageStaff;
    private javax.swing.JButton btn_manageSubjects;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
