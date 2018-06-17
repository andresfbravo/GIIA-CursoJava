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
public class Jop {
    public Jop(){}
    
    public void leer(){
        String m = "Por favor ingrese una palabra: ";
        String a = JOptionPane.showInputDialog(m);
        String b = JOptionPane.showInputDialog(m);
        String c = JOptionPane.showInputDialog(m);
        JOptionPane.showMessageDialog(null, a + " " + b + " " + c);
        //System.out.println(a + " " + b + " " + c);
    }
    
    public static void main(String[] args) {
        Jop w = new Jop();
        w.leer();
    }
}
