package kosulluIfadelerk.KullaniciGirisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınız :");
        userName = scanner.nextLine();

        System.out.println("Şifreniz");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("12345")) {
            System.out.println("Giriş yaptınız!");
        } else if (!userName.equals("patika") && password.equals("12345")) {
            System.out.println("Kullanıcı adınızı yanlıs gırdınız");
        } else if (userName.equals("patika") && !password.equals("12345")) {
            System.out.println("Şifreniz yanlış!");
            System.out.println("Şifrenizi sıfırlamak için 'Evet' e basın, tekrar denemek icin 'Hayır' a basın");
            String answer = scanner.nextLine();


            switch (answer) {

                case "Evet" :
                    System.out.println("Yeni şifreyi giriniz");

                    int password2 = scanner.nextInt();

                    if (password.equals(password2)) {
                        System.out.println("Sifreniz eski şifreyle aynı olamaz");
                    } else {
                        System.out.println("Yeni şifrenizi başarıyla girdiniz");
                    }

                    break;

                case "Hayır" :
                    System.out.println("Bilgilerinizi kontrol ediniz");
                    break;
            }
        }
    }
}
