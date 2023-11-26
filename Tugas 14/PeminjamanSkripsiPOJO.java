/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_uas;

/**
 *
 * @author reza danis
 */
public class PeminjamanSkripsiPOJO {
    private String id_peminjaman;
    private String nama;
    private String program_studi;
    private String angkatan;
    private String jumlah_skripsi;
    private String tanggal_peminjaman;
    private String tanggal_pengembalian;

    /**
     * @return the id_peminjaman
     */
    public String getId_peminjaman() {
        return id_peminjaman;
    }

    /**
     * @param id_peminjaman the id_peminjaman to set
     */
    public void setId_peminjaman(String id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the program_studi
     */
    public String getProgram_studi() {
        return program_studi;
    }

    /**
     * @param program_studi the program_studi to set
     */
    public void setProgram_studi(String program_studi) {
        this.program_studi = program_studi;
    }

    /**
     * @return the jumlah_skripsi
     */
    public String getJumlah_skripsi() {
        return jumlah_skripsi;
    }

    /**
     * @param jumlah_skripsi the jumlah_skripsi to set
     */
    public void setJumlah_skripsi(String jumlah_skripsi) {
        this.jumlah_skripsi = jumlah_skripsi;
    }

    /**
     * @return the tanggal_peminjaman
     */
    public String getTanggal_peminjaman() {
        return tanggal_peminjaman;
    }

    /**
     * @param tanggal_peminjaman the tanggal_peminjaman to set
     */
    public void setTanggal_peminjaman(String tanggal_peminjaman) {
        this.tanggal_peminjaman = tanggal_peminjaman;
    }

    /**
     * @return the tanggal_pengembalian
     */
    public String getTanggal_pengembalian() {
        return tanggal_pengembalian;
    }

    /**
     * @param tanggal_pengembalian the tanggal_pengembalian to set
     */
    public void setTanggal_pengembalian(String tanggal_pengembalian) {
        this.tanggal_pengembalian = tanggal_pengembalian;
    }

    /**
     * @return the angkatan
     */
    public String getAngkatan() {
        return angkatan;
    }

    /**
     * @param angkatan the angkatan to set
     */
    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
}
