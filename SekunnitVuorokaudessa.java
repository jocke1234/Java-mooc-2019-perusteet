
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int montako = Integer.valueOf(lukija.nextLine());
        int vrk = 24 * 60 * 60;
        System.out.println(montako * vrk);
        

    }
}
