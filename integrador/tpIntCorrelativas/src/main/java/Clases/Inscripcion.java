/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Utilities.GestorDatos;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Inscripcion {
    
    private Materia materia;
    private Alumno alumno;
    private LocalDate fecha = LocalDate.now();

    public Inscripcion() {
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = GestorDatos.traerMateria(materia);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(int legajo) {
        this.alumno = GestorDatos.traerAlumno(legajo);
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public boolean validarInscripcion(){
        
        ArrayList <String> correlativas = this.materia.getCorrelativas();
        ArrayList <String> aprobadas = this.alumno.getListaMaterias();
        int n = 0;
        if (correlativas.get(0).length() < 1) {return true;}
        for (String correlativa : correlativas) {

            for (String aprobada : aprobadas) {
                if (correlativa.equals(aprobada)) {
                    n++;
                    break;
                }
            }
        }
        if (n == correlativas.size()) {
            return true;
        } else {
            return false;
        }

    }
    
}
