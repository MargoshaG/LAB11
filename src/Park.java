import java.io.*;
public class Park {

    public static void main(String[] args) {
        // Создаем автомобили для таксопарка
        Car car1 = new Sedan("Toyota Camry", 2020);
        Car car2 = new SUV("Ford Explorer", 2019);
        Car car3 = new Sedan("Honda Accord", 2021);

        // Сериализуем объекты в файл
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("taxi_park.ser"));
            outputStream.writeObject(car1);
            outputStream.writeObject(car2);
            outputStream.writeObject(car3);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализуем объекты из файла
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("taxi_park.ser"));
            Car deserializedCar1 = (Car) inputStream.readObject();
            Car deserializedCar2 = (Car) inputStream.readObject();
            Car deserializedCar3 = (Car) inputStream.readObject();
            inputStream.close();

            // Выводим информацию о десериализованных объектах
            System.out.println("Десериализованный таксопарк:");
            System.out.println(deserializedCar1);
            System.out.println(deserializedCar2);
            System.out.println(deserializedCar3);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
