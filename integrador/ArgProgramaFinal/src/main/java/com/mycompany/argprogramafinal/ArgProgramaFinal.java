/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.argprogramafinal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import top.jfunc.json.impl.JSONArray;
import top.jfunc.json.impl.JSONObject;

/**
 *
 * @author nes
 */

public class ArgProgramaFinal {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private static Conexion conexion = new Conexion();

    public static void main(String[] args) throws SQLException, JsonProcessingException {

        crearMateria();
        
        traerDatos();
        
    }
    
    public static void crearMateria() throws SQLException{
    
        Materia materia = new Materia();

        ////---CREACION DE MATERIAS---

        System.out.println("Que nombre quiere que tenga la materia?");
        String nombre = sc.next();
        materia.setNombre(nombre);

        System.out.println("Cuantas correlativas tiene?");

        int numero = sc.nextInt();

        System.out.println("Que materias desea agregar a las correlativas?");
        ArrayList<String> correlativas = new ArrayList<>();

        String input;

        for (int i = 0; i < numero; i++) {
            input = sc.next();
            correlativas.add(input);
        }
        
        String correlativasJson = new Gson().toJson(correlativas);

        conexion.estableceConexion();
        Statement stmt = conexion.conectar.createStatement();
        stmt.executeUpdate("INSERT INTO materias_final VALUES(\"" + nombre + "\",'" + correlativasJson + "');");
        conexion.cerrarConnection();
        
    }

    //Creo el hashmap de las materias para poder trabajar dentro del codigo
    public static void traerDatos() throws SQLException, JsonProcessingException {

        Materia materia = new Materia();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        
        HashMap<String, ArrayList<String>> hmMaterias = new HashMap<>();

        conexion.estableceConexion();
        Statement stmt = conexion.conectar.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM materias_final");

        while (rs.next()) {

            materia = new Materia(rs.getString("nombre"));

            String jsonText = objectMapper.writeValueAsString(rs.getString("correlativas"));

            ArrayList<String> nombreCorrelativas = objectMapper.readValue(jsonText, ArrayList.class);

            materia.setCorrelativas(nombreCorrelativas);

            hmMaterias.put(materia.getNombre(), materia.getCorrelativas());

        }
        conexion.cerrarConnection();
        
        System.out.println(hmMaterias);

    }

}
