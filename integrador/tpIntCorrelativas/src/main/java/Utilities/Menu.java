/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Clases.Alumno;
import Clases.Inscripcion;
import Clases.Materia;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Menu {
    
    public static void menu(){
        Scanner scan = new Scanner(System.in);
        int opcion = -1;
        boolean flag = true;
        Inscripcion inscripcion = new Inscripcion();
        Alumno alumno = new Alumno();
        Materia materias = new Materia();
        String materia = "";
        int legajo = -1;
        
        do {   
            flag = true;
            System.out.println("******************");
            System.out.println("INSCRIPCION EN MATERIAS");
            System.out.println("1 - Cargar nuevo alumno.");
            System.out.println("2 - Consultar alumno existente.");
            System.out.println("3 - Cargar nueva materia.");
            System.out.println("4 - Consultar materia existente.");
            System.out.println("6 - Inscribirse en una materia");
            System.out.println("\n9 - Salir");
            
            do {                
                try {
                    System.out.print("Seleccione una opcion: ");
                    opcion = Integer.parseInt(scan.nextLine());
                    flag = false;
                } catch (Exception e) {
                    System.out.println("\nSolo admite numeros!\n");
                }
                
            } while (flag);
            
            switch (opcion) {
                
                case 1:
                    GestorDatos.cargarAlumno();
                    break;
                case 2:
                    flag = true;
                    do {
                        try {
                            System.out.print("Ingrese el legajo a consultar: ");
                            legajo = Integer.parseInt(scan.nextLine());
                            flag = false;
                        } catch (Exception e) {
                            System.out.println("\nSolo admite numeros!\n");
                        }

                    } while (flag);
                    alumno = GestorDatos.traerAlumno(legajo);
                    System.out.println(alumno.toString());
                    break;
                case 3:
                    GestorDatos.cargarMateria();
                    break;
                case 4:
                    System.out.print("Ingrese la materia a consultar: ");
                    materia = scan.nextLine();
                    try {
                        materias = GestorDatos.traerMateria(materia);
                        System.out.println(materias.toString());
                    } catch (Exception e) {
                        System.out.println("Materia " + materia + " no encontrada! | " + e);
                    }
                    break;
                
                case 6:
                    flag = true;
                    do {
                        try {
                            System.out.print("Ingrese el legajo de alumno: ");
                            legajo = Integer.parseInt(scan.nextLine());
                            System.out.print("\nIngrese la materia a inscribir: ");
                            materia = scan.nextLine();
                            flag = false;
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                    } while (flag);
                    
                    inscripcion.setAlumno(legajo);
                    inscripcion.setMateria(materia);
                    
                    if (inscripcion.validarInscripcion()) {
                        //TODO faltaria una base de materias inscriptas una vez validada la condicion
                        System.out.println("\nEl alumno " + inscripcion.getAlumno().getNombre() + " se puede inscribir en " + inscripcion.getMateria().getNombre());
                    } else {
                        System.out.println("\nEl alumno " + inscripcion.getAlumno().getNombre() + " no cumple los requisitos de correlativas para inscribirse en " + inscripcion.getMateria().getNombre());
                    }
                    break;
                case 9:
                    System.out.println("\nPrograma terminado");
                    break;
                default:
                    System.out.println("Opcion no valida!");;
            }
            
        } while (opcion != 0);
    }
    
}
