import java.util.Scanner; 
class loop{
    public static void  main(String arg[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number who's table you want to print ");
        int a= s.nextInt();
        System.out.println(a);
        for(int i=0;i<=10;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }
        if(a%2 == 0){
            System.out.println("The number entered by you is even");
        }else{
            System.out.println("The number entered by you is odd");
        }
        }
}