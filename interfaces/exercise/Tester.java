package interfaces.exercise;

public class Tester extends Employee implements BonusCalculator {
    private double ratePerHour;
   private int hoursWorked;

   public Tester(String firstName, String lastName,double ratePerHour, int hoursWorked)
   {
      super(firstName, lastName);
      setRatePerHour(ratePerHour);
      setHoursWorked(hoursWorked);
   }
    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calcBonus() {
        return ratePerHour*hoursWorked + (ratePerHour*hoursWorked)*BonusCalculator.testerBonus ;
    }
}
