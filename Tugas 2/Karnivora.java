/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas;

/**
 *
 * @author reza danis
 */
public class Karnivora extends Hewan {
    public Karnivora(String jenisMakanan) {
        super(jenisMakanan);
    }
    
    public Karnivora(int jumlahKaki) {
        super(jumlahKaki);
    }
    
    public Karnivora(boolean karnivora) {
        this.karnivora = karnivora;         
    }
    
    protected boolean karnivora;
   
    /**
     * @return the karnivora
     */
    public boolean isKarnivora() {
        return karnivora;
    }
    

    /**
     * @param karnivora the karnivora to set
     */
    public void setKarnivora(boolean karnivora) {
        this.karnivora = karnivora;
    }

    
}