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
public class Rombo {
    private int index;
    
    public Rombo(){
        index = 3;
    }
    
    public void obtenerIndex(){
        
        System.out.print("Ingrese el indice: ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();
        assert(index<3) : "no tengo diamantes";
        //return index;
    }
    
    public void print(int i){
        char ico = '*';
        assert(i<3) : "no hay diamantes";
        System.out.print("   *   "+"\n");
        System.out.print("  ***  "+"\n");
        System.out.print(" ***** "+"\n");
        System.out.print("  ***  "+"\n");
        System.out.print("   *   ");
    }
    
    public static void main(String[] args) {
        Rombo r = new Rombo();
        r.obtenerIndex();
        r.print(r.index);
    }
}
