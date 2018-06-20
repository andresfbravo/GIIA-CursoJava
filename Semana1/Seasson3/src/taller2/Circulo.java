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
public class Circulo extends Shape{
    
    private double radio;
    private double area;
    private String nombre;

    @Override
    public double getArea() {
        area = 3.1415 * radio;
        return area;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    

    
    public Circulo(double radio_){
        area = 0;
        radio = radio_;
        nombre = "Circulo";
    }
    
    public void imprimirArea(){
        
        System.out.println("El area del "+ getNombre()+" es: " + getArea());
        
    }
    
    public static void main(String[] args) {
        Circulo cir = new Circulo(3.14);
        cir.imprimirArea();
    }
    
}
