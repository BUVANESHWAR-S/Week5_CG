import java.util.HashMap;
import java.util.Map;

public class pb2 {
    static Map<String, Integer> count_freq(String[] arr, int n){
        Map<String, Integer> mp = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        return mp;
    }
    public static void main(String[] args) {
        String[] list = {"apple", "Orange", "banana", "apple", "Orange", "Orange", "banana"};
        Map<String, Integer> mp = count_freq(list, list.length);
        System.out.println(mp);
    }
}
