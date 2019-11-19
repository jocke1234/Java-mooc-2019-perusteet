
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.");
        System.out.println("Minkä niminen tarinassa esiintyvä hahmo on?");
        String Nimi = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String Ammatti = lukija.nextLine();
        System.out.println("Tässä tarina: ");
        System.out.println("Olipa kerran " + Nimi + ", joka oli ammatiltaan " + Ammatti 
        + ".\n" + "Matkatessaan töihin, " + Nimi + " mietti arkeaan. Kun työnä\n" 
        + "on " + Ammatti + ", tekemistä riittää välillä hyvin paljon ja\n" 
        + "välillä ei lainkaan. Ehkäpä " + Nimi + " ei olekaan koko\n elämäänsä "
        + Ammatti + ".");
    }
}
