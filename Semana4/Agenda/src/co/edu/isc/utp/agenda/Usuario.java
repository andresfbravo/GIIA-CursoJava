/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.isc.utp.agenda;

/**
 *
 * @author Felipe
 */
public class Usuario extends Persona {
    public String nombreUsuario;
    public String contraseña;
    
    public Usuario(String nombreUsuario, String contraseña, String nombre1, String nombre2, String apellido1, String apellido2, String fechaNacimiento, Correo correo,Direccion direccion) {
        super(nombre1, nombre2, apellido1, apellido2, fechaNacimiento, correo,direccion);
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

}
