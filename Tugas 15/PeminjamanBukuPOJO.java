/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_uas;

/**
 *
 * @author reza danis
 */
public class PeminjamanBukuPOJO {
    private String id;
    private String nama;
    private String program_studi;
    private String angkatan;
    private String jumlah_buku;
    private String kategori;
    private String tanggal_peminjaman;
    private String tanggal_pengembalian;

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
     * @return the jumlah_buku
     */
    public String getJumlah_buku() {
        return jumlah_buku;
    }

    /**
     * @param jumlah_buku the jumlah_buku to set
     */
    public void setJumlah_buku(String jumlah_buku) {
        this.jumlah_buku = jumlah_buku;
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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

    /**
     * @return the kategori
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
