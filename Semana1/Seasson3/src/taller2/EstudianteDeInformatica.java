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
public class EstudianteDeInformatica extends Estudiante {
    private String numEstudiante;
    private String promedio;
    
    
    public EstudianteDeInformatica(String nombre,String codigo, String edad,String carrera, String numEstudiante_, String promedio_){
        super(nombre,codigo,carrera,edad);
        numEstudiante = numEstudiante_;
        promedio = promedio_;
    }
    
    public String getNumEstudiante(){
        return numEstudiante;
    }
    
    public String getPromedio(){
        return promedio;
    }
    
    public void setNumEstudiante(String s){
        numEstudiante = s;
    }
    
    public void setPromedio(String s){
        promedio = s;
    }
    
    
    
    
    public void imprimir(){
        //EstudianteDeInformatica e =  new EstudianteDeInformatica();
        System.out.println("Este es el estudiante y sus datos: ");
        System.out.println("\tNombre: " + getNombre());
        System.out.println("\tCódigo: " + getCodigo());
        System.out.println("\tCarrera: " + getCarrera());
        System.out.println("\tEdad: " + getEdad());
        System.out.println("\tnumero Estudiante: " + getNumEstudiante());
        System.out.println("\tPromedio: " + getPromedio());
        
    }
    
    public static void main(String[] args) {
        EstudianteDeInformatica e =  new EstudianteDeInformatica("andres", "123", "22", "sistemas","3138899", "1");
        e.imprimir();
    }
}



