
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int positiivisialukuja = 0;
        int summa = 0;
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                if (positiivisialukuja == 0) {
                    System.out.println("keskiarvon laskeminen ei ole mahdollista");
                }
                System.out.println((double) summa / positiivisialukuja);
                break;
            }
            if (luku > 0) {
                summa = summa + luku;
                positiivisialukuja++;
            }
        }

    }
}
