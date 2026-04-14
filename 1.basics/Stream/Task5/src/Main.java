import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        //Answer
        System.out.println(numbers.stream().
                filter((n)->n%2==0).
                collect(Collectors.toList()));

        System.out.println( numbers.stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList()));

        System.out.println(numbers.stream().filter((n)->n<5)
                .findFirst());

        System.out.println(numbers.stream().anyMatch((n)->n%5==0));

        System.out.println(numbers.stream().reduce(0, ( a , b)->a+b));

        System.out.println(numbers.stream().max(( a , b)-> a.compareTo(b)));
        System.out.println(numbers.stream().min(( a , b)-> a.compareTo(b)));
        System.out.println(numbers.stream().reduce((Integer a ,Integer b)->a*b));
        System.out.println(numbers.stream().filter((n)->n>=0).count());

        System.out.println(numbers.stream()
                .mapToDouble(n -> n)
                .average());

        System.out.println(numbers.stream().collect(Collectors.partitioningBy((s)->s%2==0)));

        System.out.println( numbers.stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                skip(1).
                findFirst()
        );

        Set<Integer> seen = new HashSet<>();
        System.out.println(numbers.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet()));

        //---------------------------------------------------------
                List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara"
                        , "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
                //Answer
        System.out.println(names.stream()
                .filter((s)-> (s != null) && !(s.isEmpty()))
                .map((s)->s.toUpperCase()).
                collect(Collectors.joining(",")));

        System.out.println(names.stream().filter((s)-> (s != null) && s.startsWith("A")).
                map(s -> s.toUpperCase()).
                collect(Collectors.toList()));

        System.out.println(names.stream().filter((s)-> (s != null) && !(s.isEmpty()))
                .filter((s)-> s.length()>5).
                collect(Collectors.toList()));

        System.out.println(names.stream().
                filter((s)-> (s != null) && !(s.isEmpty())).
                collect(Collectors.toSet()));

        System.out.println(names.stream()
                .filter((s)-> (s != null) && !(s.isEmpty()))
                .flatMap(s->s.chars().mapToObj(c->(char)c))
                .distinct()
                .collect(Collectors.toList())
        );

        System.out.println(names.stream()
                .filter((s)-> (s != null) && !(s.isEmpty()))
                .map(s -> s.length())
                .collect(Collectors.toList())
        );
        //----------------------------------------------------------
        List<Student> students = Arrays.asList(
                new Student("Ali", "IT", 85),
                new Student("Mona", "CS", 92),
                new Student("Ahmed", "IT", 60),
                new Student("Sara", "CS", 70),
                new Student("Omar", "IS", 45),
                new Student("Laila", "IS", 78)
        );
        System.out.println(students.stream()
                .collect(Collectors.groupingBy(student -> student.getDepartment())));

        System.out.println(students.stream().collect(Collectors.
                partitioningBy(student -> student.getGrade()>70)
        ));

        //-------------------------------------------------------------
        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30, "HR", 5000),
                new Employee("Mona", 25, "IT", 7000),
                new Employee("Ahmed", 30, "HR", 5500),
                new Employee("Sara", 27, "IT", 7200),
                new Employee("Omar", 40, "Finance", 8000),
                new Employee("Laila", 35, "Finance", 8200)
        );
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy((employee -> employee.getDepartment())
                        ,Collectors.averagingDouble((employee)->employee.getSalary()
                                  )
                        )
                )
        );

        System.out.println(employees.stream().
                collect(Collectors.groupingBy((Employee::getAge),
                        Collectors.counting()
                        )
                )
        );
        System.out.println(employees.stream()
                .sorted(Comparator.
                        comparingDouble(Employee :: getSalary).
                        thenComparing(Employee::getName)
                )
        );
        //----------------------------------------------------------------------------
        List<List<String>> nestedWords = Arrays.asList(
                Arrays.asList("Java", "Stream"),
                Arrays.asList("API", "Lambda"),
                Arrays.asList("FlatMap", "Map")
        );
        System.out.println(nestedWords.stream().
                flatMap((l)->l.stream()).
                collect(Collectors.toList())
        );
        //--------------------------------------------------------------------------
        List<Optional<String>> list = Arrays.asList(
                Optional.of("Ali"),
                Optional.empty(),
                Optional.of("Mona"),
                Optional.empty(),
                Optional.of("Ahmed")
        );
        System.out.println(list.stream()
                .filter((opt)-> opt.isPresent())
                .map((o)->o.get())
                .collect(Collectors.toList())
        );


    }

}