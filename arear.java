//Area of Rectangle
import java.util.Scanner;
class arear{
    public static void main(String arg[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Lenght of Rectangle in Cm");
        double lenght= s.nextDouble();
        System.out.println("Enter the Width of Rectangle in Cm");
        double width= s.nextDouble();
        double area= lenght*width;
        System.out.println("Area of Rectangle = "+ area + " Cm.");
    }
}