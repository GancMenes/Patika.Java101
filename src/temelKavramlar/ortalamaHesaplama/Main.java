package temelKavramlar.ortalamaHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzık;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your math grade?");
        mat = scanner.nextInt();

        System.out.println("What is your fizik grade?");
        fizik = scanner.nextInt();

        System.out.println("What is your kimya grade?");
        kimya = scanner.nextInt();

        System.out.println("What is your turkce grade?");
        turkce = scanner.nextInt();

        System.out.println("What is your tarih grade?");
        tarih = scanner.nextInt();

        System.out.println("What is your muzık grade?");
        muzık = scanner.nextInt();

        int ortalama = (mat+fizik+kimya+turkce+tarih+muzık)/6;

        String sonuc = ortalama < 60 ? "Kaldı" : "Gecti";
    }
}
