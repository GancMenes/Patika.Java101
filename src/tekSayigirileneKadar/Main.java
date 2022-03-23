package tekSayigirileneKadar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Sayı Giriniz :");
            n = scanner.nextInt();

            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.print("Sayılardan 4'ün katlarının toplamı : " + total);
    }
}
