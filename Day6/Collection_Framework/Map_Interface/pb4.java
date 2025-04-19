package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class pb4 {
    public static void main(String[] args) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        m1.put('A', 2);
        m1.put('B', 2);
        m1.put('C', 5);
        m2.put('D', 6);
        m2.put('B', 4);

        for(Map.Entry<Character, Integer> entry : m2.entrySet()){
           Character key = entry.getKey();
           Integer value = entry.getValue();

           if(m1.containsKey(key)){
               m1.put(key, m1.get(key)+value);
           }
        }
        System.out.println(m1);
    }
}
