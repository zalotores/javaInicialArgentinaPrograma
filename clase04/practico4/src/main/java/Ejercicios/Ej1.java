/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import UtilitiesArchivo.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 * 1. Tomando los Ejercicios de la clase anterior
a. haga un main, donde por parámetro ponga 3 números y una letra que
represente ascendente o descendente y los muestre ordenados por tal criterio
b. haga lo mismo, pero solicitando los parámetros de a uno por consola
c. lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
si no detecta ninguno. Vea si con una función puede evitar repetir código.
 *
 * @author gonza
 */
public class Ej1 {
        
    public static void ej1() {
        
        System.out.println("---------------\n");
        System.out.println("Ordenador de numeros.");
        
        Scanner scan = new Scanner(System.in);
        boolean cargaManual = false;
        
        System.out.println("Ingrese la ruta del archivo, o presione Enter para carga manual:");
        String ruta = scan.nextLine();
        if(ruta.length()<1) { cargaManual = true;}
       
        char orden = '!';
        int size = 0;
        int numeros[];
        
        if(cargaManual) {
            System.out.print("\nIngrese el tamaño del arreglo: "); 
            size = scan.nextInt();
            
            numeros = new int[size];
            
            for (int i = 0; i < size; i++) {
                System.out.print("\nIngrese el elemento " + (i+1) + ": ");
                numeros[i] = scan.nextInt();                
            }
            
        }else {
            String fh = Leer.leer(ruta);
            String [] temp = fh.split(" ");

            size = temp.length;            
            numeros = new int[size];
            for (int i = 0; i < size; i++){
                //elimino corchetes si existen
                if((i == 0) && (temp[i].contains("["))) {
                    temp[i] = temp[i].substring(1, temp[i].length());
                }
                else if ((i == size - 1) && (temp[i].contains("]"))){
                       temp[i] = temp[i].substring(0, temp[i].length()-1);                         
                    }

                try {
                    numeros[i] = Integer.parseInt((temp[i]));
                } catch (Exception e) {//ignora los terminos que no sean Int
                }
            }

        }
        
        do {
            System.out.print("Ingrese 'A' para orden ascendente o 'D' para descendente: ");
            orden = scan.next().toUpperCase().charAt(0);

        } while (!(orden == 'A' || orden == 'D'));
        
        numeros = ordenador(numeros, orden);        
        
        System.out.println("---------");
        
        if (cargaManual){
            
            System.out.println("Nuevo orden:");
            for (Integer numero : numeros) {System.out.print(numero + " ");}
            
        } else {
            
            for (Integer numero : numeros) {
                if(numero == numeros[0]) {
                    Escribir.escribir(ruta, (numero.toString()), "TRUNCATE_EXISTING");
                }else {
                    Escribir.escribir(ruta, (" " + numero), "APPEND");
                }
            }
        }
        
        System.out.println("Programa terminado");

    }
    
    public static int[] ordenador(int[] lista, char orden){
        Integer buffer = lista[0];
        
        if (orden == 'A') {
            
            for (Integer numero = 0; numero < lista.length; numero++) {
                buffer = lista[numero];
                
                for (Integer i = 0; i < (lista.length - 1); i++) {
                    if (lista[i] > lista[i+1]) {
                        buffer = lista[i];
                        lista[i] = lista[i+1];
                        lista[i+1] = buffer;
                    }
                }
            }
            
        }
        else {

            for (Integer numero = 0; numero < lista.length; numero++) {
 
                buffer = lista[numero];
                
                for (Integer i = 0; i < (lista.length - 1); i++) {
                    if (lista[i] < lista[i+1]) {
                        
                        buffer = lista[i];
                        lista[i] = lista[i+1];
                        lista[i+1] = buffer;
                        
                    }
                }
            }
            
        }
        
        return lista;
        
    }
    
}
