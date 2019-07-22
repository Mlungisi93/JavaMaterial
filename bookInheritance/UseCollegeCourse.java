package bookInheritance;

public class UseCollegeCourse {
    public static void main(String[] args)
    {
        CollegeCourse collegeCourse = new CollegeCourse("Statistics", 150);
        System.out.println("College Course ="+collegeCourse.getCourseName());
        System.out.println(String.format
                ("College Course Price with VAT = R%.2f",collegeCourse.computePrice()));
        System.out.println("");
        Lab lab = new Lab("Chemistry", 150);
        System.out.println("College Lab Course ="+lab.getCourseName());
        System.out.println(String.format
                ("College Lab Course Price with VAT = R%.2f",lab.computePrice()));

        System.out.println("");

        System.out.println("Collect Name from College course is "+collegeCourse.COLLEGE_NAME);
        System.out.println("Collect Name from College Lab course is "+lab.COLLEGE_NAME);


    }
}
