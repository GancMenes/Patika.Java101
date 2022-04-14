package temelKavramlar.vucutedeksi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double boy=0;
        double kilo=0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height ");
        boy = scanner.nextDouble();

        System.out.print("Enter your weight ");
        kilo = scanner.nextDouble();

        double indeks = kilo/(boy*boy);

        System.out.print("Your body indeks is : " + indeks);
    }
}
