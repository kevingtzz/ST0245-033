/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresfinal;

import java.awt.Rectangle;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics;
import static java.awt.geom.Point2D.distance;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.Scanner;
import java.io.*;
import java.util.Stack;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author jose_
 */
public class DataStructuresFinal extends JPanel{
     Algorithm alg = new Algorithm();
     List<Bee> abejas = new ArrayList();
     List<Bee> colisiones = new ArrayList();
     static ImageIcon i = new ImageIcon("C:\\Users\\jose_\\Documents\\ConjuntoDeDatosCon10abejas.png");
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(0, 0, 5, 5);
         
        paint(g);
    }
    
    public static void main(String[] args) {
        
        DataStructuresFinal proy = new DataStructuresFinal();
        JFrame j = new JFrame();
        j.setSize(i.getIconWidth(), i.getIconHeight()+49);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.add(proy);
        j.setVisible(true);
        
       
    }
    
    public static Bee convert(Bee b) {
        double x = b.getX()/111111 - 75.6;
        double y = b.getY()/111111 + 6.3;
        
         
            int x1 = (int)(x*4950+374300);
            
            int y1 = (int)(y*-5300+33817);
            
        return new Bee( b.getID(),x1,y1);
    }
    
     
    public void paint(Graphics g) {
         try {
 
             i.paintIcon(this, g, WIDTH, WIDTH);
             
             
             List<Bee>[] lis = alg.quaad();
             abejas = lis[0];
             colisiones =  lis[1];
             int count = 0;
             for (int i = 0 ; i < abejas.size() ; i++) {
                 for (int j  = 0 ; j < abejas.size() && j != i ; j++) {
                     if(Math.sqrt(Math.pow((abejas.get(i).getX() - abejas.get(j).getX()), 2) + Math.pow((abejas.get(i).getY() - abejas.get(j).getY()), 2))<= 100){
                         count++;
                         
                     }
                 }
             }
             

             System.out.println("conteo normal: "+(count*2));
           
             System.out.println("colisiones  "+colisiones.size());
             
             ImageIcon bee = new ImageIcon("C:\\Users\\jose_\\Documents\\bee2.jpg");
             ImageIcon clash = new ImageIcon("C:\\Users\\jose_\\Documents\\clash.png");
             for(int i = 0 ; i < abejas.size() ; i++){
                 Bee b1 = convert(abejas.get(i));
                 bee.paintIcon(this , g, (int)b1.getX(), (int)b1.getY());               
             } 
             for(int i = 0 ; i < colisiones.size() ; i++){
                 Bee b1 = convert(colisiones.get(i));
                 clash.paintIcon(this , g, (int)b1.getX(), (int)b1.getY());               
             }
                // repaint();    
                     } catch (FileNotFoundException ex) {
             Logger.getLogger(DataStructuresFinal.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
