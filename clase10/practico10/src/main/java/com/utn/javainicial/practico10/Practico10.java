/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utn.javainicial.practico10;

/**
 *
 * @author gonza
 */
public class Practico10 {

    public static void main(String[] args) {
        System.out.println("**************");
        System.out.println("Ejercicio Integrador Intermedio");
        System.out.println("\nValidador de Correlativas");
        System.out.println("\nIntroducción");
        System.out.println("Nos han solicitado el desarrollo de un Validador de Correlativas. En las carreras terciarias y\n"
                + "universitarias, para ordenar la currícula y asegurar que que cuando se inicia una materia se\n"
                + "tienen todos los conocimientos necesarios para entenderla, se establece lo que se llama\n"
                + "comúnmente materias correlativas. Básicamente, son materias que hay que cursar antes de\n"
                + "cursar la materia en cuestión. Por ejemplo antes de cursar Programación III hay que cursar\n"
                + "Programación II y antes de esta hay que cursar Programación I, donde esta última, no tiene\n"
                + "correlativas.");
        System.out.println("\nConsigna");
        System.out.println("La propuesta del trabajo integrador consiste en implementar un programa que tome como\n"
                + "argumento una lista de inscripciones, y escriba en un archivo otro con la misma cantidad de\n"
                + "renglones, indicando que la inscripción fue aceptada o rechazada.");
        System.out.println("\nSe proponen los siguientes pasos:\n"
                + "1. Implementar el diseño en un proyecto Maven.");
        System.out.println("2. Generar 2 tests para el método Inscripción#aprobada:\n"
                + "    a. Una materia sin correlativas\n"
                + "    b. Una materia con correlativas y que el alumno las tenga\n"
                + "    c. Otra materia sin correlativas, y que el alumno no las tenga");
        System.out.println("3. Finalmente implementar el programa, puede seguir el siguiente esquema:");
        System.out.println("public static void main(String[] args) {\n"
                + "// Inicializar materias: crear 3 o 4 materias, con y sin correlativas\n"
                + "entre ellas\n"
                + "Collection<Materia> materias = … ;\n"
                + "// Inicializar los alumnos, crear 2 o 3 alumnos, con y sin materias\n"
                + "aprobadas.\n"
                + "// Usar para las materias los MISMOS objetos de la colección de más\n"
                + "arriba\n"
                + "Collection<Alumno> alumnos = … ;\n"
                + "// Leer el archivo parado por parámetros de args y por cada línea\n"
                + "// instanciar un objeto Inscripción, pero para llenar las materias y\n"
                + "alumnos DEBE usar los objetos que creo más arriba\n"
                + "// Imprimir la línea, con el resultado si la inscripción está o no ok\n"
                + "}");
        System.out.println("4. Puede agregar una validación, que si el alumno o la materia del csv no está en la\n"
                + "colección que usted creó, ese renglón marque un error.");
        
        //comienzo de programa
        
    }
}
