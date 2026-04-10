package Level123;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(10,"Mohamed");
        Person p2 = new Person(12,"Youssef");
        Person p3 = new Person(12,"Ali");
        Person p4 = new Person(11,"Mekawy");
        Person p5 = new Person(13,"Mekawy");
        Person p6 =new Person(15,"Ahmed");

        System.out.println(p3.equals(p2)); //Gives true as p2 and p3 has same id
        //before overriding equals() it gives false as it is comparing by referance

        Set<Person>personSet=new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);
        personSet.add(p6);
        System.out.println(personSet); //it will not return duplicate id


        Map<Person, String> map = new HashMap<>();

        Person p7 = new Person(1, "Ali");
        Person p8 = new Person(2, "Omar");
        Person p9 = new Person(1, "Ahmed"); //overrides not duplicate

        map.put(p7, "Employee");
        map.put(p8, "Manager");
        map.put(p9, "Director");

        System.out.println(map);

        Person test = new Person(1, "Test");
        System.out.println(map.get(test)); // return director
        p1.setId(99);
        System.out.println(map.get(p1)); // fails as changing id changes hash so the map searches in wrong place
        //if i want to set id do it before putting in map




    }
}