/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Clases.Inscripcion;

/**
 *
 * @author gonza
 */
public class PruebaInscripcion {
    
    public static void main(String[] args) {
        Inscripcion inscripcion1 = new Inscripcion();
        Inscripcion inscripcion2 = new Inscripcion();
        inscripcion1.setAlumno(76419);
        inscripcion1.setMateria("programacion 2");
        
        inscripcion2.setAlumno(8514);
        inscripcion2.setMateria("programacion 2");
        
        System.out.print(inscripcion1.getAlumno().getNombre() + " se puede inscribir en " + inscripcion1.getMateria().getNombre() + "? ");
        System.out.println(inscripcion1.validarInscripcion());
        
        System.out.print(inscripcion2.getAlumno().getNombre() + " se puede inscribir en " + inscripcion2.getMateria().getNombre() + "? ");
        System.out.println(inscripcion2.validarInscripcion());
    }
    
}
