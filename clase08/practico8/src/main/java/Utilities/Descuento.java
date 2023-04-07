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
    private float total;
    
    public Descuento() {}

    public float getSubtotal() throws Excepciones.ExcepcionPrecioCero {
        if(this.subtotal == 0){throw new Excepciones.ExcepcionPrecioCero("Carrito vacio!");}
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getDescuento() {
        return descuento;
    }
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
    public float getTotal() throws Excepciones.ExcepcionPrecioCero, Excepciones.ExcepcionMontoNegativo{
        total = (subtotal - descuento);
        if(total < 0){ throw new Excepciones.ExcepcionMontoNegativo("El total no puede ser negativo!");}
        return total;
    }

}
