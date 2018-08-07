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
public class Persona {

    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private Correo correo;
    private Direccion direccion;
    

    
    public String getNombre1(){
        return nombre1;
    }
    public String getNombre2(){
        return nombre2;
    }
    public String getApellido1(){
        return apellido1;
    }
    public String getApellido2(){
        return apellido2;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public Correo getCorreo() {
        return correo;
    }
    
    public Direccion getDireccion(){
        return direccion;
    }
    
    public void setNombre1(String cadena){
        nombre1 = cadena;
    }
    public void setNombre2(String cadena){
        nombre2 = cadena;
    }
    public void setApellido1(String cadena){
        apellido1 = cadena;
    }
    public void setApellido2(String cadena){
        apellido2 = cadena;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setCorreo(Correo correo) {
        this.correo = correo;
    }
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
}
