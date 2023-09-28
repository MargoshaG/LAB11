
import java.io.*;
class Sedan extends Car implements Serializable {
    public Sedan(String brand, int year) {
        super(brand, year, 20000); // Примерная стоимость седана
    }
}

class SUV extends Car implements Serializable {
    public SUV(String brand, int year) {
        super(brand, year, 30000); // Примерная стоимость внедорожника
    }
}

