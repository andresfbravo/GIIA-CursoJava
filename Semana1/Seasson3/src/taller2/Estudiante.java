/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author Felipe
 */
public class Estudiante {
    private String nombre;
    private String codigo;
    private String carrera;
    private String edad;
    
    public Estudiante(){
        nombre = "";
        codigo = "";
        carrera = "";
        edad = "";
    }
    
    public Estudiante(String nombre_,String codigo_,String carrera_,String edad_){
        nombre = nombre_;
        codigo = codigo_;
        carrera = carrera_;
        edad = edad_;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    public String getEdad(){
        return edad;
    }
    
    public void setNombre(String s){
        nombre = s;
    }
    
    public void setCodigo(String s){
        codigo = s;
    }
    
    public void setCarrera(String s){
        carrera = s;
    }
    
    public void setEdad(String s){
        edad = s;
    }
    
    
}
