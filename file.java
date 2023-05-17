
import java.io.*;
import java.util.Scanner;      
public class file {
    public static void main(String []args) throws IOException{
        File f= new File("file.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        FileWriter file=new FileWriter("file.txt",true);
        file.write("This is a java file");
        file.close();
        System.out.println("IS the file readable? :"+f.canRead());
        System.out.println("IS the file writeable? :"+f.canWrite());
        System.out.println("File name :"+f.getName());
        System.out.println("Fuile path :"+f.getAbsolutePath());
        Scanner s=new Scanner(f);
        File f2=new File("file2.txt");
        if(!f2.exists()){
            f2.createNewFile();
        }
        System.out.println("Containt of the file.");
        while(s.hasNextLine()){
            String s1=s.nextLine();
            //copy containt of file into file2.
            FileWriter file1=new FileWriter("file2.txt",true);
            file1.write(s1);
            file1.close();
            System.out.println(s1);
        }
        s.close();
    }
}
