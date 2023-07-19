/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itnetwork.evidencepojistenych;

import java.util.ArrayList;

/**
 *
 * @author ew
 */
public class SeznamPojistencu {

    /**
     * Pojistenci
     */
    private ArrayList<Pojistenec> pojistenci;

    /**
     * Konstruktor
     */
    public SeznamPojistencu() {
        pojistenci = new ArrayList<>();
    }

    /**
     * Přidá údaje o pojistěnci do ArrayListu
     *
     * @param jmeno Jmeno
     * @param prijmeni Příjmení
     * @param telefonniCislo Telefonní číslo
     * @param vek Věk
     */
    public void pridejPojistence(String jmeno, String prijmeni, String telefonniCislo, int vek) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, telefonniCislo, vek));
    }

    /**
     * Najde pojistěnce podle jména a příjmení
     *
     * @param jmeno Jméno hledaného pojištěnce
     * @param prijmeni Příjmení hledaného pojištěnce
     * @return Kolekce nalezených pojištěncu
     */
    public ArrayList<Pojistenec> najdiPojistenca(String jmeno, String prijmeni) {
        ArrayList<Pojistenec> nalezene = new ArrayList<>();

        for (Pojistenec pojistenec : pojistenci) {
            if ((pojistenec.getJmeno().equals(jmeno)) && (pojistenec.getPrijmeni().equals(prijmeni))) {
                nalezene.add(pojistenec);
            }
        }
        return nalezene;
    }

    /**
     * Vypííše všechny pojištěnce
     *
     * @return všechny pojištěnce
     */
    public ArrayList<Pojistenec> vypisVsechny() {
        ArrayList<Pojistenec> vsichni = new ArrayList<>();
        for (Pojistenec zaznam : pojistenci) {
            vsichni.add(zaznam);
        }
        return vsichni;
    }

    /**
     * Zobrazení hlavičky tabulky
     *
     * @return hlavička
     */
    public String zobrazeni() {
        String firstName = "Jméno";
        String lastName = "Příjmení";
        String phone = "Tel. číslo";
        String age = "Věk";
        String table = "-------------------------------------------------------------------------";
        return String.format("%-15s %-15s %-15s %-15s%n%s", firstName, lastName, age, phone, table);
    }
}
