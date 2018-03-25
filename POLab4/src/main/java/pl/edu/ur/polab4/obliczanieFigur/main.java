/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author Bart
 */
public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer zdanka: \n Koło: 1 \n Kwadrat: 2\n Prostokąt: 3\n Prostopadłoscian: 4\n Kula: 5\n Stożek: 6\n");
        int sterownik = scanner.nextInt();

        switch (sterownik) {

            case 1:

                System.out.println("Koło: ");

                Scanner sc = new Scanner(System.in);

                System.out.println("Podaj promien: ");
                double s1 = sc.nextInt();

                Koło funkcja = new Koło();
                System.out.println("Pole: " + funkcja.Pole_koła(s1));

                break;

            case 2:

                System.out.println("Kwadrat: ");

                Scanner sc2 = new Scanner(System.in);

                System.out.println("Podaj bok: ");
                double s2 = sc2.nextDouble();

                Kwadrat funkcja1 = new Kwadrat();
                System.out.println("Pole" + funkcja1.Pole_kwadratu(s2));

                break;

            case 3:

                System.out.println("Prostokąt: ");

                Scanner sc3 = new Scanner(System.in);

                System.out.println("Podaj bok a: ");
                double s3 = sc3.nextDouble();
                System.out.println("Podaj bok b: ");
                double s4 = sc3.nextDouble();

                Prostokąt funkcja2 = new Prostokąt();
                System.out.println("Pole" + funkcja2.Pole_prostokąta(s3, s4));

                break;

            case 4:

                System.out.println("Prostopadłoscian: ");

                Scanner sc5 = new Scanner(System.in);

                System.out.println("Podaj bok a: ");
                double s6 = sc5.nextDouble();
                System.out.println("Podaj bok b: ");
                double s7 = sc5.nextDouble();
                System.out.println("Podaj wysokosc: ");
                double s8 = sc5.nextDouble();

                Prostopadłoscian funkcja3 = new Prostopadłoscian();
                System.out.println("Objetosc" + funkcja3.Objetosc_prostopadloscianu(s6, s7, s8));
                System.out.println("Pole" + funkcja3.Pole_prostopadloscianu(s6, s7, s8));

                break;

            case 5:

                System.out.println("Kula: ");

                Scanner sc6 = new Scanner(System.in);

                System.out.println("Podaj bok a: ");
                double s9 = sc6.nextDouble();

                Kula funkcja4 = new Kula();
                System.out.println("Pole" + funkcja4.Pole_kuli(s9));

                break;

            case 6:

                System.out.println("Stozek: ");

                Scanner sc7 = new Scanner(System.in);

                System.out.println("Podaj bok a: ");
                double s10 = sc7.nextDouble();
                System.out.println("Podaj bok a: ");
                double s11 = sc7.nextDouble();

                Stożek funkcja5 = new Stożek();
                System.out.println("Objetosc" + funkcja5.Objetosc_stozka(s10, s11));

                break;

        }

    }

}
