/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Clases.Materia;

/**
 *
 * @author gonza
 */
public class PruebaMaterias {
    
    public static void main(String[] args) {
        
        Materia materia = new Materia("programacion 2");
        materia.setCorrelativas();
        System.out.println(materia.toString());
        
    }
    
}
