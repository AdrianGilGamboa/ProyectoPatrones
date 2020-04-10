/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoCuenta;

import EstrategiaClientes.Cliente;

/**
 *
 * @author Equipo
 */
public class CuentaBancariaImpl implements CuentaBancaria {
    private String id;
    private double balance;
    private Cliente cliente;

    public CuentaBancariaImpl(String id, double balance, Cliente cliente) {
        setId(id);
        setBalance(balance);
        setCliente(cliente);
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
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
