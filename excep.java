import java.util.Scanner;
public class excep {
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1 for Arthematic,2 for out of bond,3 for null exceptoin.\n");
        int x=s.nextInt();
        int c,data=100;
        int arr[]={1,2,3,4,5};
        String s1=null;
        switch(x){
            case 1:
            try {
                c=100/0;
            } catch (Exception e) {
                System.out.println(e);
            }break;

            case 2:
            try {
                System.out.println(arr[10]);
            } catch (Exception e) {
                System.out.println(e);
            }break;

            case 3:
            try {
                System.out.println(s1.length());
            } catch (Exception e) {
                System.out.println(e);
            }break;

            default:
            System.out.println("invalid input.");
        }
    }
}
