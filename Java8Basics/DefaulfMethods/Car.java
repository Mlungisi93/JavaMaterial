package Java8Basics.DefaulfMethods;

public class Car implements Vehicle, FourWheeler {

    //override the default implementation
    @Override
    public void print() {
        System.out.println("I am a four wheeler car vehicle");
    }
}
