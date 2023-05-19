import java.util.Scanner;
import java.io.*;
import java.util.Date;
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
class ATM1{
    public static void main(String arg[])throws IOException{
        File f=new File("ATM.txt");
        if(!f.exists()){
            f.createNewFile();
            FileWriter w=new FileWriter("ATM.txt");
            w.write("ATM Transaction history\n");
            w.close();
        }
        FileWriter w=new FileWriter("ATM.txt",true);
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
            System.out.println("For Amount withdraw press 2");
            System.out.println("For Exit press 3");
            int a=s.nextInt();
            if(a==1){
                ob.bln();
                Date date=new Date();
                String s1="Balance Enquiry.";
                w.write(s1+"Balance :"+ob.balance+"RS.at "+date+"\n");
            }
            else if(a==2){
                Date date=new Date();
                System.out.println("Enter the amount");
                ob.amount=s.nextInt();
                ob.wid();
                ob.bln();
                w.write("Withdraw amount :"+ob.amount+"RS,Remaining Balance :"+ob.balance+"RS. at "+date+"\n");
            }
            else if(a==3){
                System.out.println("thank you for banking with us!!!!");
                break;
            }
        }
        while(c!=3);
        w.close();
        }
        else{
            System.out.println("Please enter correct pin");
        }
        
    }
}
