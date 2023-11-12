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
@Table(name = "skripsi")
@NamedQueries({
    @NamedQuery(name = "Skripsi.findAll", query = "SELECT s FROM Skripsi s"),
    @NamedQuery(name = "Skripsi.findByIDSkripsi", query = "SELECT s FROM Skripsi s WHERE s.iDSkripsi = :iDSkripsi"),
    @NamedQuery(name = "Skripsi.findByJudul", query = "SELECT s FROM Skripsi s WHERE s.judul = :judul"),
    @NamedQuery(name = "Skripsi.findByPengarang", query = "SELECT s FROM Skripsi s WHERE s.pengarang = :pengarang"),
    @NamedQuery(name = "Skripsi.findByTahun", query = "SELECT s FROM Skripsi s WHERE s.tahun = :tahun"),
    @NamedQuery(name = "Skripsi.findByJumlahhalaman", query = "SELECT s FROM Skripsi s WHERE s.jumlahhalaman = :jumlahhalaman")})
public class Skripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Skripsi")
    private String iDSkripsi;
    @Column(name = "Judul")
    private String judul;
    @Column(name = "Pengarang")
    private String pengarang;
    @Column(name = "Tahun")
    private String tahun;
    @Column(name = "Jumlah_halaman")
    private String jumlahhalaman;

    public Skripsi() {
    }

    public Skripsi(String iDSkripsi) {
        this.iDSkripsi = iDSkripsi;
    }

    public String getIDSkripsi() {
        return iDSkripsi;
    }

    public void setIDSkripsi(String iDSkripsi) {
        this.iDSkripsi = iDSkripsi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getJumlahhalaman() {
        return jumlahhalaman;
    }

    public void setJumlahhalaman(String jumlahhalaman) {
        this.jumlahhalaman = jumlahhalaman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSkripsi != null ? iDSkripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skripsi)) {
            return false;
        }
        Skripsi other = (Skripsi) object;
        if ((this.iDSkripsi == null && other.iDSkripsi != null) || (this.iDSkripsi != null && !this.iDSkripsi.equals(other.iDSkripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pbo_uas.Skripsi[ iDSkripsi=" + iDSkripsi + " ]";
    }
    
}
