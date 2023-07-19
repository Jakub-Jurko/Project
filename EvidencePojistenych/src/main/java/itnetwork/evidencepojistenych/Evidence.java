/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itnetwork.evidencepojistenych;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ew
 */
public class Evidence {

    /**
     * Seznam pojištěnců
     */
    private SeznamPojistencu seznam;
    /**
     * Scanner
     */
    private Scanner sc = new Scanner(System.in, "Windows-1250");

    /**
     * Konstruktor
     */
    public Evidence() {
        seznam = new SeznamPojistencu();
    }

    /**
     * Přidá pojištěnce do seznamu
     */
    public void pridejPojistence() {
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = sc.nextLine();
        System.out.println("Zadejte telefonní číslo:");
        String telefonniCislo = sc.nextLine();
        System.out.println("Zadejte věk:");
        int vek = Integer.parseInt(sc.nextLine());
        seznam.pridejPojistence(jmeno, prijmeni, telefonniCislo, vek);
        System.out.print("\nData byla uložena. ");
    }

    /**
     * Vyhledá pojištěnce podle jména a příjmění
     *
     */
    public void vyhledejPojistence() {
        System.out.println("Zadej jméno pojišteného:");
        String jmeno = sc.nextLine();
        System.out.println("Zadej příjmení pojišteného:");
        String prijmeni = sc.nextLine();
        System.out.println();
        ArrayList<Pojistenec> lidi = seznam.najdiPojistenca(jmeno, prijmeni);
        if (lidi.size() > 0) {
            for (Pojistenec pojistenec : lidi) {
                System.out.println(seznam.zobrazeni());
                System.out.println(pojistenec);
            }
            System.out.println();
        } else {
            System.out.print("\nOsoba nenalezena...");
        }
    }

    /**
     * Vypíše všechny pojištěnce
     */
    public void vypisVsechnyPojistence() {
        ArrayList<Pojistenec> lidi = seznam.vypisVsechny();
        if (lidi.size() > 0) {
            System.out.println(seznam.zobrazeni());
            for (Pojistenec osoba : lidi) {
                System.out.println(osoba);
            }
            System.out.println();
        } else {
            System.out.print("Nebyly nalezeny žádné záznamy.");
        }

    }

    /**
     * Pokračování stisknutím Enter
     */
    public void pokracovani() {
        System.out.println("Pokračujte klávesou Enter...");
        sc.nextLine();
    }

}
