package week05_10_08_2022;
import java.util.Scanner;
public class startswith {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.next();
        if (word.startsWith("red"))
            System.out.println("red");
        else if (word.startsWith("blue")) {
            System.out.println("blue");

        } else
            System.out.println("");

    }
}
