package interfaces;

public class Car extends Loan implements Print {
    public Car() {
        super("Car Loan");
        this.setCost();
    }

    @Override
    public void setCost() {
        super.cost = 500;
    }

    @Override
    public void print() {
        System.out.println(super.getType()+String.format(" of value R%.2f",super.getCost()));
    }
}
