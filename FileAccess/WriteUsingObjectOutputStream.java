package FileAccess;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteUsingObjectOutputStream {
 static ArrayList<Student> arrStudents = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        getInput(input);
    }

    private static void getInput(Scanner sc)
    {
        ReadUsingObjectOutputStream.readObject();
        Student objStudent = null;
        String option = "";
        String studentNo;
        String firstName;
        String lastName;

        System.out.println("Enter Quit to terminate OR No to not quit");
        option = sc.nextLine();

        while(!option.equalsIgnoreCase("Quit"))
        {
            System.out.print("Enter student No: ");
            studentNo = sc.nextLine();
            System.out.print("Enter First Name:");
            firstName = sc.nextLine();
            System.out.print("Enter Last Name:");
            lastName  = sc.nextLine();
            objStudent = new Student(studentNo, firstName, lastName);

            for(Student s: arrStudents)
            {
                if(s.getStudentNo().equalsIgnoreCase(objStudent.getStudentNo()))
                {
                    JOptionPane.showMessageDialog(null,
                            objStudent.getStudentNo()+" Already Exist!");
                }
            }
            arrStudents.add(objStudent);
            JOptionPane.showMessageDialog(null, "Added "+firstName+" successfully!");
            writeObjectStream();
            System.out.println("Enter Quit to terminate OR No to continue");
            option = sc.nextLine();
        }


    }

    private static void writeObjectStream()
    {
        try
        {
            FileOutputStream objFileOutputStream = new FileOutputStream("studentAppend.dat");
            ObjectOutputStream myOutputStream = new ObjectOutputStream(objFileOutputStream);
            myOutputStream.writeObject(arrStudents);
            JOptionPane.showMessageDialog(null, "file written "+" successfully!");


        }catch (FileNotFoundException ex)
        {
            System.out.println("File Not Found Error: "+ex.getMessage());
        }catch (IOException ex)
        {
            System.out.println("I/O Error: "+ex.getMessage());
        }

    }
}
