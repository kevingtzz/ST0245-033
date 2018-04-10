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
import java.util.HashMap;
public class Taller09 {

    /**
     * @param args the command line arguments^
     */
    public static void main(String[] args) {
        HashMap empresas = new HashMap(4);
        agregar(empresas, "Google", "Estados Unidos");
        agregar(empresas, "La locura", "Colombia");
        agregar(empresas, "Nokia", "Finlandia");
        agregar(empresas, "Sony", "Japón");
        System.out.println("Punto 3: ");
        System.out.println(buscar(empresas, "Google"));
        System.out.println(buscar(empresas, "Motorola"));
        System.out.println("Punto 4: ");
        System.out.println(contienekey(empresas, "India"));
        System.out.println(contienekey(empresas, "Estados Unidos"));
        
    }
	
    //pedrito 2
    public static void agregar(HashMap empresas,String key, String value){
        empresas.put(key, value);
    }
    
    //pedrito 3
    public static Object buscar(HashMap empresas,String key){
        if(empresas.containsKey(key)) return empresas.get(key);
        return null;
    }
    //pedrito 4
    public static boolean contienekey(HashMap empresas,String value){
        
        return empresas.containsValue(value);
        
    } 

}
