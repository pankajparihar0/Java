public class exceptionnested {
    public static void main(String[] args) {
        int c,data=100;
        int arr[]={1,2,3,4,5};
        String s1=null;
        try {
            c=100/0;
        } catch (Exception e) {
            System.out.println(e);
            try {
                System.out.println(arr[10]);
            } catch (Exception e1) {
                System.out.println(e1);
                try {
                    System.out.println(s1.length());
                } catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        }
    }
}
