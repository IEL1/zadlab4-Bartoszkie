/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Zadanie3_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        zadanie3_1 student = new zadanie3_1();
        
        System.out.println("Podaj imie: ");
        student.imie = scanner.next();
        System.out.println("Podaj nazwisko: ");
        student.nazwisko = scanner.next();
        System.out.println("Podaj numer albumu: ");
        student.indeks = scanner.nextInt();
        System.out.println("Podaj numer jakis: ");
        student.numer = scanner.nextInt();
        
        student.pokazDane();
        
    }

}
