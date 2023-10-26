/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuantiga;

/**
 *
 * @author reza danis
 */
public class OrangJawa extends Orang implements Mahasiswa, Pramusaji, PenjagaWarnet {

    @Override
    public void belajar() {
        System.out.println("Saya belajar");
    }

    ;
    
    @Override
    public void menyajikanPesanan() {
        System.out.println("Saya menyajikan makanan");
    }

    ;
    
    @Override
    public void jagaWarnet() {
        System.out.println("Saya jaga warnet");
    }

    ;
    
    public void setDomisili() {
        super.setDomisili("Jawa");
    }

    public OrangJawa() {
        this.setDomisili();
    }

}
