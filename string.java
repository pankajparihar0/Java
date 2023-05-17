
public class string {
    public static void main(String[] args) {
        String a="pankaj";
        String b="parihar";
        String c="PANKAJ";
        String d=" hello "; 
        System.out.println("str.length():"+a.length());
        System.out.println("str.toLowerCase():"+c.toLowerCase());
        System.out.println("str.toUppercase():"+a.toUpperCase());
        System.out.println("str.concat(str1):"+a.concat(" "+b));
        System.out.println("str.equals(str1):"+a.equals(c));
        System.out.println("str.equalsIgnoreCase(str1):"+a.equalsIgnoreCase(c));
        System.out.println("str.compareTo(str1):"+a.compareTo(b));
        System.out.println("str.indexOf(x):"+a.indexOf("a"));
        System.out.println("str.replace():"+a.replace("a", "-"));
        System.out.println("str.subString:"+a.substring(1,5));
        System.out.println("str.split():"+(a.split("")[0]));
        System.out.println("str.trim():"+d.trim());
    }
}
