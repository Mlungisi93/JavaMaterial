package InterfaceExercise;

public class UseLoan {
    public static void main(String[] args) {
        Loan[] loans = {new Home(), new Car()};
        /*
        Home home = new Home();
        Car car = new Car();
        home.print();
         */
        for (int i = 0; i < loans.length; i++) {
            if (loans[i] instanceof Car) {
                Car car = (Car) loans[i];
                car.print();
            } else {
                Home home = (Home) loans[i];
                home.print();
            }
        }
        System.out.println(Print.calculate());

    }
}
