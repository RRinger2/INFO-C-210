
import java.util.ArrayList;

public class UseCar1 {
    public static void main(String[] args) {
        // Create some CarOwner objects
        CarOwner owner1 = new CarOwner("John Doe", "123 Elm Street");
        CarOwner owner2 = new CarOwner("Jane Smith", "456 Oak Avenue");

        // Create some Car objects
        Car car1 = new Car("Toyota", "Camry", 2020, 24000, owner1);
        Car car2 = new Car("Honda", "Civic", 2019, 22000, owner2);
        Car car3 = new Car("Ford", "Focus", 2021, 21000, owner1);

        // Store cars in an ArrayList
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        // Display each car's information
        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }
}