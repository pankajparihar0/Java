import java.util.Scanner;
class fun{
    int balance=10000;
    int pass=1234;
    int amount;
    void bln(){
        System.out.println("Your A/C balance is "+this.balance);
    }
    void wid(){
        System.out.println("your with draw amount is "+this.amount);
        balance=balance-amount;
        
    }
}
class ATM{
    public static void main(String arg[]){
        fun ob=new fun();
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to the abc bank ATM");
        System.out.println("Please enter your pin");
        int p=s.nextInt();
        if(p==ob.pass){
            int c=0;
            do{
            System.out.println("Select your service from below options");
            System.out.println("For balance enquiry press 1");
            System.out.println("For Amount with draw press 2");
            System.out.println("For Exit press 3");
            int a=s.nextInt();
            if(a==1){
                ob.bln();
            }
            else if(a==2){
                System.out.println("Enter the amount");
                ob.amount=s.nextInt();
                ob.wid();
                ob.bln();
            }
            else if(a==3){
                System.out.println("thank you for banking with us!!!!");
                break;
            }
        }
        while(c!=3);
        }
        else{
            System.out.println("Please enter correct pin");
        }
        
    }
}
