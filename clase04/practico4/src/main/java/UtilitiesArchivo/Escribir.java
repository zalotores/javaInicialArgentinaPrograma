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
    
    public void escribir(String ruta, String linea) {

        Path path = Paths.get(ruta);

        try {
            Files.writeString(path, " " + linea, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("No se pudo escribir en archivo!\n" + ruta/* + "\n" + e*/);
        }

    }
    
}
