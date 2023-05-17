class a{
    void add(int x,int y){
        System.out.println("Addition is :"+(x+y));
    }
}
public class overriding extends a{
    void add(float x,float y){
        System.out.println("Addition is : "+(x+y));
    }
    public static void main(String[] args) {
        a s=new overriding();
        overloading s1=new overloading();
        //calling parents method which override childs add method.
        s1.add(5,6);
        //calling childs method.
        s.add(4.3f,5.3f);
    }
}
