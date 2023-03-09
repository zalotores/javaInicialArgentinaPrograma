/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.javainicial.practico3;

import java.util.Scanner;

/**
 *
 * @author gonza
 * 
 * dado un vector de números, y un número X, que sume todos los números > X y
 * retorne el resultado
 */
public class ej1c {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos del vector: ");
        Integer tamanho = 0;
        Integer suma = 0;
        Integer puntoDeSuma = 0;
        Integer posDeSuma = tamanho - 1;
        try {
            tamanho = sc.nextInt();
        } catch (Exception e) {System.out.println("Solo se admiten numeros enteros!");}
        
        Integer[] numeros = new Integer[tamanho];
        System.out.println("Ahora, vamos a cargar los valores (enteros) del vector.");
        
        try {
            for (Integer i = 0; i < tamanho; i++) {
                System.out.print("Ingrese el elemento " + (i+1) + ": ");
                numeros[i] = sc.nextInt();
                
            }
        } catch (Exception e) {System.out.println("Solo se admiten numeros enteros!");}
        
        System.out.print("Finalmente, ingrese el numero a partir del cual quiere contar: ");
        try {
            puntoDeSuma = sc.nextInt();
        } catch (Exception e) {System.out.println("Solo se admiten numeros enteros!");}
        
        for (Integer i = 0; i < tamanho; i++) {
            if(puntoDeSuma == numeros[i]) {
                posDeSuma = i+1;
                break;
            }            
        }
        for (Integer i = posDeSuma; i < tamanho; i++) {
            suma += numeros[i];
        }
        
        System.out.println("La suma de los " + (tamanho - posDeSuma) +
                " numeros que siguen al " + puntoDeSuma + " es: " + suma);
        
        sc.close();
        
    }
    
}
