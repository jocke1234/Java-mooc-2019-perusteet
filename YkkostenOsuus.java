
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lkm = 0;
        int syotetyt = -1;
        int luku;
        while (true) {
            luku = Integer.valueOf(lukija.nextLine());
            syotetyt++;
            if (luku == 0) {
                if (lkm == 0) {
                    System.out.println("ykkösten osuutta ei voida laskea");;
                }
            System.out.println((double)lkm / syotetyt);
            break;
            }
            else if (luku == 1) {
                lkm++;
            }
            
        }

    }
}
