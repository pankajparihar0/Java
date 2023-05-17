public class overloading {
    void add(int x,int y){
        System.out.println("the addition is :"+(x+y));
    }
    void add(float x,float y){
        System.out.println("the addition is :"+(x+y));
    }
    public static void main(String[] args) {
        overloading l1=new overloading();
        l1.add(2,3);
        l1.add(2.5f,6.2f);

    }
}
