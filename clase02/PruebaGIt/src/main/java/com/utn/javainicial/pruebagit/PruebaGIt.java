/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utn.javainicial.pruebagit;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class PruebaGIt {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Ingresa un numero: ");
        
        double num1 = sc.nextDouble();
        
        System.out.println("Ahora, ingrese una palabra o frase: ");
        
        String palabra1 = sc.next();
        
        System.out.println("\nEl numero ingresado es: " + num1);
        System.out.println("Y la frase es: " + palabra1);
        
        sc.close();
    }
}
