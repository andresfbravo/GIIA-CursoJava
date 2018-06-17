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
public class Operaciones {
    public Operaciones(){}
    
    public double suma(double a,double b){
        double c;
        c = a + b;
        return c;
    }
    
    public double resta(double a,double b){
        double c;
        c = a - b;
        return c;
    }
    
    public double multiplicacion(double a,double b){
        double c;
        c = a * b;
        return c;
    }
    
    public double division(double a,double b){
        double c;
        c = a / b;
        return c;
    }
    
    public static void main(String[] args) {

        Operaciones w = new Operaciones();
        if(args.length < 2 ){
            System.out.println("ingrese de esta forma <numero> <numero>");
        }
        else{
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
            System.out.println("los Números son: "+ a +" " + b);
            System.out.println("la suma es: " + w.suma(a,b));
            System.out.println("la resta es: " + w.resta(a,b));
            System.out.println("la multiplicacion es " + w.multiplicacion(a,b));
            System.out.println("la división es: " + w.division(a,b));
        }
    }
}
