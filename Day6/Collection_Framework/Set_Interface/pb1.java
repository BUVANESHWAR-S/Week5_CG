package Set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class pb1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,1));
        System.out.println(set2.equals(set1));


    }
}
