package temelKavramlar.sinifiGecme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        int total=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz");
        mat = scanner.nextInt();
        if (mat<101 && -1<mat){
            total += mat;
        }

        System.out.println("Fizik notunu giriniz");
        fizik = scanner.nextInt();
        if (mat<101 && -1<mat){
            total += fizik;
        }

        System.out.println("Türkçe notunu giriniz");
        turkce = scanner.nextInt();
        if (mat<101 && -1<mat){
            total += turkce;
        }

        System.out.println("Kimya notunu giriniz");
        kimya = scanner.nextInt();
        if (mat<101 && -1<mat){
            total += kimya;
        }

        System.out.println("Muzik notunu giriniz");
        muzik = scanner.nextInt();
        if (mat<101 && -1<mat){
            total += mat;
        }

        int ortalama = total/5;
        System.out.println(ortalama);

        if (ortalama>= 55){
            System.out.println("Tebrikler sınıfı gectiniz!");
        }
        else  {
            System.out.println("Başarılı not değildir");
        }
    }
}
