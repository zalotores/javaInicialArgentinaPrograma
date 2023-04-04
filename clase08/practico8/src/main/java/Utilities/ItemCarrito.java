/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

/**
 *
 * @author gonza
 */
public class ItemCarrito {
    
    private int cantidad;
    private ItemProducto itemProducto;

    public ItemCarrito() {}

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ItemProducto getItemProducto() {
        return itemProducto;
    }

    public void setItemProducto(ItemProducto itemProducto) {
        this.itemProducto = itemProducto;
    }

    @Override
    public String toString() {
        return "{sku: " + itemProducto.getCodigo() + ", cantidad: " + this.cantidad
                + ", descripcion: " + itemProducto.getDescripcion() + ", precio: " + itemProducto.getPrecioUnitario()
                + "}";
    }

    

}
