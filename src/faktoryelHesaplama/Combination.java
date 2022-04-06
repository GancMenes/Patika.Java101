package faktoryelHesaplama;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        int rnumberFactoriel=1, numberFactoriel=1, differenceFactoriel =1;


        Scanner scanner = new Scanner(System.in);

        System.out.print("R'li kombinasyon sayısını girin : ");
        int rnumber = scanner.nextInt();

        for (int i = 1; i <= rnumber;i++){
            rnumberFactoriel =  rnumberFactoriel * i;
        }

        System.out.print("Eleman sayısını girin : ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            numberFactoriel = numberFactoriel * i;
        }

        int difference = number -rnumber;
        System.out.println(difference);
        for (int i = 1; i < difference; i++){
            differenceFactoriel = differenceFactoriel*i;
        }


            try {

                int Combination = numberFactoriel / (rnumberFactoriel * differenceFactoriel);
                System.out.println(Combination);}


            catch (ArithmeticException e){
                }
    }
}
