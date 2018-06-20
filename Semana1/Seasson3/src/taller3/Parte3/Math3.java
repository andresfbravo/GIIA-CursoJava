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
public class Math3 implements Extremos{

    @Override
    public int min(int[] a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int minimo_=a[0];
        for(int i = 0; i <a.length; i++){
            
            if (a[i] < minimo_) {
                   minimo_ = a[i];             
            }
        }
        return minimo_;
    }

    @Override
    public int max(int[] a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int maximo_ = 0;
        for(int i = 0; i <a.length; i++){
            if (a[i] > maximo_) {
                   maximo_ = a[i];             
            }
        }
        return maximo_;
    }

    @Override
    public double min(double[] a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double minimo_=a[0];
        for(int i = 0; i <a.length; i++){
            
            if (a[i] < minimo_) {
                   minimo_ = a[i];             
            }
        }
        return minimo_;
    }

    @Override
    public double max(double[] a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double maximo_ = 0;
        for(int i = 0; i <a.length; i++){
            if (a[i] > maximo_) {
                   maximo_ = a[i];             
            }
        }
        return maximo_;
    }
    
    public void llenar(int a[]){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<a.length;i++ ){
            System.out.print("ingrese un dato: ");
            int date = sc.nextInt();
            a[i] = date;
        }
    }
    
    public void llenar(double a[]){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<a.length;i++ ){
            System.out.print("ingrese un dato: ");
            double date = sc.nextDouble();
            a[i] = date;
        }
    }
    
    private void print(int a[]){
        System.out.println("El mayor es: " + max(a));
        System.out.println("El menor es: " + min(a));
        
    }
    
    private void print(double a[]){
        System.out.println("El mayor es: " + max(a));
        System.out.println("El menor es: " + min(a));
        
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de su vector de reales: ");
        int tamaño = sc.nextInt();
        double w[] = new double[tamaño];
        int x[] = new int[tamaño];
        Math3 arr = new Math3();
        arr.llenar(w);
        arr.print(w);
        arr.llenar(x);
        arr.print(x);
    }
    
}
