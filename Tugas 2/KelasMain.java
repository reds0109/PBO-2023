/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utama;

import pbotugas.Herbivora;
import pbotugas.Karnivora;
import pbotugas.Tumbuhan;

/**
 *
 * @author reza danis
 */
public class KelasMain {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Herbivora jerapah = new Herbivora ();
        jerapah.setNama("jerapah");
        jerapah.setSpesies("Giraffa camelopardalis");
        jerapah.setJumlahKaki(4);
        jerapah.setHerbivora(true);
        
        Karnivora harimau = new Karnivora ("Daging");
        harimau.setNama("harimau");
        harimau.setSpesies("Panthera tigris");
        harimau.setJumlahKaki(4);
        harimau.setKarnivora(true);
        
        Tumbuhan mangga = new Tumbuhan ();
        mangga.setNama("mangga");
        mangga.setSpesies("Mangifera indica");
        mangga.setUmur(3);
        mangga.setJenisMakanan("hasil fotosintesis");
        mangga.setDikotil(true);
            
        System.out.println("Nama hewan adalah " + jerapah.getNama() + " , spesies " + jerapah.getSpesies() + " , makanannya adalah " + jerapah.getJenisMakanan() + " , jumlah kakinya ada " + jerapah.getJumlahKaki() + " , Apakah termasuk hewan herbivora? " + jerapah.isHerbivora());
        System.out.println("Nama hewan adalah " + harimau.getNama() + " , spesies " + harimau.getSpesies() + " , makanannya adalah " + harimau.getJenisMakanan() + " , jumlah kakinya ada " + harimau.getJumlahKaki() + " , Apakah termasuk hewan karnivora? " + harimau.isKarnivora());
        System.out.println("Nama tumbuhan adalah " + mangga.getNama() + " , spesies " + mangga.getSpesies() + " , umur tumbuhan " + mangga.getUmur() + " tahun" + " , makanan diperoleh dari " + mangga.getJenisMakanan() + " , Apakah termasuk tumbuhan dikotil? " + mangga.isDikotil());
    
    }
}
