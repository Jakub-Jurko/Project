/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itnetwork.evidencepojistenych;

/**
 *
 * @author ew
 */
public class Pojistenec {

    /**
     * Jméno pojištěnce
     */
    private String jmeno;
    /**
     * Příjmení pojištěnce
     */
    private String prijmeni;
    /**
     * Věk pojištence
     */
    private int vek;
    /**
     * Telefonní číslo pojištěnce
     */
    private String telefonniCislo;

    /**
     * Konstruktor
     *
     * @param jmeno Jméno
     * @param prijmeni Příjmení
     * @param telefonniCislo Telefonní číslo
     * @param vek Věk
     */

    public Pojistenec(String jmeno, String prijmeni, String telefonniCislo, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefonniCislo = telefonniCislo;
        this.vek = vek;
    }

    /**
     * Nastaví jméno
     *
     * @param jmeno Jméno
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * Vráti jméno
     *
     * @return jméno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Nastaví Příjmení
     *
     * @param prijmeni Příjmení
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**
     * Vráti Příjmení
     *
     * @return příjmení
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Nastaví telefonní číslo
     *
     * @param telefonniCislo telefonní číslo
     */
    public void setTelefonniCislo(String telefonniCislo) {
        this.telefonniCislo = telefonniCislo;
    }

    /**
     * Vráti telefonní číslo
     *
     * @return telefonní číslo
     */
    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    /**
     * Nastaví věk
     *
     * @param vek věk
     */
    public void setVek(int vek) {
        this.vek = vek;
    }

    /**
     * Vráti věk
     *
     * @return věk
     */
    public int getVek() {
        return vek;
    }

    /**
     * Výpis
     *
     * @return výpis
     */
    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s %-15s", jmeno, prijmeni, vek, telefonniCislo);
    }

}
