package Set_Interface;

import java.util.*;

public class pb4 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>(Arrays.asList(1, 2,43, 3, 5, 6));
        List<Integer> l1 = new ArrayList<>(s);
        Collections.sort(l1);
        System.out.println(l1);
    }
}
