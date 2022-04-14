package donguler.ebobEkokProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n1 sayısını giriniz");
        int n1 = scanner.nextInt();
        System.out.println("n2 sayısını giriniz");
        int n2 = scanner.nextInt();
        int ebob =1;

        if ( n2 > n1){
            int i=1;
            while (i <= n1){
                if (n2 % i == 0 && n1 % i == 0){
                    ebob = i;
                }
                i++;
            }
        }else {
            int i=1;
            while (i <=n2){
                if (n1 % i == 0 && n2%i ==0){
                    ebob = i;
                }i++;
            }
            System.out.println("Ebob: " +ebob);
        }
        System.out.println("-----------------------");

        //Ekok kısmı

        int j = 1;
        while (j <= (n1*n2)){
            if (j % n1 ==0 && j%n2==0){
                System.out.println("Ekok: "+j);
                break;
            }
            j++;
        }
        System.out.println(n1*n2/ebob);
    }
}
