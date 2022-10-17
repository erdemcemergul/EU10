package week05_10_08_2022;

public class cydexx {
    public static void main(String[] args) {


        System.out.print("enter a password;") ;
                String pasee="cydeo";
        System.out.println(pasee);
        System.out.println("encrypt witc char:");
        char encrypte='x';
        String ENCRYPTEDPASS="";
        for (int i = 0; i < pasee.length(); i++) {
            ENCRYPTEDPASS+=""+pasee.charAt(i)+encrypte;
            
        }
        System.out.println(ENCRYPTEDPASS);
    }
}
