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
public class Cuadrado extends Shape{
    private double lado;
    private double area;
    private String nombre;

    @Override
    public double getArea() {
        area = lado * lado;
        return area;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    

    
    public Cuadrado(double lado_){
        area = 0;
        lado = lado_;
        nombre = "Cuadrado";
    }
    
    public void imprimirArea(){
        
        System.out.println("El area del "+ getNombre()+" es: " + getArea());
        
    }
    
    public static void main(String[] args) {
        Cuadrado cua = new Cuadrado(5.5);
        cua.imprimirArea();
    }
}
