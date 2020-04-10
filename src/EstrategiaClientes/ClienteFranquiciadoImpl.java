/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstrategiaClientes;

import TiendaProducto.Tienda;

/**
 *
 * @author Equipo
 */
public class ClienteFranquiciadoImpl extends ClienteImpl{
    private Tienda tienda;

    public ClienteFranquiciadoImpl(String id, String nombre, int edad, Estrategia estrategia) {
        super(id, nombre, edad, estrategia);
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
    
}
