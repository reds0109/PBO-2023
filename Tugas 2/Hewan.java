/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas;

/**
 *
 * @author reza danis
 */
public class Hewan extends MakhlukHidup {
    public Hewan() {
        this.jenisMakanan = "Tumbuhan";
    }
    
    public Hewan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }    
    
    public Hewan(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
    
  private int jumlahKaki;

    /**
     * @return the jumlahKaki
     */
    public int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
}
