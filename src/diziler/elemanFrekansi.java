package diziler;

import java.util.Arrays;

public class elemanFrekansi {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] times = new int [numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            times[i] = 1;
        }

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                if ((i != j) && (numbers[i] == numbers[j])){
                    times[i]++;
                }
            }
        }

        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < numbers.length; j++){
                if ((i != j) && (numbers[i] == numbers[j])){
                    times[j]++;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (times[i] > 1) {
                if (numbers[i] != 0)
                    System.out.println(numbers[i] + " sayisi " + times[i ]+ " kere tekrar edildi. ");
            }
        }
    }
}
