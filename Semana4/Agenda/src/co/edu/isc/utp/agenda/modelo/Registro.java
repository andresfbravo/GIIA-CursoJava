/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.isc.utp.agenda;

import java.time.LocalDate;
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
    private Directorio directorio;
    private List<Grupo> grupos;



    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
    
    
    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public void setDirectorio(Directorio directorio) {
        this.directorio = directorio;
    }

    public Directorio getDirectorio() {
        return directorio;
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
