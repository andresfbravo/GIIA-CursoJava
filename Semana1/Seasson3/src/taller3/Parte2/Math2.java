/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.Parte2;

import static java.lang.Math.*;

/**
 *
 * @author Felipe
 */
final class Math2 {
    
    private static double maximo(double w[]){
        double maximo_ = 0;
        for(int i = 0; i <=9; i++){
            if (w[i] > maximo_) {
                   maximo_ = w[i];             
            }
        }
        return maximo_;
    }
    
    private static double minimo(double w[]){
       
        double minimo_=w[0];
        for(int i = 0; i <=9; i++){
            
            if (w[i] < minimo_) {
                   minimo_ = w[i];             
            }
        }
        return minimo_;
    }
    
    private static double sumatoria(double w[]){
        double sumatoria_=0;
        for(int i = 0 ; i<= 9 ; i++){
            sumatoria_ = sumatoria_ + w[i];
        }
        return sumatoria_;
    }
    
    private static double multiplicatoria(double w[]){
        double multi_=0;
        for(int i = 0 ; i<= 9 ; i++){
            multi_ = multi_ * w[i];
        }
        return multi_;
    }
    
    private static double mediaAritmetica(double w[]){
        double mediaAritmetica= sumatoria(w)/w.length;
        return mediaAritmetica;
    }
    
    private static double mediaGeometrica(double w[]){
        double mediaAritmetica= Math.pow(multiplicatoria(w),1/w.length);
        return mediaAritmetica;
        
    }
    
    private static void print(double w[]){
        System.out.println("El mayor es: " + maximo(w));
        System.out.println("El menor es: " + minimo(w));
        System.out.println("La sumatoria es: " + sumatoria(w));
        System.out.println("La media aritmetica es: " + mediaAritmetica(w));
        System.out.println("La media geometrica es: " + mediaGeometrica(w));
    }
    
    
    
    public static void main(String[] args) {
        double w[];
        w = new double[10];
        for(int i = 0; i<= 9 ; i++){
            w[i]= new java.util.Random().nextDouble();
        }
        for(int i = 0; i<= 9; i++){
            System.out.print(" " + w[i]+"\n");
        }
        print(w);
    }
}
