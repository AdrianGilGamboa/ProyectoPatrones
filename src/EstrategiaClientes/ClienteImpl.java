/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstrategiaClientes;

import EstrategiaClientes.FactoriaDeClientes;
import BancoCuenta.CuentaBancaria;
import TiendaProducto.Producto;
import TiendaProducto.Tienda;
import java.util.Objects;

/**
 *
 * @author Equipo
 */
public class ClienteImpl implements Cliente {
    private String id;
    private String nombre;
    private int edad;
    private CuentaBancaria cuentabancaria;
    Estrategia estrategia;

    public ClienteImpl(String id, String nombre, int edad, Estrategia estrategia) {
        setId(id);
        setNombre(nombre);
        setEdad(edad);
        setEstrategia(estrategia);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
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
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClienteImpl other = (ClienteImpl) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public CuentaBancaria getCuentabancaria() {
        return cuentabancaria;
    }

    @Override
    public void setCuentabancaria(CuentaBancaria cuentabancaria) {
        this.cuentabancaria = cuentabancaria;
    }

    @Override
    public Estrategia getEstrategia() {
        return estrategia;
    }

    @Override
    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void Comprar(Producto p, Tienda t) {
        estrategia.comprar(t, p, this.cuentabancaria);
    }
    
    
    
    
    
}
