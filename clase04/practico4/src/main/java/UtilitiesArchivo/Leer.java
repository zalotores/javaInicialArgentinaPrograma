/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilitiesArchivo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gonza
 */
public class Leer {
    
    public static String leer(String ruta) {

        Path path = Paths.get(ruta);
        List<String> fh = new ArrayList();
        try {
            fh = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("No se pudo abrir archivo!\n"/* + e*/);
        }

        if(!fh.isEmpty()) {
            return fh.toString();
        } else return null;
        
    }
    
}
