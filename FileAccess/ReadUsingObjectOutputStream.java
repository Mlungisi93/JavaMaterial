package FileAccess;



import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class ReadUsingObjectOutputStream {

    public static void main(String[] args) {
        readObject();
        display();
    }

    public static void readObject()
    {
        File file = new File("studentAppend.dat");
        if(file.exists())
        {
            try
            {

                ObjectInputStream myObjectInputStream =
                        new ObjectInputStream(new FileInputStream(file));
                WriteUsingObjectOutputStream.arrStudents =
                        (ArrayList<Student>)myObjectInputStream.readObject();
                System.out.println("Reading successful!");
            }catch (FileNotFoundException ex)
            {
                System.out.println("File Not Found Error: "+ex.getMessage());
            }catch (IOException ex)
            {
                System.out.println("I/O Error: "+ex.getMessage());
            }catch (ClassNotFoundException ex)
            {
                System.out.println(ex.getMessage());
            }
        }else
        {
            try {
                ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(file));
                if(WriteUsingObjectOutputStream.arrStudents.size() == 0)
                {
                    WriteUsingObjectOutputStream.arrStudents.
                            add(new Student("215229827", "Mlungisi",
                                    "Khumalo") );
                    ois.writeObject(WriteUsingObjectOutputStream.arrStudents);
                    JOptionPane.showMessageDialog(
                            null, "studentAccess.dat " +
                                    "created successfully on "+file.getAbsolutePath());

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void display()
    {
        for (Student s: WriteUsingObjectOutputStream.arrStudents) {
            System.out.println(s.toString());
        }
    }
}
