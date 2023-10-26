/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas;

/**
 *
 * @author reza danis
 */
public class Herbivora extends Hewan {
    
    public Herbivora() {
        this.jenisMakanan = "Tumbuhan";
    }
    
    public Herbivora(int jumlahKaki) {
        super(jumlahKaki);
    }
    
    public Herbivora(boolean herbivora) {
        this.herbivora = herbivora;
    }
    
    protected boolean herbivora;

    /**
     * @return the herbivora
     */
    public boolean isHerbivora() {
        return herbivora;
    }
    
    

    /**
     * @param herbivora the herbivora to set
     */
    public void setHerbivora(boolean herbivora) {
        this.herbivora = herbivora;
    }
    
}
