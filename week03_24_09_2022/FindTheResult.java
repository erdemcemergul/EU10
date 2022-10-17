package week03_24_09_2022;

public class FindTheResult {
    public static void main(String[] args) {
        int a = 15;
        if (a % 3 == 0)
            System.out.println("a = " + (a + 20));
        if (a % 5 == 0)
            System.out.println("a = " + (a + 25));
        if (a % 15 == 0)
            System.out.println("a = " + (a + 50));
    }
}
