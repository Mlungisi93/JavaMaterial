package Java8Basics.DefaulfMethods;

public interface FourWheeler {
    default void print()
    {
        System.out.println("I am a four wheeler!");
    }
}
