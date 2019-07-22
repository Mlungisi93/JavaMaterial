package ExceptionHandling;

import java.util.Scanner;

public class SqrtError {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        int i =0;
        while ((isValid == false)) {
            try {

                System.out.println("Enter a number");
                i = input.nextInt();
                if (input.hasNextInt()) {

                    isValid = true;
                    System.out.println("The squere root of " + i + " is " + Math.sqrt(i));
                }


            } catch (Exception e) {
                System.out.println("" + e.getMessage());
                input.next();
            }


        }


    }
}
