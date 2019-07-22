package ExceptionHandling;

public class ExceptionTesting {
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Starting up....");
            throw new Exception();
        }catch(Exception ex)
        {
            System.out.println("Error");
            System.exit(0);
        }finally {
            System.out.println("Ending...");
        }
    }
}
