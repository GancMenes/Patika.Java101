package whileDongusu;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        int password;
        Scanner scanner = new Scanner(System.in);
        boolean passwordSuccesfull = true;

        do{
            System.out.print("Şifre Giriniz : ");
            password = scanner.nextInt();

            if (password ==12345){
                System.out.println("Doğru");
                passwordSuccesfull =false;
            }else {
                System.out.println("Yanlış");
            }

        }
        while(passwordSuccesfull);


        /*int left =100,right =200;

        while (++left < --right){

        }
        System.out.println(left);*/
    }
}


