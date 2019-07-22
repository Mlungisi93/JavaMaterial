package Java8Basics.DefaulfMethods;

public class Java8Test {
    public static void main(String[] args) {
        //overriding
        Vehicle vehicle = new Car();
        vehicle.print();

        //using super
        Vehicle vehicle1 = new Car2();
        vehicle1.print();

        //overriding
        Car car = new Car();
        car.print();

        //using super
        Car2 car2 = new Car2();
        car2.print();

    }
}
