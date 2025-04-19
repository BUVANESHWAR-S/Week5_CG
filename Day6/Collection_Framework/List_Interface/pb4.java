import java.util.ArrayList;
import java.util.Arrays;
//package List_Interface;

public class pb4 {
    static void remove(ArrayList<Integer> arr, int n){
        ArrayList<Integer> arr_1 = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(arr_1.contains(arr.get(i))){
                arr.remove(i);
                n--;
                i--;
            }
            else{
                arr_1.add(arr.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1 ,3, 2, 2, 3 ,4, 5, 6));
        int n = arr.size();
        remove(arr, 8);
        System.out.println(arr);
    }
}
