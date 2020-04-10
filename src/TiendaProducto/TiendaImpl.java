/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaProducto;

import EstrategiaClientes.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo
 */
public class TiendaImpl implements Tienda {
    private String idTienda;
    private String nombre;
    private String localizacion;
    private Cliente cliente;
    private List<Producto> ldp;


    public TiendaImpl(String idTienda, String nombre, String localizacion, Cliente cliente) {
        this.idTienda=idTienda;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.cliente=cliente;
        this.ldp = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getLocalizacion() {
        return localizacion;
    }

    @Override
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public List<Producto> getLdp() {
        return ldp;
    }

    @Override
    public void setLdp(List<Producto> ldp) {
        this.ldp = ldp;
    }

    @Override
    public String getIdTienda() {
        return idTienda;
    }

    @Override
    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }

    @Override
    public boolean addProducto(Producto e) {
        return ldp.add(e);
    }

    @Override
    public boolean removeProducto(Producto e) {
        return ldp.remove(e);
    }
    
    @Override
    public boolean creaProducto(String nombre, double precio){
        Producto p=new ProductoImpl(nombre, precio);
        return addProducto(p);
    }

    @Override
    public String toString() {
        return nombre + " / " + localizacion;
    }
    
    
}
