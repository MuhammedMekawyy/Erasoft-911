package Level123;

import java.util.Objects;

//🟢 Level 1: Basics of equals & hashCode
//Create a Level123.Person class with fields: id, name
//Define what makes two persons equal (by id only)
//Compare two different objects with same values
//Check behavior before overriding equals()
//Then check behavior after
//Create multiple Level123.Person objects with same id
//Test equality manually using .equals()
//Think:
//What happens if you override equals() but NOT hashCode()?
public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if (obj==null || this.getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return this.id== person.id ;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Level123.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
