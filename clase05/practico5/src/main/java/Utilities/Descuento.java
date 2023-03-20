/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

/**
 *
 * @author gonza
 */
public class Descuento {
    
    private float descuento;
    private float subtotal;

    public Descuento(float subtotal, float descuento) {
        this.subtotal = subtotal;
        this.descuento = descuento;
    }

    public float total() {
        return subtotal * (1 - (descuento/100));
    }
    
    
    
}
