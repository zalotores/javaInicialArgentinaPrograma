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
    
    public static HashMap<String, Integer> puntajesTotales(Jugador jugador) {
        
        HashMap<String, Integer> listaEquipos = Equipos.getEquipos();
        
        int fecha = 0;
        int goles1 = 0;
        int goles2 = 0;
        String equipo1 = "";
        String equipo2 = "";
        
        boolean gana1 = false;
        boolean empate = false;
        boolean gana2 = false;
        
        String rutaResultados = "C:\\datos\\zalo\\cursos\\argentinaPrograma\\javaInicial\\clase10\\tpIntB\\datos\\resultadosTR14.csv";
        
        String rutaPrediccionesPlayer1 = jugador.getRuta();
                
        String fhResultados = Leer.leer(rutaResultados);
        String fhPrediccionesPlayer1 = Leer.leer(rutaPrediccionesPlayer1);
        
        String[] rawResultados = fhResultados.split(",");
        String[] rawPrediccionesPlayer1 = fhPrediccionesPlayer1.split(",");
        
        for (int i = 1; i < rawResultados.length; i++) {
            
            gana1 = false;
            gana2 = false;
            empate = false;
            
            //al ser la prediccion sobre el total de las fechas, se puede poner en el mismo if
            //TODO modificar para resultados parciales
            if (i == rawResultados.length - 1){
                rawResultados[i] = rawResultados[i].replace(']', ' ');
                rawPrediccionesPlayer1[i] = rawPrediccionesPlayer1[i].replace(']', ' ');
            } 
            rawResultados[i] = rawResultados[i].strip();
            rawPrediccionesPlayer1[i] = rawPrediccionesPlayer1[i].strip();
            
            String[] lineaRawResultados = rawResultados[i].split(";");
            fecha = Integer.parseInt(lineaRawResultados[0]);
            equipo1 = lineaRawResultados[1];
            goles1 = Integer.parseInt(lineaRawResultados[2]);
            equipo2 = lineaRawResultados[3];
            goles2 = Integer.parseInt(lineaRawResultados[4]);
            Ronda ronda = new Ronda(fecha, equipo1, goles1, equipo2, goles2);
            
            String[] lineaRawPrediccionesPlayer1 = rawPrediccionesPlayer1[i].split(";");
            if(!lineaRawPrediccionesPlayer1[2].isBlank()) {gana1 = true;}
            else if (!lineaRawPrediccionesPlayer1[4].isBlank()) {gana2 = true;}
            else {empate = true;}
            
            Prediccion prediccionPlayer1 = new Prediccion(fecha, equipo1, gana1, empate, gana2, equipo2);
            
            int resultadoRonda = ronda.puntaje();
            
            if(resultadoRonda == prediccionPlayer1.getResultado()){
                jugador.setPuntaje(1);
            }
            
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
