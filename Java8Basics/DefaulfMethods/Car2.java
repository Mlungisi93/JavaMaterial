package Java8Basics.DefaulfMethods;

public class Car2 implements Vehicle, FourWheeler{
    //call the default method on the specified interface using super
    public void print() {
        Vehicle.super.print();
    }
}
