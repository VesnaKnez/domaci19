import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite dan u godini");
        int dayInYear = input.nextInt();
        if (dayInYear > 0 && dayInYear <= 365) {
            int week = dayInYear / 7;
            if (dayInYear % 7 == 0) {
                System.out.println("Nedelja je " + week);
            }else{
                week++;
                System.out.println("Nedelja je " + week);
            }
        } else {
            System.out.println("Nevalidan dan u godini!");
        }
    }
}
