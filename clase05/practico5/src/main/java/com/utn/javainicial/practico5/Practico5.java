/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utn.javainicial.practico5;

import Ejercicios.*;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Practico5 {

    public static void main(String[] args) {
        
        System.out.println("**************");
        System.out.println("Introducción a la\n" +
"programación OO");
        System.out.println("1. Implemente usted mismo el ejemplo visto en clase" + 
                "de “carrito de compras”: una clase Producto (que pueda tener hasta 3 items),"
                + " \notra ItemCarrito, otra Carrito y otra Descuento, con 2 subclases.");
        System.out.println("\n2. En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una" +
" lista de items, arme los objetos correspondientes \ny con el método de carrito “precio”, " +
"retorne el resultado. Por ejemplo:");
        System.out.println("\ncant  precioUnitario  producto");
        System.out.println("1       40             jabón en polvo");
        System.out.println("3       10             esponjas");
        System.out.println("2       100            chocolates");
        System.out.println("carrito.precio( ) == 270");
        System.out.println("\n3. Suba el proyecto / ejercicios a GIT");
        
        boolean flag = true;
        while (flag) {
            
            System.out.println("\n*************************\n");
            System.out.println("Menu de ejercicios.");
            Scanner scan = new Scanner(System.in);
            int opcion = -1;

            do {

                System.out.println("Ingrese el numero de ejercicio ( 1 a 3) o ingrese '0' para salir.");
                System.out.print("Opcion: ");

                try {
                    opcion = scan.nextInt();
                } catch (Exception e) {
                    System.out.println("\nOpcion no permitida!");
                }

            } while ((opcion < 0) || (opcion > 3));

            switch (opcion) {
                case 0:
                    flag = false;
                    System.out.println("\n*************************\n");
                    System.out.println("Programa terminado.");
                    scan.close();
                    break;

                case 1:
                    
                    Ej1.ej1();
                    break;

                case 2:

                    Ej2.ej2();
                    break;

                case 3:

                    System.out.println("Los ejercicios fueron cargados en el repositorio de github:");
                    System.out.println("https://github.com/zalotores/javaInicialArgentinaPrograma");

                    break;

                default:
                    System.out.println("\nOpcion no permitida!");
            }

        }
        
    }
}
