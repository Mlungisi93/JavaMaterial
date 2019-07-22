package Java8Basics.LambdaExpressions;

public class Java8Test {
     static String salutation = "Hello! ";
    public static void main(String[] args) {
        Java8Test tester = new Java8Test();

       //with type decleration
       MathOperation addOperation =(int a, int b) -> a + b;

       // with out type decleration
        MathOperation substration = (d, c) -> d - c;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {return a * b; };

        //with out return statement without curly braces
        MathOperation division = (int a, int b) ->  a / b;

        System.out.println("10 + 5 = " + tester.operate(10,5,addOperation));
        System.out.println("10 - 5 = " + tester.operate(10,5,substration));
        System.out.println("10 * 5 = " + tester.operate(10,5,multiplication));
        System.out.println("10 / 5 = " + tester.operate(10,5,division));

        //There was no need for the operate method
        System.out.println(addOperation.operation(10, 8));

        //with parenthesis
        GreetingService greetingService1 = (message) ->
                System.out.println("Hello "+message);

        //without parenthesis
        GreetingService greetingService2 = message ->
                System.out.println("Hello " +message);

        GreetingService greetingService3 = message ->
                System.out.println(salutation + message);

        greetingService1.sayMessage("Mlungisi");
        greetingService2.sayMessage("Rashida");
        greetingService3.sayMessage("David");

    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
