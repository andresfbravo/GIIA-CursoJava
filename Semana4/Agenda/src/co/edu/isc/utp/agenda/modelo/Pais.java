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

    private List<Departamento> departamentos;
    private String nombre;
   

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public String getNombre() {
        return nombre;
    }


}
