package donguler.sayininKuvvetleri;

import java.util.Scanner;

/**
 * Girilen sayıya kadar 4 ve 5 li kuvvetlerini bulma
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int number = scanner.nextInt();

        System.out.println("Dördün kuvvetleri :");
        for (int i = 1; i <= number ; i*=4){
            System.out.println(i);
        }

        System.out.println("Beşin kuvvetleri :");
        for (int i = 1; i <= number ; i*=5){
            System.out.println(i);
        }
    }
}
