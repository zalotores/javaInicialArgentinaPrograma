/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import Clases.Equipos;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gonza
 */
public class TestEquipos {
    
    public static void main(String[] args) {

        HashMap<String, Integer> listaEquipos = Equipos.getEquipos();

        //control de listaEquipos
        int contPrueba = 1;
        for (Map.Entry<String, Integer> entry
                : listaEquipos.entrySet()) {
            Object key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(contPrueba + " , " + key + " , " + value);
            contPrueba++;
        }
        
    }
    
}
