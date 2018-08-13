package forms;

public class StudentMenu extends javax.swing.JDialog {

    public String formType, userType;
    
    public StudentMenu(java.awt.Frame parent, boolean modal, String form, String user) {
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
        btn_yearEnrol = new javax.swing.JButton();
        btn_addStudent = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_yearEnrol1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(null);

        btn_yearEnrol.setBackground(new java.awt.Color(203, 213, 255));
        btn_yearEnrol.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_yearEnrol.setForeground(java.awt.Color.darkGray);
        btn_yearEnrol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enrolment.png"))); // NOI18N
        btn_yearEnrol.setText("Manage Enrolment");
        btn_yearEnrol.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_yearEnrol.setIconTextGap(10);
        btn_yearEnrol.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_yearEnrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yearEnrolActionPerformed(evt);
            }
        });
        jPanel1.add(btn_yearEnrol);
        btn_yearEnrol.setBounds(435, 150, 360, 310);

        btn_addStudent.setBackground(new java.awt.Color(203, 213, 255));
        btn_addStudent.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_addStudent.setForeground(java.awt.Color.darkGray);
        btn_addStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addStudent.png"))); // NOI18N
        btn_addStudent.setText("Manage Student");
        btn_addStudent.setFocusPainted(false);
        btn_addStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_addStudent.setIconTextGap(10);
        btn_addStudent.setMaximumSize(new java.awt.Dimension(100, 116));
        btn_addStudent.setMinimumSize(new java.awt.Dimension(100, 116));
        btn_addStudent.setPreferredSize(new java.awt.Dimension(100, 116));
        btn_addStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addStudentActionPerformed(evt);
            }
        });
        jPanel1.add(btn_addStudent);
        btn_addStudent.setBounds(30, 150, 360, 310);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Student Menu");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 40, 1210, 80);

        btn_yearEnrol1.setBackground(new java.awt.Color(203, 213, 255));
        btn_yearEnrol1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_yearEnrol1.setForeground(java.awt.Color.darkGray);
        btn_yearEnrol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/promoteBatches.png"))); // NOI18N
        btn_yearEnrol1.setText("Promote Batches");
        btn_yearEnrol1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_yearEnrol1.setIconTextGap(10);
        btn_yearEnrol1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_yearEnrol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yearEnrol1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_yearEnrol1);
        btn_yearEnrol1.setBounds(840, 150, 360, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_yearEnrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yearEnrolActionPerformed
        this.setVisible(false);
        this.getParent().setVisible(false);
        new Enrollment(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_yearEnrolActionPerformed

    private void btn_addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addStudentActionPerformed
        this.setVisible(false);
        this.getParent().setVisible(false);
        new Student(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_addStudentActionPerformed

    private void btn_yearEnrol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yearEnrol1ActionPerformed
        this.setVisible(false);
        this.getParent().setVisible(false);
        new PromoteBatches(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_yearEnrol1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentMenu dialog = new StudentMenu(new javax.swing.JFrame(), true, "ABC", "ABC");
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
    private javax.swing.JButton btn_addStudent;
    private javax.swing.JButton btn_yearEnrol;
    private javax.swing.JButton btn_yearEnrol1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
