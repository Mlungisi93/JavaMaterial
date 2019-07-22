package Java8Basics.StaticDefaultMethod;



public class Car implements Vehicle, FourWheeler {

    //we use super and override
    @Override
    public void print() {

        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car");
    }
}
