/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaProducto;

import EstrategiaClientes.Cliente;
import java.util.List;

/**
 *
 * @author Equipo
 */
public interface Tienda {

    Cliente getCliente();

    String getIdTienda();

    List<Producto> getLdp();

    String getLocalizacion();

    String getNombre();

    void setCliente(Cliente cliente);

    void setIdTienda(String idTienda);

    void setLdp(List<Producto> ldp);

    void setLocalizacion(String localizacion);

    void setNombre(String nombre);
    
    boolean addProducto(Producto e);
    
    boolean removeProducto(Producto e);
    
    boolean creaProducto(String nombre, double precio);
    
    @Override
    String toString();
    
}
