
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = 1;        
        int summa = 1;
        System.out.println("Anna luku:");
        int mihin = Integer.valueOf(lukija.nextLine());
        while (luku <= mihin) {
            summa = summa * luku;
            luku++;
            
        }
        System.out.println("Summa on " + summa);

    }
}
