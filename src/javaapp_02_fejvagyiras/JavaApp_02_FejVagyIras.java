package javaapp_02_fejvagyiras;

import java.util.Scanner;
import java.util.Random;

public class JavaApp_02_FejVagyIras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean kilep = false;
        int randomSzam;
        int tippeltSzam;

        while(kilep == false){
            System.out.println("Fej vagy írás játék.\n0 - Fej\n1 - Írás\nTipped:");
            randomSzam = r.nextInt(2);
            System.out.println(randomSzam);
            tippeltSzam = sc.nextInt(); 
            if (tippeltSzam == randomSzam) {
                System.out.println("Gratulálunk!");
                kilep = true;
            }else{
                System.out.println("Sajnos nem sikerült, szeretnéd újra megpróbálni? i/n");
                String s = sc.next();
                if (s == "n") {
                    kilep = true;
                }
            }
        }

    }
    
}
