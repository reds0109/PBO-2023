/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo_uas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author reza danis
 */
public class SkripsiGUI extends javax.swing.JFrame {

    /**
     * Creates new form Skripsi
     */
    
    private Timer refreshTimer;

    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<SkripsiPOJO> dataSkripsi;

    private void updateTable(EntityManager em) {
        dataSkripsi.clear();

        // ... (kode untuk mendapatkan data dari database)
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.addColumn("ID Skripsi");
        newModel.addColumn("Judul");
        newModel.addColumn("Pengarang");
        newModel.addColumn("Tahun");
        newModel.addColumn("Jumlah Halaman");

        for (SkripsiPOJO data : dataSkripsi) {
            Object[] rowData = {
                data.getId_skripsi(),
                data.getJudul(),
                data.getPengarang(),
                data.getTahun(),
                data.getJumlah_halaman(),
            };
            newModel.addRow(rowData);
        }

        jTableSkripsi.setModel(newModel);
    }

    private void tampil(Connection conn) {
        dataSkripsi.clear();
        try {
            // Ganti query dengan query yang sesuai
            String sql = "SELECT * FROM Skripsi";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                SkripsiPOJO dataPOJO = new SkripsiPOJO();

                dataPOJO.setId_skripsi(String.valueOf(rs.getObject(1)));
                dataPOJO.setJudul(String.valueOf(rs.getObject(2)));
                dataPOJO.setPengarang(String.valueOf(rs.getObject(3)));
                dataPOJO.setTahun(String.valueOf(rs.getObject(4)));
                dataPOJO.setJumlah_halaman(String.valueOf(rs.getObject(5)));
                dataSkripsi.add(dataPOJO);
            }
            DefaultTableModel model = (DefaultTableModel) jTableSkripsi.getModel();
            model.setRowCount(0);
            for (SkripsiPOJO data : dataSkripsi) {

                Object[] baris = new Object[5];
                baris[0] = data.getId_skripsi();
                baris[1] = data.getJudul();
                baris[2] = data.getPengarang();
                baris[3] = data.getTahun();
                baris[4] = data.getJumlah_halaman();
                model.addRow(baris);

            }
        } catch (SQLException ex) {
            Logger.getLogger(SkripsiGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public SkripsiGUI() {
        try {
            dataSkripsi = new ArrayList<>();
            initComponents();
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/PBO_UAS", "postgres", "123");
            tampil(conn);
                        refreshTimer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tampil(conn);
                }
            });
            refreshTimer.start();

        } catch (SQLException ex) {
            Logger.getLogger(SkripsiGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void kosongkan_form() {
        jTextFieldID.setText("");
        jTextFieldJudul.setText("");
        jTextFieldPengarang.setText("");
        jTextFieldTahun.setText("");
        jTextFieldHal.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonSimpan = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonKembali = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldJudul = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextFieldTahun = new javax.swing.JTextField();
        jTextFieldHal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSkripsi = new javax.swing.JTable();
        jTextFieldPengarang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonUploud = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA SKRIPSI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel3.setText("ID Skripsi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel4.setText("Judul");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel5.setText("Tahun");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel6.setText("Jumlah Halaman");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jButtonSimpan.setBackground(new java.awt.Color(30, 66, 38));
        jButtonSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSimpan.setText("SIMPAN");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jButtonUpdate.setBackground(new java.awt.Color(30, 66, 38));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        jButtonDelete.setBackground(new java.awt.Color(30, 66, 38));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("HAPUS");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        jButtonKembali.setBackground(new java.awt.Color(30, 66, 38));
        jButtonKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonKembali.setForeground(new java.awt.Color(255, 255, 255));
        jButtonKembali.setText("KEMBALI");
        jButtonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        jButtonBatal.setBackground(new java.awt.Color(30, 66, 38));
        jButtonBatal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBatal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBatal.setText("BATAL");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Screenshots\\Screenshot 2023-11-11 233641.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 70));
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 250, -1));
        getContentPane().add(jTextFieldJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 250, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 240, -1));
        getContentPane().add(jTextFieldTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 180, -1));
        getContentPane().add(jTextFieldHal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 180, -1));

        jTableSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Skripsi", "Judul", "Pengarang", "Tahun", "Jumlah Halaman"
            }
        ));
        jTableSkripsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSkripsiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSkripsi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 700, 260));
        getContentPane().add(jTextFieldPengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 250, -1));

        jLabel9.setText("Pengarang");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jButtonUploud.setBackground(new java.awt.Color(30, 66, 38));
        jButtonUploud.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonUploud.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUploud.setText("UPLOUD");
        jButtonUploud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploudActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUploud, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        jLabel1.setBackground(new java.awt.Color(30, 66, 38));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Screenshots\\Screenshot 2023-11-10 153602.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKembaliActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonKembaliActionPerformed

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String Id_skripsi = jTextFieldID.getText().trim();
        String Judul = jTextFieldJudul.getText();
        String Pengarang = jTextFieldPengarang.getText();
        String Tahun = jTextFieldTahun.getText();
        String Jumlah_halaman = jTextFieldHal.getText();
        
        try {
            EntityManager entityManager = Persistence.createEntityManagerFactory("PBO_UASPU").createEntityManager();
            entityManager.getTransaction().begin();
            Skripsi s = new Skripsi();
            s.setIdSkripsi(Id_skripsi);
            s.setJudul(Judul);
            s.setPengarang(Pengarang);
            s.setTahun(Tahun);
            s.setJumlahHalaman(Jumlah_halaman);

            entityManager.persist(s);
            entityManager.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            // Kosongkan form setelah simpan
            kosongkan_form();

            // Perbarui tabel
            updateTable(entityManager);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jTableSkripsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSkripsiMouseClicked
        // TODO add your handling code here:
        int baris = jTableSkripsi.rowAtPoint(evt.getPoint());
        String ID_Skripsi = jTableSkripsi.getValueAt(baris, 0).toString();
        jTextFieldID.setText(ID_Skripsi);

        String Judul = jTableSkripsi.getValueAt(baris, 1).toString();
        jTextFieldJudul.setText(Judul);

        String Pengarang = jTableSkripsi.getValueAt(baris, 2).toString();
        jTextFieldPengarang.setText(Pengarang);

        String Tahun = jTableSkripsi.getValueAt(baris, 3).toString();
        jTextFieldTahun.setText(Tahun);

        String Jumlah_halaman = jTableSkripsi.getValueAt(baris, 4).toString();
        jTextFieldHal.setText(Jumlah_halaman);
    }//GEN-LAST:event_jTableSkripsiMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        String Id_skripsi = jTextFieldID.getText().trim();
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBO_UASPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            Skripsi s = em.find(Skripsi.class, Id_skripsi);
            em.remove(s);

            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            // Perbarui tabel
            updateTable(em);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        jTextFieldID.setText("");
        
        kosongkan_form();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String Id_skripsi = jTextFieldID.getText().trim();
        String Judul = jTextFieldJudul.getText();
        String Pengarang = jTextFieldPengarang.getText();
        String Tahun = jTextFieldTahun.getText();
        String Jumlah_halaman = jTextFieldHal.getText();

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBO_UASPU");
            EntityManager em = emf.createEntityManager();
            Skripsi s = new Skripsi();
            s.setIdSkripsi(Id_skripsi);
            s.setJudul(Judul);
            s.setPengarang(Pengarang);
            s.setTahun(Tahun);
            s.setJumlahHalaman(Jumlah_halaman);
            em.getTransaction().begin();
            em.merge(s);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil diupdate.", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            // Perbarui tabel
            updateTable(em);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal mengupdate data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        jTextFieldID.setText("");
        jTextFieldJudul.setText("");
        jTextFieldPengarang.setText("");
        jTextFieldTahun.setText("");
        jTextFieldHal.setText("");
        kosongkan_form();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonUploudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploudActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();

        int i = filechooser.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {

            EntityManager entityManager = Persistence.createEntityManagerFactory("PBO_UASPU").createEntityManager();
            entityManager.getTransaction().begin();

            File f = filechooser.getSelectedFile();
            String filepath = f.getPath();
            String fi = f.getName();
            //Parsing CSV Data
            System.out.print(filepath);
            DefaultTableModel csv_data = new DefaultTableModel();

            try {

                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                for (CSVRecord csvRecord : csvParser) {

                    Skripsi s = new Skripsi();
                    s.setIdSkripsi(csvRecord.get(0));
                    s.setJudul(csvRecord.get(1));
                    s.setPengarang(csvRecord.get(2));
                    s.setTahun(csvRecord.get(3));
                    s.setJumlahHalaman(csvRecord.get(4));
                    entityManager.persist(s);
                }

            } catch (Exception ex) {
                System.out.println("Error in Parsing CSV File");
            }

            entityManager.getTransaction().commit();
        }
    }//GEN-LAST:event_jButtonUploudActionPerformed

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
            java.util.logging.Logger.getLogger(SkripsiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkripsiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkripsiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkripsiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SkripsiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonKembali;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonUploud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSkripsi;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldHal;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldJudul;
    private javax.swing.JTextField jTextFieldPengarang;
    private javax.swing.JTextField jTextFieldTahun;
    // End of variables declaration//GEN-END:variables
}
