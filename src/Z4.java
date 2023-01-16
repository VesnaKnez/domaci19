import java.util.Scanner;

public class Z4 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Unesite prvi broj");
                int a = input.nextInt();
                System.out.println("Unesite drugi broj");
                int b = input.nextInt();
                System.out.println("Unesite treci broj");
                int c = input.nextInt();

                if (a > 0 && b > 0 && c > 0) {
                    if ((a > b && a < c) || (a > c && a < b)) {
                        System.out.println("A je srednji broj " + a);
                    } else if ((b > a && b < c) || (b > c && b < a)) {
                        System.out.println("B je srednji broj " + b);
                    } else if ((c > a && c < b) || (c > b && c < a)) {
                        System.out.println("C je srednji broj " + c);
                    }
                } else {
                    System.out.println("Negativni brojevi nisu dozvoljeni!");
                }
                input.close();
            }
        }

