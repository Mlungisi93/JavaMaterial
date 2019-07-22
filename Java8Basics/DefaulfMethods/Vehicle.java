package Java8Basics.DefaulfMethods;

public interface Vehicle {
    default void print()
    {
        System.out.println("I am a vehicle");
    }
}
