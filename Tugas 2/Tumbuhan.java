/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas;

/**
 *
 * @author reza danis
 */
public class Tumbuhan extends MakhlukHidup {
    public Tumbuhan() {
        this.jenisMakanan = "hasil dari fotosintesis";
    }
    
    public Tumbuhan(int umur) {
        super(umur);
    }
    
    public Tumbuhan(boolean dikotil) {
        this.dikotil = dikotil;
    }
    
    protected boolean dikotil;
    

    /**
     * @return the dikotil
     */
    public boolean isDikotil() {
        return dikotil;
    }

    /**
     * @param dikotil the dikotil to set
     */
    public void setDikotil(boolean dikotil) {
        this.dikotil = dikotil;
    }
    
}
