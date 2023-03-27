// Area of Circle 
import java.util.Scanner;
class areac{
        public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of Circle in Cm.");
        double r= s.nextDouble();
        double area= 3.14*r*r;
        System.out.println("The Area of Circle = " + area +" Cm.");
        }
    }   