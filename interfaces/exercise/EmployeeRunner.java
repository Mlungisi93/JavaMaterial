package interfaces.exercise;

public class EmployeeRunner {
    public static void main(String[] args) {
        Developer objDeveloper =new Developer("Ayanda", "Khumalo",20,160);
        System.out.println(String.format("Developer salary: R%.2f ",objDeveloper.calcBonus()));

        Tester objTester =new Tester("Ayanda", "Khumalo",20,160);
        System.out.println(String.format("Tester salary: R%.2f ",objTester.calcBonus()));
    }
}
