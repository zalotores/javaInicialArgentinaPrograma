/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

/**
 *
 * @author gonza
 */
public class ItemProducto {
    
    private int codigo;
    private float precioUnitario;
    private String descripcion;

    public ItemProducto(int codigo, float precioUnitario, String descripcion) {
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }
    

    @Override
    public String toString() {
        return "ItemProducto{" + "codigo=" + codigo + ", precioUnitario=" + precioUnitario + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
