package ciftSayilariBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int toplam = 0, tane =0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı girin : ");
        int sayi = scanner.nextInt();


        for (int i = 1; i <= sayi ; i++){
            if ( (i % 3 == 0) && (i % 4 == 0)){
                toplam += i;
                tane ++;
            }
        }

        int ortalama = toplam / tane ;
        System.out.println("Ortalama : " + ortalama);

    }
}