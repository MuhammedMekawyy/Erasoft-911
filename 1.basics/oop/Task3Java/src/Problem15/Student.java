package Problem15;

class Student {

    private String name;
    private Course[] courses = new Course[8];
    private int count = 0;

    public Student(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        courses[count++] = course;
    }

    public String getName() {
        return name;
    }
}