import java.util.Scanner;

public class exercici03 {
    public static String primersIDarrers(String cadena) {

        if (cadena.length() < 2) {
            return "";
        }
        return cadena.substring(0, 2) +
                cadena.substring(cadena.length() - 2);
    }
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.print("Escriu una cadena de text: ");
        String cadena = teclat.nextLine();

        System.out.println("Resultat: '" + primersIDarrers(cadena) + "'");

    }
}