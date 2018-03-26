/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

/**
 *
 * @author Bart
 */
public class Student {

    private String name;
    private int age;
    private int indeks;
    private int numer_indeksu;
    static String[] studenty = new String[100];

    public Student() {
    }

    public Student(String username, int userage, int userindeks, int numer_indeksu) {
        this.name = username;
        this.age = userage;
        this.indeks = userindeks;
        this.numer_indeksu = numer_indeksu;
    }

    public String Wpisywanie_imienia(String username, int numer_indeksu) {

        studenty[numer_indeksu] = username;
        System.out.println("Imie studenta " + studenty[numer_indeksu]);

        return null;
    }

    public String Wpisywanie_wieku(int userage, int numer_indeksu) {

        studenty[numer_indeksu] = String.valueOf(userage);
        System.out.println("Wiek studenta " + studenty[numer_indeksu]);
        return null;
    }

    public String Wpisywanie_indeksu(int userindeks, int numer_indeksu) {

        studenty[numer_indeksu] = String.valueOf(userindeks);
        System.out.println("Indeks studenta " + studenty[numer_indeksu]);
        return null;
    }
    
    
}
