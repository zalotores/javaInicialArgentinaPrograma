/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Utilities.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author gonza
 */
public class Alumno {
    
    private String nombre;
    private int legajo;
    private ArrayList <String> listaMaterias = new ArrayList<>();

    public Alumno(String nombre) {
        
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLegajo() {
        String dato = "";
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("\nIngrese legajo(hasta 5 digitos): ");
            dato = scan.nextLine();
            if (Pattern.compile("^\\d{1,5}$").matcher(dato).find()) {
                    flag = false;
                    this.legajo = Integer.parseInt(dato);
                }
            
        } while (flag);
        
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public ArrayList<String> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias() {

        this.listaMaterias = Arrays.cargar();
    }

    public void setListaMaterias(ArrayList<String> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", legajo=" + legajo + ", listaMaterias=" + listaMaterias + '}';
    }

    
}
