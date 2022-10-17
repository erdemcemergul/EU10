package week03_24_09_2022;

public class CalculateCarTax {
    public static void main(String[] args) {
        int price = 25000;
        float taxrate = 0;
        if (price >= 20000 & price < 40000) {
            taxrate = 0.2f;
        } else if (price >= 40000 & price < 60000) {
            taxrate = 0.3f;
        } else if (price >= 60000 & price < 80000) {
            taxrate = 0.4f;
        }

        System.out.println("" + taxrate);
    }
}
