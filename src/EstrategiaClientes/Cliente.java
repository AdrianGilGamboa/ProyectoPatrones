/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstrategiaClientes;

import BancoCuenta.CuentaBancaria;
import TiendaProducto.Producto;
import TiendaProducto.Tienda;

/**
 *
 * @author Equipo
 */
public interface Cliente {

    int getEdad();

    String getId();

    String getNombre();

    void setEdad(int edad);

    void setId(String id);

    void setNombre(String nombre);
    
    void Comprar(Producto p, Tienda t);
    
    CuentaBancaria getCuentabancaria();
    
    void setCuentabancaria(CuentaBancaria cuentaBancaria);
    
    Estrategia getEstrategia();
    
    void setEstrategia(Estrategia estrategia);
    
    @Override
    String toString();
    
}
