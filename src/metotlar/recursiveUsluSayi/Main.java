package metotlar.recursiveUsluSayi;

import java.util.Scanner;

public class Main {

   static int power(int n, int p){
       if (p == 0){
           return 1;
       }else
           return n*power(n,p-1);
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = scanner.nextInt();
        System.out.println("Enter your power");
        int p = scanner.nextInt();

        System.out.println("Your result is : " + power(n,p));

    }
}
