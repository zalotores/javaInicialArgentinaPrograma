/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import UtilitiesArchivo.Leer;
import java.util.ArrayList;
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
        
    public static void main(String[] args) {
        
        System.out.println("---------------\n");
        System.out.println("Ordenador de numeros.");
        
        Scanner scan = new Scanner(System.in);
        boolean cargaManual = false;
        
        System.out.println("Ingrese la ruta del archivo, o escriba 'manual' para carga manual:");
        String ruta = scan.nextLine();
        if(ruta.length()<1) {
            ruta = "C:\\datos\\zalo\\cursos\\argentinaPrograma\\javaInicial\\clase04\\fibonacci10.txt";
        }
        else if(ruta.toLowerCase() == "manual"){ cargaManual = true;}
        
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
            String [] temp = fh.substring(1, fh.length()-1).split(" "); //elimino los corchetes
            size = temp.length;
            numeros = new int[size];
            for (int i = 0; i < size; i++){
                numeros[i] = Integer.parseInt((temp[i]));
            }
        }
        
        do {
            System.out.print("Ingrese 'A' para orden ascendente o 'D' para descendente: ");
            orden = scan.next().toUpperCase().charAt(0);

        } while (!(orden == 'A' || orden == 'D'));
        
        
        System.out.println("---------");
        for (Integer numero : numeros) {System.out.println(numero);}  

    }
    
    public static int[] ordenador(int[] lista, char orden){
        int size = lista.length;
        Integer buffer = lista[0];
        Integer pos = 0;
        
        if (orden == 'A') {
            
            for (Integer numero = 0; numero < (lista.length-1); numero++) {
                
                for (Integer i = 0; i < (lista.length); i++) {
                    if (buffer > lista[i]) {
                        lista[pos] = lista[i];
                        lista[i] = buffer;
                        buffer = lista[i];
                        pos = i;
                    }
                }
            }
            
        }
        else {

            for (Integer numero = 0; numero < (lista.length-1); numero++) {
                
                for (Integer i = 0; i < (lista.length); i++) {
                    if (buffer < lista[i]) {
                        lista[pos] = lista[i];
                        lista[i] = buffer;
                        buffer = lista[i];
                        pos = i;
                    }
                }
            }
            
        }
        
        return lista;
        
    }
    
}
