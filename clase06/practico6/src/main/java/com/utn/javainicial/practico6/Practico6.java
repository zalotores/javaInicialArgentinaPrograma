/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utn.javainicial.practico6;

/**
 *
 * @author gonza
 */
public class Practico6 {

    public static void main(String[] args) {

        System.out.println("**************");
        System.out.println("Testing");
        System.out.println("\nImplemente una clase “Calculadora” que tenga cuatro métodos, uno por cada operación\n"
                + "aritmética básica (suma, resta, multiplicación y división), respetando las siguientes firmas:");
        System.out.println(" * double sumar(double unNumero, double otroNumero);");
        System.out.println(" * double restar(double unNumero, double otroNumero);");
        System.out.println(" * double multiplicar(double unNumero, double otroNumero);");
        System.out.println(" * double dividir(double unNumero, double otroNumero);");

        System.out.println("\nLuego de haber implementado la Calculadora, realice los siguientes casos de prueba:");

        System.out.println("\n 1. El resultado de multiplicar 80 por 3 da 240");
        System.out.println(" 2. El resultado de sumar 150 y 180, dividido por 3, da 110");
        System.out.println(" 3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.");
        System.out.println(" 4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.");

        System.out.println("\nCuando termine, suba el nuevo código a GIT");
        
        System.out.println("\n*************************\n");
        System.out.println("Resultado de pruebas:");
        
        System.out.println(Tests.Test1.prueba1());
        
        System.out.println(Tests.Test1.prueba2());
        
        System.out.println(Tests.Test1.prueba3());
        
        System.out.println(Tests.Test1.prueba4());
        
    }
}
