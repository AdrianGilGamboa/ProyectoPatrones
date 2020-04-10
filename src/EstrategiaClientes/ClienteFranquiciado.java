/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstrategiaClientes;

import BancoCuenta.CuentaBancaria;
import Fachada.Multinacional;
import TiendaProducto.Producto;
import TiendaProducto.Tienda;

/**
 *
 * @author Equipo
 */
public class ClienteFranquiciado implements Estrategia{

    @Override
    public void comprar(Tienda t, Producto p, CuentaBancaria cb) {
        restarDinero(p, cb);
        sumarDinero(t, p);
        restaMultinacional(p);
        borrarProductoTienda(t, p);
    }
    public void restarDinero(Producto p, CuentaBancaria cb){
        cb.setBalance(cb.getBalance()-p.getPrecio()*0.8);
    }
    
    public void sumarDinero(Tienda t, Producto p){
        t.getCliente().getCuentabancaria().setBalance(t.getCliente().getCuentabancaria().getBalance()+p.getPrecio());
    }
    public void restaMultinacional(Producto p){
        Multinacional.OC.banco.setSaldoTotalEmpresa(Multinacional.OC.banco.getSaldoTotalEmpresa()-p.getPrecio()*0.2);
    }
    public void borrarProductoTienda(Tienda t, Producto p){
        t.removeProducto(p);
    }
}
