package temelKavramlar.kdvHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price");
        double price = scanner.nextInt();

        double kdv = price < 1000 ? price*0.18 : price*0.08;


        System.out.println("KDV'siz tutar " + price);
        System.out.println("KDV'li tutar = "+price+kdv);
        System.out.println("KDV tutarı = " + kdv);
    }
}
