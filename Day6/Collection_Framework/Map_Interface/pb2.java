package Map_Interface;

import java.util.*;

public class pb2 {
    public static void main(String[] args) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('A', 1);
        mp.put('B', 2);
        mp.put('C', 1);
        mp.put('A', 2);

        Map<Integer, List<Character>> inv_mp = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : mp.entrySet()){
            Character key = entry.getKey();
            Integer values = entry.getValue();

            List<Character> inv_val = inv_mp.getOrDefault(values, new ArrayList<>()); //(values, default if value is not there)

            inv_val.add(key);
            inv_mp.put(values, inv_val);

        }
        System.out.println(inv_mp);
    }
}
