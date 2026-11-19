public class exercici05 {
    public static String paraulaMesLlarga(String[] paraules) {

        if (paraules.length == 0) {
            return "";
        }
        String mesLlarga = paraules[0];

        for (String paraula : paraules) {
            if (paraula.length() > mesLlarga.length()) {
                mesLlarga = paraula;
            }

        }
        return mesLlarga;
    }
    public static void main(String[] args) {

        String[] paraules = {"sol", "ordinador", "web", "java", "programa"};
        String resultat = paraulaMesLlarga(paraules);

    }
}