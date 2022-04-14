package donguler.tersYildizUcgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++){

            for (int j = 0; j < i +1; j++){
                System.out.print(" ");
            }
            for (int k =(2*number-1); k >= (2*i -1); k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
