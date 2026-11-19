public class exercici05 {
    public static String paraulaMesLlarga(String[] paraules) {


        // 1. Si el vector és buit, no hi ha cap paraula per tornar
        if (paraules.length == 0) {
            return "";
        }

        // 2. La primera paraula és la campiona provisional
        String mesLlarga = paraules[0];

        // 3. Recorrem el vector i comparem cada paraula amb la campiona
        for (String paraula : paraules) {
            if (paraula.length() > mesLlarga.length()) {
                mesLlarga = paraula;
            }

        }

        // 4. Tornem la paraula més llarga
        return mesLlarga;
    }
    public static void main(String[] args) {

        // Declarem el vector de paraules
        String[] paraules = {"sol", "ordinador", "web", "java", "programa"};

        // Calculem la paraula més llarga i la seva longitud
        String resultat = paraulaMesLlarga(paraules);
        int longitud = resultat.length();

        // Mostrem el resultat per pantalla
        System.out.println("La paraula més llarga és: " + resultat);
        System.out.println("La seva longitud és: " + longitud);
    }
}