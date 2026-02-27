package Problem4;

public class Student extends Person{
    private int age;

    public Student(int id, String name, int age) {
        super(id, name);
        setAge(age);
    }

    public void getAge() {
        if(this.age>7 && this.age<30)
            System.out.println("Your age is : " + this.age);
        else
            System.out.println("Your age is : Null");
    }

    private void setAge(int age) {
        if(age>7 && age<30)
        this.age = age;
        else
            System.out.println("Age must be between 7 and 30");
    }
    public void print() {
        super.print();
        getAge();
     }
}
