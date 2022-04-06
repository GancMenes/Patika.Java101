package Hackerrank.IfELse;

import java.util.Scanner;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter n");
        int n = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (n % 2 == 1 || ((n >= 6 && n <= 20))) {
            System.out.println("Weird");
            }
        else if ((n < 5 && 2 < n) || 20 < n )
        {
            System.out.println("Not Weird");
        }else {
            System.out.println("number invalid");
        }
    }
}