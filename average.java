//Average of four number
import java.util.Scanner;
class average {
    public static void main(String arg[]){
        Scanner s= new Scanner(System.in); 
        System.out.println("Enter the numbers.");
        double a=s.nextDouble();
        double b= s.nextDouble();
        double c= s.nextDouble();
        double d= s.nextDouble();
        double Average=(a+b+c+d)/4;
        System.out.println("The Average of four numbers is = " +Average);
        }
    }
