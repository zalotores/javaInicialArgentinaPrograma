/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class pruebaLeerArchivos {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("************");
        System.out.println("Prueba de lectura\n");
        System.out.println("Ingrese la ruta del archivo:");
        String ruta = scan.nextLine();
        
        if (ruta.length() < 1) {    //ruta por defecto
            ruta = "C:\\datos\\zalo\\cursos\\argentinaPrograma\\javaInicial\\clase04\\alfabetoRadiofonico.txt";
        }
        
        Path path = Paths.get(ruta);
        
        List<String> fh = new ArrayList();
        try {
             fh = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("No se pudo abrir archivo!\n" + e);
        }
        
        if (!fh.isEmpty()) {
            for (String linea : fh) { System.out.println(linea);}
        }
        
        System.out.println("\n************");
        System.out.println("Prueba de escritura\n");
        
        System.out.println("Ingrese la ruta del archivo:");
        ruta = scan.nextLine();
        
        System.out.println("Ahora, ingrese el texto del archivo:");
        String texto = scan.nextLine();
        
        escribir(ruta, texto);        
        
    }
    
    public static void escribir(String ruta, String linea) {
        
        Path path = Paths.get(ruta);
        
        try {
            Files.writeString(path, "\n" + linea,StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("No se pudo escribir en archivo!\n" + ruta + "\n" + e);
        }
        
    }
    
}
