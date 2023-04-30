/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Conexiones.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gonza
 */
public class PruebaConexion {
    
    public static void main(String[] args) {
       
        Conexion c = new Conexion();
        
        Connection con = c.estableceConexion();
        
        //statement
        try {
            String sql = "SELECT * FROM practico12";
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                int doc = result.getInt("dni");
                String nacionalidad = result.getString("nacionalidad");
                System.out.println("dni: " + doc + ", pais: " + nacionalidad);
            }
            st.close();
            result.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //preparedStatement
        
        try {
            String sql = "SELECT * FROM practico12 WHERE dni = ?";
            PreparedStatement st =con.prepareStatement(sql);
            st.setInt(1, 11425778);
            ResultSet result = st.executeQuery();
            while(result.next()) {
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                System.out.println("nombre: " + nombre + " " + apellido);
            }
            st.close();
            result.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("error! " + ex);
        }
        
        System.out.println("Conexion terminada");

    }
    
}
