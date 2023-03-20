/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Utilities.Carrito;
import Utilities.Descuento;
import java.util.Scanner;

/**
 * 
 * En un programa main, lea de un archivo, por ejemplo separado por Tabs o
 * comas, una lista de items, arme los objetos correspondientes y con el método
 * de carrito “precio”, retorne el resultado. Por ejemplo:
 *
 * cant  precioUnitario  producto 
 * 1     40              jabón en polvo 
 * 3     10              esponjas 
 * 2     100             chocolates 
 * carrito.precio( ) == 270
 *
 * @author gonza
 */
public class Ej2 {
    
    public static void ej2() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----------------");
        System.out.println("Carga de productos.");
        float total = 0;
        int codigo = 0;
        int cantidad = 0;
        Carrito carrito = new Carrito();
        
        do {

            System.out.print("Ingrese el codigo de producto o '0' para salir: ");
            try {
                codigo = scan.nextInt();
                
            } catch (Exception e) {
                System.out.println("\nCodigo incorrecto!");
                break;
            }
            
            if (codigo != 0){
                System.out.print("Ingrese la cantidad de unidades de codigo " + codigo + ": ");
                try {
                    cantidad = scan.nextInt();
                
                } catch (Exception e) { 
                    System.out.println("\nCantidad incorrecta!");
                    break;
                }
            }
            
            if(codigo != 0){
                carrito.setItem(codigo, cantidad);
                System.out.println("---------");
            }
            
        } while (codigo != 0);
        
        total = carrito.carritoPrecio();
        
        float descuento = 0;
        try {
            System.out.print("Ingrese el descuento a aplicar: ");
            descuento = scan.nextFloat();
            
        } catch (Exception e) {
            System.out.println("\nNo aplica descuento");
        }
        
        Descuento subtotal = new Descuento(total, descuento);
        
        total = subtotal.total();
        
        System.out.println("\n----------------");
        System.out.println("Total a pagar: " + total);

    }
    
}
