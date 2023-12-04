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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
public class PeminjamanBukuGUI extends javax.swing.JFrame {

    /**
     * Creates new form LaporanPeminjaman
     */
    
    private Timer refreshTimer;
    
    private void kosongkan_form() {
        jTextFieldID.setText("");
        jTextFieldNama.setText("");
        jTextFieldProdi.setText("");
        jTextFieldAng.setText("");
        jTextFieldJumlah.setText("");
        jComboBox1.setSelectedItem("");
        jTextFieldPinjam.setText("");
        jTextFieldKembali.setText("");
    }
    
    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<PeminjamanBukuPOJO> dataPeminjamanBuku;

    private void tampil(Connection conn) {
        dataPeminjamanBuku.clear();
        try {
            String sql = "Select * from peminjaman_buku";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                PeminjamanBukuPOJO data = new PeminjamanBukuPOJO();
                data.setId(String.valueOf(rs.getObject(1)));
                data.setNama(String.valueOf(rs.getObject(2)));
                data.setProgram_studi(String.valueOf(rs.getObject(3)));
                data.setAngkatan(String.valueOf(rs.getObject(4)));
                data.setJumlah_buku(String.valueOf(rs.getObject(5)));
                data.setKategori(String.valueOf(rs.getObject(6)));
                data.setTanggal_peminjaman(String.valueOf(rs.getObject(7)));
                data.setTanggal_pengembalian(String.valueOf(rs.getObject(8)));
                dataPeminjamanBuku.add(data);
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            for (PeminjamanBukuPOJO data : dataPeminjamanBuku) {

                Object[] baris = new Object[8];
                baris[0] = data.getId();
                baris[1] = data.getNama();
                baris[2] = data.getProgram_studi();
                baris[3] = data.getAngkatan();
                baris[4] = data.getJumlah_buku();
                baris[5] = data.getKategori();
                baris[6] = data.getTanggal_peminjaman();
                baris[7] = data.getTanggal_pengembalian();
                model.addRow(baris);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanBukuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public PeminjamanBukuGUI() {
        try {
            dataPeminjamanBuku = new ArrayList<>();
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
            Logger.getLogger(PeminjamanBukuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jButtonSimpan = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonKembali = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldProdi = new javax.swing.JTextField();
        jTextFieldJumlah = new javax.swing.JTextField();
        jTextFieldPinjam = new javax.swing.JTextField();
        jTextFieldKembali = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonUploud = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAng = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA PEMINJAMAN BUKU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 60));

        jButtonSimpan.setBackground(new java.awt.Color(30, 66, 38));
        jButtonSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSimpan.setText("SIMPAN");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 80, -1));

        jButtonUpdate.setBackground(new java.awt.Color(30, 66, 38));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 80, -1));

        jButtonDelete.setBackground(new java.awt.Color(30, 66, 38));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("HAPUS");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 80, -1));

        jButtonKembali.setBackground(new java.awt.Color(30, 66, 38));
        jButtonKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonKembali.setForeground(new java.awt.Color(255, 255, 255));
        jButtonKembali.setText("KEMBALI");
        jButtonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));

        jButtonBatal.setBackground(new java.awt.Color(30, 66, 38));
        jButtonBatal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBatal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBatal.setText("BATAL");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 80, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Screenshots\\Screenshot 2023-11-11 233641.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 70));

        jLabel5.setText("ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel6.setText("Nama");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel7.setText("Program Studi");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel8.setText("Jumlah Buku");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel9.setText("Tanggal Peminjaman");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel10.setText("Tanggal Pengembalian");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 400, -1));
        getContentPane().add(jTextFieldNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 400, -1));
        getContentPane().add(jTextFieldProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 400, -1));
        getContentPane().add(jTextFieldJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 400, -1));
        getContentPane().add(jTextFieldPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 400, -1));
        getContentPane().add(jTextFieldKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 400, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Program Studi", "Angkatan", "Jumlah Buku", "Kategori", "Tanggal Peminjaman", "Tanggal Pengembalian"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 760, 150));

        jButtonUploud.setBackground(new java.awt.Color(30, 66, 38));
        jButtonUploud.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonUploud.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUploud.setText("UPLOUD");
        jButtonUploud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploudActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUploud, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 80, -1));

        jLabel4.setText("Angkatan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        getContentPane().add(jTextFieldAng, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 400, -1));

        jLabel11.setText("Kategori");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH KATEGORI", "Arsitektur", "Bahasa", "Ilmu Sosial", "Sains", "Teknik", "Teknologi" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 400, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Screenshots\\Screenshot 2023-11-10 153602.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

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
        String id = jTextFieldID.getText().trim();
        String nama = jTextFieldNama.getText();
        String program_studi = jTextFieldProdi.getText();
        String angkatan = jTextFieldAng.getText();
        String jumlah_buku = jTextFieldJumlah.getText();
        String kategori = (String) jComboBox1.getSelectedItem();
        String tanggal_peminjaman = jTextFieldPinjam.getText();
        String tanggal_pengembalian = jTextFieldKembali.getText();
        
        try {

            EntityManager entityManager = Persistence.createEntityManagerFactory("PBO_UASPU").createEntityManager();
            entityManager.getTransaction().begin();
            PeminjamanBuku p = new PeminjamanBuku();
            p.setId(id);
            p.setNama(nama);
            p.setProgramStudi(program_studi);
            p.setAngkatan(angkatan);
            p.setJumlahBuku(jumlah_buku);
            p.setKategori(kategori);
            p.setTanggalPeminjaman(tanggal_peminjaman);
            p.setTanggalPengembalian(tanggal_pengembalian);

            entityManager.persist(p);
            entityManager.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        jTextFieldID.setText("");
        jTextFieldNama.setText("");
        jTextFieldProdi.setText("");
        jTextFieldAng.setText("");
        jTextFieldJumlah.setText("");
        jComboBox1.getSelectedItem();
        jTextFieldPinjam.setText("");
        jTextFieldKembali.setText("");
        kosongkan_form();
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String id = jTextFieldID.getText().trim();
        String nama = jTextFieldNama.getText();
        String program_studi = jTextFieldProdi.getText();
        String angkatan = jTextFieldAng.getText();
        String jumlah_buku = jTextFieldJumlah.getText();
        String kategori = (String) jComboBox1.getSelectedItem();
        String tanggal_peminjaman = jTextFieldPinjam.getText();
        String tanggal_pengembalian = jTextFieldKembali.getText();
        
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBO_UASPU");
            EntityManager em = emf.createEntityManager();
            PeminjamanBuku p = new PeminjamanBuku();
            p.setId(id);
            p.setNama(nama);
            p.setProgramStudi(program_studi);
            p.setAngkatan(angkatan);
            p.setJumlahBuku(jumlah_buku);
            p.setKategori(kategori);
            p.setTanggalPeminjaman(tanggal_peminjaman);
            p.setTanggalPengembalian(tanggal_pengembalian);

            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil diupdate.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Gagal mengupdate data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        jTextFieldID.setText("");
        jTextFieldNama.setText("");
        jTextFieldProdi.setText("");
        jTextFieldAng.setText("");
        jTextFieldJumlah.setText("");
        jComboBox1.getSelectedItem();
        jTextFieldPinjam.setText("");
        jTextFieldKembali.setText("");
        kosongkan_form();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        String id = jTextFieldID.getText().trim();
        
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBO_UASPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            PeminjamanBuku p = em.find(PeminjamanBuku.class, id);
            em.remove(p);

            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        jTextFieldID.setText("");
        kosongkan_form();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

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

                        PeminjamanBuku p = new PeminjamanBuku();
                        p.setId(csvRecord.get(0));
                        p.setNama(csvRecord.get(1));
                        p.setProgramStudi(csvRecord.get(2));
                        p.setAngkatan(csvRecord.get(3));
                        p.setJumlahBuku(csvRecord.get(4));
                        p.setKategori(csvRecord.get(5));
                        p.setTanggalPeminjaman(csvRecord.get(6));
                        p.setTanggalPengembalian(csvRecord.get(7));
                        entityManager.persist(p);
                        
                        }
                        
                    } catch (Exception ex) {
                        System.out.println("Error in Parsing CSV File");
                    }
                    
                    entityManager.getTransaction().commit();
                }
    }//GEN-LAST:event_jButtonUploudActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String id = jTable1.getValueAt(baris, 0).toString();
        jTextFieldID.setText(id);

        String nama = jTable1.getValueAt(baris, 1).toString();
        jTextFieldNama.setText(nama);

        String program_studi = jTable1.getValueAt(baris, 2).toString();
        jTextFieldProdi.setText(program_studi);
        
        String angkatan = jTable1.getValueAt(baris, 3).toString();
        jTextFieldAng.setText(angkatan);

        String jumlah_buku = jTable1.getValueAt(baris, 4).toString();
        jTextFieldJumlah.setText(jumlah_buku);
        
        String kategori = jTable1.getValueAt(baris, 5).toString();
        jComboBox1.getSelectedItem();

        String tanggal_peminjaman = jTable1.getValueAt(baris, 6).toString();
        jTextFieldPinjam.setText(tanggal_peminjaman);

        String tanggal_pengembalian = jTable1.getValueAt(baris, 7).toString();
        jTextFieldKembali.setText(tanggal_pengembalian);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(PeminjamanBukuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeminjamanBukuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeminjamanBukuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeminjamanBukuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeminjamanBukuGUI().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAng;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldJumlah;
    private javax.swing.JTextField jTextFieldKembali;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldPinjam;
    private javax.swing.JTextField jTextFieldProdi;
    // End of variables declaration//GEN-END:variables
}
