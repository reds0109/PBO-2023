/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuantiga;

/**
 *
 * @author reza danis
 */
public class OrangBetawi extends Orang implements Penjahit, PenjualBeras, PedagangBuah {
    
    @Override
    public void menjahit() {
        System.out.println("Saya menjahit");
    }

    ;
    
    @Override
    public void menjualBeras() {
        System.out.println("Saya menjual beras");
    }

    ;
    
    @Override
    public void menjualBuah() {
        System.out.println("Saya menjual buah");
    }

    ;
    
    public void setDomisili() {
        super.setDomisili("Betawi");
    }
    
    public OrangBetawi() {
        this.setDomisili();
    }
    
}
