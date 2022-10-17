package week05_10_08_2022;
import java.util.Scanner;
public class ThreeCopyOfLastTwoChar {
    public static void main(String[] args) {
        //  Create a logic print a new string made of 3 copies of the last 2 chars of the original string.
    Scanner scanner=new Scanner(System.in);
    String word=scanner.next();
    int indexOfLastChar=word.length()-1;
    int indexofSecondFromLast=word.length()-2;
    char last=word.charAt(indexOfLastChar);
    char beforeLast=word.charAt(indexofSecondFromLast);
    String lastTwo=""+beforeLast+last;
        System.out.println(lastTwo+lastTwo+lastTwo);

    }
}
