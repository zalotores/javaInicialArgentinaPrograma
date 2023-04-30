/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Utilities.Arrays;
import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Materias {
    
    private String nombre;
    private ArrayList <String> correlativas = new ArrayList<>();

    public Materias(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas() {
        this.correlativas = Arrays.cargar();     
    }

    @Override
    public String toString() {
        return "Materias{" + "nombre=" + nombre + ", correlativas=" + correlativas + '}';
    }
    
}
