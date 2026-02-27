package Problem5;
//Please Create App that accept
//Person(id,name)
//Player(id , name, number,phone)
//student (id,name,age,phone) wit oop
//
//BaseEntity(id,name)
//ShareData(phone) extend BaseEntity(id,name)
//
//Person() extend BaseEntity(id,name)
//Player(number) extend ShareData(phone) extend BaseEntity(id,name)
//student (age) extend ShareData(phone) extend BaseEntity(id,name)
//wit oop

public class BaseEntity {
    private String name ;
    private int id ;

    public BaseEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
