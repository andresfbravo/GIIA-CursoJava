/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Adivino {
    public Adivino(){}
    
    public double Aleatorio(){
        int b = 100;
        int a = new java.util.Random().nextInt(b);
        return a;
    }
    
    public boolean validarNumero(String a){
        boolean q = true;
        try{
            Integer.parseInt(a);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null ,"No es un número válido");
            q = false;
        }
        return q;
    }
    
    public static void main(String[] args) {
        Adivino n = new Adivino();
        int a = (int) n.Aleatorio();
        boolean g = false;
        //System.out.println(a);
        String d = "ingrese un numero entre el 1 y el 100";
        
        while (g == false){
            
            String s = JOptionPane.showInputDialog(d);
            if (!n.validarNumero(s)){
                continue;
            }
            int c = Integer.parseInt(s);
            
            
            if(c == a){
                 JOptionPane.showMessageDialog(null ,"Te has ganado un premio");
                 g = true;
                 //System.out.println(a);
            }else if(c < a){
                JOptionPane.showMessageDialog(null ,"Tu número es menor a el de la rifa");
                //System.out.println(a);
            }else{
                JOptionPane.showMessageDialog(null ,"Tu número es mayor a el de la rifa");
                //System.out.println(a);
            }
        }
        
        
    }
}
