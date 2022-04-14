package donguler.atmProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int choice;

        while (right>0){

            System.out.print("Enter your userName : ");
            userName = scanner.nextLine();
            System.out.print("Enter your password : ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz");
                do {
                    System.out.print("Lütfen yapmak istediginiz işlemi seçiniz : \n");
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    choice = scanner.nextInt();

                    switch (choice){
                        case 1:
                            System.out.print("Girmek istediginiz miktarı seciniz : ");
                            int money = scanner.nextInt();
                            balance += money;
                            break;

                        case 2:

                            System.out.print("Çekmek istediginiz miktarı seçiniz : ");
                            int money1 = scanner.nextInt();
                            if (money1 > balance){
                                System.out.println("Insufficient funds");
                            }else {
                                balance -= money1;
                                break;
                            }
                        case 3 :
                            System.out.print("Bakiyeniz : " + balance + "\n");
                            break;
                    }

                }while(choice != 4);
                System.out.println("Tekrar görüşmek üzere");
                    break;

            } else {

                --right;
                System.out.println("Hatalı giriş yaptınız ");

                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur");
                }else{
                System.out.println("Kalan hakkınız " + right);
                }
            }
        }
    }
}
