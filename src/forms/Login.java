package forms;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); //to get it to the center of the screen
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(1600, 800));
        setMinimumSize(new java.awt.Dimension(1600, 800));
        setPreferredSize(new java.awt.Dimension(1600, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(234, 255, 255));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1089, 784);

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-businessman-filled-100.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1260, 120, 160, 110);

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WELCOME");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1200, 40, 280, 42);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1150, 450, 110, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1150, 290, 110, 24);

        txt_username.setBackground(new java.awt.Color(255, 255, 255));
        txt_username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_username.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_username);
        txt_username.setBounds(1150, 330, 380, 50);

        btn_login.setBackground(new java.awt.Color(20, 70, 101));
        btn_login.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Log In");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login);
        btn_login.setBounds(1280, 660, 140, 50);

        error.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("Please enter the username and password");
        error.setEnabled(false);
        error.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(error);
        error.setBounds(1151, 600, 380, 19);

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_password);
        txt_password.setBounds(1150, 490, 380, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1506, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String username = txt_username.getText();
        String password = txt_password.getText();
        
        if(username.equals("superadmin")){
            if(password.equals("superadmin123")){
                MainMenu form = new MainMenu();
                this.setVisible(false);
                form.setVisible(true);
            }
        }
        
        else if(username.equals("socadmin")){
            if(password.equals("socadmin123")){
                new SubMenu("SOC", "SOC").setVisible(true);
                this.setVisible(false);
            }
        }
        
        else if(username.equals("soeadmin")){
            if(password.equals("soeadmin123")){
                new SubMenu("SOE", "SOE").setVisible(true);
                this.setVisible(false);
            }
        }
        
        else if(username.equals("sobadmin")){
            if(password.equals("sobadmin123")){
                new SubMenu("SOB", "SOB").setVisible(true);
                this.setVisible(false);
            }
        }
        
        else{
            error.setEnabled(true);
            error.setText("Incorrect Credentials. Please try again");
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
