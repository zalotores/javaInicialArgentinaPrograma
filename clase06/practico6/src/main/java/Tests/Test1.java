/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import com.utn.javainicial.practico6.Calculadora;

/**
 *
 * @author gonza
 */
public class Test1 {
    
    public static boolean prueba1(){
        
        System.out.println("--------------");
        System.out.println("1. El resultado de multiplicar 80 por 3 da 240");
        
        double n1 = 80;
        double n2 = 3;
        
        double resultado = Calculadora.multiplicar(n1, n2);
        
        return (resultado != 240);
        
    }
    
    public static boolean prueba2(){
        
        System.out.println("--------------");
        System.out.println("2. El resultado de sumar 150 y 180, dividido por 3, da 110");
        
        double n1 = 150;
        double n2 = 180;
        double n3 = 3;
        
        double resultado = Calculadora.dividir(Calculadora.sumar(n1, n2), n3);
        
        return (resultado != 110);
        
    }
    
    public static boolean prueba3(){
        
        System.out.println("--------------");
        System.out.println("3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.");
        
        double n1 = 90;
        double n2 = 50;
        double n3 = 15;
        
        double resultado = Calculadora.multiplicar(Calculadora.restar(n1, n2), n3);
        
        return (resultado == 605);
        
    }
    
    public static boolean prueba4(){
        
        System.out.println("--------------");
        System.out.println("4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700");
        
        double n1 = 80;
        double n2 = 3;
        double n3 = 25;
        
        double resultado = Calculadora.multiplicar(Calculadora.sumar(n1, n2), n3);
        
        return (resultado == 2700);
        
    }
    
}
