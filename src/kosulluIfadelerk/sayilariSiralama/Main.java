package kosulluIfadelerk.sayilariSiralama;

import java.util.Scanner;

/**
 * Girilen 3 sayıyı sırala
 */

public class Main {
    public static void main(String[] args) {
        int x ,y ,z ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        x  = scanner.nextInt();
        System.out.println("Enter y");
        y = scanner.nextInt();
        System.out.println("Enter z");
        z = scanner.nextInt();

        if (x > y && x > z) {
            if (y > z) {
                System.out.print(x + ">" + y + ">" + z);
            } else {
                System.out.print(x + ">" + z + ">" + y);
            }

        }else if( y > x && y > z){
            if (x > z) {
                System.out.print(y + ">" + x + ">" + z);
            } else {
                System.out.print(y + ">" + z + ">" + x);
            }
            }
        else {
            if (x > y) {
                System.out.print(z + ">" + x + ">" + y);
            } else {
                System.out.print(z + ">" + y + ">" + x);
            }
        }
    }
}

