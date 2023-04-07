/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Excepciones.ExcepcionMontoNegativo;
import Excepciones.ExcepcionPrecioCero;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Compra {
    
    public static void compra(){
        Carrito carrito = new Carrito();
       
        System.out.println("---------------");
        
        Scanner scan = new Scanner(System.in);
        
        int codigo = -1;
        int cantidad = 0;
        float subtotal = 0;
        int n = 0;
        
        do {

            System.out.print("\nIngrese el codigo de producto o '0' para terminar: ");
            try {
                codigo = scan.nextInt();
            } catch (Exception e) {
                System.out.println("\nCodigo Incorrecto!");
                codigo = 0;
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
                    subtotal = subtotal + carrito.getPrecioItem(n);
                    n++;
                    
                } catch (Exception e) {
                    System.out.println("\nError al cargar producto! " + e);
                }
                
            }
            
        } while (codigo != 0);
        
        //calculo de precio final
        System.out.println("---------------");
        System.out.println("Subtotal: " + subtotal);
        
        float total = subtotal;
        System.out.print("Aplica porcentaje de descuento? ");
        String respuesta = scan.next().toLowerCase();
        boolean porcentaje = false;
        if (respuesta.startsWith("s")) {porcentaje = true;}
        
        if(porcentaje){
            float montoPorcentaje = 0;
            System.out.print("\nAplica tope de descuento? ");
            respuesta = scan.next().toLowerCase();
            if (respuesta.startsWith("s")) {
                float montoTope = 0;
                try {
                    System.out.print("\nIngrese el porcentaje de descuento: ");
                    montoPorcentaje = scan.nextFloat();
                    System.out.print("\nIngrese el tope de descuento: ");
                    montoTope = scan.nextFloat();
                    Descuento descuentoPorcConTope = new DescuentoPorcentajeConTope(montoTope, montoPorcentaje);
                    descuentoPorcConTope.setSubtotal(subtotal);
                    total = descuentoPorcConTope.getTotal();
                    System.out.println("\n---------------");
                    System.out.println("Total a pagar: " + total);
                } catch (ExcepcionMontoNegativo | ExcepcionPrecioCero e) {
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println("\nValores no permitidos!");
                }
            } else {
                try {
                    System.out.print("\nIngrese el porcentaje de descuento: ");
                    montoPorcentaje = scan.nextFloat();
                    Descuento descuentoPorc = new DescuentoPorcentaje(montoPorcentaje);
                    descuentoPorc.setSubtotal(subtotal);
                    total = descuentoPorc.getTotal();
                    System.out.println("\n---------------");
                    System.out.println("Total a pagar: " + total);
                } catch (ExcepcionMontoNegativo | ExcepcionPrecioCero e) {
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println("\nValores no permitidos!");
                }
            }
        } else {
            float descuento = 0;
            try {
                    System.out.print("\nIngrese el monto de descuento: ");
                    descuento = scan.nextFloat();
                    Descuento descuentoFijo = new DescuentoFijo();
                    descuentoFijo.setSubtotal(subtotal);
                    descuentoFijo.setDescuento(descuento);
                    total = descuentoFijo.getTotal();
                    System.out.println("\n---------------");
                    System.out.println("Total a pagar: " + total);
                } catch (ExcepcionMontoNegativo | ExcepcionPrecioCero e) {
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println("\nValores no permitidos!");
                }
        }
    }
    
}
