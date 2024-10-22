
public class openning extends javax.swing.JFrame {

    
    public openning() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        background0 = new javax.swing.JPanel();
        signup = new javax.swing.JButton();
        authoritylogin = new javax.swing.JButton();
        userlogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 102, 0));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setToolTipText("");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        background0.setBackground(new java.awt.Color(147, 196, 231));
        background0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), null, null));
        background0.setForeground(new java.awt.Color(255, 255, 255));
        background0.setPreferredSize(new java.awt.Dimension(800, 600));

        signup.setBackground(new java.awt.Color(213, 235, 249));
        signup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signup.setText("Sign Up");
        signup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        authoritylogin.setBackground(new java.awt.Color(99, 130, 180));
        authoritylogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        authoritylogin.setForeground(new java.awt.Color(255, 255, 255));
        authoritylogin.setText("Authority login");
        authoritylogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        authoritylogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorityloginActionPerformed(evt);
            }
        });

        userlogin.setBackground(new java.awt.Color(99, 130, 180));
        userlogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userlogin.setForeground(new java.awt.Color(255, 255, 255));
        userlogin.setText("User login");
        userlogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        userlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userloginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("If you are new sign up here...");

        javax.swing.GroupLayout background0Layout = new javax.swing.GroupLayout(background0);
        background0.setLayout(background0Layout);
        background0Layout.setHorizontalGroup(
            background0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background0Layout.createSequentialGroup()
                .addGroup(background0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background0Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(background0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(authoritylogin, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background0Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        background0Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {authoritylogin, userlogin});

        background0Layout.setVerticalGroup(
            background0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background0Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(userlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(authoritylogin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(background0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        background0Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {authoritylogin, userlogin});

        getContentPane().add(background0, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 810, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        signupinterface inf0 = new signupinterface();
        inf0.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signupActionPerformed

    private void userloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userloginActionPerformed
       verifyuserlogin us = new verifyuserlogin();
        us.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_userloginActionPerformed

    private void authorityloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorityloginActionPerformed
        verifyauthoritylogin us = new verifyauthoritylogin();
        us.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_authorityloginActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new openning().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authoritylogin;
    private javax.swing.JLabel background;
    private javax.swing.JPanel background0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton signup;
    private javax.swing.JButton userlogin;
    // End of variables declaration//GEN-END:variables
}
