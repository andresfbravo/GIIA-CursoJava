/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.isc.utp.agenda;

import java.util.List;

/**
 *
 * @author Felipe
 */
public class Registro extends Persona{
    
    private String alias;
    private String cargo;
    private String carrera;
    private String foto;
    private List<Telefono> telefonos; //lista de telefonos
    private List<Correo> correos; //lista de telefonos

    public Registro(String alias, String cargo, String carrera, String foto,
            List<Telefono> telefonos, List<Correo> correos, String nombre1,
            String nombre2, String apellido1, String apellido2, String fechaNacimiento,
            Correo correo,Direccion direccion) {
        super(nombre1, nombre2, apellido1, apellido2, fechaNacimiento, correo,
                direccion);
        this.alias = alias;
        this.cargo = cargo;
        this.carrera = carrera;
        this.foto = foto;
        this.telefonos = telefonos;
        this.correos = correos;
    }
     
    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public void setCorreos(List<Correo> correos) {
        this.correos = correos;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public List<Correo> getCorreos() {
        return correos;
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getAlias() {
        return alias;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getFoto() {
        return foto;
    }

}
