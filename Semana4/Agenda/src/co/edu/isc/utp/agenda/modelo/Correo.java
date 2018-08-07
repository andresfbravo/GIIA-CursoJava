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
public class Correo {
    private String correo;
    private Tipo tipo;
    


    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

}
