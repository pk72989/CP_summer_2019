import java.sql.SQLOutput;

public class Hello {
    public static void main(String[] inputargs) { //void=no output variable
        System.out.println("Hello!!!");
        Integer a=5;
        Integer b,c;
        b = a;
        c= b +4;
        if (b == a) System.out.println("b==a");
        if (b.equals(a)) System.out.println("b equals a");

        System.out.println("c=" + c);
        System.out.println("b=" + b);

        String s1 = "abc";
        String s2 = null; //just a pointer
        String s3 = s1.toUpperCase();

        System.out.println(s3.charAt(1)); //1 means b, 0 is a, 2 is c
        s1 = "Hello John";
        int j = s1.indexOf("Jo");
        System.out.println(j); //wyrzuca numer znaku, po ktorym znajduje sie szukana fraza

        System.out.println(s1.substring(3,6)); //pokazuje znaki miedzy 3 a 6
    }

}
