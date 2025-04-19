package List_Interface;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//import java.util.List;
public class pb6 {
    static <T> T find(LinkedList<T> l, int n){
        ListIterator<T> first = l.listIterator();
        ListIterator<T> second = l.listIterator();
        int count = 0;
        while(first.hasNext() && count < n){
            first.next();
            count++;
        }
        if(count < n){
            throw new IllegalArgumentException("n is larger than the size of the list");
        }

        while(first.hasNext()){
            first.next();
            second.next();
        }
        return second.next();
    }
    public static void main(String[] args) {
        LinkedList<Character> l1 = new LinkedList<>();
        l1.add('A');
        l1.add('B');
        l1.add('C');
        l1.add('D');
        l1.add('E');

        int n = 2;
        System.out.println(find(l1, n));
    }
}
