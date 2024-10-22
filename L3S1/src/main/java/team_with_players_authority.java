
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class team_with_players_authority extends javax.swing.JFrame {

    
    public team_with_players_authority() {
        initComponents();
        combobox();
        table_update();
    }

  
    Connection conn ;
    PreparedStatement insert;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        team_table = new javax.swing.JTable();
        cmbbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(147, 196, 231));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        back.setBackground(new java.awt.Color(213, 235, 249));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Team Name :");

        team_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        team_table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        team_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player's Name", "Type", "Category", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(team_table);

        cmbbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(back))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbbox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_update()
    {
        int c;
        String selected = cmbbox.getSelectedItem().toString();
        
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/l3s1","root","mdihtushar");
            insert = conn.prepareStatement("SELECT player_name,player_type,player_category,sold_price FROM player_info WHERE player_team='"+selected+"' order by player_type,player_category");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss =rs.getMetaData();
            
            c= rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)team_table.getModel();
            df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v= new Vector();
                
                for(int a=1;a<c;a++)
                {
                    v.add(rs.getString("player_name"));
                    v.add(rs.getString("player_type"));
                    v.add(rs.getString("player_category"));
                    v.add(rs.getString("sold_price")); 
                    
                }
                df.addRow(v);
                
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(team_with_players_authority.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
     private void combobox()
    {
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/l3s1","root","mdihtushar");
            insert = conn.prepareStatement("SELECT DISTINCT team_name FROM team_info");
            ResultSet rs;
            rs = insert.executeQuery();
            while(rs.next())
            {
                cmbbox.addItem(rs.getString("team_name"));
            }
            
        }
         catch (SQLException ex) {
            Logger.getLogger(team_with_players_authority.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        auctioning inf0 = new auctioning();
        inf0.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void cmbboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbboxActionPerformed
        table_update();
    }//GEN-LAST:event_cmbboxActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new team_with_players_authority().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> cmbbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable team_table;
    // End of variables declaration//GEN-END:variables
}
