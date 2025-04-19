package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class pb3 {
    public static void main(String[] args) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('A', 20);
        mp.put('B', 30);
        mp.put('C', 40);

        int max_val = 0;
        Character max_key = null;

        for (Map.Entry<Character, Integer> entry : mp.entrySet()){
            int val = entry.getValue();

            if(val > max_val){
                max_val = val;
                max_key = entry.getKey();
            }
        }
        System.out.println(max_key);
    }
}
