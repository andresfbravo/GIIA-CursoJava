/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.ArrayList;
//mport static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class LibretaDeDirecciones {
    //public RegistroLibreta[] libreta ;
    private List<RegistroLibreta> libreta;// = new ArrayList<RegistroLibreta>();
    private int posicion;
    
    public LibretaDeDirecciones(){
        //libreta = new RegistroLibreta[100];
        libreta = new ArrayList<RegistroLibreta>();
        /*for(int i=0; i < 100; i++){
            libreta[i] = new RegistroLibreta();
        }*/
        posicion = 0; 
    }
    
    
    
    public void agregar(){
        Scanner sc = new Scanner(System.in);
            RegistroLibreta registro = new RegistroLibreta();
            if (libreta.size() <= 100) {
            System.out.println("INGRESE UN NUEVO REGISTRO ");
            System.out.print("\tingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.print("\tingrese el direccion: ");
            String direccion = sc.nextLine();
            System.out.print("\tingrese el telefono: ");
            String telefono = sc.nextLine();
            System.out.print("\tingrese el email: ");
            String email = sc.nextLine();
            registro.setNombre(nombre);
            registro.setDireccion(direccion);
            registro.setNumeroTelefono(telefono);
            registro.setCorreoElectronico(email);
            //libreta [posicion] = registro;
            libreta.add(registro);
            System.out.println("\n");
            }
           
    }
    
    public void borrar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la posicion del registro que desea borrar: ");
        int posicion = Integer.parseInt(sc.nextLine()) - 1;
        if (posicion >= 0 && posicion < libreta.size()) {
            //RegistroLibreta registro = new RegistroLibreta();
            //libreta[posicion] = registro; 
            libreta.remove(posicion);
        }
    }
    
    public void ver(){
        
            RegistroLibreta registro = new RegistroLibreta();
            for(int i = 0; i < libreta.size(); i++){
                //registro = libreta[posicion];
                registro = libreta.get(i);
                int posicion = i + 1;
                String nombre = registro.getNombre();
                String telefono = registro.getNumeroTelefono();
                String direccion = registro.getDireccion();
                String correo = registro.getCorreoElectronico();
                System.out.println("__Esta es tu libreta organizada__");
                System.out.println("\tRegistro numero (" + posicion + ")");
                System.out.println("\tNombre: " + nombre);
                System.out.println("\tDireccion: " + direccion);
                System.out.println("\tTelefono: " + telefono);
                System.out.println("\tcorreo: " + correo + "\n");
                
            
        }
    }
    
    public void actualizar(int posicion){
        
        
        //RegistroLibreta registro = new RegistroLibreta(nombre_,direccion_,numeroTelefono_,correoElectronico_);
        RegistroLibreta registro = new RegistroLibreta();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese la posicion que desea actualizar: ");
        posicion = Integer.parseInt(sc.nextLine()) - 1;
        System.out.print("\tingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("\tingrese el direccion: ");
        String direccion = sc.nextLine();
        System.out.print("\tingrese el telefono: ");
        String telefono = sc.nextLine();
        System.out.print("\tingrese el email: ");
        String email = sc.nextLine();
        registro.setNombre(nombre);
        registro.setDireccion(direccion);
        registro.setNumeroTelefono(telefono);
        registro.setCorreoElectronico(email);
        //libreta [posicion] = registro;
        libreta.set(posicion, registro);
        System.out.println("\n");
        
    }
    
    public static void main(String[] args) {
        LibretaDeDirecciones libreta = new LibretaDeDirecciones();
        //libreta.actualizar();
        libreta.agregar();
        libreta.agregar();
        
        
        libreta.ver();
        libreta.borrar();
        System.out.println("\nahora ha borrado");
        libreta.ver();
        libreta.actualizar(1);
        libreta.ver();
    }
}
