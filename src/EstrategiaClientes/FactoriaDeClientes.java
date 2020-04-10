/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstrategiaClientes;



/**
 *
 * @author Equipo
 */
public class FactoriaDeClientes {
    public static Cliente creaClienteNormal(String id, String nombre, int edad){
        return new ClienteImpl(id, nombre, edad, new ClienteNormal());
    }
    public static Cliente creaClienteSocio(String id, String nombre, int edad){
        return new ClienteImpl(id, nombre, edad, new ClienteSocio());
    }
    public static Cliente creaClienteFranquiciado(String id, String nombre, int edad){
        return new ClienteFranquiciadoImpl(id, nombre, edad, new ClienteFranquiciado());
    }
    
    
   
    
}
