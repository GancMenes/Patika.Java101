package temelKavramlar.hipotenus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilk kenarı girin");
        int a = scanner.nextInt();
        System.out.println("Ikıncı kenarı girin");
        int b = scanner.nextInt();
        System.out.println("Ucuncu kenarı girin");
        int c = scanner.nextInt();

        int u = (a+b+c)/2;
        int cevre = 2*u;

        int alan = u*(u-a)*(u-b)*(u-c);
        System.out.println(alan);
    }
}
