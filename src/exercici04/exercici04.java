public class exercici04 {
    public static String afegirIng(String cadena) {

        if (cadena.length() < 3) {
            return cadena;
        }

        if (cadena.endsWith("ing")) {
            return cadena + "ly";
        }

        return cadena + "ing";
    }
    public static void main(String[] args) {
        System.out.println("abc -> \"" + afegirIng("abc") + "\"");
        System.out.println("string -> \"" + afegirIng("string") + "\"");
        System.out.println("ab -> \"" + afegirIng("ab") + "\"");

    }
}