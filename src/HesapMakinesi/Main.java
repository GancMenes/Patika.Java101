package HesapMakinesi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n1,n2,select;

        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz");
        n1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz");
        n2 = scanner.nextInt();

        System.out.println("İşlemi seçiniz");
        select = scanner.nextInt();

        switch (select){
            case 1 :
                System.out.println("Toplam " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma " + n1*n2);
                break;
            case 4:
                if (n1 > 0 && n2 > 0) {


                    System.out.println("Bölme" + n1 / n2);
                }
                else {
                    System.out.println("Geçersiz sayı girdiniz");
                    }
                break;

        }
    }
}
