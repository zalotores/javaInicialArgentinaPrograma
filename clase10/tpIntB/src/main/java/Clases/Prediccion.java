/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author gonza
 */
public class Prediccion {
    
    private int fecha;
    private String equipo1;
    private boolean gana1;
    private boolean empate;
    private boolean gana2;
    private String equipo2;
    private int resultado;
    private int sumatoria;
    
    //constructor se define con resultado de Ronda, siendo 1 para cuando gana equipo 1
    //2 para cuando gana equipo 2 y 0 cuando empatan

    public Prediccion(int fecha, String equipo1, boolean gana1, boolean empate, boolean gana2, String equipo2) {
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.gana1 = gana1;
        this.empate = empate;
        this.gana2 = gana2;
        this.equipo2 = equipo2;
        this.sumatoria = 0;
        
        if(gana1 == true) { this.resultado = 1;}
        else if (gana2 == true) { this.resultado = 2;}
        else { this.resultado = 0;}
    }

    public int getFecha() {
        return fecha;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public boolean isGana1() {
        return gana1;
    }

    public boolean isEmpate() {
        return empate;
    }

    public boolean isGana2() {
        return gana2;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public int getResultado() {
        return resultado;
    }
    
    public int getSumatoria(){
        return sumatoria;
    }
    
    public void setSumatoria(int puntos){
        this.sumatoria += puntos;
    }

}
