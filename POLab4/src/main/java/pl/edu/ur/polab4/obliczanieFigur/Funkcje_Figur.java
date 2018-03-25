/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Bart
 */
public class Funkcje_Figur {

    private String nazwa_figury;
    private double promien;
    private double bok_1;
    private double bok_2;
    private double wysokosc;

    public Funkcje_Figur() {
    }

    public Funkcje_Figur(String usernazwa_figury, double userpromien, double userbok_1, double userbok_2, double userwysokosc) {
        this.nazwa_figury = usernazwa_figury;
        this.promien = userpromien;
        this.bok_1 = userbok_1;
        this.bok_2 = userbok_2;
        this.wysokosc = userwysokosc;
    }

    public double Pole_koła(double userpromien) {
        return 3.14 * userpromien * userpromien;
    }

    public double Pole_kwadratu(double userbok_1) {
        return userbok_1 * userbok_1;
    }

    public double Pole_prostokąta(double userbok_1, double userbok_2) {

        return userbok_1 * userbok_2;
    }

    public double Pole_szescianu(double userbok_1) {

        return 6 * (userbok_1 * userbok_1);
    }

    public double Objetosc_szescianu(double userbok_1) {

        return userbok_1 * userbok_1 * userbok_1;
    }

    public double Pole_prostopadloscianu(double userbok_1, double userbok_2, double userwysokosc) {

        return (2 * (userbok_1 * userbok_2)) + (2 * (userbok_2 * userwysokosc)) + (2 * (userbok_1 * userwysokosc));

    }

    public double Objetosc_prostopadloscianu(double userbok_1, double userbok_2, double userwysokosc) {

        return userbok_1 * userbok_2 * wysokosc;
    }

    public double Pole_kuli(double userbok_1) {

        return (4 * 3.14 * userbok_1 * userbok_1);
    }

    public double Objetosc_kuli(double userbok_1) {

        return (4 / 3 * 3.14 * (userbok_1 * userbok_1 * userbok_1));
    }
    
    public double Objetosc_stozka(double userbok_1, double userwysokosc){
        
        return 1/3*3.14*userbok_1*userbok_1*userwysokosc;
    }

}
