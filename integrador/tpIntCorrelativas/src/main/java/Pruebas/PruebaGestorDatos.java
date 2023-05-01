/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Clases.Alumno;
import Clases.Materia;
import Utilities.GestorDatos;

/**
 *
 * @author gonza
 */
public class PruebaGestorDatos {
    
    public static void main(String[] args) {
        
        //carga de alumno
        GestorDatos.cargarAlumno();
        
        //traer un alumno
        Alumno pepito = GestorDatos.traerAlumno(76419);
        System.out.println(pepito.toString());
        
        //carga de materia
        GestorDatos.cargarMateria();
        
        //traer una materia
        Materia cosa = GestorDatos.traerMateria("programacion 2");
        System.out.println(cosa.toString());
        
    }
    
}
