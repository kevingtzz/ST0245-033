/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose_
 */
public class ProyectoV1 {
static List<Bee> allObjects;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       quaad();
    }
    
    public static void quaad() {
        allObjects = new ArrayList();
        Bee b = new Bee(1,0,0);
        allObjects.add(b);
        Bee c = new Bee(2,100,200);
        allObjects.add(c);
        Bee d = new Bee(3,0,1);
        allObjects.add(d);
        Bee e = new Bee(4,134,200);
        allObjects.add(e);
        Bee f = new Bee(5,1,1);
        allObjects.add(f);
        Quadtree quad = new Quadtree(0, new Rectangle(0,0,600,600));
        quad.clear();
        for (int i = 0; i < allObjects.size(); i++) {
             quad.insert(allObjects.get(i));
        }
        List<Bee> returnObjects = new ArrayList();
for (int i = 0; i < allObjects.size(); i++) {
  returnObjects.clear();
  quad.retrieve(returnObjects, allObjects.get(i));
  for (int x = 0; x < returnObjects.size() && returnObjects.get(x).getID() != allObjects.get(i).getID(); x++) {
      
      if(check(allObjects.get(i), returnObjects.get(x)))
      System.out.println("la abeja en la posicion "+allObjects.get(i).getX()+", "+allObjects.get(i).getY()+" colisiona con la abeja en la posicion "+returnObjects.get(x).getX()+", "+returnObjects.get(x).getY());
      //else System.out.println("la abeja en la posicion "+allObjects.get(i).getX()+", "+allObjects.get(i).getY()+" no colisiona con la abeja en la posicion "+returnObjects.get(x).getX()+", "+returnObjects.get(x).getY());
     
  }
}
    }
    
    public static boolean check(Bee b, Bee b1) {
        return Math.sqrt(Math.pow((b.getX() - b1.getX()), 2) + Math.pow((b.getY() - b1.getY()), 2)) <= 1;
    }
}
