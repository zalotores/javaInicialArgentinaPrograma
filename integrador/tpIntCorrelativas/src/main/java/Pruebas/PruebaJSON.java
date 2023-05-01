/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Clases.Alumno;
import Conexiones.Conexion;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class PruebaJSON {
    
    public static void main(String[] args) {
        
        Conexion c = new Conexion();
        
        Connection con = c.estableceConexion();
        
        int legajo = -1;
        String nombre = "";
        ArrayList <String> listaMaterias = new ArrayList<>();
        
        ObjectMapper om = new ObjectMapper();
        Alumno alumno = new Alumno("Pedro Perez");
        alumno.setLegajo();
        alumno.setListaMaterias();
        legajo = alumno.getLegajo();
        nombre = alumno.getNombre();
        
        try {
            String jsonText = om.writeValueAsString(alumno.getListaMaterias());
            System.out.println(jsonText);
            String sql = "INSERT INTO alumnos(legajo, nombre, materias_aprobadas) VALUES (?, ?, '" + jsonText + "')";
            PreparedStatement st =con.prepareStatement(sql);
            st.setInt(1, legajo);
            st.setString(2, nombre);
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println(alumno.toString());
        
    }
    
}
