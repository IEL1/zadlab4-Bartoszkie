/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/**
 *
 * @author Bart
 */
public class main extends Student {

    public static void main(String[] args) {

        boolean x = true;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj zadanie: ");
            int sterownik = scanner.nextInt();

            switch (sterownik) {

                case 1:

                    System.out.println("Wybierz indeks tablicy: ");
                    Scanner sc = new Scanner(System.in);
                    int indeks_tablicy = sc.nextInt();
                    System.out.println("Wpisz imie studenta: ");
                    String username = sc.next();

                    Student funkcja = new Student();
                    System.out.println(funkcja.Wpisywanie_imienia(username, indeks_tablicy));

                    System.out.println("Podaj numer indeksu: ");
                    int indeks_studenta = sc.nextInt();
                    System.out.println(funkcja.Wpisywanie_indeksu(indeks_studenta, indeks_tablicy));

                    System.out.println("Podaj wiek: ");
                    int wiek_studenta = sc.nextInt();
                    System.out.println(funkcja.Wpisywanie_wieku(wiek_studenta, indeks_tablicy));

                    System.out.println(funkcja.Wpisywanie_imienia(username, indeks_tablicy) + "\n" + funkcja.Wpisywanie_wieku(wiek_studenta, indeks_tablicy) + "\n" + funkcja.Wpisywanie_indeksu(indeks_studenta, indeks_tablicy));

                    // EXIT
                    System.out.println("Zakoczyc działanie? Y/N");
                    Scanner s = new Scanner(System.in);
                    char x1 = s.next().charAt(0);
                    if (x1 == 'Y') {
                        x = true;
                    } else {
                        x = false;
                    }

                    break;

                case 2:

                    for (int i = 0; i < studenty.length; i++) {

                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Podaj indeks tablicy: ");
                        int indeks_tablicy1 = sc1.nextInt();

                        if (studenty[indeks_tablicy1] != null) {

                            Scanner scanner1 = new Scanner(System.in);
                            int wartosc = scanner1.nextInt();
                            studenty[indeks_tablicy1] = String.valueOf(wartosc); // podstawowa zamiana wartosci danego indeksu, nie chce mi się pisac tego dalej

                        }
                    }

                    // EXIT
                    System.out.println("Zakoczyc działanie? Y/N");
                    Scanner s1 = new Scanner(System.in);
                    char x2 = s1.next().charAt(0);
                    if (x2 == 'Y') {
                        x = true;
                    } else {
                        x = false;
                    }

                    break;

                case 3:

                    System.out.println("Usunięcie wszystkich indeksów talbicy: ");
                    for (int i = 0; i <= studenty.length; i++) {

                        studenty[i] = null;
                    }

                    for (int i = 0; i < studenty.length; i++) {
                        System.out.println("Indeks: " + studenty[i]);

                    }

                    // EXIT
                    System.out.println("Zakoczyc działanie? Y/N");
                    Scanner s3 = new Scanner(System.in);
                    char x3 = s3.next().charAt(0);
                    if (x3 == 'Y') {
                        x = true;
                    } else {
                        x = false;
                    }

                    break;
                    
                case 4: 
                    
                    

            }

        } while (x == false);
    }
}
