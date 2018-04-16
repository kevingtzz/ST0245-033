/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

/**
 *
 * @author jose_
 */
public class Bee {
    private int id;
    private boolean flag = false;
    private double x;
    private double y;
    
    public Bee(int id, double x, double y){
        this.id = id;
        this.x = x;
        this.y = y;
    }

    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public int getID(){
        return id;
    }
}
