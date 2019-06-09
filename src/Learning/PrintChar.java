package Learning;

public class PrintChar {
    public static void main(String[] args) {
//        char ch = 'a';
        char ch = '\u5234';//输出中文


        int num = ch;
        System.out.println(num+"\t"+((char)(num++)));
        System.out.println(num+"\t"+((char)(num++)));
        System.out.println(num+"\t"+((char)(num++)));
        System.out.println(num+"\t"+((char)(num++)));
        System.out.println(num+"\t"+((char)(num++)));
        System.out.println(num+"\t"+((char)(num++)));
        System.out.println(num+"\t"+((char)(num++)));
        System.out.println(num+"\t"+((char)(num++)));
        System.out.println(num+"\t"+((char)(num++)));
        System.out.println(num+"\t"+((char)(num++)));
    }
}
