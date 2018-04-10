/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller09;

/**
 *
 * @author jose_
 */
import javafx.util.Pair;
import java.util.LinkedList;
public class UnaTablaDeHash {

   LinkedList<Pair<String, Integer>>[] tabla;
   public UnaTablaDeHash(){
      tabla = new LinkedList[10];
   }

   // Ojo, esta función hash es muy ingenua
   private static int funcionHash(String k){
       return ((int) k.charAt(0)) % 10;
   }
   

   public Integer get(String k){
       int index = funcionHash(k);
       for(int i = 0 ; i < tabla[index].size() ; i++){
           if(tabla[index].get(i).getKey().equals(k)) return tabla[index].get(i).getValue();
       }
       return -1;
   }
   
   public void put(String k, Integer v){
         if (tabla[funcionHash(k)] == null) {
     tabla[funcionHash(k)] = new LinkedList<>();
  }
       Pair p = new Pair(k, v);
       tabla[funcionHash(k)].add(p);
   }
}

