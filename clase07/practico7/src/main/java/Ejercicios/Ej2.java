/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Utilities.*;
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
        //agrego estas lineas para automatizar el carrito de compras con una lista fija
        int contadorTest = 0;
        int [] cantidadesTest = {1, 3, 2};
        
        do {

            System.out.print("Ingrese el codigo de producto o '0' para salir: ");
            /*try {
                codigo = scan.nextInt();
                
            } catch (Exception e) {
                System.out.println("\nCodigo incorrecto!");
                break;
            }*/
            codigo = contadorTest + 1;
            System.out.print(codigo);
            System.out.print("\nIngrese la cantidad de unidades de codigo " + codigo + ": ");
            cantidad = cantidadesTest[contadorTest];
            System.out.println(cantidad + "\n");
            
            /*if (codigo != 0){
                System.out.print("Ingrese la cantidad de unidades de codigo " + codigo + ": ");
                try {
                    cantidad = scan.nextInt();
                
                } catch (Exception e) { 
                    System.out.println("\nCantidad incorrecta!");
                    break;
                }
            }*/
            
            if(codigo != 0){
                carrito.setItem(codigo, cantidad);
                System.out.println("---------");
            }
            contadorTest++;
            if(contadorTest > 2){break;}
            
        } while (codigo != 0);
        
        total = carrito.carritoPrecio();
        
        float descuento = 0;
        /*
        try {
            System.out.print("Ingrese el descuento a aplicar: ");
            descuento = scan.nextFloat();
            
        } catch (Exception e) {
            System.out.println("\nNo aplica descuento");
        }*/
        
        boolean porcentajeDescuento = true;
        String bufferDescuento;
        /*
        try {
            System.out.print("El descuento es en porcentaje? ");
            bufferDescuento = scan.next();
            if(!(bufferDescuento.toLowerCase().equals("si")) || 
               (bufferDescuento.toLowerCase().equals("s"))){
                porcentajeDescuento = false;
            }
            
        } catch (Exception e) {
            System.out.println("\nNo aplica descuento");
        }*/
        System.out.println("**************");
        float totalEsperado = total;
        float resultadoEsperado = 0;
        System.out.println("\nSubtotal sin descuentos: " + total);
        System.out.println("\nTest 1: Descuento fijo");
        
        descuento = 50;
        
        System.out.println("Descuento: " + descuento);
        
        Descuento subtotal = new Descuento(total, descuento, false);
        
        total = subtotal.descuentoFijo();

        System.out.println("Total a pagar: " + total);
        resultadoEsperado = totalEsperado - descuento;
        System.out.println("Resultado Test: " + !(resultadoEsperado == total));
        
        System.out.println("\n----------------");
        System.out.println("\nTest 2: Descuento porcentual");
        total = totalEsperado;
        descuento = 20;
        
        System.out.println("Descuento: " + descuento);
        
        Descuento subtotal2 = new Descuento(total, descuento, true);
        
        total = subtotal2.descuentoPorcentaje();

        System.out.println("Total a pagar: " + total);
        resultadoEsperado = totalEsperado * (1 - ( descuento / 100));
        System.out.println("Resultado Test: " + !(resultadoEsperado == total));

        System.out.println("\n----------------");
        System.out.println("\nTest 3: Descuento porcentual con tope - tope no alcanzado");
        total = totalEsperado;
        descuento = 20;
        float tope = 60;
        
        System.out.println("Descuento: " + descuento);
        System.out.println("Tope: " + tope);
        
        Descuento subtotal3 = new Descuento(total, descuento, false);
        
        total = subtotal3.descuentoPorcentajeConTope(tope);

        System.out.println("Total a pagar: " + total);
        if((totalEsperado * descuento/100) > tope){
            resultadoEsperado = totalEsperado - tope;
        }else {
            resultadoEsperado = totalEsperado - (totalEsperado * descuento / 100);
        }
        System.out.println("Resultado Test: " + !(resultadoEsperado == total));
        
        System.out.println("\n----------------");
        System.out.println("\nTest 4: Descuento porcentual con tope - tope alcanzado");
        total = totalEsperado;
        descuento = 60;
        tope = 60;
        
        System.out.println("Descuento: " + descuento);
        System.out.println("Tope de descuento: " + tope);
        
        Descuento subtotal4 = new Descuento(total, descuento, true);
        
        total = subtotal4.descuentoPorcentajeConTope(tope);

        System.out.println("Total a pagar: " + total);
        if((totalEsperado * descuento/100) > tope){
            resultadoEsperado = totalEsperado - tope;
        }else {
            resultadoEsperado = totalEsperado - (totalEsperado * descuento/100);
            System.out.println("!");
        }
        System.out.println("Resultado Test: " + !(resultadoEsperado == total));

    }
    
}
