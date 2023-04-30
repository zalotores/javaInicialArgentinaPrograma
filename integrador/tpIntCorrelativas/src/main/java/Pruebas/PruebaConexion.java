/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Conexiones.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gonza
 */
public class PruebaConexion {
    
    public static void main(String[] args) {
        Conexion c = new Conexion();
        
        Connection con = c.estableceConexion();
        
        //Mostrar todos los alumnos ordenados alfabéticamente.
        //statement
        try {
            String sql = "SELECT * FROM alumnos ORDER BY legajo";
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(sql);
            System.out.println("Listado de alumnos: ");
            while(result.next()) {
                int legajo = result.getInt("legajo");
                String alumno = result.getString("alumno");
                System.out.println(legajo + " | " + alumno);
            }
            st.close();
            result.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
