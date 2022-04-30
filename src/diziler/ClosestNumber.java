package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();

        int[] numbers = {2,31,53,6,-45,-76,-354,1243};

        calculateNumber(numbers, number);
    }

    static void calculateNumber(int[] numbers, int number){

        int[] array = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(array);

        int lowest = array[0];
        int highest = array[array.length - 1];

        for (int a:array
             ) {
            if (a < number) {
                lowest = a;
            }
        }

        for (int j = array.length; j >=0; j--) {
            if (array[j] > number){
                highest = array[j];
            }
        }

        System.out.print("Lowest number is : " + lowest);
        System.out.print("Highest number is : " + highest);
    }
}
