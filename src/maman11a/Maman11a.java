/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maman11a;

import java.util.Scanner;

/**
 *
 * @author elira
 */
public class Maman11a {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Receiving the first rational number:");
        Rational r1 = receiveRationalFromUser();
        System.out.println("Receiving the second rational number:");
        Rational r2 = receiveRationalFromUser();
        
        // Addition
        System.out.println(r1 + " + " + r2 + " = " + r1.plus(r2));
        
        // Substraction
        System.out.println(r1 + " - " + r2 + " = " + r1.minus(r2));
        System.out.println(r2 + " - " + r1 + " = " + r2.minus(r1));
        
        // Multiplication
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        
        // Greater
        System.out.println("Checking order...");
        if(r1.equals(r2)) {
            System.out.println(r1 + " = " + r2);
        }
        else {
            System.out.println(r1 + (r1.greaterThan(r2) ? " > " : " < ") + r2);
        }
    }
    
    private static Rational receiveRationalFromUser() {
        System.out.println("Please enter a numerator...");
        int p1 = SC.nextInt();
        int q1;
        do {
            System.out.println("Please enter a denomerator...");
            q1 = SC.nextInt();
        } while(q1 == 0);
        
        return new Rational(p1, q1);
    }
}
