/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.utn.javainicial.practico9;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Practico9 {

    public static void main(String[] args) {

        System.out.println("**************");
        System.out.println("Configuración de Software");
        System.out.println("\nLa práctica tendrá la finalidad de conocer los comandos básicos de Maven y, además,\n"
                + "investigar y comprender la funcionalidad brindada por la biblioteca de Lombok. Es\n"
                + "importante destacar que Lombok tiene una integración directa con el IDE IntelliJ, no\n"
                + "así con Eclipse u otros. En caso de estar utilizando Eclipse puede leer este link, o en el\n"
                + "caso de NetBeans este.");

        System.out.println("\n1. Crear un proyecto nuevo mediante Maven.");
        System.out.println("2. Agregar la dependencia necesaria para utilizar Lombok");
        System.out.println("3. Crear un programa Java que pida por consola el nombre, apellido y fecha de\n"
                + "nacimiento de una persona. Estos datos deben ser guardados en una instancia de una\n"
                + "clase Persona utilizando los setters generados por Lombok. IMPORTANTE: el\n"
                + "programa debe permitir cargar varias personas y también debe ofrecer la posibilidad\n"
                + "de listar a todas las personas por pantalla (utilizar los getters generados por Lombok).");
        System.out.println("4. Generar un archivo “jar” del proyecto implementado. Ejecutarlo desde la terminal del\n"
                + "Sistema Operativo.");
        System.out.println("\n**************");

        Scanner scan = new Scanner(System.in);

        List<Persona> lista = new ArrayList();

        boolean flag = true;
        int id = 0;

        do {
            Persona persona = new Persona();
            String nombre = "";
            String apellido = "";
            int dia = 0;
            int anho = 0;
            int mes = 0;

            try {
                System.out.println("\nCarga de persona # " + id);
                System.out.print("Ingrese el nombre: ");
                nombre = scan.next();
                System.out.print("\nIngrese el apellido: ");
                apellido = scan.next();
                System.out.print("\nIngrese el dia de nacimiento (1 a 31): ");
                dia = scan.nextInt();
                System.out.print("\nIngrese el mes de nacimiento (1 a 12): ");
                mes = scan.nextInt();
                System.out.print("\nIngrese el año de nacimiento (1 a 12): ");
                anho = scan.nextInt();

                if ((nombre == "") || (apellido == "")) {
                    throw new Exception();
                }

                Month mesDate = Month.of(mes);
                persona.setDate(LocalDate.of(anho, mesDate, dia));
                persona.setId(id);
                persona.setNombre(nombre);
                persona.setApellido(apellido);

                System.out.println(persona.toString());
                id++;
                lista.add(persona);

            } catch (Exception e) {
                System.out.println("\nFormato incorrecto!" + e);
            }

            System.out.print("Agregar otra persona? S/N: ");
            flag = scan.next().toLowerCase().startsWith("s");

        } while (flag);
        
        System.out.println("--------------");
        System.out.println("Lista de personas agregadas: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
        System.out.println("--------------");
        
    }
}
