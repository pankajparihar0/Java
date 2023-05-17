
interface a {
    String name="pnakaj";
    void display();
}
interface b{
    int id=1;
    void get();
}
public class interface1 implements a,b{
    public void display(){
        System.out.println("Name :"+name);
    }
    public void  get(){
        System.out.println("id :"+id);
    }
    public static void main(String[] args) {
        interface1 obj=new interface1();
        obj.display();
        obj.get();
    }
}
