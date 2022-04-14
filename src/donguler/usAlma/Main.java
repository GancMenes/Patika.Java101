package donguler.usAlma;

import java.util.Scanner;

/**
 * For döngüsüyle sayının üssünü alma
 */
public class Main {
    public static void main(String[] args) {
        int n,m,total =1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n = scanner.nextInt();

        System.out.print("Üs olacak sayı : ");
        m = scanner.nextInt();


        for (int i = 1; i <= m ; i++){
            total *= n;

        }

        System.out.println(total);
    }
}
