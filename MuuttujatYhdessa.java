
import java.util.Scanner;

public class MuuttujatYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String merkkijono = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double liuku = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean totuus = Boolean.valueOf(lukija.nextLine());
        System.out.println("Syötit merkkijonon " + merkkijono
        + "\nSyötit kokonaisluvun " + luku
        + "\nSyötit liukuluvun " + liuku
        + "\nSyötit totuusarvon " + totuus);

    }
}
