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
@Table(name = "peminjaman_skripsi")
@NamedQueries({
    @NamedQuery(name = "PeminjamanSkripsi.findAll", query = "SELECT p FROM PeminjamanSkripsi p"),
    @NamedQuery(name = "PeminjamanSkripsi.findByIdPeminjaman", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.idPeminjaman = :idPeminjaman"),
    @NamedQuery(name = "PeminjamanSkripsi.findByNama", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.nama = :nama"),
    @NamedQuery(name = "PeminjamanSkripsi.findByProgramStudi", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.programStudi = :programStudi"),
    @NamedQuery(name = "PeminjamanSkripsi.findByJumlahBuku", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.jumlahBuku = :jumlahBuku"),
    @NamedQuery(name = "PeminjamanSkripsi.findByTanggalPeminjaman", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.tanggalPeminjaman = :tanggalPeminjaman"),
    @NamedQuery(name = "PeminjamanSkripsi.findByTanggalPengembalian", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.tanggalPengembalian = :tanggalPengembalian")})
public class PeminjamanSkripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_peminjaman")
    private String idPeminjaman;
    @Column(name = "nama")
    private String nama;
    @Column(name = "program_studi")
    private String programStudi;
    @Column(name = "jumlah_buku")
    private String jumlahBuku;
    @Column(name = "tanggal_peminjaman")
    private String tanggalPeminjaman;
    @Column(name = "tanggal_pengembalian")
    private String tanggalPengembalian;

    public PeminjamanSkripsi() {
    }

    public PeminjamanSkripsi(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
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

    public String getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(String jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
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
        hash += (idPeminjaman != null ? idPeminjaman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanSkripsi)) {
            return false;
        }
        PeminjamanSkripsi other = (PeminjamanSkripsi) object;
        if ((this.idPeminjaman == null && other.idPeminjaman != null) || (this.idPeminjaman != null && !this.idPeminjaman.equals(other.idPeminjaman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pbo_uas.PeminjamanSkripsi[ idPeminjaman=" + idPeminjaman + " ]";
    }
    
}
