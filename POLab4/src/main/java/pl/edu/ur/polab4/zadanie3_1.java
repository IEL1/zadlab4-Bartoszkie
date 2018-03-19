/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class zadanie3_1 {

    String imie;
    String nazwisko;
    int indeks;
    String wyraz;
    int numer;

    public zadanie3_1(String imie, String nazwisko, int indeks, String wyraz, int numer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.wyraz = wyraz;
        this.numer = numer;
    }

    public zadanie3_1(String imie, String nazwisko, int indeks, String wyraz) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.wyraz = wyraz;
    }

    public zadanie3_1(String imie, String nazwisko, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public zadanie3_1(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public zadanie3_1(String imie) {
        this.imie = imie;
    }

    public zadanie3_1() {
    }

    public void pokazDane() {

        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("indeks: " + this.indeks + " lat" + this.numer);
    }
    }


