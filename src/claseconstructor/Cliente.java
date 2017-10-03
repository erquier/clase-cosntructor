/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseconstructor;

/**
 *
 * @author 00140051
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String direccion;
    
    public Cliente(){
    
    
    }
    
    public Cliente(int idCliente, String nombre, String direccion){
    
        this.idCliente=idCliente;
        this.nombre=nombre;
        this.direccion=direccion;
    }
    
    public Cliente(int idCliente, String nombre){
    
        this.idCliente=idCliente;
        this.nombre=nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
