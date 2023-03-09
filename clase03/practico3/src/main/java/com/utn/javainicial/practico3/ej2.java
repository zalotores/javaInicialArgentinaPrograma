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
 * Genere una clase que tenga los métodos para realizar la codificación y decodificación
 * de un string, dado un número de desplazamiento.
 * 
 * Por ejemplo, con desplazo de 1:
 * “hola que tal” -> “ipmbarvfaubm”
 * h -> i
 * o -> p
 * 
 * con desplazo de 2
 * “hola que tal” -> “jqncbswgbvcn”
 * h -> j
 * o -> q
 * 
 * En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz "
 * Para este ejercicio puede usar todos los métodos de String, tanto de instancia (por
 * ejemplo length) como de clase, por ejemplo String.valueOf(arr) # donde
 * arr es un char[]. Tenga a mano los javadocs del mismo
 */
public class ej2 {
    
    public static void main(String[] args) {
        String frase = " ";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la frase a codificar: ");
        frase = sc.nextLine().toLowerCase();
        Integer n = frase.length();
        Integer seed = 0;
        Integer[] numChar = new Integer[n];     //para guardar char ascii a entero
        Integer buffer = 0;
        char letra = ' ';       //para imprimir mensaje encriptado
        
        while (true) {    

            System.out.print("Ahora, ingrese un numero entero para codificar: ");
            try {
                seed = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Debe ser un numero entero!");
            }
        
        }
        Integer posicion = 0;       //para iterar en el vector de frase
        for(char letraChar : frase.toCharArray()){
            buffer = letraChar + seed;
            if(buffer > 122) {
                buffer -= 26;
            }
            else if (letraChar == ' ') {
                buffer = 96 + seed;
            }
            numChar[posicion] = buffer;
            posicion++;
        }
        
        System.out.println("\nFrase encriptada:");
        
        for (Integer i = 0; i < n; i++) {
            letra = (char) numChar[i].byteValue();
            if (letra == '`'){letra = ' ';}
            System.out.print(letra);
        }
        
    }
    
}
