/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1seasson1;

/**
 *
 * @author Felipe
 */
public class SaludoPersonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if (args.length > 0) {
            String h = args[0];
            System.out.println("Hola " + h);
        }
        else{
            System.out.println("Hola como estás, no conozco tu nombre");
        }
    }
}
