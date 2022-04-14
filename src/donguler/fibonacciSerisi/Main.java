package donguler.fibonacciSerisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the scale for your fibonacci series");
        int scale = scanner.nextInt();
        int n1=0,n2=1,total;
        total=n1+n2;

        for (int i = 0; i < scale; i++){
            total=n1+n2;
            n1=n2;
            n2=total;

            System.out.println(total);
        }
    }
}
