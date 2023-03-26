/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.util.ArrayList;


/**
 *
 * @author gonza
 */
public class Carrito {
    
    private ArrayList<ItemCarrito> items = new ArrayList();
    private float precio = 0;

    public Carrito() {
    }

    public void setItem(int codigo, int cantidad) {
        ItemCarrito item = new ItemCarrito(codigo, cantidad);
        items.add(item);
        System.out.println("\ncantidad: " + cantidad + ", precio unit: " + item.getProducto().getPrecio(codigo)
                + ", producto: " + item.getProducto().getNombre(codigo));
    }

    public float carritoPrecio() {
        for (ItemCarrito item : items) {
            precio += (item.getCantidad()* item.getProducto().getPrecio(item.getCodigo()));
        }
        return precio;
    }

    
}
