package Java8Basics.MethodReference;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Test {
    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Mlungisi");
        names.add("Rashida");
        names.add("Ayanda");

        names.forEach(System.out::println);

        //Predicate Example
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Predicate<Integer> predicate = n -> true
        // n is passed as parameter to test method of Predicate interface
        //test method will always return true no matter what value

        System.out.println("Print all numbers");

        //pass n as parameter
        eval(list, n->true);

        //Predicate<Integer> predicate = n -> n%2 == 0
        // n is passed as parameter to test method of Predicate interface
        //test method will  return true if n%2 comes to be zero

        System.out.println("Print even numbers");

        eval(list, n-> n%2 == 0);

        //Predicate<Integer> predicate = n -> n >3
        // n is passed as parameter to test method of Predicate interface
        //test method will  return true if n > 3

        System.out.println("Print numbers greater than 3");

        eval(list, n-> n > 3);

    }

    public static void eval(List<Integer> list, Predicate<Integer>predicate)
    {
        for(Integer n : list)
        {
            if(predicate.test(n))
            {
                System.out.println(n+ " ");
            }
        }
    }
}
