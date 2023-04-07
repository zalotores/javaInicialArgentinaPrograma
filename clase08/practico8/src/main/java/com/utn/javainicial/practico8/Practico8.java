/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utn.javainicial.practico8;

import Excepciones.ExcepcionMontoNegativo;
import Excepciones.ExcepcionPrecioCero;
import Utilities.*;
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
        
        System.out.println("\nPara probar excepcion de carrito 0, se puede iniciar con cero y aplicar un descuento");
        Compra.compra();
        
        System.out.println("\n Para descuento negativo, se puede agregar un porcentaje mayor a 100");
        Compra.compra();
    }
}
