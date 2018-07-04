/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.isc.calculadora;

import static java.lang.Math.*;

/**
 *
 * @author Felipe
 */
public class Calculadora {
    
    public Calculadora(){}
    
    public Calculadora(String a){}
    
    public String sumar(String a, String b){
        return Double.toString(Integer.parseInt(a) + Integer.parseInt(b));
    }
    
    public String restar(String a, String b){
        return Double.toString(Integer.parseInt(a) - Integer.parseInt(b));
    }
    
    public String multiplicar(String a, String b){
        return Double.toString(Integer.parseInt(a) * Integer.parseInt(b));
    }
    
    public String dividir(String a, String b){
        return Double.toString(Integer.parseInt(a) / Integer.parseInt(b));
    }
    
    public String sumarEntero(String a, String b){
        return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
    }
    
    public String restarEntero(String a, String b){
        return Integer.toString(Integer.parseInt(a) - Integer.parseInt(b));
    }
    
    public String multiplicarEntero(String a, String b){
        return Integer.toString(Integer.parseInt(a) * Integer.parseInt(b));
    }
    
    public String dividirEntero(String a, String b){
        return Integer.toString(Integer.parseInt(a) / Integer.parseInt(b));
    }
    
    public String invertir(String a){
        return Double.toString(pow(Double.parseDouble(a),-1));
    }
    
    public String convertirDecimalAHexadecimal(String numero){
        return Integer.toHexString(Integer.parseInt(numero));
    }
    public String convertirDecimalABinario(String numero){
        return Integer.toBinaryString(Integer.parseInt(numero));
    }
    
    public String convertirHexadecimalADecimal(String numero){
        Integer n = Integer.parseInt(numero, 16);
        return Integer.toString(n, 10);
    }
    public String convertirHexadecimalABinario(String numero){
        
        String numDec = convertirHexadecimalADecimal(numero);
        return Integer.toBinaryString(Integer.parseInt(numDec));
    }
    
    public String convertirBinarioADecimal(String numero){
        Integer numBin = Integer.parseInt(numero);
        Integer numDec = 0;
        int e = 1;
        if (numBin == 0) {
            numDec = 0;
        }else{
            while(numBin > 0){
                int y = numBin % 10;
                numBin = numBin / 10;
                numDec = numDec +(y * e);
                e = 2 * e;
            }
        }
        return Integer.toString(numDec);
        
    }
    public String convertirBinarioAHexadecimal(String numero){
        String numDec = convertirBinarioADecimal(numero);
        return Integer.toHexString(Integer.parseInt(numDec));
    }
    
    public String convertirDecimalAOctal(String numero){
        return Integer.toOctalString(Integer.parseInt(numero));
    }
    public String convertirOctalADecimal(String numero){
        Integer numOct = Integer.parseInt(numero);
        Integer numDec = 0;
        int e = 1;
        if (numOct == 0) {
            numDec = 0;
        }else{
            while(numOct > 0){
                int y = numOct % 10;
                numOct = numOct / 10;
                numDec = numDec +(y * e);
                e = 8 * e;
            }
        }
        return Integer.toString(numDec);
    }
    
    public String convertirHexadecimalAOctal(String numero){
        String numDec = convertirHexadecimalADecimal(numero);
        return Integer.toOctalString(Integer.parseInt(numDec));
    }
    public String convertirOctalAHexadecimal(String numero){
        String numDec = convertirOctalADecimal(numero);
        return Integer.toHexString(Integer.parseInt(numDec));
    }
    
    public String convertirBinarioAOctal(String numero){
        String numDec = convertirBinarioADecimal(numero);
        return Integer.toOctalString(Integer.parseInt(numDec));
    }
    public String convertirOctalABinario(String numero){
        String numDec = convertirOctalADecimal(numero);
        return Integer.toBinaryString(Integer.parseInt(numDec));
    }
    
    public String sumarDecimales(String a, String b){
        return sumar(a,b);
    }
    
    public String sumarHexadecimales(String a, String b){
        String a_ = convertirHexadecimalADecimal(a);
        String b_ = convertirHexadecimalADecimal(b);
        return convertirDecimalAHexadecimal(sumarEntero(a_,b_));
    }
    public String sumarBinario(String a, String b){
        String a_ = convertirBinarioADecimal(a);
        String b_ = convertirBinarioADecimal(b);
        return convertirDecimalABinario(sumarEntero(a_,b_));
    }
    public String sumarOctal(String a, String b){
        String a_ = convertirOctalADecimal(a);
        String b_ = convertirOctalADecimal(b);
        return convertirDecimalAOctal(sumarEntero(a_,b_));
    }
    
    public String restarDecimales(String a, String b){
        return restar(a,b);
    }
    
    public String restarHexadecimales(String a, String b){
        String a_ = convertirHexadecimalADecimal(a);
        String b_ = convertirHexadecimalADecimal(b);
        return convertirDecimalAHexadecimal(restarEntero(a_,b_));
    }
    public String restarBinario(String a, String b){
        String a_ = convertirBinarioADecimal(a);
        String b_ = convertirBinarioADecimal(b);
        return convertirDecimalABinario(restarEntero(a_,b_));
    }
    public String restarOctal(String a, String b){
        String a_ = convertirOctalADecimal(a);
        String b_ = convertirOctalADecimal(b);
        return convertirDecimalAOctal(restarEntero(a_,b_));
    }
    
    public String multiplicarDecimales(String a, String b){
        return multiplicar(a,b);
    }
    
    public String multiplicarHexadecimales(String a, String b){
        String a_ = convertirHexadecimalADecimal(a);
        String b_ = convertirHexadecimalADecimal(b);
        return convertirDecimalAHexadecimal(multiplicarEntero(a_,b_));
    }
    public String multiplicarBinario(String a, String b){
        String a_ = convertirBinarioADecimal(a);
        String b_ = convertirBinarioADecimal(b);
        return convertirDecimalABinario(multiplicarEntero(a_,b_));
    }
    public String multiplicarOctal(String a, String b){
        String a_ = convertirOctalADecimal(a);
        String b_ = convertirOctalADecimal(b);
        return convertirDecimalAOctal(multiplicarEntero(a_,b_));
    }
    
    public String dividirDecimales(String a, String b){
        return dividir(a,b);
    }
    
    public String dividirHexadecimales(String a, String b){
        String a_ = convertirHexadecimalADecimal(a);
        String b_ = convertirHexadecimalADecimal(b);
        return convertirDecimalAHexadecimal(dividirEntero(a_,b_));
    }
    public String dividirBinario(String a, String b){
        String a_ = convertirBinarioADecimal(a);
        String b_ = convertirBinarioADecimal(b);
        return convertirDecimalABinario(dividirEntero(a_,b_));
    }
    public String dividirOctal(String a, String b){
        String a_ = convertirOctalADecimal(a);
        String b_ = convertirOctalADecimal(b);
        return convertirDecimalAOctal(dividirEntero(a_,b_));
    }
    
    public String invertirEntero(String numero){
        return invertir(numero);
    }
    
    public static boolean validarDenominador(String numero){
        if(Double.valueOf(numero) > 0)
            return true;
        else{
            System.err.println("El denominador debe ser mayor a cero");
            return false;
        }
    }
    
    public static boolean ValidarNumeroDecimal(String numero){
        
        try{
            Double.valueOf(numero);
            return true;
        }catch(NumberFormatException ex){
            System.err.println("El Número decimal no es valido");
        }
        
        return false;
    }
    
    public static boolean ValidarOperacion(String op){
        
        switch (op) {
            case "+":
            case "-":
            case "x":
            case "/":
            case "binario":
            case "octal":
            case "decimal":
            case "inverso":
            
                return true;    
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c = new Calculadora();
        String a = c.invertir("5");
        System.out.println(a);
        //System.out.println(c.convertirDecimalABinario("16"));
    }
    
}
