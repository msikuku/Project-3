package forms;

public class ResultsMenu extends javax.swing.JDialog {

    public String formType, userType;
    
    public ResultsMenu(java.awt.Frame parent, boolean modal, String form, String user) {
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
        btn_addResults = new javax.swing.JButton();
        btn_viewResults = new javax.swing.JButton();
        btn_addAssignment = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(null);

        btn_addResults.setBackground(new java.awt.Color(203, 213, 255));
        btn_addResults.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_addResults.setForeground(java.awt.Color.darkGray);
        btn_addResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addResults.png"))); // NOI18N
        btn_addResults.setText("Add Results");
        btn_addResults.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_addResults.setIconTextGap(10);
        btn_addResults.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_addResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addResultsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_addResults);
        btn_addResults.setBounds(830, 150, 360, 310);

        btn_viewResults.setBackground(new java.awt.Color(203, 213, 255));
        btn_viewResults.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_viewResults.setForeground(java.awt.Color.darkGray);
        btn_viewResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewResults.png"))); // NOI18N
        btn_viewResults.setText("View Results");
        btn_viewResults.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_viewResults.setIconTextGap(10);
        btn_viewResults.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_viewResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewResultsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_viewResults);
        btn_viewResults.setBounds(430, 150, 360, 310);

        btn_addAssignment.setBackground(new java.awt.Color(203, 213, 255));
        btn_addAssignment.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_addAssignment.setForeground(java.awt.Color.darkGray);
        btn_addAssignment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addAssignment.png"))); // NOI18N
        btn_addAssignment.setText("Add Assignment");
        btn_addAssignment.setFocusPainted(false);
        btn_addAssignment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_addAssignment.setIconTextGap(10);
        btn_addAssignment.setMaximumSize(new java.awt.Dimension(100, 116));
        btn_addAssignment.setMinimumSize(new java.awt.Dimension(100, 116));
        btn_addAssignment.setPreferredSize(new java.awt.Dimension(100, 116));
        btn_addAssignment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_addAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addAssignmentActionPerformed(evt);
            }
        });
        jPanel1.add(btn_addAssignment);
        btn_addAssignment.setBounds(30, 150, 360, 310);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Results Menu");
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

    private void btn_viewResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewResultsActionPerformed
        this.setVisible(false);
        this.getParent().setVisible(false);
        new ViewResults(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_viewResultsActionPerformed

    private void btn_addAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addAssignmentActionPerformed
        this.setVisible(false);
        this.getParent().setVisible(false);
        new AddAssignment(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_addAssignmentActionPerformed

    private void btn_addResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addResultsActionPerformed
        this.setVisible(false);
        this.getParent().setVisible(false);
        new AddResults(formType, userType).setVisible(true);
    }//GEN-LAST:event_btn_addResultsActionPerformed

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
            java.util.logging.Logger.getLogger(ResultsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResultsMenu dialog = new ResultsMenu(new javax.swing.JFrame(), true, "ABC", "ABC");
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
    private javax.swing.JButton btn_addAssignment;
    private javax.swing.JButton btn_addResults;
    private javax.swing.JButton btn_viewResults;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
