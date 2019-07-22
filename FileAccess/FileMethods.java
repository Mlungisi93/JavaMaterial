package FileAccess;
import java.io.*;
public class FileMethods {

    public static void main(String[] args) {

        String path = "file/data.txt";
        String path2 = "data.txt";

        File someFile = new File(path);
        File someFileNotExist = new File(path2);

        String path5 = "file";
        File somePath2 = new File(path5);

        System.out.println("Useful File Method!!!!!");
        System.out.println("SomeFile exist?: "+someFile.exists());
        System.out.println("SomeFileNotExist exist?: "+someFileNotExist.exists());

        System.out.println("SomeFile a File?: "+someFile.isFile());
        System.out.println("SomePath2 a File?: "+somePath2.isFile());

        System.out.println("SomeFile fileName: "+someFile.getName());
        System.out.println("SomeFile is Readable?: "+someFile.canRead());
        System.out.println("SomeFile is Writetable?: "+someFile.canWrite());
        System.out.println("SomeFile size: "+someFile.length());
        System.out.println("SomeFile last time and date modified: "+someFile.lastModified());

        System.out.println("End of Useful File Method!!!!!");
        System.out.println("");
        //Path Methods
        System.out.println("Useful Path Methods!!!!!");
        System.out.println("Is SomeFile a directory? : "+someFile.isDirectory());

        String path3 = "file";
        File somePath = new File(path3);
        System.out.println("Is Some path a directory? : "+somePath.isDirectory());

        System.out.println("SomeFile path name: "+someFile.getPath());
        System.out.println("Is SomePath an Absolute Path? : "+somePath.isAbsolute());

        String path4 = "C:/Users/7201\\IdeaProjects\\HelloWorld10\\file\\data.txt";
        File absolutePath = new File(path4);
        System.out.println("Is absolutePath an Absolute Path? : "+someFile.isAbsolute());

        System.out.println("SomeFile getAbsolutePath: "+someFile.getAbsolutePath());


        System.out.println("SomeFile getParent: "+someFile.getParent());

        if(someFile.getParent().equalsIgnoreCase("file"))
        {
            System.out.println("Is SomePath a Parent Path? : true");
        }else
        {
            System.out.println("Is SomePath a Parent Path? : false");
        }

        // listing method
        String pathFile2 = "file/";
        File somePathFile2 = new File(pathFile2);
        if(somePathFile2.isDirectory())
        {

            String[] ls = somePathFile2.list();
            for(String directoryName: ls)
            { System.out.printf( "%s\n", directoryName );
            }
        }

    }


}
