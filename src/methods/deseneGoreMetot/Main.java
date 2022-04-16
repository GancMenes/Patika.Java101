package methods.deseneGoreMetot;

import java.util.Scanner;

public class Main {
    static void subtract(int num, int temp){
        System.out.print(temp+" ");
        if(temp <= 0)
            add(num, temp+5);
        else
            subtract(num,temp-5);
    }
    static void add(int num, int temp){
        System.out.print(temp+" ");
        if(num == temp)
            return ;
        else{
            add(num, temp+5);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        subtract(num, num);
    }
}