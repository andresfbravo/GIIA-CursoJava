/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc;

/**
 *
 * @author Pipe
 */
public class Suma {
    
    private int X;
    private int Y;
    
    Suma(int x, int y){
        
        X = x;
        Y = y;
    }
    
    public int sumar(){
        
        return X + Y;
    } 
    
    public static void main(String[] args) {
        
        if(args.length < 2){
            System.out.println("debe ingresar dos argumentos");
            return;
        }else{
             
            double n1 = Double.parseDouble(args[0]);
            double n2 = Double.parseDouble(args[1]);
               
            System.out.println(n1 +"+" + n2 + "=" + (n1 +n2));
         }
    }
}
