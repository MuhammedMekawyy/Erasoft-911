package Level4;
//🔵 Level 4: Real-world Scenarios
//Create a Product class (code, price)
//Define equality based on code only
//Store in HashSet
//Create a Student class (id, email)
//Define equality based on:
//        case 1: id
//case 2: email
//Compare results in collections
//Create a Car class (plateNumber, color)
//Use it as a key in HashMap
//Simulate real system behavior

import java.util.Objects;

public class Product {
    private int price;
    private String code;

    public Product(String code, int price) {
        this.code = code;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return this.code == product.code;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", price=" + price +
                '}';
    }
}
