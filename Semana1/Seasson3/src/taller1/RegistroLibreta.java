/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author Felipe
 */
public class RegistroLibreta {
    private String nombre;
    private String direccion;
    private String numeroTelefono;
    private String correoElectronico;
    
    public RegistroLibreta(){
        nombre = "";
        direccion = "";
        numeroTelefono = "";
        correoElectronico = "";        
    }
    
    
    public RegistroLibreta(String nombre_, String direccion_, String numeroTelefono_, String correoElectronico_){
        nombre = nombre_;
        direccion = direccion_;
        numeroTelefono = numeroTelefono_;
        correoElectronico = correoElectronico_;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String getNumeroTelefono(){
        return numeroTelefono;
    }
    
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    
    public void setNombre(String s){
        nombre = s;
    }
    
    public void setDireccion(String s){
        direccion = s;
    }
    public void setNumeroTelefono(String s){
        numeroTelefono = s;
    }
    
    public void setCorreoElectronico(String s){
        correoElectronico = s;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
