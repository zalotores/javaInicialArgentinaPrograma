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
    private boolean porcentaje;
    
    public Descuento(float subtotal, float descuento) {
        this.subtotal = subtotal;
        this.descuento = descuento;
    }

    public Descuento(float subtotal, float descuento, boolean porcentaje) {
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.porcentaje = porcentaje;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getSubtotal() {
        return subtotal;
    }
    
    
    
    public float total() {
        return subtotal * (1 - (descuento/100));
    }

    public float total(boolean porcentaje) {
        if (porcentaje){return subtotal * (1 - (descuento/100));}
        return (subtotal - descuento);
    }
    
    public float descuentoFijo(){
        return (subtotal - descuento);
    }
    
    public float descuentoPorcentaje() {
        return subtotal * (1 - (descuento/100));
    }
    
    public float descuentoPorcentajeConTope(float topeMontoDescuento) {
        if((subtotal * descuento /100) > topeMontoDescuento){return subtotal - topeMontoDescuento;}
        return subtotal * (1 - (descuento/100));
    }
    
    
}
