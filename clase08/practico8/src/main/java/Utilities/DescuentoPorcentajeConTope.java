/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Excepciones.ExcepcionMontoNegativo;
import Excepciones.ExcepcionPrecioCero;

/**
 *
 * @author gonza
 */
public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
    
    private float tope;

    public DescuentoPorcentajeConTope(float tope, float porcentaje) {
        super(porcentaje);
        this.tope = tope;
    }
    
    @Override
    public float getTotal() throws ExcepcionPrecioCero, ExcepcionMontoNegativo{
        float subtotal = super.getSubtotal();
        float montoDescuento = subtotal * super.getPorcentaje() / 100;
        if( montoDescuento < tope) {return super.getTotal();}
        else {
            return subtotal - tope;
        }
    }
    
}
