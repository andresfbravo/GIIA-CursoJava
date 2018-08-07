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
public class Directorio {

    private String nombre;
    private List<Registro> registros;
    private List<Grupo> grupos;
    private Usuario usuario;
    

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

}
