package methods.deseneGoreMetot;

import java.util.Scanner;

public class Main {

    static void Pattern (int number) {
        if (number <= 0) {
            System.out.println(" " + number);
            Pattern(number - 5);
            return;

        } else {
            System.out.println(" " + number);
            Pattern(number + 5);
            System.out.println(" " + number);
        }
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("N sayısını girin : ");
            int n = scanner.nextInt();
            System.out.print("Çıktısı : ");
            Pattern(n);
            System.out.println("\n");
        }
    }
}
