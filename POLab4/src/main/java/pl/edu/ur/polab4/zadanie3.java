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
public class zadanie3 {

    public static void main(String[] args) {
        zadanie3_1 student = new zadanie3_1("Marcin", "Chyła", 6894, "WSDFD", 5);
        zadanie3_1 student1 = new zadanie3_1("Marcin", "Chyła", 6894, "WSDFD");
        zadanie3_1 student2 = new zadanie3_1("Marcin", "Chyła", 6894);
        zadanie3_1 student3 = new zadanie3_1("Marcin", "Chyła");

        student.pokazDane();
        student1.pokazDane();
        student2.pokazDane();
        student3.pokazDane();

    }

}
