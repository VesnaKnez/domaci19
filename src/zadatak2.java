
/*Napisati program koji od korisnika traži unos sekundi, a kao rezultat obrade štampa
koliko je to sati, minuta i sekundi u formatu (sati:minuti:sekunde).
Primeri ispisa u konzoli:
Molimo Vas unesite trajanje u sekundama
56428
Trajanje (sati:minuti:sekunde): 15hrs:40min:28sec
 */

import java.util.Scanner;

        public class zadatak2 {
            public static void main(String[] args) {
                Scanner inport = new Scanner(System.in);
                System.out.println("Unesite broj sekundi:");
                int broj = inport.nextInt();


                int sat = 0;
                int min = 0;
                int sek = 0;

                if (broj >0) {
                sat= broj /  3600 ;
                min = (broj % 3600) / 60;
                sek = broj % 60;



                System.out.print(sat + "hrs:" + min + "min:" + sek + "sec");


            }
        }
    }

