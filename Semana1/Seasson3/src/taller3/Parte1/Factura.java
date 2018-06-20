/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.Parte1;

/**
 *
 * @author Felipe
 */
public class Factura extends Precio {
    
    String emisor;
    String cliente;
    
    public Factura(double pesos_, String emisor_,String cliente_) {
        super(pesos_);
        emisor = emisor_;
        cliente = cliente_;
    }
    
    public String getEmisor(){
        return emisor;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public void setEmisor(String s){
        emisor = s;
    }
    
    public void setCliente(String s){
        cliente = s;
    }
    
    public void imprimirFactura(){
        System.out.println("\tSU FACTURA ES ");
        System.out.println("nombre de cliente: " + getCliente());
        System.out.println("nombre de emisor: " + getEmisor());
        System.out.println("el precio a pagar es: $" + getPrecio());
    }
    
    public static void main(String[] args) {
        Factura f = new Factura(300,"chavarro", "felipe");
        f.imprimirFactura();
    }
}
