import java.io.*;
class Car implements Serializable{
    private String brand;
    private int year;
    private double price;

    public Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return year + " " + brand + " - $" + price;
    }
}
