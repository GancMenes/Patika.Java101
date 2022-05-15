package diziler;

import java.util.Arrays;

public class elemanFrekansi {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        int times = 1;
        int a = 0;
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]!=a) {
                for(int j = 0; j < numbers.length; j++) {

                    if ((i != j) && numbers[j] == numbers[i]) {
                        times++;
                        a=numbers[i];
                    }
                }
                System.out.println(numbers[i] + " sayısı " + times + " kere tekrar edildi.");
            }

        }
    }
}
