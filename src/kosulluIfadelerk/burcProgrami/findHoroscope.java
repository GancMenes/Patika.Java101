package kosulluIfadelerk.burcProgrami;

import java.util.Scanner;

/**
 * Burç bulma program
 */
//( kontrol edilecek ifade ) ? doğru olması durumunda yapılacaklar : yanlış olması durumunda yapılacaklar
public class findHoroscope {
    public static void main(String[] args) {
        int month;
        int day;
        String burc="";
        boolean error = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the your birthday");
        day = scanner.nextInt();
        System.out.println("Enter the your birthmonth");
        month = scanner.nextInt();

        if (month ==1){
            if (day<32 && day>0)
            burc = (day < 22) ? "Oğlak" :
                    (21 < day) ? "Kova" : "Hatalı giriş";
        }

        if (month ==2){
            if (day<32 && day>0)
            burc = (day < 20) ? "Kova" :
                    (20 < day) ? "Balık" : "Hatalı giriş";
        }

        if (month == 3){
            if (day<32 && day>0)
            burc = (day < 21) ? "Balık" :
                    (day >20) ? "Koç" : "Hatalı girişş yaptınız";
        }

        if (month ==4){
            if (day<32 && day>0)
            burc = (day < 21)? "Koç" :
                    (day > 20) ? "Boğa" : "Hatalı giriş yaptınız";
        }

        if (month == 5){
            if (day<32 && day>0)
                burc = (day < 22) ? "Boğa":
                        (day>21) ? "İkizler" : "Hatalı giriş yaptınız";
        }

        if (month == 6){
            if (day<32 && day>0)
            burc = (day < 23) ? "İkizler" :
                    (day> 22) ? "Yengeç" : "Hatalı giriş yaptınız";
        }

        if (month == 7){
            if (day<32 && day>0)
            burc = (day < 23) ? "Yengeç" :
                    (21 < day) ? "Aslan" : "Hatalı giriş yaptınz";
        }

        if (month == 8){
            if (day<32 && day>0)
            burc = (day < 23) ? "Aslan" :
                    (22 < day)? "Başak" : "Hatalı giriş yaptınız";
        }

        if (month == 9){
            if (day<32 && day>0)
            burc = (day < 23) ? "Başak" :
                    (day > 22) ? "Terazi" : "Hatalı giriş yaptınız";
        }

        if (month == 10) {
            if (day<32 && day>0)
            burc = (day < 23) ? "Terazi":
                    (day > 21) ? "Akrep" : "Hatalı giriş yaptınız";
        }

        if (month == 11){
            if (day<32 && day>0)
            burc = (day < 22) ? "Akrep" :
                    (21 < day) ? "Yay" : " Hatalı giriş yaptınız";
        }

        if (month == 12){
            if (day<32 && day>0)
                burc = (day < 22)?  "Yay":
                        (21 < day) ? "Oğlak" : "Hatalı giriş yaptınız";
        }

        System.out.println("Burcunuz : " + burc);
        }
    }
