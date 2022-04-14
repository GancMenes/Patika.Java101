package hipotenus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=0,y=0;
        double z;

        System.out.println("Enter the side x");
        x = scanner.nextInt();
        System.out.println("Enter the side y");
        y = scanner.nextInt();

        z = (int) Math.sqrt((x*x) + (y*y));

        System.out.println("Hipotenus is : " + z);
    }
}
