/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.javainicial.practico3;

import java.util.Scanner;

/**
 *
 * @author gonza
 * Dados 3 números y un orden (ascendente o decreciente) que ordene los
 * mismos y los retorne en un vector de 3
 */
public class ej1b {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char orden = '!';
        Integer[] numeros = new Integer[3];
        
        try {
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese n° " + (i+1) + ": ");
                numeros[i] = sc.nextInt();                
            }
            
        } catch (Exception e) { System.out.println("Solo se admiten numeros!");}
        
        System.out.print("Ingrese 'A' para orden ascendente o 'D' para descendente: ");
        orden = sc.next().toUpperCase().charAt(0);
        
        if (!(orden == 'A' || orden == 'D')){ System.out.println("Caracter no permitido!");}
        else if (orden == 'A') {
            Integer buffer = numeros[0];
            Integer pos = 0;
            for (Integer numero = 0; numero < (numeros.length-1); numero++) {
                
                for (Integer i = 0; i < (numeros.length); i++) {
                    if (buffer > numeros[i]) {
                        numeros[pos] = numeros[i];
                        numeros[i] = buffer;
                        buffer = numeros[i];
                        pos = i;
                    }
                }
            }
            
        }
        else {
            
            Integer buffer = numeros[0];
            Integer pos = 0;
            for (Integer numero = 0; numero < (numeros.length-1); numero++) {
                
                for (Integer i = 0; i < (numeros.length); i++) {
                    if (buffer < numeros[i]) {
                        numeros[pos] = numeros[i];
                        numeros[i] = buffer;
                        buffer = numeros[i];
                        pos = i;
                    }
                }
            }
            
        }
        System.out.println("---------");
        for (Integer numero : numeros) {System.out.println(numero);}  
        
        sc.close();
    }
    
}
