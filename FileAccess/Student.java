package FileAccess;

import java.io.Serializable;

public class Student implements Serializable {
    private String studentNo;
    private String firstName;
    private String lastName;

    public Student(String studentNo, String firstName, String lastName)
    {
        this.studentNo = studentNo;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
