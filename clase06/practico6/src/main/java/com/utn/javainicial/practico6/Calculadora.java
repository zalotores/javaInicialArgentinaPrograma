/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.javainicial.practico6;

/**
 *
 * @author gonza
 */
public class Calculadora {
    
    public static double sumar(double unNumero, double otroNumero){
        
        return (unNumero + otroNumero);
    }
    
    public static double restar(double unNumero, double otroNumero){
        
        return (unNumero - otroNumero);
    }
    
    public static double multiplicar(double unNumero, double otroNumero){
        
        return (unNumero * otroNumero);
    }
    
    public static Double dividir(double unNumero, double otroNumero){
        
        if (otroNumero == 0) {
            return (Double.MAX_VALUE);
        } else {
            return (unNumero / otroNumero);
        }
    }
    
}
