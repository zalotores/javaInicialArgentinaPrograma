/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Clases.Alumno;
import Clases.Materias;
import Conexiones.Conexion;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class GestorDatos {
    
    public static void cargarAlumno() {
        Conexion c = new Conexion();
        Connection con = c.estableceConexion();
        Scanner scan = new Scanner(System.in);
        String validador = "";
        
        int legajo = -1;
        String nombre = "";
        
        System.out.println("---------");
        System.out.println("Carga de Alumno");
        
        while (true) {            
            System.out.print("\nIngrese el nombre del alumno: ");
            nombre = scan.nextLine();
            System.out.print("\n" + nombre + " es correcto? S / N: ");
            validador = scan.nextLine().toLowerCase();
            if(validador.startsWith("s")){break;}
        }
        
        Alumno alumno = new Alumno(nombre);
        alumno.setLegajo();
        legajo = alumno.getLegajo();
        alumno.setListaMaterias();
        
        ObjectMapper om = new ObjectMapper();
        
        try {
            String jsonText = om.writeValueAsString(alumno.getListaMaterias());
            String sql = "INSERT INTO alumnos(legajo, nombre, materias_aprobadas) VALUES (?, ?, '" + jsonText + "')";
            PreparedStatement st =con.prepareStatement(sql);
            st.setInt(1, legajo);
            st.setString(2, nombre);
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }
        
    }
    
    public static Alumno traerAlumno(int legajo){
        
        Conexion c = new Conexion();
        Connection con = c.estableceConexion();
       
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM alumnos WHERE legajo = " + legajo);
            rs.next();
            Alumno alumno = new Alumno(rs.getString("nombre"));
            alumno.setLegajo(rs.getInt("legajo"));
            alumno.setListaMaterias(Arrays.convertirString(rs.getString("materias_aprobadas")));
            con.close();
            return alumno;
        } catch (Exception e) {
            System.out.println("Error! " + e);
            return null;
        }
        
    }
    
    public static void cargarMateria(){
        
        Conexion c = new Conexion();
        Connection con = c.estableceConexion();
        Scanner scan = new Scanner(System.in);
        String validador = "";
        
        String nombre = "";
        System.out.println("---------");
        System.out.println("Carga de Materia");
        
        while (true) {            
            System.out.print("\nIngrese el nombre de la materia: ");
            nombre = scan.nextLine();
            System.out.print("\n" + nombre + " es correcto? S / N: ");
            validador = scan.nextLine().toLowerCase();
            if(validador.startsWith("s")){break;}
        }
        
        Materias materia = new Materias(nombre);
        materia.setCorrelativas();
        
        ObjectMapper om = new ObjectMapper();
        
        try {
            String jsonText = om.writeValueAsString(materia.getCorrelativas());
            String sql = "INSERT INTO materias_final(nombre, correlativas) VALUES (?, '" + jsonText + "')";
            PreparedStatement st =con.prepareStatement(sql);
            st.setString(1, nombre);
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }
        
    }
    
    public static Materias traerMateria(String nombre) {
        Conexion c = new Conexion();
        Connection con = c.estableceConexion();
        
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM materias_final WHERE nombre = '" + nombre + "'");
            rs.next();
            Materias materia = new Materias(rs.getString("nombre"));
            materia.setCorrelativas(Arrays.convertirString(rs.getString("correlativas")));
            con.close();
            return materia;
            
        } catch (Exception e) {
            System.out.println("Error! " + e);
            return null;
        }
    }
    
}
