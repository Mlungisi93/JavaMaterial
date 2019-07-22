package inheritance.Exercise;

public class Employee {
    private int hrsWorked;
    private double hourlyRate;



    public Employee(int hrsWorked, double hourlyRate)
    {
       this.hrsWorked = hrsWorked;
       this.hourlyRate = hourlyRate;
    }

    public double getSalary()
    {

        return hourlyRate*hrsWorked;
    }

}
