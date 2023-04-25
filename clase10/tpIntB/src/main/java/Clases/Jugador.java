/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author gonza
 */
public class Jugador {
    
    private String nombre;
    private static int puntaje;
    private String ruta;
    
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getPuntaje() {
        return puntaje;
    }

    public static void setPuntaje(int puntaje) {
        Jugador.puntaje += puntaje;
    }
    
    public static void reSetPuntaje() {
        Jugador.puntaje = 0;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String nombreArchivo) {
        this.ruta = "C:\\datos\\zalo\\cursos\\argentinaPrograma\\javaInicial\\clase10\\tpIntB\\datos\\" + nombreArchivo;
    }
    
    
    
}
