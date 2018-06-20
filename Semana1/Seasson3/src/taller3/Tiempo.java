/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 *
 * @author Felipe
 */
public class Tiempo implements Comparison{
    private double t1;
    private double t2;
    
    public Tiempo(double t1_, double t2_){
        this.t1 = t1_;
        this.t2 = t2_;
    }

    @Override
    public boolean isGreater(Object t1, Object t2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (t1 > t2) {
            return true;
        }
        else{
            return false;
        } 
    }

    @Override
    public boolean isLess(Object t1, Object t2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (t1 < t2) {
            return true;
        }
        else{
            return false;
        } 
    }

    @Override
    public boolean isEqual(Object t1, Object t2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (t1 = t2) {
            return true;
        }
        else{
            return false;
        } 
    }
}
