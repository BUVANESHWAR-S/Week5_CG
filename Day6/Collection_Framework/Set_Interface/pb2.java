package Set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class pb2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,3,4, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,1, 5));
        Set<Integer> union = new HashSet<>(set1);
        Set<Integer> intersection = new HashSet<>(set2);
        union.addAll(set2);
        System.out.println(union);
        intersection.retainAll(set1);
        System.out.println(intersection);
    }
}
