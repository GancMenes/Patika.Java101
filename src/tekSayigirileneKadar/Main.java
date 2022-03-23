package tekSayigirileneKadar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int total = 0;
        boolean evenNumber = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz :");
            n = scanner.nextInt();

            for (int i = 0; i <= n ; i++ ){
                if (i % 4 == 0){
                    total += i;
                }
            }

        }while (n % 2 == 0);

        System.out.print("Sayılardan 4'ün katlarının toplamı : " + total);
    }
}
