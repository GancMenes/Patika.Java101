import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat, fizik, kımya, turkce, tarıh, muzık;

        System.out.println("Mat dersi");
        mat = scanner.nextInt();
        System.out.println("Fizik dersi");
        fizik = scanner.nextInt();
        System.out.println("Kimya dersi");
        kımya = scanner.nextInt();
        System.out.println("Türkçe dersi");
        turkce = scanner.nextInt();
        System.out.println("Tarih dersi");
        tarıh = scanner.nextInt();
        System.out.println("Muzik dersi");
        muzık = scanner.nextInt();

        int total = (mat+fizik+kımya+turkce+tarıh+muzık)/6;

        System.out.println(total);

        String sonuc = (total > 60) ? "Geçti" : "Kaldı";
        System.out.println(sonuc);

    }
}
