/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.Parte4;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Convertir {
    private int hex;
    private int dateConvert;
    
    public Convertir(){
        hex = 0x00;
        dateConvert = 0;
    }
    
    public void convertirHexaToEntero(String s){
        //hex = Integer.parseInt(s);
        
        try{
            dateConvert = Integer.parseInt(s, 16);
            System.out.println("El numero en hexadecimal es: "+ s);
            System.out.println("Numero en decimal: "+dateConvert);
        }catch(NumberFormatException exe){
            System.out.println("formato inválido");
        }
        
    }
    
    public static void main(String[] args) {
        Convertir numero = new Convertir();
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el numero que quiere convertir de hexadecimal a entero: ");
        String hexad =  sc.nextLine();
        numero.convertirHexaToEntero(hexad);
    }
    
}
