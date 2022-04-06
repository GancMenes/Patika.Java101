package armstrongSayilari;

import java.util.Scanner;

public class basamakSayiToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int number, toplam=0;

        number = scanner.nextInt();

        while (number != 0) {
            toplam += number%10;
            number = number - number%10;
            number = number/10;

        }

        System.out.println("Rakamlar toplamı:"+toplam);
    }
}
