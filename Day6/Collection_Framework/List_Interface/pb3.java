import java.util.ArrayList;

public class pb3 {
    static void rotate(ArrayList<Integer> arr, int n ){
        if(n == 0){
            return;
        }
        arr.add(arr.remove(0));
        rotate(arr, n-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        rotate(arr, 2);
        System.out.println(arr);
    }
}
