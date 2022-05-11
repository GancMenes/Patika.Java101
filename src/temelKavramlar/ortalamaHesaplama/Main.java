package temelKavramlar.ortalamaHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your mat note");
        int mat = scanner.nextInt();

        System.out.println("Enter your mat note");
        int fizik = scanner.nextInt();

        System.out.println("Enter your mat note");
        int kimya = scanner.nextInt();

        System.out.println("Enter your mat note");
        int turkce = scanner.nextInt();

        System.out.println("Enter your mat note");
        int tarih = scanner.nextInt();

        System.out.println("Enter your mat note");
        int muzik = scanner.nextInt();

        int toplam = mat+ fizik+ kimya+ turkce+ tarih+ muzik;

        double sonuc = toplam/6;
        System.out.println(sonuc);

        System.out.println(sonuc>60 ? "Geçti" : "Kaldı");
    }
}
