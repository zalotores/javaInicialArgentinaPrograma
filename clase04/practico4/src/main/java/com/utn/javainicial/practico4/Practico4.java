/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utn.javainicial.practico4;

import Ejercicios.Ej2;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Practico4 {

    public static void main(String[] args) {

        System.out.println("Practico 4 - Programas y Archivos");
        System.out.println("1. Tomando los Ejercicios de la clase anterior: ");
        System.out.println("\nhaga un main, donde por parámetro ponga 3 números y una letra que\n"
                + "represente ascendente o descendente y los muestre ordenados por tal criterio");
        System.out.println("b. haga lo mismo, pero solicitando los parámetros de a uno por consola");
        System.out.println("c. lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)\n"
                + "si no detecta ninguno. Vea si con una función puede evitar repetir código.");

        System.out.println("\n2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe\n"
                + "contener números. El programa debe escribir por consola la suma de esos números\n"
                + "a. Al programa anterior agreguele un parámetro para que la operación pueda ser\n"
                + "suma o multiplicación.");

        System.out.println("\n3. Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una\n"
                + "codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y\n"
                + "otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los\n"
                + "resultados deben estar en el archivo de salida");

        System.out.println("\n4. Suba el proyecto / ejercicios a GIT\n");

        boolean flag = true;
        while (flag) {
            
            System.out.println("\n*************************\n");
            System.out.println("Menu de ejercicios.");
            Scanner scan = new Scanner(System.in);
            int opcion = -1;

            do {

                System.out.println("Ingrese el numero de ejercicio ( 1 a 4) o ingrese '0' para salir.");
                System.out.print("Opcion: ");

                try {
                    opcion = scan.nextInt();
                } catch (Exception e) {
                    System.out.println("\nOpcion no permitida!");
                }

            } while ((opcion < 0) || (opcion > 4));

            switch (opcion) {
                case 0:
                    flag = false;
                    System.out.println("\n*************************\n");
                    System.out.println("Programa terminado. Presione Enter para salir");
                    scan.next();
                    scan.close();
                    break;

                case 1:

                    break;

                case 2:

                    Ej2.ej2();
                    break;

                case 3:

                    break;

                case 4:

                    System.out.println("Los ejercicios fueron cargados en el repositorio de github:");
                    System.out.println("https://github.com/zalotores/javaInicialArgentinaPrograma");

                    break;

                default:
                    System.out.println("\nOpcion no permitida!");
            }

        }

    }
}
