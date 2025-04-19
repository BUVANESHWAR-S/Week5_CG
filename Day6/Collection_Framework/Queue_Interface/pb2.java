package Queue_Interface;

import java.util.*;

public class pb2 {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        int n = 5;
        for(int i = 0; i<n; i++){
            String current = queue.poll();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }
        System.out.println(result);
    }
}
