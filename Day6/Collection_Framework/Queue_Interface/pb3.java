package Queue_Interface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class pb3 {
    //@Override

    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Alice", 5);
        mp.put("Bob", 2);
        mp.put("John", 4);
        //mp.put("Cat", 6);
        PriorityQueue<String> pq = new PriorityQueue<>((p1, p2) -> Integer.compare(mp.get(p2), mp.get(p1)));
        //pq.add(mp.forEach(pol -> ));
        pq.addAll(mp.keySet());
//        System.out.println(pq);
        pq.forEach(p ->System.out.println(pq.poll()));
    }
}
