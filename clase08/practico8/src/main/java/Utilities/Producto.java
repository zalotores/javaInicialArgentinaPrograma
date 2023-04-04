/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author gonza
 */
public class Producto {
    private ArrayList <ItemProducto> listaProductos = new ArrayList<>();

    public Producto() {
        Integer codigo = 0;
        Float precioUnitario = 0.0F;
        String descripcion = " ";
        String datos = Leer.leer();
        datos = datos.substring(1, (datos.length()-1));
        int pos = 1;
        for (String string : datos.split(",")) {
            if (string.startsWith("codigo")){continue;}

            for (String item : string.split("-")){
                item = item.strip();

                switch (pos) {
                    case 1:
                        codigo = Integer.parseInt(item);
                        pos=2;
                        break;
                    case 2:
                        descripcion = item;
                        pos ++;
                        break;
                    case 3:
                        precioUnitario = Float.parseFloat(item);
                        pos= 1;
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            ItemProducto itemProducto = new ItemProducto(codigo, precioUnitario, descripcion);
            listaProductos.add(itemProducto);
        }
    }

    public ArrayList<ItemProducto> getListaProductos() {
        return listaProductos;
    }
    
    public ItemProducto getListaProductos(Integer i){
        return listaProductos.get(i-1);
    }
    
    public int getTamanhoProductos () { return listaProductos.size();}

    @Override
    public String toString() {
        return "Producto{" + "listaProductos=" + listaProductos + '}';
    }
    
    
    
    
}
