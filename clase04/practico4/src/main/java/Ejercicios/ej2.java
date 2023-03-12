/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import UtilitiesArchivo.*;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
contener números. El programa debe escribir por consola la suma de esos números
a. Al programa anterior agreguele un parámetro para que la operación pueda ser
suma o multiplicación.
 *
 * @author gonza
 */
public class ej2 {
    
    public static void main(String[] args) {
        System.out.println("---------------\n");
        System.out.println("Sumador / Multiplicador de numeros.");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la ruta del archivo:");
        String ruta = scan.nextLine();
        if(ruta.length()<1) {
            ruta = "C:\\datos\\zalo\\cursos\\argentinaPrograma\\javaInicial\\clase04\\fibonacci10.txt";
        }
        
        String fh = Leer.leer(ruta);
        
        if(!fh.isEmpty()){
            char operador = 'a';
            do { 
                System.out.print("Ingrese 'S' para sumar o 'M' para multiplicar: ");
                operador = Character.toLowerCase(scan.next().charAt(0));
                
            } while ((operador != 's') && (operador!= 'm'));
            
            BigInteger resultado = BigInteger.ONE;
            if(operador == 's'){ resultado = BigInteger.ZERO;}
            
            for (String dato : fh.split(" ")) {
                
                if( dato.startsWith("[")){
                    dato = dato.substring(1);
                }
                if ( dato.endsWith("]") ) {
                    dato = dato.substring(0, dato.length()-1);
                }
                
                try {
                    
                    BigInteger buffer = new BigInteger(dato);
                
                    if(operador == 's'){
                        resultado = resultado.add(buffer);
                        System.out.println("suma " + buffer);
                    }
                    else {resultado = resultado.multiply(buffer);}
                    
                } catch (Exception e) {}
                
            }
            String operacion = "suma";
            if(operador !='s'){operacion = "multiplicacion";}
            
            System.out.println("El resultado de la " + operacion + " de los valores numericos del archivo es: "
                    + resultado );
            System.out.println("---------------\n");
                    
        } else System.out.println("No se encuentra archivo");
        
        
    }
    
}
