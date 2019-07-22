package interfaces;

public class TestLoan {
    public static void main(String[] args)
    {
        Loan[] loan = new Loan[2];
        Home home = new Home();
        loan[0] = home;
        Car car = new Car();
        loan[1] = car;


        for (int i = 0; i < loan.length; i++) {
           if(loan[i] instanceof Car)
           {
               Car car2 = (Car)loan[i];
               car2.print();

           }else
           {
               Home home2 = (Home)loan[i];
               home2.print();
           }
        }
    }
}
