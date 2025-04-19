package Set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class pb5 {

    public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 4, 5));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4));
    if(set1.containsAll(set2)){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }

    }
}
