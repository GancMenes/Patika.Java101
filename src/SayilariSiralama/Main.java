package SayilariSiralama;

import java.util.Scanner;

/**
 * Girilen 3 sayıyı sırala
 */

public class Main {
    public static void main(String[] args) {
        int x ,y ,z ;
        int enBuyuk;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        x  = scanner.nextInt();
        System.out.println("Enter y");
        y = scanner.nextInt();
        System.out.println("Enter z");
        z = scanner.nextInt();

        enBuyuk = z;

        if (x > y && x > z) {
            if (y > z) {
                System.out.println("x > y > z");
            } else {
                System.out.println("x > z > y");
            }

        }else if( y > x && y > z){
                if (x > z){
                    System.out.println("y > x > z");
                }else {
                    System.out.println("y > z > x");
                }
            }
        else {
            if (x < y) {
                System.out.println("z > y > x");
                }
            else {
                System.out.println("z > x > y");
            }
        }
    }
}

