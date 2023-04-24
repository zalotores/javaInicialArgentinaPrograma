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
public class Partidos {
    
    public static HashMap<String, Integer> puntajesTotales() {
        
        HashMap<String, Integer> listaEquipos = Equipos.getEquipos();
        int fecha = 0;
        int goles1 = 0;
        int goles2 = 0;
        String equipo1 = "";
        String equipo2 = "";
        
        String ruta = "C:\\datos\\zalo\\cursos\\argentinaPrograma\\javaInicial\\clase10\\tpIntB\\datos\\resultadosTR14.csv";
        
        String fh = Leer.leer(ruta);
        String[] raw = fh.split(",");
        
        for (int i = 1; i < raw.length; i++) {
            
            if (i == raw.length - 1){
                raw[i] = raw[i].replace(']', ' ');
            } 
            raw[i] = raw[i].strip();
            
            String[] lineaRaw = raw[i].split(";");
            fecha = Integer.parseInt(lineaRaw[0]);
            equipo1 = lineaRaw[1];
            goles1 = Integer.parseInt(lineaRaw[2]);
            equipo2 = lineaRaw[3];
            goles2 = Integer.parseInt(lineaRaw[4]);
            
            Ronda ronda = new Ronda(fecha, equipo1, goles1, equipo2, goles2);
            
            int resultadoRonda = ronda.puntaje();
            switch (resultadoRonda) {
                case 0:
                    listaEquipos.put(equipo1, listaEquipos.get(equipo1) + 1);
                    listaEquipos.put(equipo2, listaEquipos.get(equipo2) + 1);
                    break;
                case 1:
                    listaEquipos.put(equipo1, listaEquipos.get(equipo1) + 3);
                    listaEquipos.put(equipo2, listaEquipos.get(equipo2) + 0);
                    break;
                case 2:
                    listaEquipos.put(equipo1, listaEquipos.get(equipo1) + 0);
                    listaEquipos.put(equipo2, listaEquipos.get(equipo2) + 3);
                    break;
                default:
                    System.out.println("Algo fallo! Resultado no encontrado en fecha " + fecha);
            }
            
        }
        
        return listaEquipos;
        
    }
    
}
