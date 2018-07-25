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
    private List<String> ciudades;
    private String nombre;
    private Pais pais;
    
    public Departamento(List<String> ciudades, String nombre, Pais pais) {
        this.ciudades = ciudades;
        this.nombre = nombre;
        this.pais = pais;
    }
    public void setCiudades(List<String> ciudades) {
        this.ciudades = ciudades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<String> getCiudades() {
        return ciudades;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    

}
