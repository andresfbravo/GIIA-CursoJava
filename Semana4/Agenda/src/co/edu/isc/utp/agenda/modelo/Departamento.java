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
public class Departamento {
    private List<Ciudad> ciudades;
    private String nombre;
    private Pais pais;
   //private List<Departamento> departamentos;
    
   
    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    

}
