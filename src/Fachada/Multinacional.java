/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import EstrategiaClientes.Cliente;
import EstrategiaClientes.ClienteSocio;
import Singleton.OrdenadorCentral;
import TiendaProducto.Tienda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo
 */
public class Multinacional {
    //facade
    private String nombre;
    private String id;
    
    private List<Cliente> ListaDeClientes;
    private List<Tienda> ListaDeTiendas;
    
    public static OrdenadorCentral OC;

    public Multinacional(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        
        this.ListaDeClientes = new ArrayList<>();
        this.ListaDeTiendas = new ArrayList<>();
        this.OC = OrdenadorCentral.getOrdenadorCentral();
                
    }

    public List<Cliente> getListaDeClientes() {
        return ListaDeClientes;
    }

    public void setListaDeClientes(List<Cliente> ListaDeClientes) {
        this.ListaDeClientes = ListaDeClientes;
    }

    public List<Tienda> getListaDeTiendas() {
        return ListaDeTiendas;
    }

    public void setListaDeTiendas(List<Tienda> ListaDeTiendas) {
        this.ListaDeTiendas = ListaDeTiendas;
    }
    
    

    public boolean addCliente(Cliente e) {
        return ListaDeClientes.add(e);
    }

    public boolean addTienda(Tienda e) {
        return ListaDeTiendas.add(e);
    }
    
    
    
    public boolean creaClienteNormal(String id, String nombre, int edad, String idCuenta, double balance){
        Cliente cl= OC.creaClienteNormal(id, nombre, edad);
        boolean p = ListaDeClientes.contains(cl);
        if(!p){
            OC.creaCuentaBancaria(idCuenta, balance, cl);
            addCliente(cl);
        }
        
        return !p;
    }
    
    public boolean creaClienteFranquiciado(String id, String nombre, int edad, String idCuenta, double balance, String idTienda, String nombreTienda, String localizacion){
        Cliente cl= OC.creaClienteFranquiciado(id, nombre, edad);
        boolean p = ListaDeClientes.contains(cl);
        if(!p){
            creaTienda(idTienda, nombreTienda, localizacion, cl);
            OC.creaCuentaBancaria(idCuenta, balance, cl);
            addCliente(cl);
        }
        
        return !p;
    }
    
    public boolean creaClienteSocio(String id, String nombre, int edad, String idCuenta, double balance){
        Cliente cl= OC.creaClienteSocio(id, nombre, edad);
        boolean p = ListaDeClientes.contains(cl);
        if(!p){
            OC.creaCuentaBancaria(idCuenta, balance, cl);
            addCliente(cl);
        }
        
        return !p;
    }
    
    public boolean creaTienda(String id, String nombre, String localizacion, Cliente cliente){
        Tienda td= OC.creaTienda(id, nombre, localizacion, cliente);
        return addTienda(td);
    }
    
    public boolean asciendeASocio(Cliente c){
        c.setEstrategia(new ClienteSocio());
        return true;
    }
    
    public Cliente InicioSesion(String nombre, String id) {
        Cliente res = null;
        for (Cliente c : ListaDeClientes) {
            if (c.getId().equals(id)) {
                if (c.getNombre().equals(nombre)) {
                    res = c;
                }
            }
        }
        return res;
    }
    
    public Cliente BuscarCliente(String id) {
        Cliente res = null;
        for (Cliente c : ListaDeClientes) {
            if (c.getId().equals(id)) {
                res = c;
            }
        }
        return res;
    }
    
    public Tienda BuscarTienda(String idTienda){
        Tienda res= null;
        for(Tienda t: ListaDeTiendas){
            if(t.getIdTienda().equals(idTienda)){
                res = t;
            }
        }
        return res;
    }
    
    public Cliente InicioSesionFranquiciado(String nombre, String id, String idTienda) {
        Cliente res = null;
        for (Cliente c : ListaDeClientes) {
            if (c.getId().equals(id)) {
                if (c.getNombre().equals(nombre)) {
                    Tienda t = BuscarTienda(idTienda);
                    if(t!=null){
                        res = c;
                    }
                }
            }
        }
        return res;
    }
    

    public String getId() {
        return id;
    }
    
    public double getSaldoMultinacional(){
        return OC.banco.getSaldoTotalEmpresa();
    }
    
    
}
