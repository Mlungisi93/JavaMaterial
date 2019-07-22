package ExceptionHandling;

public class ThrowParty {

    public static void main(String[] args)
    {
        try {
            Party party1 = new Party(11, "Mlungisi");

        } catch (PartyException e) {
            System.out.println(e.getMessage());
        }
    }



}
