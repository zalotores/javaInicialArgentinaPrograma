/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Clases.Alumno;

/**
 *
 * @author gonza
 */
public class PruebaAlumno {
    
    public static void main(String[] args) {
        
        Alumno alumno = new Alumno("Pedro Perez");
        alumno.setLegajo();
        alumno.setListaMaterias();
        
        System.out.println(alumno.toString());
                
    }
    
}
