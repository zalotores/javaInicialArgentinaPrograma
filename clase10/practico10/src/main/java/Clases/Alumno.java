/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Alumno {
    
    private String nombre;
    private String legajo;
    private List <String> materiasAprobadas = new ArrayList();
    
    public Alumno(String nombre, String legajo){
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public List getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas() {
        Scanner scan = new Scanner(System.in);
        String materia = "";
        boolean flag = true;
        int index = 0;
        while(flag) {
            System.out.print("\nIngrese la materia aprobada del alumno " + this.nombre + " : ");
            materia = scan.nextLine();
            if(materia.length() > 1) {
                this.materiasAprobadas.add(index, materia);
                index++;
            } else {
                flag = !flag;
            }
        }
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", legajo=" + legajo + ", materiasAprobadas=" + materiasAprobadas + '}';
    }
    
    
    
}
