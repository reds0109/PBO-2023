/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuantiga;

/**
 *
 * @author reza danis
 */
public class OrangSunda extends Orang implements GuruLes, Florist, AdminOlshop {
    
    @Override
    public void mengajarLes() {
        System.out.println("Saya mengajar les");
    }

    ;
    
    @Override
    public void merangkaiBunga() {
        System.out.println("Saya merangkai bunga");
    }

    ;
    
    @Override
    public void mengelolaOlshop() {
        System.out.println("Saya mengelola olshop");
    }

    ;
    
    public void setDomisili() {
        super.setDomisili("Sunda");
    }
    
    public OrangSunda() {
        this.setDomisili();
    }
    
}
