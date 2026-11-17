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

            // 4. Si el caràcter ja hi és, sumem 1; si no, comencem a 0 i sumem 1
            frequencies.put(caracter, frequencies.getOrDefault(caracter, 0) + 1);

            // 5. Mostrem el resultat amb el format de l'enunciat
            StringBuilder resultat = new StringBuilder("{");
            boolean primer = true;
            for (Map.Entry<Character, Integer> entrada : frequencies.entrySet()) {
                if (!primer) {
                    resultat.append(", ");
                }

                resultat.append("'")
                        .append(entrada.getKey())
                        .append("': ")
                        .append(entrada.getValue());

                primer = false;
            }
        }
    }
}