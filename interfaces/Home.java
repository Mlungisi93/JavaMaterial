package interfaces;

public class Home extends Loan implements Print{
    public Home() {
        super("Home Loan");
        this.setCost();
    }

    @Override
    public void setCost() {
      super.cost = 1200;
    }

    @Override
    public void print() {
        System.out.println(super.getType()+String.format(" of value R%.2f",super.getCost()));
    }


}
