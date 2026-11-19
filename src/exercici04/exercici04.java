public class exercici04 {
    public static String afegirIng(String cadena) {

        if (cadena.length() < 3) {
            return cadena;
        }

        if (cadena.endsWith("ing")) {
            return cadena + "ly";
        }
    }
}