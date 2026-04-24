package model;

public class Account {
    private String userName;
    private String password;
    private Double balance;
    private String phoneNumber;
    private float age;

    public Account() {}

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Account(String phoneNumber, String password, String userName, float age) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
        this.age = age;
    }

    public Account(float age, Double balance, String password,
                   String phoneNumber, String userName) {
        this.age = age;
        this.balance = balance;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
