/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utn.javainicial.practico8;

import Utilities.Carrito;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Practico8 {

    public static void main(String[] args) {
        
        System.out.println("**************");
        System.out.println("Excepciones y Colecciones");
        System.out.println("\n1. Modifique el ejercicio del carrito de la clase 5-7, para tener una cantidad ilimitada de\n" +
"ítems. Verifique que cuando lea un archivo pueda leer items de cualquier tamaño");
        
        System.out.println("2. Agregue excepciones a los descuentos:");
        System.out.println("  a. que no se pueda aplicar un descuento a un carrito de precio 0");
        System.out.println("  b. que el resultado del descuento no de un monto negativo");
        System.out.println("  c. Si ocurre alguna de esas 2 situaciones, mostrar por pantalla el error, en lugar\n" +
        "   del resultado del carrito");
        
        System.out.println("3. Realice algún test para probar la funcionalidad de las 2 excepciones planteadas");

       Carrito carrito = new Carrito();
       
        System.out.println("---------------");
        
        Scanner scan = new Scanner(System.in);
        
        int codigo = -1;
        int cantidad = 0;
        
        do {

            System.out.print("\nIngrese el codigo de producto o '0' para terminar: ");
            try {
                codigo = scan.nextInt();
            } catch (Exception e) {
                System.out.println("\nCodigo Incorrecto!");
            }
            
            if (codigo < 0){
                System.out.println("\nCodigo Incorrecto!");
            }
            else if ((codigo != 0) &&(!(carrito.existeItem(codigo)))){
                System.out.println("\nCodigo no encontrado");
            }
            else if((codigo != 0) && (carrito.existeItem(codigo))){
                System.out.print("\nIngrese cantidad: ");
                try {
                    cantidad = scan.nextInt();
                    carrito.agregarItem(codigo, cantidad);
                    System.out.println("\n" + carrito.toString());//TODO
                    
                } catch (Exception e) {
                    System.out.println("\nError al cargar producto! " + e);
                }
                
            }
            
        } while (codigo != 0);
        
    }
}
