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
public class DescuentoPorcentaje extends Descuento {
    
    private float porcentaje;

    public DescuentoPorcentaje(float porcentaje) {
        super();
        this.porcentaje = porcentaje;
    }

    public float getPorcentaje() {
        return porcentaje;
    }
    
    @Override
    public float getTotal()throws ExcepcionPrecioCero, ExcepcionMontoNegativo{
        float total = super.getSubtotal() * (1 - (porcentaje /100));
        if(total < 0){ throw new Excepciones.ExcepcionMontoNegativo("El total no puede ser negativo!");}
        return total;
    }
    
}
