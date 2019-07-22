package ExceptionHandling;

public class Party {
    private int guest;
    private String Host;

    public Party(int g, String h) throws PartyException
    {
        if(g < 10)
        {
            throw new PartyException();
        }
    }

}

