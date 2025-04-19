package Queue_Interface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class pb1 {
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int p = q.remove();
        //q.remove(p);
        reverse(q);
        q.add(p);
//        reverse_add(q,p);
    }
//    public static void  reverse_add(Queue<Integer> q, int p){
//        q.add(p);
//    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,2,3,4));

        reverse(q);
        System.out.println(q);

    }
}
