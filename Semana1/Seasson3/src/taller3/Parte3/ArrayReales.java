/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.Parte3;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class ArrayReales implements Estadisticas{
    
    double w[];
    
    ArrayReales(double w_[]){
        w = w_; 
    }
    
    @Override
    public double minimo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double minimo_=w[0];
        for(int i = 0; i <w.length; i++){
            
            if (w[i] < minimo_) {
                   minimo_ = w[i];             
            }
        }
        return minimo_;
    }

    @Override
    public double maximo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double maximo_ = 0;
        for(int i = 0; i <w.length; i++){
            if (w[i] > maximo_) {
                   maximo_ = w[i];             
            }
        }
        return maximo_;
    }

    @Override
    public double sumatorio() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double sumatoria_=0;
        for(int i = 0 ; i<w.length ; i++){
            sumatoria_ = sumatoria_ + w[i];
        }
        return sumatoria_;
    }
    
    public void llenar(int tamaño){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<tamaño;i++ ){
            System.out.print("ingrese un dato: ");
            double date = sc.nextDouble();
            w[i] = date;
        }
    }
    
    private void print(){
        System.out.println("El mayor es: " + maximo());
        System.out.println("El menor es: " + minimo());
        System.out.println("La sumatoria es: " + sumatorio());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de su vector de reales: ");
        int tamaño = sc.nextInt();
        double w[] = new double[tamaño];
        ArrayReales arr = new ArrayReales(w);
        arr.llenar(tamaño);
        arr.print();
    }
}
