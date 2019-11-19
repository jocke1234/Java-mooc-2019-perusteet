
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lkm = 0;
        int summa = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            summa = summa + luku;
            if (luku == 0) {
                break;
            }
            lkm++;
            
        }
        System.out.println("Lukujen keskiarvo " + ((double)summa / lkm));
    }
}
