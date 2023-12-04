/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_uas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author reza danis
 */
@Entity
@Table(name = "peminjaman_buku")
@NamedQueries({
    @NamedQuery(name = "PeminjamanBuku.findAll", query = "SELECT p FROM PeminjamanBuku p"),
    @NamedQuery(name = "PeminjamanBuku.findById", query = "SELECT p FROM PeminjamanBuku p WHERE p.id = :id"),
    @NamedQuery(name = "PeminjamanBuku.findByNama", query = "SELECT p FROM PeminjamanBuku p WHERE p.nama = :nama"),
    @NamedQuery(name = "PeminjamanBuku.findByProgramStudi", query = "SELECT p FROM PeminjamanBuku p WHERE p.programStudi = :programStudi"),
    @NamedQuery(name = "PeminjamanBuku.findByAngkatan", query = "SELECT p FROM PeminjamanBuku p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "PeminjamanBuku.findByJumlahBuku", query = "SELECT p FROM PeminjamanBuku p WHERE p.jumlahBuku = :jumlahBuku"),
    @NamedQuery(name = "PeminjamanBuku.findByKategori", query = "SELECT p FROM PeminjamanBuku p WHERE p.kategori = :kategori"),
    @NamedQuery(name = "PeminjamanBuku.findByTanggalPeminjaman", query = "SELECT p FROM PeminjamanBuku p WHERE p.tanggalPeminjaman = :tanggalPeminjaman"),
    @NamedQuery(name = "PeminjamanBuku.findByTanggalPengembalian", query = "SELECT p FROM PeminjamanBuku p WHERE p.tanggalPengembalian = :tanggalPengembalian")})
public class PeminjamanBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "program_studi")
    private String programStudi;
    @Column(name = "angkatan")
    private String angkatan;
    @Column(name = "jumlah_buku")
    private String jumlahBuku;
    @Column(name = "kategori")
    private String kategori;
    @Column(name = "tanggal_peminjaman")
    private String tanggalPeminjaman;
    @Column(name = "tanggal_pengembalian")
    private String tanggalPengembalian;

    public PeminjamanBuku() {
    }

    public PeminjamanBuku(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(String jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(String tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public String getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanBuku)) {
            return false;
        }
        PeminjamanBuku other = (PeminjamanBuku) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pbo_uas.PeminjamanBuku[ id=" + id + " ]";
    }
    
}
