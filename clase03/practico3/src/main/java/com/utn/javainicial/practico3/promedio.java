/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.javainicial.practico3;

/**
 *
 * @author gonza
 */
public class promedio {

    
    public static void main(String[] args) {
        
        int matematica = 15;
        int biologia = 8;
        int promedio = 0;
        
        promedio=(matematica + biologia)/2;
        
        if(promedio >= 6){
            System.out.println("El alumno aprobo"+promedio);
            
        }
        else{
            System.out.println("El alumno reaprobo"+promedio);
        }
    }
}
