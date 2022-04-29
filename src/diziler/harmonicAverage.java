package diziler;

public class harmonicAverage {
    public static void main(String[] args) {

        int[] numbers  = {10, 20, 30, 40, 50, 60, 70};
        double total = 0;

        for (int i=0; i < numbers.length; i++) {
            total += (1+numbers[i]);
        }

        double average = numbers.length / total;
        System.out.println(average);
    }
}
