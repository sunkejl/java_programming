package Learning;

public class MathCal {
    public static void main(String[] args){
        System.out.println(5/6);
        System.out.println(5/6.0);
        int a = 5;
        double b =6.5;
        float f = 100.1F;
        long l =1001111111111111L;
        System.out.println(a/b);
        System.out.println(f);
        System.out.println(l );

        int c = 011;
        int d = 0xF;

        System.out.println(c);
        System.out.println(d);

        int z = 1;
        int y = 2;

        System.out.println(z&y);
        System.out.println(z|y);
        System.out.println(z^y);
        System.out.println(~y);

        System.out.println(z>>1);
        System.out.println(z<<1);
    }
}
