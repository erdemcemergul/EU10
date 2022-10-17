package week05_10_08_2022;

public class StringIntro {
    public static void main(String[] args) {
        //we can create Strin two different ways
        //1. sting literal
        String str="Kazim";
        String str1="Kazim";
        System.out.println(str1==str);

        //2.new keyword
        String str2=new String("Kazim");// we create object from heap memory
        String str3=new String("Kazim");
        System.out.println(str1==str2);
        System.out.println(str2==str3);

    }
}
