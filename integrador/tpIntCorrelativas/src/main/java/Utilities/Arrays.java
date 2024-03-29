/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Arrays {
    
    public static ArrayList<String> cargar() {
        ArrayList <String> lista = new ArrayList<>();
        String item = "";
        String confirmacion = "";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------");
        System.out.println("Carga de lista");
        System.out.println("Ingrese la materia, o escriba 'salir' para terminar.");
        while(true) {
            System.out.print("\nMateria: ");
            item = scan.nextLine().toLowerCase();
            if (item.equals("salir")) {
                break;
            }
            System.out.print("\n" + item + " es correcto? S / N: ");
            confirmacion = scan.nextLine().toLowerCase();
            if (confirmacion.startsWith("s")){
                lista.add(item);
                System.out.println("Guardado");
            }
        }
        //scan.close();
        return lista;
    }
    
    public static ArrayList<String> convertirString(String entrada) {
        
        ArrayList <String> resultado = new ArrayList<>();
        
        String [] buffer = entrada.split(",");
        String palabra = "";
        buffer[0] = buffer[0].replace('[', ' ');
        buffer[0] = buffer[0].replace('\'', ' ');
        buffer[buffer.length-1] = buffer[buffer.length-1].replace(']', ' ');
        buffer[buffer.length-1] = buffer[buffer.length-1].replace('\'', ' ');
        for (int i = 0; i < buffer.length; i++) {
            
            palabra = buffer[i].strip();
            resultado.add(palabra);
        }
        
        
        return resultado;
    }
    
}
