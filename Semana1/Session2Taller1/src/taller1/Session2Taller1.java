/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author Felipe
 */
public class Session2Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        // TODO code application logic here
        for(i= 1;i<101;i++){
            int n = i;
            
            if (((n % 10) != 2) && ((n % 10) != 5)){
                if(i % 10 == 0){
                    System.out.print("\n");
                }
                System.out.print(n + " ");
            }
        }
    }
    
}
