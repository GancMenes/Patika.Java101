package ucakbileti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, oran = 0.1,yasİndirimi = 1,total,geriDonusParasi=1;
        int yas,yolcuklukTipi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = scanner.nextDouble();

        System.out.print("Yasınızı giriniz : ");
        yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolcuklukTipi = scanner.nextInt();


        if (mesafe < 0 || yas < 0 || yolcuklukTipi < 0 || yolcuklukTipi >2) {
            System.out.println("Geçersiz bilgi girdiniz, tekrar deneyin");
        }
        else {
            if (yas < 12) {
                yasİndirimi = 0.5;
            } else if (12 <= yas && yas <= 24) {
                yasİndirimi = 0.9;
            } else if (65 < yas) {
                yasİndirimi = 0.7;
            }

            if (yolcuklukTipi == 2 ) {
                geriDonusParasi = 1.6;
                }

            total = mesafe*oran*yasİndirimi*geriDonusParasi;
            System.out.print("Toplam Tutar : " + total);
        }
    }
}
