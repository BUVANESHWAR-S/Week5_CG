package Set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class pb3 {
    public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 4, 5));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4 ,6));

    set1.removeAll(set2);
        System.out.println(set1);

    }

}
