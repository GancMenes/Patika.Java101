package HavaSicakliginaGoreEtkinlik;

import java.util.Scanner;

/**
 * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
 * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
 * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
 * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the temperature today");
        int heat = scanner.nextInt();

        if (heat < 5){
            System.out.println("You can do snowboard");
        }
        if (heat<25){
            if (heat >= 5 && heat <= 15) {
                System.out.println("You can go to cinema");
            }
             if(heat >= 10 && heat <= 25){
                System.out.println("You can go to picnic");
            }

        }else if(heat>25) {
            System.out.println("You can go swimming");
        }
    }
}
