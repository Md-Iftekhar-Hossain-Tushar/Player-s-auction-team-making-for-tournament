
public class authority extends javax.swing.JFrame {

    
    public authority() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        TeamInfo_athority = new javax.swing.JButton();
        Player_Info_athority1 = new javax.swing.JButton();
        add_team_player = new javax.swing.JButton();
        change_passautho = new javax.swing.JButton();
        Auction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(147, 196, 231));

        jButton2.setBackground(new java.awt.Color(213, 235, 249));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TeamInfo_athority.setBackground(new java.awt.Color(99, 130, 180));
        TeamInfo_athority.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TeamInfo_athority.setForeground(new java.awt.Color(255, 255, 255));
        TeamInfo_athority.setText("Team Info");
        TeamInfo_athority.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        TeamInfo_athority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamInfo_athorityActionPerformed(evt);
            }
        });

        Player_Info_athority1.setBackground(new java.awt.Color(99, 130, 180));
        Player_Info_athority1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Player_Info_athority1.setForeground(new java.awt.Color(255, 255, 255));
        Player_Info_athority1.setText("Player Info");
        Player_Info_athority1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Player_Info_athority1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player_Info_athority1ActionPerformed(evt);
            }
        });

        add_team_player.setBackground(new java.awt.Color(99, 130, 180));
        add_team_player.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add_team_player.setForeground(new java.awt.Color(255, 255, 255));
        add_team_player.setText("Add team & player");
        add_team_player.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        add_team_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_team_playerActionPerformed(evt);
            }
        });

        change_passautho.setBackground(new java.awt.Color(99, 130, 180));
        change_passautho.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        change_passautho.setForeground(new java.awt.Color(255, 255, 255));
        change_passautho.setText("Change Pass");
        change_passautho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        change_passautho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_passauthoActionPerformed(evt);
            }
        });

        Auction.setBackground(new java.awt.Color(99, 130, 180));
        Auction.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Auction.setForeground(new java.awt.Color(255, 255, 255));
        Auction.setText("Auction");
        Auction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Auction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuctionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(change_passautho, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Auction, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_team_player, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TeamInfo_athority, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(Player_Info_athority1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Auction, Player_Info_athority1, TeamInfo_athority, change_passautho});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Player_Info_athority1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeamInfo_athority, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_team_player, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(change_passautho, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Auction, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Auction, Player_Info_athority1, TeamInfo_athority, add_team_player, change_passautho});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void Player_Info_athority1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player_Info_athority1ActionPerformed
        playerinfo_authority up = new playerinfo_authority();
        up.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Player_Info_athority1ActionPerformed

    private void TeamInfo_athorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamInfo_athorityActionPerformed
        TeamInfo_athority up = new TeamInfo_athority();
        up.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_TeamInfo_athorityActionPerformed

    private void add_team_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_team_playerActionPerformed
        Add_team_player up = new Add_team_player();
        up.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_add_team_playerActionPerformed

    private void AuctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuctionActionPerformed
        auctioning up = new auctioning();
        up.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AuctionActionPerformed

    private void change_passauthoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_passauthoActionPerformed
        authority_passchange up = new authority_passchange();
        up.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_change_passauthoActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new authority().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Auction;
    private javax.swing.JButton Player_Info_athority1;
    private javax.swing.JButton TeamInfo_athority;
    private javax.swing.JButton add_team_player;
    private javax.swing.JButton change_passautho;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
