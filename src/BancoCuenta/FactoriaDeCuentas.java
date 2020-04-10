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
public class FactoriaDeCuentas {
    public static CuentaBancaria creaCuentaBancaria(String id, double balance, Cliente cliente){
        return new CuentaBancariaImpl(id, balance,cliente);
    }
}
