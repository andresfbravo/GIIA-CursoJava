/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.io.*;

/**
 *
 * @author Felipe
 */
public class BufferRead {
    public BufferRead(){
        
    }
    
    public void leer(){
        String a = "";
        String b = "";
        String c = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese tres palabras separadas por la tecla intro: ");
        try{
            a = entrada.readLine();
            b = entrada.readLine();
            c = entrada.readLine();
        }catch(IOException e){
            System.out.println("Error");
        }
        System.out.println(a + " " + b + " " + c);
        
    }
    public static void main(String[] args) {
        BufferRead w = new BufferRead();
        w.leer();
    }
}
