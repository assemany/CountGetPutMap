/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import utils.CountGetPutMap;

/**
 *
 * @author Assemany
 */
public class AppCtr {
    public static void main (String args[])
    {
        CountGetPutMap map = new CountGetPutMap();
        
        //The program will call the method put() 2 time
        map.put(1, 5);
        map.put(2, 10);
        map.put(3, 15);
        
        //The program will call the method get() 1 once
        Integer keyValue = (Integer)map.get(1);
        
        //Print the Map
        System.out.println("Map: " + map);    
        
        //Print the counters
        System.out.println("Count Put: " + map.getPCount());
        System.out.println("Count Get: " + map.getGCount());
    }
}
