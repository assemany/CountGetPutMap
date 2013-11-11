/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.HashMap;

/**
 *
 * @author Assemany
 */
public class CountGetPutMap<K, V> extends HashMap<K, V>
{
    //Declarations counters and initialisation to 0
    private static int pCount = 0;
    private static int gCount = 0;
 
    @Override
    public V put(K key, V value)
    {
        //Increment put counter
        pCount++;
        return super.put(key, value);
    }
 
    @Override
    public V get(Object key)
    {
        //Increment get counter
        gCount++;
        return super.get(key);
    }
 
    public int getPCount()
    {
        return pCount;
    }
 
    public int getGCount()
    {
        return gCount;
    }    
}
