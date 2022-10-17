package week05_10_08_2022;

public class String_Methods {
    public static void main(String[] args) {
        String str="Adam";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        int lengthOfTheString =str.length();
        int indexOfLastChar= lengthOfTheString-1;
        System.out.println(str.charAt(indexOfLastChar));
        System.out.printf("", str.toLowerCase());
        System.out.printf("", str.toUpperCase());
        String str1="       Adam      ";
        System.out.println(str1.trim());
        System.out.println(str1);
        String number="0123456";
        System.out.println(number.indexOf("14"));//-1
    }
}
