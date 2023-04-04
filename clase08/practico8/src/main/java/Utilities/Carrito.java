/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.util.List;

/**
 *
 * @author gonza
 */
public class Carrito {
    
    Producto prod= new Producto();
    
    private List<ItemCarrito> items;

    public Carrito() {}
    
    public boolean existeItem(int sku){
        try {
            prod.getListaProductos(sku);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void agregarItem(int sku, int cantidad) {
        
        ItemCarrito ic = new ItemCarrito();
        
        ic.setItemProducto(prod.getListaProductos(sku));
        ic.setCantidad(cantidad);

        this.items.add(ic);
        

    }

}

