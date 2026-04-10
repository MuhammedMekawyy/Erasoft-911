package Level4;

import java.util.Objects;

public class Student {
    private int id;
    private String email;

    public Student(String email, int id) {
        this.email = email;
        this.id = id;
    }
     //equality based on id

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
