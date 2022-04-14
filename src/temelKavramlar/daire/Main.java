package temelKavramlar.daire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        double r = 0;

        double alan = pi *r*r;
        double cevre = 2*pi*r;

        System.out.println("Dairenin yarıçapını giriniz");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();

        System.out.println("Daire'nin alanı : " + alan);
        System.out.println("Daire'nin çevresi : " + cevre);
    }
}
