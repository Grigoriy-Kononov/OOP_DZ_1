import java.util.*;

public class Main {
    static ArrayList<Car> cars = new ArrayList<>();
    public static void main(String[] args) {
        name(cars);
        System.out.println(cars);
        
    }

    public static ArrayList<Car> name(ArrayList<Car> cars) {
        Car car1 = new Car("Mazda", 2022, 3000000.3, "red", 2000);
        Car car2 = new Car("Opel", 2022, 2400000.3, "blue", 1600);
        Car car3 = new Car("Mazda", 2022, 3000000.3, "red", 2000);


        System.out.println(car1.equals(car3));
        System.out.println(car1.equals(car2));

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        return cars;
    }
    
}
