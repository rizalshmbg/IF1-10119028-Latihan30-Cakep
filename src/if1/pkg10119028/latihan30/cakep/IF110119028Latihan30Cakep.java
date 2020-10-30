/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan30.cakep;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk mendeteksi tingkat ke-cakep an seorg user
 */
public class IF110119028Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String jawab;
        String normal   = "\u001b[0m";
        String merah    = "\u001b[31m";
        String hijau    = "\u001b[32m";
        String kuning   = "\u001b[33m";
        String biru     = "\u001b[34m";
        String ungu     = "\u001b[35m";
        String birumuda = "\u001b[36m";

        System.out.print(merah + "Kamu " + hijau + "ngerjain sendiri " + kuning + "latihan 17 sampe " + biru + "latihan 30 ini? \nJawab " + merah + "(Yoi/Enggak) : " + normal);
        jawab = input.next();
        jawab = jawab.toUpperCase();
        System.out.println();
        switch (jawab) {
            case ("YOI"):
                System.out.println(merah + "Cakep bener. " + ungu + "Good Job" + normal);
                break;
            case ("ENGGAK"):
                System.out.println(merah + "Tetep cakep sih.\n" + birumuda + "Sing penting paham konsep nya yee.\n" + normal + "Keep the code works dude");
                break;
            default:
                System.out.println(" ");
        }
    }
}