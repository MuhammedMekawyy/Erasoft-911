package Problem15;

class Course {

    private String name;
    private Student[] students = new Student[50];
    private int count = 0;

    public Course(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students[count++] = student;
    }

    public String getName() {
        return name;
    }

}