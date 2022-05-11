package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class elemanSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizilerin boyutu: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i =0; i < n; i++) {
            System.out.println(i+1 +". Elemanı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
