/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbopertemuantiga;

/**
 *
 * @author reza danis
 */
public class Orang {

    public Orang() {
        this.domisili = "di planet bumi";
    }

    private String jenisMakanan;
    private String jenisMinuman;
    private String jenisBaju;
    private String domisili = "di planet bumi";

    public String makanPagi() {
        return "sedang makan pagi nyam nyam";
    }

    public String makanPagi(String waktu) {
        return "sedang makan pagi nyam nyam, " + "waktunya " + waktu;
    }

    public String makanPagi(int waktu) {
        return "sedang makan pagi nyam nyam, " + "waktunya jam " + String.valueOf(waktu);
    }

    public String makanSiang(String waktu) {
        return "sedang makan siang nyam nyam, " + "waktunya " + waktu;
    }

    public String makanSiang(int waktu) {
        return "sedang makan siang nyam nyam, " + "waktunya jam " + String.valueOf(waktu);
    }

    public String makanMalam() {
        return "sedang makan malam nyam nyam";
    }

    public String makanMalam(String waktu) {
        return "sedang makan malam nyam nyam, " + "waktunya " + waktu;
    }

    public String makanMalam(int waktu) {
        return "sedang makan malam nyam nyam, " + "waktunya jam " + String.valueOf(waktu);
    }

    public String tidur() {
        return "tidur zzz";
    }

    public String tidur(String waktu) {
        return "waktunya " + waktu;
    }

    public String tidur(int waktu) {
        return "jam " + String.valueOf(waktu);
    }

    /**
     * @param args the command line arguments
     */
    /**
     * @return the jenisMakanan
     */
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    /**
     * @param jenisMakanan the jenisMakanan to set
     */
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    /**
     * @return the jenisMinuman
     */
    public String getJenisMinuman() {
        return jenisMinuman;
    }

    /**
     * @param jenisMinuman the jenisMinuman to set
     */
    public void setJenisMinuman(String jenisMinuman) {
        this.jenisMinuman = jenisMinuman;
    }

    /**
     * @return the jenisBaju
     */
    public String getJenisBaju() {
        return jenisBaju;
    }

    /**
     * @param jenisBaju the jenisBaju to set
     */
    public void setJenisBaju(String jenisBaju) {
        this.jenisBaju = jenisBaju;
    }

    /**
     * @return the domisili
     */
    public String getDomisili() {
        return domisili;
    }

    /**
     * @param domisili the domisili to set
     */
    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }
}
