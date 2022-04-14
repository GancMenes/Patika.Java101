package taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total = 10;
        double km = 2.20;

        System.out.println("Enter the distance you travelled");
        Scanner scanner = new Scanner(System.in);
        double yol = scanner.nextDouble();

        total = total + km*yol;

        double price = total < 20 ? 20 : total;

        System.out.println(price);
    }
}
