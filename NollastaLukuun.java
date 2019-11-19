
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int laskija = 0;
        int luku = Integer.valueOf(lukija.nextLine());
        while (laskija <= luku){
            System.out.println(laskija);
            laskija++;
        }
            

    }
}
