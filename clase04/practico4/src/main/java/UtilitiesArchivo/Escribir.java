/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilitiesArchivo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author gonza
 */
public class Escribir {
    
    public static void escribir(String ruta, String linea) {

        Path path = Paths.get(ruta);

        try {
            Files.writeString(path, " " + linea, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("No se pudo escribir en archivo!\n" + ruta/* + "\n" + e*/);
        }

    }
    
    //para elegir openOption
    public static void escribir(String ruta, String linea, String opcion) {

        Path path = Paths.get(ruta);

        try {
            switch (opcion) {
                case "READ" -> Files.writeString(path, linea, StandardOpenOption.READ);
                
                case "WRITE" -> Files.writeString(path, linea, StandardOpenOption.WRITE);
                 
                case "APPEND" -> Files.writeString(path, linea, StandardOpenOption.APPEND);
                
                case "TRUNCATE_EXISTING" -> Files.writeString(path, linea, StandardOpenOption.TRUNCATE_EXISTING);
                    
                case "CREATE" -> Files.writeString(path, linea, StandardOpenOption.CREATE);
                    
                case "DELETE_ON_CLOSE" -> Files.writeString(path, linea, StandardOpenOption.DELETE_ON_CLOSE);
                    
                case "CREATE_NEW" -> Files.writeString(path, linea, StandardOpenOption.CREATE_NEW);
                    
                default -> {
                    System.out.println("Error de carga! - Debug StandardOpenOption");
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo escribir en archivo!\n" + ruta/* + "\n" + e*/);
        }

    }
    
}
