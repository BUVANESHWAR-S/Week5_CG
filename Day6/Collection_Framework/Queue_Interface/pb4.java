package Queue_Interface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class pb4 {
    public static boolean rev = false;
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int p = q.remove();

        reverse(q);
        q.add(p);
        rev = true;
    }
    public static int pop(Queue<Integer> q) throws Exception {
        if(!q.isEmpty()){

            if(rev){
                return q.remove();
            }
            reverse(q);
            return q.remove();
        }
        throw new Exception("Stack is empty");
    }
    public static int top(Queue<Integer> q) throws Exception {
        if(!q.isEmpty()){

            if(rev){
                return q.peek();
            }
            reverse(q);
            return q.peek();
        }
        throw new Exception("Stack is empty");
    }
    public static void push(Queue<Integer> q, int n){
        if(rev){
            reverse(q);
            q.add(n);
            rev = false;
        }
        q.add(n);
    }
    public static void main(String[] args) throws Exception {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        //q.add(8);
        push(q, 9);
        System.out.println(top(q));
        push(q, 10);

    }
}
