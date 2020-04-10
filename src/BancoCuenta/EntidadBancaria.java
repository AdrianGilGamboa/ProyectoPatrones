package BancoCuenta;

import EstrategiaClientes.Cliente;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class EntidadBancaria {
    private FactoriaDeCuentas fdc;
    private String idBancoCentral;
    private String nombreBanco;
    private double saldoTotalEmpresa;
    private List<Cliente> ldClientes;
    private List<CuentaBancaria> ldCB;
    
    //crea las cuentas bancarias

    public EntidadBancaria(String idBancoCentral, String nombreBanco, double saldoTotalEmpresa) {
        this.idBancoCentral = idBancoCentral;
        this.nombreBanco = nombreBanco;
        this.saldoTotalEmpresa = saldoTotalEmpresa;
        this.ldClientes = new ArrayList<>();
        this.ldCB = new ArrayList<>();
        this.fdc=new FactoriaDeCuentas();
    }
    
    
    public CuentaBancaria creaCuentaBancaria(String id, double balance, Cliente cliente){
        CuentaBancaria cb= fdc.creaCuentaBancaria(id, balance,cliente);
        ldClientes.add(cliente);
        ldCB.add(cb);
        cliente.setCuentabancaria(cb);
        return cb;
        
    }

    public double getSaldoTotalEmpresa() {
        return saldoTotalEmpresa;
    }

    public void setSaldoTotalEmpresa(double saldoTotalEmpresa) {
        this.saldoTotalEmpresa = saldoTotalEmpresa;
    }
    
    
}
