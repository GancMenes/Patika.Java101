package ciftSayilariBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int toplam = 0,i;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı girin : ");
        int sayi = scanner.nextInt();


        for (int i = 1; i <= sayi ; i++){
            if ( (i % 3 == 0) && (i % 4 == 0)){
                System.out.println(i);
                toplam += i;
            }
        }

        int ortalama = toplam / i ;
        System.out.println("Ortalama : " + ortalama);

    }
}