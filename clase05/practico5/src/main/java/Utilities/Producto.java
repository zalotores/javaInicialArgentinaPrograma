/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.util.Hashtable;

/**
 * Producto puede tener hasta tres items
 *
 * @author gonza
 */
public class Producto {
    
    private String nombre;
    private float precio;
    
    
    
    public Producto(int codigo) {
        
        Hashtable<Integer,String> lista = new Hashtable<>(); 
        lista.put(1, "jabón en polvo");
        lista.put(2, "esponjas");
        lista.put(3, "chocolate");
        
        this.nombre = lista.getOrDefault(codigo, "No encontrado");
        
        switch (codigo) {
            case 1:
                this.precio = 40;
                break;
            case 2:
                this.precio = 10;
                break;
            case 3:
                this.precio = 100;
                break;
            default:
                System.out.println("No encontrado");;
        }
        
    }

    public String getNombre(int codigo) {
        return this.nombre;
    }

    public float getPrecio(int codigo) {
        return this.precio;
    }
    

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
