/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotask;

/**
 *
 * @author reza danis
 */
public class Mangga {
    public static void main(String[] args) {
        // TODO code application logic here
        Tumbuhan mangga = new Tumbuhan();
        mangga.setNama("Mangga");
        mangga.setNamaLatin("Mangifera indica");
        mangga.setKingdom("Plantae");
        mangga.setOrdo("Sapindales");
        mangga.setFamili("Anacardiaceae");
        mangga.setJenisDaun("Sederhana");
        mangga.setTulangDaun("Menyirip");
        mangga.setJenisBatang("Berkayu");
        mangga.setJenisAkar("Tunggang");
        mangga.setBentukBiji("Pipih");
        mangga.setCadanganMakanan("Buah");
        mangga.setJenisBunga("Majemuk");
        
        System.out.println("Nama tumbuhan : "+ mangga.getNama());
        System.out.println("Nama latin : " + mangga.getNamaLatin());
        System.out.println("Mangga termasuk dalam kingdom : " + mangga.getKingdom());
        System.out.println("Mangga termasuk dalam ordo : " + mangga.getOrdo());
        System.out.println("Mangga termasuk dalam famili : " + mangga.getFamili());
        System.out.println("Jenis daun : " + mangga.getJenisDaun());
        System.out.println("Tulang daun : " + mangga.getTulangDaun());
        System.out.println("Jenis batang : " + mangga.getJenisBatang());
        System.out.println("Jenis akar : " + mangga.getJenisAkar());
        System.out.println("Bentuk biji : " + mangga.getBentukBiji());
        System.out.println("Tempat penyimpanan cadangan makanan : " + mangga.getCadanganMakanan());
        System.out.println("Jenis bunga : " + mangga.getJenisBunga());
        
        System.out.println(mangga.bergerak());
        System.out.println(mangga.berkembangbiak());
    }
}
