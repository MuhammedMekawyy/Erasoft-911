package Testt;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[]args) {
        Function<String , String> object =(value) ->  value += " Erasoft";
        Scanner scanner =new Scanner(System.in);
        String value = scanner.next();
        System.out.println(object.apply(value));
        Supplier<Integer> supplier = ()-> 5 ;
        Consumer
    }
}
