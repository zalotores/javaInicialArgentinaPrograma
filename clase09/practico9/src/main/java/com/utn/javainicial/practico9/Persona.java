/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.javainicial.practico9;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author gonza
 */
@Data
public class Persona {
    
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate date;
    
}
