import java.util.LinkedHashMap;
import java.util.Map;

public class exercici02 {

    public static void main(String[] args) {

        // 1. Declarem la cadena de mostra
        String cadena = "google.com";

        // 2. Creem el Map que guardarà cada caràcter i la seva freqüència
        Map<Character, Integer> frequencies = new LinkedHashMap<>();

        // 3. Recorrem la cadena caràcter per caràcter
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
    }
}