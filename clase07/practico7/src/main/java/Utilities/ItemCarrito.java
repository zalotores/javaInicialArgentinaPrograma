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
    
    private Producto producto;
    private int cantidad;
    private int codigo;

    public ItemCarrito(int codigo, int cantidad) {
        this.producto = new Producto(codigo);
        this.cantidad = cantidad;
        this.codigo = codigo;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "ItemCarrito{" + "producto=" + producto + ", cantidad=" + cantidad + '}';
    }
    
}
