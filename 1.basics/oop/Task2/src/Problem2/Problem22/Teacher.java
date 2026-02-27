package Problem2.Problem22;

public class Teacher  {
    private Long id ; // id > 0
    private String name; // size >=3 and all digits char(a-z)
    private float age; // age >= 25 and age <= 60
    private String phoneNumber; //  +20111390660 13 cher and start with +20
    private float salary;  // salary >= 3000


    private boolean isAllLetters(String name ) {
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean checkPhone(String phoneNumber) {
        String num ="" ;
        if (phoneNumber.length() != 13) {return false;}
        else  {
            for(int i= 0 ; i<3 ; i++ ) {
                num+=phoneNumber.charAt(i);
            }
            if (num.equals("+20")) {return true ; }
            else
                return false ;
        }

    }





    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        if( age >= 25 && age <= 60)
            this.age = age;
        else
        {
            System.out.println("please age must be between 25 and 60");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if (id>=0)
            this.id = id;
        else  {
            System.out.println("Id msut be postive");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (isAllLetters(name))
            this.name=name ;
        else
            System.out.println("Name must be only characters");

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(checkPhone(phoneNumber))
            this.phoneNumber = phoneNumber;
        else
            System.out.println(" The phone number should start with +20 ");
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if(salary>=3000)
            this.salary = salary;
        else {
            System.out.println("Salary must be greater than 3000");
        }
    }
}