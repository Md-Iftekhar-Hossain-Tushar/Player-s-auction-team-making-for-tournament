
public class users extends javax.swing.JFrame {

    /**
     * Creates new form users
     */
    public users() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        players_with_team = new javax.swing.JButton();
        playerinfouser = new javax.swing.JButton();
        teaminfouser = new javax.swing.JButton();
        userlogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(147, 196, 231));

        jButton2.setBackground(new java.awt.Color(213, 235, 249));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        players_with_team.setBackground(new java.awt.Color(99, 130, 180));
        players_with_team.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        players_with_team.setForeground(new java.awt.Color(255, 255, 255));
        players_with_team.setText("Players of Team");
        players_with_team.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        players_with_team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                players_with_teamActionPerformed(evt);
            }
        });

        playerinfouser.setBackground(new java.awt.Color(99, 130, 180));
        playerinfouser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerinfouser.setForeground(new java.awt.Color(255, 255, 255));
        playerinfouser.setText("Player Info");
        playerinfouser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerinfouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerinfouserActionPerformed(evt);
            }
        });

        teaminfouser.setBackground(new java.awt.Color(99, 130, 180));
        teaminfouser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        teaminfouser.setForeground(new java.awt.Color(255, 255, 255));
        teaminfouser.setText("Team Info");
        teaminfouser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        teaminfouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teaminfouserActionPerformed(evt);
            }
        });

        userlogin1.setBackground(new java.awt.Color(99, 130, 180));
        userlogin1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userlogin1.setForeground(new java.awt.Color(255, 255, 255));
        userlogin1.setText("Change Pass");
        userlogin1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userlogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teaminfouser, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userlogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerinfouser, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(players_with_team, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {playerinfouser, players_with_team, teaminfouser, userlogin1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerinfouser, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teaminfouser, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(players_with_team, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {playerinfouser, players_with_team, teaminfouser});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        openning inf0 = new openning();
        inf0.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void players_with_teamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_players_with_teamActionPerformed
        team_with_players up = new team_with_players();
        up.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_players_with_teamActionPerformed

    private void playerinfouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerinfouserActionPerformed
        playerinfo_users up = new playerinfo_users();
        up.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_playerinfouserActionPerformed

    private void teaminfouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teaminfouserActionPerformed
        TeamInfo_user up = new TeamInfo_user();
        up.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_teaminfouserActionPerformed

    private void userlogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userlogin1ActionPerformed
        user_passchange up = new user_passchange();
        up.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_userlogin1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playerinfouser;
    private javax.swing.JButton players_with_team;
    private javax.swing.JButton teaminfouser;
    private javax.swing.JButton userlogin1;
    // End of variables declaration//GEN-END:variables
}
