/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_managebase_byteam6;

import Class.Buku;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Team 6
 */
public class BukuGUI extends javax.swing.JFrame {
Buku buku = new Buku("idbuku", "judul", "penulis", "penerbit", 10);
    /**
     * Creates new form Buku
     */
    public BukuGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel_Peminjaman = new javax.swing.JLabel();
        jLabel_Pengembalian = new javax.swing.JLabel();
        jLabel_Buku = new javax.swing.JLabel();
        jLabel_member = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        tf_idbuku = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_judul = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_penulis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_penerbit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_show = new javax.swing.JButton();
        jspinner_stok = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_buku = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(197, 137, 64));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Library Manage Base", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Ink Free", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(250, 234, 177));
        jPanel2.setForeground(new java.awt.Color(250, 234, 177));

        jPanel4.setBackground(new java.awt.Color(197, 137, 64));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(250, 234, 177), java.awt.Color.white, new java.awt.Color(250, 234, 177)));

        jLabel_Peminjaman.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel_Peminjaman.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Peminjaman.setText("Peminjaman");
        jLabel_Peminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PeminjamanMouseClicked(evt);
            }
        });

        jLabel_Pengembalian.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel_Pengembalian.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Pengembalian.setText("Pengembalian");
        jLabel_Pengembalian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PengembalianMouseClicked(evt);
            }
        });

        jLabel_Buku.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel_Buku.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Buku.setText("Buku");
        jLabel_Buku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BukuMouseClicked(evt);
            }
        });

        jLabel_member.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel_member.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_member.setText("Member");
        jLabel_member.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_memberMouseClicked(evt);
            }
        });

        btn_logout.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(197, 137, 64));
        btn_logout.setText("Logout");
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_member)
                    .addComponent(jLabel_Buku)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_Pengembalian, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_Peminjaman)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(btn_logout))))
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel_member)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Buku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Peminjaman)
                .addGap(12, 12, 12)
                .addComponent(jLabel_Pengembalian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout)
                .addGap(47, 47, 47))
        );

        tf_idbuku.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_idbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idbukuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(197, 137, 64));
        jLabel1.setText("Id Buku");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(197, 137, 64));
        jLabel5.setText("Judul");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(197, 137, 64));
        jLabel8.setText("Penerbit");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(197, 137, 64));
        jLabel6.setText("Penulis");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(197, 137, 64));
        jLabel7.setText("Stok");

        btn_show.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_show.setForeground(new java.awt.Color(197, 137, 64));
        btn_show.setText("Show");
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });

        jspinner_stok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jspinner_stokMouseClicked(evt);
            }
        });

        tabel_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Buku", "Judul", "Penulis", "Penerbit", "Stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel_buku);
        tabel_buku.getAccessibleContext().setAccessibleName("");

        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(197, 137, 64));
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_idbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(tf_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGap(42, 42, 42)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(tf_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(tf_penulis, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jspinner_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_add)))
                    .addComponent(btn_show))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_idbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jspinner_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_idbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idbukuActionPerformed

    public void showDatafromDB() {
    try {
        Connection conn = Connector_db.getConnection();
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM buku";

        ResultSet rs = statement.executeQuery(sql);
        ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
        DefaultTableModel model = (DefaultTableModel) tabel_buku.getModel();
        int cols = rsmd.getColumnCount();

        // Menghapus kolom yang ada pada tabel sebelumnya (jika ada)
        model.setColumnCount(0);

        // Menambahkan nama kolom ke model tabel
        for (int i = 1; i <= cols; i++) {
            model.addColumn(rsmd.getColumnName(i));
        }

        // Menambahkan data ke model tabel
        while (rs.next()) {
            Object[] row = new Object[cols];
            for (int i = 1; i <= cols; i++) {
                row[i - 1] = rs.getObject(i);
            }
            model.addRow(row);
        }

        statement.close();
        conn.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
    

   public void showDataInTable() {
    try {
        Connection conn = Connector_db.getConnection();

        // Menyiapkan pernyataan SQL untuk mendapatkan data dari tabel
        String sql = "SELECT * FROM buku";
        PreparedStatement statement = conn.prepareStatement(sql);

        // Menjalankan pernyataan SQL dan mendapatkan hasilnya
        ResultSet rs = statement.executeQuery();

        // Mengambil metadata hasil query
        ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        // Menghapus data sebelumnya dari tabel
        DefaultTableModel model = (DefaultTableModel) tabel_buku.getModel();
        model.setRowCount(0);

        // Menambahkan baris data ke dalam tabel
        while (rs.next()) {
            Object[] rowData = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
                rowData[i] = rs.getObject(i + 1);
            }
            model.addRow(rowData);
        }

        // Menutup koneksi dan pernyataan SQL
        rs.close();
        statement.close();
        conn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage());
    }
}
    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
    showDataInTable();   
    }//GEN-LAST:event_btn_showActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        LoginGUI login = new LoginGUI();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void jLabel_PengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PengembalianMouseClicked
        PengembalianGUI pengembalian = new PengembalianGUI();
        pengembalian.setVisible(true);
        pengembalian.pack();
        pengembalian.setLocationRelativeTo(null);
        pengembalian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_PengembalianMouseClicked

    private void jLabel_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_memberMouseClicked
        MemberGUI member = new MemberGUI();
        member.setVisible(true);
        member.pack();
        member.setLocationRelativeTo(null);
        member.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_memberMouseClicked

    private void jLabel_BukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BukuMouseClicked
        BukuGUI buku = new BukuGUI();
        buku.setVisible(true);
        buku.pack();
        buku.setLocationRelativeTo(null);
        buku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_BukuMouseClicked

    private void jLabel_PeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PeminjamanMouseClicked
        PeminjamanGUI peminjaman = new PeminjamanGUI();
        peminjaman.setVisible(true);
        peminjaman.pack();
        peminjaman.setLocationRelativeTo(null);
        peminjaman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_PeminjamanMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        LoginGUI login = new LoginGUI();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

//    public void insertDatatoDB(String idbuku, String judul, String penulis, String penerbit, int stok) {
//        try {
//            Connection conn = Connector_db.getConnection();
//            
//            String sql = "INSERT INTO buku (idbuku, judul, penulis, penerbit, stok) VALUES (?, ?, ? ,? ,?)";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setString(1, idbuku);
//            statement.setString(2, judul);
//            statement.setString(3, penulis);
//            statement.setString(4, penerbit);
//            statement.setInt(5, stok);
//
//            
//            int rowsInserted = statement.executeUpdate();
//            if (rowsInserted > 0) {
//                JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke dalam database!");
//                
//            }
//
//            statement.close();
//            conn.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage());
//        }
//    }
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String idbuku = tf_idbuku.getText();
        String judul = tf_judul.getText();
        String penulis = tf_penulis.getText();
        String penerbit = tf_penerbit.getText();
        int stok = (int)jspinner_stok.getValue();
        buku.insertDatatoDB(idbuku,judul,penulis,penerbit,stok);
    }//GEN-LAST:event_btn_addActionPerformed

    private void jspinner_stokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jspinner_stokMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jspinner_stokMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BukuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BukuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BukuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BukuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BukuGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_show;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Buku;
    private javax.swing.JLabel jLabel_Peminjaman;
    private javax.swing.JLabel jLabel_Pengembalian;
    private javax.swing.JLabel jLabel_member;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jspinner_stok;
    private javax.swing.JTable tabel_buku;
    private javax.swing.JTextField tf_idbuku;
    private javax.swing.JTextField tf_judul;
    private javax.swing.JTextField tf_penerbit;
    private javax.swing.JTextField tf_penulis;
    // End of variables declaration//GEN-END:variables
}
