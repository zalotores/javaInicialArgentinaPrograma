/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utn.javainicial.tpintb;

import Clases.Jugador;
import Clases.Partidos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author gonza
 */
public class TpIntB {

    public static void main(String[] args) {
        
        System.out.println("************");
        System.out.println("PRODE TORNEO FUTBOL ARGENTINO");
        System.out.println("\nEste prode se basa en el torneo de transicion 2014");
        System.out.println("http://www.futbolpasion.com/fixture.cfm?campeonato=tr14");
        
        System.out.println("Jugador 1: Player1");
        Jugador player1 = new Jugador("Player 1");
        System.out.println("Archivo de predicciones guardado en /Datos/player1.csv");
        player1.setRuta("player1.csv");
        
        System.out.println("Jugador 2: Player2");
        Jugador player2 = new Jugador("Player 2");
        System.out.println("Archivo de predicciones guardado en /Datos/player2.csv");
        player2.setRuta("player2.csv");
        
        HashMap<String, Integer> puntuacionesTotales = Partidos.puntajesTotales(player1);
        int puntajeJugador1 = player1.getPuntaje();
        
        Partidos.puntajesTotales(player2);
        int puntajeJugador2 = player2.getPuntaje();
        
        System.out.println("\n************");
        System.out.println("Resultados finales");
        System.out.println("Jugador 1: " + puntajeJugador1 );
        System.out.println("Jugador 2: " + puntajeJugador2);
        System.out.println("\nResultados del torneo:");
        
        ArrayList totales = new ArrayList();
        for (Map.Entry<String, Integer> entry
                : puntuacionesTotales.entrySet()) {
            Object key = entry.getKey();
            Integer value = entry.getValue();
            totales.add((value + " | " + key));
            
        }
        
        Collections.sort(totales, Collections.reverseOrder());
        for (int i = 0; i < totales.size(); i++) {
            System.out.println(totales.get(i));
            
        }
        System.out.println("\n************");
        
    }
}
