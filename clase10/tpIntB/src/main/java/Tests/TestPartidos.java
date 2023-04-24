/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import Clases.Partidos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gonza
 */
public class TestPartidos {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> puntuacionesTotales = Partidos.puntajesTotales();
        
        ArrayList totales = new ArrayList();
        
        //control de listaEquipos
        int contPrueba = 1;
        for (Map.Entry<String, Integer> entry
                : puntuacionesTotales.entrySet()) {
            Object key = entry.getKey();
            Integer value = entry.getValue();
            totales.add((value + " | " + key));
            //System.out.println(contPrueba + " , " + key + " , " + value);
            contPrueba++;
            
        }
        
        Collections.sort(totales, Collections.reverseOrder());
        for (int i = 0; i < totales.size(); i++) {
            System.out.println(totales.get(i));
            
        }
    }
    
}
