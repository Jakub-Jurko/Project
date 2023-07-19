/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itnetwork.evidencepojistenych;

import java.util.Scanner;

/**
 *
 * @author ew
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        Evidence evidence = new Evidence();
        String volba = "";

        // Hlavní cyklus
        while (!volba.equals("4")) {

            SystemE.Menu();
            volba = sc.nextLine();
            // Reakce na volbu
            switch (volba) {
                case "1" -> {

                    evidence.pridejPojistence();
                    evidence.pokracovani();
                }
                case "2" -> {
                    evidence.vypisVsechnyPojistence();
                    evidence.pokracovani();
                }
                case "3" -> {
                    evidence.vyhledejPojistence();
                    evidence.pokracovani();
                }
                case "4" -> {
                }
                default -> {
                    System.out.print("Neplatná volba...");
                    evidence.pokracovani();
                }
            }
        }
    }
}
