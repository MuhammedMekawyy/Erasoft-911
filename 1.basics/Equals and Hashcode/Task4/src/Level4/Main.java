package Level4;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Product> set = new HashSet<>();

        set.add(new Product("P1", 100));
        set.add(new Product("P2", 200));
        set.add(new Product("P1", 999)); // duplicate code

        System.out.println(set);

        HashSet<Student> byIdSet = new HashSet<>();

        byIdSet.add(new Student("a@x.com", 1));
        byIdSet.add(new Student("b@x.com", 1)); // duplicate id

        System.out.println("By ID: " + byIdSet);




        HashMap<Car, String> registry = new HashMap<>();

        Car c1 = new Car("ABC-123", "Red");
        Car c2 = new Car("XYZ-999", "Blue");

        registry.put(c1, "Ahmed");
        registry.put(c2, "Sara");

        // Same plate number, different color (like repainting car)
        Car c3 = new Car("ABC-123", "Black");

        registry.put(c3, "Omar"); // overwrites Ahmed

        System.out.println(registry);

    }
}
