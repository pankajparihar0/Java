import java.util.Scanner;
class a{
    int hindi;
}
class b extends a{
    int english;
}
class c extends b{
    int math;
}
class d extends c{
    int phy;
}
class multilevel extends d{
    int chem;
    public static void main (String arg[]){
        Scanner s=new Scanner(System.in);
        int sum;
        float a;
        multilevel obj =new multilevel();
        System.out.println("Enter your marks of Hindi,English,Maths,Physics and chemistry");
        obj.hindi=s.nextInt();
        obj.english=s.nextInt();
        obj.math=s.nextInt();
        obj.phy=s.nextInt();
        obj.chem=s.nextInt();
        sum=obj.hindi+obj.english+obj.math+obj.phy+obj.chem;
        a=(float)sum/5;
        System.out.println(a);
        }
}