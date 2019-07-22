package InterfaceExercise;

public class Home extends Loan implements Print {
    public Home() {
        super("Home");
        this.setCost();
    }

    @Override
    public void setCost() {
        super.cost = 1200;
    }

    @Override
    public void print() {
        System.out.println(super.getType() + String.format(" Loan of R%.2f", super.getCost()));
    }
}
