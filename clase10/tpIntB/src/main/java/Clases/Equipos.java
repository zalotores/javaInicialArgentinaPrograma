/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Utilities.Leer;
import java.util.HashMap;

/**
 *
 * @author gonza
 */
public class Equipos {

    public static HashMap<String, Integer> getEquipos() {
        
        HashMap <String, Integer> equipos = new HashMap<>();
        String ruta = "C:\\datos\\zalo\\cursos\\argentinaPrograma\\javaInicial\\clase10\\tpIntB\\datos\\equipos.txt";

        String equiposRaw = Leer.leer(ruta);
        String[] raw = equiposRaw.split(",");
        //saco los espacios
        for (int i = 0; i < raw.length -1; i++) {
            if (i == 0){
                raw[i] = raw[i].replace('[', ' ');
            } else if (i == (raw.length - 1)) {
                raw[i] = raw[i].replace(']', ' ');
            }
            raw[i] = raw[i].strip();
            equipos.put(raw[i], 0);
        }        
        
        return equipos;
    }
    
    

}
