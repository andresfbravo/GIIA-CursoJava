/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.Parte1;

/**
 *
 * @author Felipe
 */
public class Precio {
    public double pesos;
    public Precio(double pesos_){
        pesos = pesos_;
    }
    
    public double getPrecio(){
        return pesos;
    }
    
    public void setPrecio(double x){
        pesos = x;
    }
}
