/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Scann {
    public Scann(){
        
    }
    
    public void leer(){
        Scanner w = new Scanner(System.in);
        String a = "";
        String b = "";
        String c = "";
        System.out.println("Por favor ingrese tres palabras y precionar intro: ");
        a = w.nextLine();
        b = w.nextLine();
        c = w.nextLine();
        System.out.println(a + " " + b + " " + c);
    }
    
    public static void main(String[] args) {
        Scann w = new Scann();
        w.leer();
    }
}
