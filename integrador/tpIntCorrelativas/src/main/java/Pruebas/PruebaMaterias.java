/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Clases.Materias;

/**
 *
 * @author gonza
 */
public class PruebaMaterias {
    
    public static void main(String[] args) {
        
        Materias materia = new Materias("programacion 2");
        materia.setCorrelativas();
        System.out.println(materia.toString());
        
    }
    
}
