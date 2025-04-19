
import java.util.ArrayList;
import java.util.LinkedList;


class ll<T extends Number>{
    LinkedList<T> ll_1;
    ll(LinkedList<T> ll_1){
        this.ll_1 = ll_1;
        //ll_1 = new LinkedList<>();
    }
    void add( T n){
        ll_1.add(n);
    }
    LinkedList<T> reverse(){
        LinkedList<T> reverse_ll = new LinkedList<>();
        for(int i = ll_1.size()-1; i>=0; i--){
            reverse_ll.add(ll_1.get(i));
        }
        return reverse_ll;
    }
}

class arr_l<T extends Number>{
    ArrayList<T> arr1;
    arr_l(ArrayList<T> arr1){
        this.arr1 = arr1;
    }
    void add(T n){
        arr1.add(n);
    }
    ArrayList<T> reverse_arr(){
        ArrayList<T> rev_arr = new ArrayList<>();
        for(int i = arr1.size()-1; i>=0; i--){
            rev_arr.add(arr1.get(i));
        }
        return rev_arr;
    }
}
public class pb1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll<Integer> obj1 = new ll<>(ll1);
        obj1.add(1);
        obj1.add(2);
        obj1.add(4);
        obj1.add(5);
        obj1.add(6);
        obj1.add(8);
        //LinkedList<Integer> link_l;
        ll1 = obj1.reverse();
        System.out.println(ll1);

        ArrayList<Integer> arr = new ArrayList<>();
        arr_l<Integer> obj2 = new arr_l<>(arr);
        obj2.add(1);
        obj2.add(2);
        obj2.add(4);
        obj2.add(5);
        obj2.add(6);
        obj2.add(8);
        arr = obj2.reverse_arr();
        System.out.println(arr);
    }
}
