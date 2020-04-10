/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaProducto;

/**
 *
 * @author Equipo
 */
public interface Producto {

    String getNombre();

    double getPrecio();

    void setNombre(String nombre);

    void setPrecio(double precio);
    
    @Override
    String toString();
    
}
