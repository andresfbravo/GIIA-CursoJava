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
public class NumerosPares {
    public static void main(String[] args) {
        int a = 1539;
        int b = 2505;
        //int i = 0;
        for(int i = a; i <= b; i++){
            if (i % 2  == 0) {
                if (i % 10 == 0) {
                    System.out.print("\n");
                }
                System.out.print(i +" ");
            }
        }
    }
}
