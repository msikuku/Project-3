package forms;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null); //to get it to the center of the screen
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_sob = new javax.swing.JButton();
        btn_soe = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_soc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(1500, 800));
        setMinimumSize(new java.awt.Dimension(1500, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(234, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(null);

        btn_sob.setBackground(new java.awt.Color(203, 213, 255));
        btn_sob.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_sob.setForeground(java.awt.Color.darkGray);
        btn_sob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/business.png"))); // NOI18N
        btn_sob.setText("School of Business");
        btn_sob.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sob.setIconTextGap(10);
        btn_sob.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_sob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sobActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sob);
        btn_sob.setBounds(1020, 200, 430, 290);

        btn_soe.setBackground(new java.awt.Color(203, 213, 255));
        btn_soe.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_soe.setForeground(java.awt.Color.darkGray);
        btn_soe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/engineer.png"))); // NOI18N
        btn_soe.setText("School of Engineering");
        btn_soe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_soe.setIconTextGap(10);
        btn_soe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_soe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_soeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_soe);
        btn_soe.setBounds(530, 200, 430, 290);

        btn_logout.setBackground(new java.awt.Color(203, 213, 255));
        btn_logout.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_logout.setForeground(java.awt.Color.darkGray);
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logout.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_logout.setIconTextGap(10);
        btn_logout.setMaximumSize(new java.awt.Dimension(100, 116));
        btn_logout.setMinimumSize(new java.awt.Dimension(100, 116));
        btn_logout.setPreferredSize(new java.awt.Dimension(100, 116));
        btn_logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout);
        btn_logout.setBounds(50, 530, 1400, 230);

        btn_soc.setBackground(new java.awt.Color(203, 213, 255));
        btn_soc.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_soc.setForeground(java.awt.Color.darkGray);
        btn_soc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compuer.png"))); // NOI18N
        btn_soc.setText("School of Computing");
        btn_soc.setFocusPainted(false);
        btn_soc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_soc.setIconTextGap(10);
        btn_soc.setMaximumSize(new java.awt.Dimension(100, 116));
        btn_soc.setMinimumSize(new java.awt.Dimension(100, 116));
        btn_soc.setPreferredSize(new java.awt.Dimension(100, 116));
        btn_soc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_soc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_socActionPerformed(evt);
            }
        });
        jPanel1.add(btn_soc);
        btn_soc.setBounds(50, 200, 430, 290);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Main Menu");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(590, 50, 330, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sobActionPerformed
        this.hide();
        new SubMenu("SOB", "admin").setVisible(true);
    }//GEN-LAST:event_btn_sobActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to logout?", "Logout", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
          this.hide();
          new Login().setVisible(true);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_socActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_socActionPerformed
        this.hide();
        new SubMenu("SOC", "admin").setVisible(true);
    }//GEN-LAST:event_btn_socActionPerformed

    private void btn_soeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_soeActionPerformed
        this.hide();
        new SubMenu("SOE", "admin").setVisible(true);
    }//GEN-LAST:event_btn_soeActionPerformed
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_sob;
    private javax.swing.JButton btn_soc;
    private javax.swing.JButton btn_soe;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
