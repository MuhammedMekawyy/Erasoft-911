package Level4;

import java.util.Objects;

class Car {
    String plateNumber;
    String color;

    public Car(String plateNumber, String color) {
        this.plateNumber = plateNumber;
        this.color = color;
    }

    // identity is ONLY plateNumber
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return this.plateNumber== car.plateNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                '}';
    }
}