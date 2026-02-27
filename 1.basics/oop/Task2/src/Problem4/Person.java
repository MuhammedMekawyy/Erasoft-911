package Problem4;
//create APP that Accept Player(id,name,number) and student(id , name,age) and print Data
//look!
//        - id must be > 0
//        - number length must be <=2       0 1     99
//        - age must be > 7 and < 30

public class Person {
    private int id ;
    private String name ;

    public Person(int id, String name) {
        setId(id);
        this.name = name;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        if (id>0)
        this.id = id;
        else
            System.out.println("Id must be greater than 7");
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Your name is : " + getName());
        System.out.println("Your id is : " + getId());
    }
}
