package ExceptionHandling;

public class PartyException extends Exception {
    public PartyException()
    {
        super("You can not have less than 10 guests!");
    }
}
