/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utn.javainicial.practico13;

import Conexiones.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gonza
 */
public class Practico13 {

    public static void main(String[] args) {
        Conexion c = new Conexion();
        
        Connection con = c.estableceConexion();
        
        int dni = 0;
        String nombre = "";
        String apellido = "";
        String nacionalidad = "";
        int departamento = 0;
        
        //Insertar un empleado nuevo en la nómina de trabajo.
        dni = 23546875;
        nombre = "Pedro";
        apellido = "Perez Pascal";
        nacionalidad = "mexico";
        departamento = 2;
        
        try {
            String sql = "INSERT INTO practico12(dni, nombre, apellido, nacionalidad, departamento) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement st =con.prepareStatement(sql);
            st.setInt(1, dni);
            st.setString(2, nombre);
            st.setString(3, apellido);
            st.setString(4, nacionalidad);
            st.setInt(5, departamento);
            st.execute();
            
            st.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //Modificar la nacionalidad de algún empleado.
        nacionalidad = "francia";
        
        try {
            String sql = "UPDATE practico12 SET nacionalidad = ? WHERE dni = ?";
            PreparedStatement st =con.prepareStatement(sql);
            st.setString(1, nacionalidad);
            st.setInt(2, dni);
            st.execute();
            
            st.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //Eliminar un departamento.
        departamento = 3;
        try {
            String sql = "DELETE FROM practico12_secundaria WHERE id = ?;";
            PreparedStatement st =con.prepareStatement(sql);
            st.setInt(1, departamento);
            st.execute();
            
            st.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //Conocer los empleados que trabajan en el departamento de “logística”
        departamento = 1;
        try {
            String sql = "SELECT * FROM practico12 a JOIN practico12_secundaria b ON a.departamento = b.id WHERE b.id = ?";
            PreparedStatement st =con.prepareStatement(sql);
            st.setInt(1, departamento);
            ResultSet result = st.executeQuery();
            System.out.println("Nomina de Sistemas: ");
            while(result.next()) {
                dni = result.getInt("dni");
                nombre = result.getString("nombre");
                apellido = result.getString("apellido");
                nacionalidad = result.getString("nacionalidad");
                departamento = result.getInt("departamento");
                System.out.println("dni: " + dni + " | nombre: " + nombre + " | apellido: " + apellido + " | nacion: " + nacionalidad);
            }
            st.close();
            result.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //Mostrar todos los departamentos ordenados alfabéticamente.
        //statement
        try {
            String sql = "SELECT * FROM practico12_secundaria ORDER BY departamento";
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(sql);
            System.out.println("Listado de departamentos: ");
            while(result.next()) {
                String depto = result.getString("departamento");
                System.out.println(depto);
            }
            st.close();
            result.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
