/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gonza
 */
public class serieFibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("************");
        System.out.println("Generador de serie fibonacci.\n");
        System.out.println("Ingrese la ruta para guardar el documento:");
        String ruta = scan.nextLine();

        if (ruta.length() < 1) {    //ruta por defecto
            ruta = "C:\\datos\\zalo\\cursos\\argentinaPrograma\\javaInicial\\clase04\\fibonacci.txt";
        }

        System.out.print("\nIngrese la cantidad de terminos a generar en la secuencia: ");
        int n = scan.nextInt() - 1;

        List<BigInteger> secuencia = new ArrayList();

        secuencia.add(BigInteger.ONE);
        secuencia.add(BigInteger.ONE);

        Path path = Paths.get(ruta);
        try {
            Files.writeString(path, secuencia.get(0).toString(), StandardOpenOption.CREATE);
        } catch (IOException ex) {
            Logger.getLogger(serieFibonacci.class.getName()).log(Level.SEVERE, null, ex);
        }
        escribir(ruta, secuencia.get(1).toString());

        for (int i = 1; i < n; i++) {
            secuencia.add(secuencia.get(i).add(secuencia.get(i - 1)));
            escribir(ruta, secuencia.get(i+1).toString());
        }

        System.out.println("\nListado generado:");
        leer(ruta);

    }

    public static void escribir(String ruta, String linea) {

        Path path = Paths.get(ruta);

        try {
            Files.writeString(path, " " + linea, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("No se pudo escribir en archivo!\n" + ruta + "\n" + e);
        }

    }

    public static void leer(String ruta) {

        Path path = Paths.get(ruta);
        List<String> fh = new ArrayList();
        try {
            fh = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("No se pudo abrir archivo!\n" + e);
        }

        if (!fh.isEmpty()) {
            for (String linea : fh) {
                System.out.println(linea);
            }
        }
    }

}
