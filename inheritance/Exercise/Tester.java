package inheritance.Exercise;

import java.util.Scanner;

public class Tester extends Employee {

    public Tester(int hrsWorked, double hourlyRate) {
        super(hrsWorked, hourlyRate);
    }

    public double getSalary()
    {
        return super.getSalary() - super.getSalary()*0.03;
    }

    public static void main(String[] args) {
        int hrsWorked;
        double hrRate;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hour:");
        hrsWorked = input.nextInt();
        System.out.print("Enter rate:");
        hrRate = input.nextDouble();
        Tester objTester = new Tester(hrsWorked, hrRate);
        System.out.println(objTester.getSalary());
    }
}
