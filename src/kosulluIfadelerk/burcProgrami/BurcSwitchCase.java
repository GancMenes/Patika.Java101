package kosulluIfadelerk.burcProgrami;

import java.util.Scanner;

public class BurcSwitchCase {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğdugumuz ay : ");
        month = scanner.nextInt();

        System.out.println("Doğdugunuz gün : ");
        day = scanner.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                        isError = true;
                }
                break;

            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;



            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
                break;


            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
                break;



            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
                break;

            default:
                System.out.println("Hatalı bir ay girdiniz");
        }

        if (isError){
            System.out.println("Hatalı giriş yaptınız");
        }
        else {
            System.out.println("Merhaba, burcunuz : " +burc);
        }
    }
}
