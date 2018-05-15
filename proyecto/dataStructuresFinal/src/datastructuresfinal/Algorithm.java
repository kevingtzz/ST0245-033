/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresfinal;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class Algorithm {
    static int flag = 0;
        static List<Bee> abejas;
        static Quadtree quad = new Quadtree(0, new Rectangle(0,0,111111,111111));
    /**
     * @param args the command line arguments
     */
    
    public static List<Bee>[] quaad() throws FileNotFoundException {
        List<Bee> colisiones = new ArrayList();
        abejas = new ArrayList();
        read();
        for (int i = 0; i < abejas.size(); i++) {
             quad.insert(abejas.get(i));
        }
        List<Bee> posiblesColisiones = new ArrayList();
for (int i = 0; i < abejas.size(); i++) {
  posiblesColisiones.clear();
  quad.getBees(posiblesColisiones, abejas.get(i));
  for (int x = 0; x < posiblesColisiones.size() ; x++) {
      if(abejas.get(i).getID() != posiblesColisiones.get(x).getID() && check(abejas.get(i), posiblesColisiones.get(x))){
          colisiones.add(abejas.get(i));
      }
      
      
     
  }
}
List<Bee>[] ans = new List[2];
ans[0] = abejas;
ans[1] = colisiones;
return ans;
     }
    public static void read() throws FileNotFoundException {
    String path = "C:\\Users\\jose_\\Desktop\\beeDataSet.txt";
      Scanner read = new Scanner(new File(path));
          int i = 1;
           
           String line = read.nextLine();
           Scanner input = new Scanner(System.in);
           System.out.println("Ingrese el número de abejas que desea analizar");
           int limit  = input.nextInt();
            LinkedList<Bee> b = new LinkedList();
            while(i<= limit && read.hasNextLine()){
                line = read.nextLine();
               String[] str = line.split(",");
                String lenX = str[0];
                String lenY = str[1];
                double x = Double.parseDouble(lenX);
                double y = Double.parseDouble(lenY);
                Bee b1 = new Bee(i,(x+75.6)*111111 ,(y-6.3)*111111);
                abejas.add(b1);
                i++;
            }
          
            
    }
    
    public static boolean check(Bee b, Bee b1) {
  
        if(Math.sqrt(Math.pow((b.getX() - b1.getX()), 2) + Math.pow((b.getY() - b1.getY()), 2))<= 100){
          
            return true;
          
        }
        return false ;
   }

}
