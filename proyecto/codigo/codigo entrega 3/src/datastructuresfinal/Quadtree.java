/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresfinal;

import java.awt.Rectangle;
import static java.awt.geom.Point2D.distance;
import java.util.ArrayList;
import java.util.List;


public class Quadtree {
 
  private int MAX_OBJECTS = 100;
  private int MAX_LEVELS = 50;
  private int level;
  private List<Bee> objects;
  private Rectangle bounds;
  private Quadtree[] nodes;
 
 /*
  * Constructor
  */
  public Quadtree(int pLevel, Rectangle pBounds) {
   level = pLevel;
   objects = new ArrayList();
   bounds = pBounds;
   nodes = new Quadtree[4];
  }
  /*
 * Clears the quadtree
 */
 public void clear() {
   objects.clear();
 
   for (int i = 0; i < nodes.length; i++) {
     if (nodes[i] != null) {
       nodes[i].clear();
       nodes[i] = null;
     }
   }
 }
 /*
 * Splits the node into 4 subnodes
 */
 private void split() {
   int subWidth = (int)(bounds.getWidth() / 2);
   int subHeight = (int)(bounds.getHeight() / 2);
   int x = (int)bounds.getX();
   int y = (int)bounds.getY();
 
   nodes[0] = new Quadtree(level+1, new Rectangle(x + subWidth, y, subWidth, subHeight));
   nodes[1] = new Quadtree(level+1, new Rectangle(x, y, subWidth, subHeight));
   nodes[2] = new Quadtree(level+1, new Rectangle(x, y + subHeight, subWidth, subHeight));
   nodes[3] = new Quadtree(level+1, new Rectangle(x + subWidth, y + subHeight, subWidth, subHeight));
 }
 
 /*
 * Determine which node the object belongs to. -1 means
 * object cannot completely fit within a child node and is part
 * of the parent node
 */
 private int getIndex(Bee b) {
   int index = -1;
   //if(bounds.getX() != 0 && bounds.getX() != 111111 && bounds.getY() != 0 && bounds.getY() != 111111){
     if(distance(b.getX(),bounds.y, b.getX(),b.getY()) < 100){
       
         return -1;
         
         
     }
     if(distance(bounds.getX(),b.getY(),b.getX(),b.getY()) < 100){
         return -1;
     
 }
     if(distance(b.getX(),bounds.getMaxY(),b.getX(),b.getY()) < 100){ 
         return -1;
     
 }
     if(distance(bounds.getMaxX(),b.getY(),b.getX(),b.getY()) < 100){
         return -1;
     
 }
   //}
   
   double verticalMidpoint = bounds.getX() + (bounds.getWidth() / 2);
   double horizontalMidpoint = bounds.getY() + (bounds.getHeight() / 2);
 
   // Object can completely fit within the top quadrants
   boolean topQuadrant = (b.getY() < horizontalMidpoint);
   // Object can completely fit within the bottom quadrants
   boolean bottomQuadrant = (b.getY() > horizontalMidpoint);
 
   // Object can completely fit within the left quadrants
   if (b.getX() < verticalMidpoint) {
      if (topQuadrant) {
        index = 1;
      }
      else if (bottomQuadrant) {
        index = 2;
      }
    }
    // Object can completely fit within the right quadrants
    else if (b.getX() > verticalMidpoint) {
     if (topQuadrant) {
       index = 0;
     }
     else if (bottomQuadrant) {
       index = 3;
     }
   }
 
   return index;
 }
  /*
 * Insert the object into the quadtree. If the node
 * exceeds the capacity, it will split and add all
 * objects to their corresponding nodes.
 */
 public void insert(Bee b) {
   if (nodes[0] != null) {
     int index = getIndex(b);
 
     if (index != -1) {
       nodes[index].insert(b);
 
       return;
     }
   }
 
   objects.add(b);
 
   if (objects.size() > MAX_OBJECTS && level < MAX_LEVELS) {
      if (nodes[0] == null) { 
         split(); 
      }
 
     int i = 0;
     while (i < objects.size()) {
       int index = getIndex(objects.get(i));
       if (index != -1) {
         nodes[index].insert(objects.remove(i));
       }
       else {
         i++;
       }
     }
   }
 }
 
 /*
 * Return all objects that could collide with the given object
 */
 public List getBees(List returnObjects, Bee b) {
   int index = getIndex(b);
   if (index != -1 && nodes[0] != null) {
     nodes[index].getBees(returnObjects, b);
   }
 
   returnObjects.addAll(objects);
 
   return returnObjects;
 }

}