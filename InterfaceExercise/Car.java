package InterfaceExercise;

public class Car extends Loan  implements Print{

    public Car() {
        super("Car");
        setCost();
    }

    @Override
    public void setCost() {
        super.cost = 500;
    }

    @Override
    public void print() {
        System.out.println(super.getType() + String.format(" Loan of R%.2f", super.getCost()));
    }
}
