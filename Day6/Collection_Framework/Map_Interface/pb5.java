package Map_Interface;

import java.util.*;

public class pb5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Chef", "MCA"),
                new Employee("Chief", "ECE"),
                new Employee("Kuroko", "Big-Data"),
                new Employee("Animesh's frnd", "Big-Data"),
                new Employee("Buvaneshwar", "Aiml")
        );

        Map<String, List<String>> mp = new HashMap<>();

        for (Employee emp : employees){
            mp.computeIfAbsent(emp.getDep(), k -> new ArrayList<>()).add(emp.getname());
        }
        System.out.println(mp);
    }
}
