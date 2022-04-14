package Manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç kilo ? :");
        int armutadedi = scanner.nextInt();

        System.out.print("Elma Kaç kilo ? :");
        int elmaadedi = scanner.nextInt();

        System.out.print("Domates Kaç kilo ? :");
        int domatesadedi = scanner.nextInt();

        System.out.print("Muz Kaç kilo ? :");
        int muzadedi = scanner.nextInt();

        System.out.print("Patlıcan Kaç kilo ? :");
        int patlıcanadedi = scanner.nextInt();

        double toplam = armutadedi*armut + elmaadedi*elma + domates*domatesadedi
                +muzadedi*muz + patlıcan*patlıcanadedi;

        System.out.print("Toplam tutar :" + toplam);
    }
}
