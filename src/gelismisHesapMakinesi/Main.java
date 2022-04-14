package gelismisHesapMakinesi;

import java.util.Scanner;

public class Main {

    static int sum(int a,int b) {
        int result = a+b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int sub(int a, int b){
        int result = a-b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int multiply (int a,int b){
        int result = a*b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divide(int a,int b){
        int result = a*b;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int power(int a,int b){
        int result = 1;
        for (int i =1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b){
        return a % b;
    }

    static void calc(int a, int b){
        System.out.println("Çevresi : " + ( 2 * (a + b)));
        System.out.println("Alanı : " + (a * b));
    }

    static int fact(int a){
        int total = 1;

        for (int i = 1; i <=a ;i++){
            total *=i;
        }
        return total;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"+
                "2-Çıkarma İşemi\n"+
                "3-Çarpma İşemi\n"+
                "4-Bölme İşemi\n"+
                "5-Üslü Sayı Hesaplama İşemi\n"+
                "6-Mod Alma\n"+
                "7-Dikdörtgen Alan ve Çevre Hesabı\n"+
                "8-Faktöryel Hesaplama\n"+
                "9-Çıkış Yap\n";

        System.out.println(menu);

        while (true){
            System.out.print("Bir işlem seçiniz : ");
            select = scanner.nextInt();
            System.out.print("İlk Sayı : ");
            int a = scanner.nextInt();
            System.out.print("İkinci Sayı : ");
            int b = scanner.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;

                case 2:
                    sub(a,b);
                    break;

                case 3:
                    multiply(a,b);
                    break;

                case 4:
                    divide(a,b);
                    if (divide(a, b) == 0) {
                        System.out.println("İkinci sayı 0'dan farklı olmalıdır.");
                    }
                    break;

                case 5:
                    System.out.println("Üs Hesabı " + power(a,b));
                    break;

                case 6:
                    System.out.println("Mod işlemi: " + mod(a,b));
                    break;

                case 7:
                   calc(a,b);
                   break;

                case 8:
                    System.out.print("Faktöryel sonucu " + fact(a));
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz");
            }
        }
    }
}
