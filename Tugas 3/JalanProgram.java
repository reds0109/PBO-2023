/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utama;

import pbopertemuantiga.Orang;
import pbopertemuantiga.OrangJawa;
import pbopertemuantiga.OrangBetawi;
import pbopertemuantiga.OrangSunda;

/**
 *
 * @author reza danis
 */
public class JalanProgram {

    public static void main(String[] args) {
        // TODO code application logic here

        OrangJawa joko = new OrangJawa();
        System.out.println("Joko orang " + joko.getDomisili());
        System.out.println("Joko " + joko.makanPagi("pagi"));
        System.out.println("Joko " + joko.makanPagi(7));
        System.out.println("joko tidur, " + joko.tidur("malam ") + joko.tidur(10));
        joko.belajar();
        joko.menyajikanPesanan();
        joko.jagaWarnet();
        System.out.println("                                   ");
        System.out.println("                                   ");
        OrangBetawi siDoel = new OrangBetawi();
        System.out.println("siDoel orang " + siDoel.getDomisili());
        System.out.println("siDoel " + siDoel.makanSiang("siang"));
        System.out.println("siDoel " + siDoel.makanSiang(12));
        System.out.println("siDoel tidur, " + siDoel.tidur("malam ") + siDoel.tidur(11));
        siDoel.menjahit();
        siDoel.menjualBeras();
        siDoel.menjualBuah();
        System.out.println("                                   ");
        System.out.println("                                   ");
        OrangSunda asep = new OrangSunda();
        System.out.println("asep orang " + asep.getDomisili());
        System.out.println("asep " + asep.makanMalam());
        System.out.println("asep " + asep.makanMalam("malam"));
        System.out.println("asep " + asep.makanMalam(6));
        System.out.println("asep tidur, " + asep.tidur("malam ") + asep.tidur(9));
        asep.mengajarLes();
        asep.merangkaiBunga();
        asep.mengelolaOlshop();
        System.out.println("                                   ");
        System.out.println("                                   ");
        Orang x = new Orang();
        System.out.println("x orang " + x.getDomisili());
        System.out.println("x " + x.makanPagi());
        System.out.println("x " + x.tidur());
    }
}