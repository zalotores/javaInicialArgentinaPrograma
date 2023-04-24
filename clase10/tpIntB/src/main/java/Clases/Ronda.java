/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author gonza
 */
public class Ronda {
    
    private int fecha;
    private String equipo1;
    private int goles1;
    private String equipo2;
    private int goles2;

    public Ronda(int fecha, String equipo1, int goles1, String equipo2, int goles2) {
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.goles1 = goles1;
        this.equipo2 = equipo2;
        this.goles2 = goles2;
    }

    public int getFecha() {
        return fecha;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }
    
    //devuelve 1 si gano equipo1, 2 si gano equipo2 o 0 si empatan
    public int puntaje() {
        if(goles1 < goles2) {return 2;}
        else if (goles1 > goles2) { return 1;}
        else return 0;
    }
    
}
