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
public class Pais {

    private List<String> departamentos;
    private String nombre;
   
    public Pais(List<String> departamentos, String nombre) {
        this.departamentos = departamentos;
        this.nombre = nombre;
    }
    

    public void setDepartamentos(List<String> departamentos) {
        this.departamentos = departamentos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDepartamentos() {
        return departamentos;
    }

    public String getNombre() {
        return nombre;
    }


}
