
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mihin asti?");
        int luku = 0;
        int mihin = Integer.valueOf(lukija.nextLine());
        int summa = 0;
        while (luku <= mihin) {
            summa = summa + luku;
            luku++;
            
        }
        System.out.println("Summa on " + summa);

    }
}
