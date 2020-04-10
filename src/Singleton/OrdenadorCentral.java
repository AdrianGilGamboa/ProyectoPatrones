/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import TiendaProducto.FactoriaDeTiendas;
import EstrategiaClientes.FactoriaDeClientes;
import EstrategiaClientes.Cliente;
import EstrategiaClientes.ClienteFranquiciadoImpl;
import BancoCuenta.CuentaBancaria;
import BancoCuenta.EntidadBancaria;
import TiendaProducto.Tienda;

/**
 *
 * @author Equipo
 */
public class OrdenadorCentral {
    
    FactoriaDeClientes fdCl;
    public EntidadBancaria banco;
    FactoriaDeTiendas fdT;
    
    private static OrdenadorCentral instancia=null;

    private OrdenadorCentral() {
        fdCl = new FactoriaDeClientes();
        banco = new EntidadBancaria("1", "UPO", 100000);
        fdT = new FactoriaDeTiendas();
    }
    
    public static OrdenadorCentral getOrdenadorCentral(){
        //Singleton
        if(instancia==null){
            instancia=new OrdenadorCentral();
        }
        return instancia;
    }
    
    public Cliente creaClienteNormal(String id, String nombre, int edad){
        return fdCl.creaClienteNormal(id, nombre, edad);
    }
    
    public Cliente creaClienteSocio(String id, String nombre, int edad){
        return fdCl.creaClienteSocio(id, nombre, edad);
    }
    public Cliente creaClienteFranquiciado(String id, String nombre, int edad){
        return fdCl.creaClienteFranquiciado(id, nombre, edad);
    }
    
    public CuentaBancaria creaCuentaBancaria(String id, double balance, Cliente cliente){
        return banco.creaCuentaBancaria(id, balance, cliente);
    }
    
    public Tienda creaTienda(String idTienda, String nombre, String localizacion, Cliente cliente){
        Tienda t = fdT.creaTienda(idTienda, nombre, localizacion, cliente);
        ClienteFranquiciadoImpl cl = (ClienteFranquiciadoImpl)cliente;
        cl.setTienda(t);
        return t;
    }
    
}
