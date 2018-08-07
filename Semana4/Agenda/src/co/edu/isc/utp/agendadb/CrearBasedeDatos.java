/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.isc.utp.agendadb;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe
 */
public class CrearBasedeDatos {
    public static void iniciar(){
        if(DBHelper.registerDriver()){
            try {
                Connection con = DBHelper.obtenerConexion();
                Statement stmt = con.createStatement();
                
                stmt.execute("CREATE TABLE PAIS ("
                        + " ID INT,"
                        + " NOMBRE VARCHAR(50) NOT NULL,"
                        + " CONSTRAINT PAIS_PK PRIMARY KEY (ID)"
                        + ")");
                stmt.execute("CREATE TABLE DEPARTAMENTO ("
                        + " ID INT,"
                        + " NOMBRE VARCHAR(50) NOT NULL,"
                        + " ID_PAIS INT NOT NULL),"
                        + " CONSTRAINT DEPARTAMENTO_PK PRIMARY KEY (ID),"
                        + " CONSTRAINT DEPARTAMENTO_PAIS_FK FOREIGN KEY (ID_PAIS) REFERENCES PAIS(ID)");
                
                stmt.execute("CREATE TABLE CIUDAD(ID INT,"
                        + " NOMBRE VARCHAR(100)),"
                        + " ID_DEPARTAMENTO INT NOT NULL,"
                        + " CONSTRAINT CIUDAD_PK PRIMARY KEY (ID),"
                        + " CONSTRAINT CIUDAD_DEPARTAMENTO_FK FOREIGN KEY (ID_DEPARTAMENTO) REFERENCES DEPARTAMENTO(ID)");
            } catch (Exception ex) {
                Logger.getLogger(CrearBasedeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
}
