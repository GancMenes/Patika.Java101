package minMaxDegeriBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int number = scanner.nextInt();
        int max = 0,min=0;

            for (int i =1; i<= number;i++){

                System.out.print(i+"."+" Sayıyı giriniz: ");
                int n = scanner.nextInt();

                if (n > max){
                    max =n;
                }else if(n < min){
                    min =n;
                }
            }

        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
