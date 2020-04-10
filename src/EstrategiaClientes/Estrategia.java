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
public interface Estrategia {
    void comprar(Tienda t, Producto p, CuentaBancaria cb);
    
}
