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
public interface CuentaBancaria {

    double getBalance();

    Cliente getCliente();

    String getId();

    void setBalance(double balance);

    void setCliente(Cliente cliente);

    void setId(String id);
    
}
