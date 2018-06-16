/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc;

/**
 *
 * @author AndresFelipe
 */
public class Calculadora {
    
    public Calculadora (){
        
    }
    
    public Calculadora(String Bienvenido){
        
    }
    
    
    public double suma(double a, double b){
        
        return a + b;
    }
    
    public double multiplicacion(double a, double b){
        
        return a * b;
    }
    
    public double division(double a, double b){
        
        return a / b;
    }
    public double resta(double a, double b){
        
        return a - b;
    }
    
    public static void validarDenominador(double b){
        if(b == 0){
            System.out.println("No se puede dividir por cero, no sea toche");
        }
    }
    
    public static boolean ValidarNumero(String numero){
        
        try{
            Double.valueOf(numero);
            return true;
        }catch(NumberFormatException ex){}
        
        return false;
    }
    
    public static boolean ValidarOperacion(String op){
        
        switch (op) {
            case "+":
            case "-":
            case "x":
            case "/":
                return true;    
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        
        
        if( args.length < 3
                || !ValidarNumero(args[0]) || !ValidarNumero(args[2])
                || !ValidarOperacion(args[1])){
            System.out.println("introduzca <numero><operador><numero>");
        }else{
        
            double a = Double.valueOf(args[0]);
            double b = Double.valueOf(args[2]);
            String op = args[1];
            Calculadora c = new Calculadora();
            
            //System.out.println("los numeros "+ n1 + " " + n2 + " seran:");
            if(null == op){
                System.out.println("operador invalido");
            }else switch (op) {
                case "+":
                    System.out.println(a + " " + op + " " + b  + " = " + c.suma(a, b));
                    break;
                case "-":
                    System.out.println(a + " " + op + " " + b  + " = " +c.resta(a,b));
                    break;
                case "x":
                    System.out.println(a + " " + op + " " + b  + " = " + c.multiplicacion(a,b));
                    break;
                case "/":
                    if(b==0){validarDenominador(b);}
                    else
                    {System.out.println(a + " " + op + " " + b  + " = " +  c.division(a,b));}
                    break;
                default:
                    System.out.println("operador invalido");
                    break;
            }   
        }
    }        
}
