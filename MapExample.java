/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netbeans;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jaani
 */
public class MapExample 
{
    public static void main(String[] args) 
    {
        // It is just like dictionary
        Map<String, String> map = new HashMap<>();
        map.put("name", "Kanha");   // this is first entry 
        map.put("last_name", "Rajput");      // this is second entry
        map.put("village", "Bada Barda");
        map.put("near_city", "Bakaner");
        map.put("city", "Manawar");
        // It also not give output in sequence.
        System.out.println(map);
    
        // To get output through key or loop.
        Set<String> keys = map.keySet();     // now all keys are inside the set
        
        for(String key : keys)
            System.out.println(key + "  " + map.get(key));  // map.get(key) will give output according to key.
    }
}
