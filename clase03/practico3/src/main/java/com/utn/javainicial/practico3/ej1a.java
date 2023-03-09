/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.javainicial.practico3;

import java.util.Scanner;

/**
 *
 * @author gonza
 * 1.a:
 * Dado un String y una letra, que cuente la cantidad de apariciones de la 
 * letra en el String
 */
public class ej1a {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String frase = " ";
        char letra = 'A';
        Integer contador = 0;
        
        System.out.print("Ingrese una frase: ");
        frase = sc.nextLine();
        
        System.out.print("\nAhora, ingrese una letra: ");
        letra = Character.toLowerCase(sc.next().charAt(0));
        
        for (int i = 0; i < frase.length(); i++) {
            
            if(frase.charAt(i) == letra) {
                contador++;
            }
            
        }
        
        System.out.println("\nLa letra " + letra + " aparece " + contador + " veces en la frase");
        
        sc.close();
        
    }
    
}
