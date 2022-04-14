package methods.recursiveAsalSayi;

import java.util.Scanner;

public class Main {
    static int i =2;

    static String isPrime(int n, int d) {
        while (n > d) {
            if (n % d == 0) {
                return n + " not a prime number.";
            }
            return isPrime(n, d+1);
        }
        return n + " is a prime number";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = scanner.nextInt();

        System.out.println(isPrime(n, 2));
    }




}