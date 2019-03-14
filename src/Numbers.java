public class Numbers {
    public static void main(String[] args) {
        float f1 = 455.3f;
        double d1 = f1;

        int a = 6;
        long b = a;
        int c = Long.valueOf(b).intValue(); //conversion of primitive type into object orientation
        Long bb = Long.valueOf(a);
        int cc = bb.intValue();

        int i = 0;
        i++; //i = i + 1
        i--; //i = i - 1
        i = 8;
        a = ++i;
        System.out.println(a);//=9
        i = 8;
        a = i++;
        System.out.println(a);//=8


    }
}
