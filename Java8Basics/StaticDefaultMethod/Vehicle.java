package Java8Basics.StaticDefaultMethod;

public interface Vehicle {
    default void print()
    {
        System.out.println("I am a vehicle!");
    }

    static void blowHorn()
    {
        System.out.println("Blowing horn!!!");
    }
}
