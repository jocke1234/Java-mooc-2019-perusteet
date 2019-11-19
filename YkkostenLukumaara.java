
import java.util.Scanner;

public class YkkostenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lkm = 0;
        while(true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 1) {
                lkm++;
            }
            else if (luku == 0) {
                break;
            }
            
        }
        System.out.println(lkm);

    }
}
