package temelKavramlar.daire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        double r, a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yarıçapı girin : ");
        r = scanner.nextDouble();

        System.out.println("Açıyı girin : ");
        a = scanner.nextDouble();

        double dilim = (pi * (r*r) *a) * 360;
    }
}
