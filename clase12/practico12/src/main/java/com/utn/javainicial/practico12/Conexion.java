/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.javainicial.practico12;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class Conexion {
    
    Connection conectar = null;
    String usuario = "root";
    String contraseña = "Exa76419";
    String bd = "argentina_programa";
    String ip = "localhost";
    String puerto = "3306";
    
    String ruta = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection estableceConexion(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(ruta, usuario, contraseña);
            //JOptionPane.showMessageDialog(null, "Se conecto correctamente");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO se conecto correctamente" + e);
        }
        
        return conectar;
        
        
        
    }
}
