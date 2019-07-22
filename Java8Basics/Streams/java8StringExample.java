package Java8Basics.Streams;

import java.util.Arrays;
import java.util.List;

public class java8StringExample {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
//.....my program....
        System.out.println("Using Java 8: ");

        // Count empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println("List: " +strings);
        long count = strings.stream().filter(string->string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);
        //..... end my program....
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        double seconds = (double) totalTime/1000000000;
        System.out.println(seconds);
    }
}
