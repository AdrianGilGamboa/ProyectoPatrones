/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaProducto;

import EstrategiaClientes.Cliente;

/**
 *
 * @author Equipo
 */
public class FactoriaDeTiendas {
    public static Tienda creaTienda(String idTienda, String nombre, String localizacion, Cliente cliente){
        return new TiendaImpl(idTienda, nombre, localizacion, cliente);
    }
}
