/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.isc.utp.agenda;

import java.time.LocalDate;

/**
 *
 * @author Felipe
 */
public class Usuario extends Persona {
    private String nombreUsuario;
    private String contraseña;
    private Directorio directorio;
    


    public void setDirectorio(Directorio directorio) {
        this.directorio = directorio;
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

    public Directorio getDirectorio() {
        return directorio;
    }
    
    

}
