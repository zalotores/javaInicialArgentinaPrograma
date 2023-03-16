/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import UtilitiesArchivo.*;
import java.util.Scanner;

/**
 * 3. Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si
 * es una codificación o decodificación, el valor del desplazo, y 2 archivos,
 * uno para la entrada y otro para la salida. Que por pantalla solo indique si
 * terminó o no correctamente, los resultados deben estar en el archivo de
 * salida
 *
 * @author gonza
 */
public class Ej3 {

    public static void ej3() {

        System.out.println("---------------\n");
        System.out.println("Codificador de texto.");

        Scanner scan = new Scanner(System.in);
        String fh = "";
        int seed = 0;
        String rutaIn = "";
        

        do {        //verifico que el archivo exista y se pueda abrir
            System.out.println("Ingrese la ruta del archivo de origen:");
            rutaIn = scan.nextLine();
            if (rutaIn.length() < 1) {
                rutaIn = "C:\\datos\\zalo\\cursos\\argentinaPrograma\\javaInicial\\clase04\\prueba.txt";
            }
            try {
                fh = Leer.leer(rutaIn);
            } catch (Exception e) {
            }
        } while ((fh == null) || (fh.length() < 1));
       
        char flag = 'f';
        do {
            System.out.print("Ingrese C para codificar o D para descodificar: ");
            flag = scan.next().toLowerCase().charAt(0);
            
        } while (!((flag == 'c') || (flag == 'd')));
        
        String rutaOut = "";
        if(flag == 'c'){
            rutaOut = rutaIn.replaceAll(".txt", "Encriptado.txt");
        }else {
            rutaOut = rutaIn.replaceAll(".txt", "Desencriptado.txt");
        }
        
        while (true) {      //pido el numero par clave de encriptacion    

            System.out.print("Ahora, el numero de encriptacion: ");
            try {
                seed = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Debe ser un numero entero!");
            }
        }
        
        encriptador(flag, seed, rutaIn, rutaOut, fh);
        
        System.out.println("\nTexto guardado en:\n" + rutaOut);

    }
    
    public static void encriptador(char flag, int seed, String rutaIn, String rutaOut, String frase){
        
        Integer posicion = 0;       //para iterar en el vector de frase
        Integer buffer = 0;     //para guardar el char encriptado convertido a int
        Integer n = frase.length();
        Integer[] numChar = new Integer[n];     //para guardar char ascii a entero
        char caracter = ' '; 
        
        for(char letraChar : frase.toCharArray()){
            
            if (flag == 'c'){buffer = letraChar + seed;}
            else {buffer = letraChar - seed;}
            
            if(buffer > 122) {
                buffer -= 26;
            }
            else if (letraChar == ' ') {
                buffer = 96 + seed;
            }
            numChar[posicion] = buffer;
            posicion++;
        }
        
        System.out.println("\nFrase encriptada.");
        String letra = "";
        for (Integer i = 1; i < (n-1); i++) {
            caracter = (char) numChar[i].byteValue();
            if (caracter == '`'){caracter = ' ';}
            letra = "" + caracter;
            if (i == 1) {

                Escribir.escribir(rutaOut, letra, "CREATE");
            } else {

                Escribir.escribir(rutaOut, letra, "APPEND");
            }
        }
        
    }

}



