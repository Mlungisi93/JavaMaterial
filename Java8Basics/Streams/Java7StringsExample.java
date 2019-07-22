package Java8Basics.Streams;

import java.util.Arrays;
import java.util.List;

public class Java7StringsExample {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
//.....my program....
        System.out.println("Using Java 7: ");

        // Count empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println("List: " +strings);
        long count = getCountEmptyStringUsingJava7(strings);
        System.out.println("Empty Strings: " + count);
        //..... end my program....
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        double seconds = (double) totalTime/1000000000;
        System.out.println(seconds);
    }

    private static int getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;

        for(String string: strings) {

            if(string.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
