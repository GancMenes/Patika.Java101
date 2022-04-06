package whileDongusu;

import java.util.Scanner;

public class sifreSorma {
    public static void main(String[] args) {
        int password;
        boolean isPasswordTrue = false;

        Scanner scanner = new Scanner(System.in);

        while (!isPasswordTrue) {
            System.out.print("Şifre giriniz : ");
            password = scanner.nextInt();

            if (password == 12345) {
                System.out.println("Doğru");
                isPasswordTrue = true;
            } else {
                System.out.println("Yanlış");
            }
        }
    }
}