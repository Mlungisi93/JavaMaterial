package Java8Basics.StaticDefaultMethod;

public interface FourWheeler {
    default void print()
    {
        System.out.println("I am a four wheeler!");
    }
}
