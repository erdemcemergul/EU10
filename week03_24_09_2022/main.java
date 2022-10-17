package week03_24_09_2022;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] operationSystem = {"", "MACOS", "LENOVO", "IOS", "ANDROID"};
        String[] devivces = {"", "MACBOOK", "LENOVO", "IPHONE", "SAMSUNG"};
        String ansDevice;

        System.out.println("<--------- DEVICES ---------> ");
        for (int i = 1, num = 1; (i >= 1) && (i <= 4); i++, num++) {
            System.out.println("*\t" + num + ") " + devivces[i] + "\t\t\t\t*");
        }
        System.out.println("<--------------------------->");
        System.out.print("WHICH DEVICE DO YOU USE : ");
        ansDevice = input.nextLine();

        switch (ansDevice) {

            case "MACBOOK":
            case "macbook":
                operationSystem.equals(1);
                break;
            case "LENOVO":
            case "lenovo":
                operationSystem.equals(2);
                break;
            case "IPHONE":
            case "iphone":
                operationSystem.equals(3);
                break;
            case "SAMSUNG":
            case "samsung":
                operationSystem.equals(4);

                break;
            default:
                System.err.println("------------------------");
                System.err.println("INVALID DEVICE : " + ansDevice);
                System.err.println("------------------------");
                break;

        }

        for (int j = 1; j == 1; j++) {
            System.out.println("----------------------------------"
                    + "\nYOUR DEVICE IS : " + ansDevice
                    + "\n-----------"
                    + "\nYOUR OPERATION SYSTEM IS : " + operationSystem[j]);
        }
    }
}

/**
 * Write a java program in order to learn to OS
 * Mac     ->     MacOS
 * Lenovo  ->     Windows
 * Iphone  ->     IOS
 * Samsung ->     Android
 * <p>
 * input : Mac
 * output: MacOS
 */

