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
public class Persona {

    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String fechaNacimiento;
    private Correo correo;
    private Direccion direccion;
    
    public Persona(String nombre1, String nombre2, String apellido1, String apellido2, String fechaNacimiento, Correo correo, Direccion direccion) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.direccion = direccion;
        
    }
    
    public Persona(){}
    
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
    public String getFechaNacimiento(){
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
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setCorreo(Correo correo) {
        this.correo = correo;
    }
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
}
