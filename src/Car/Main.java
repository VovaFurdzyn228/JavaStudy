package Car;

public class Main {
    public static void main(String[] args) {

        Helm helm = new Helm(30, "left");
        Wheel wheel = new Wheel(19, "winter");
        Body body = new Body(5, "black");
        Car car = new Car("KIA", 2015, 5, "black", 30,
                "left", 19, "winter");

        System.out.println(car.toString());

        car.multiColorCar("Yellow");
        System.out.println(car.toString());
    }
}
