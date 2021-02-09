public class M1D2 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entrez le prix sans tva : ");
        double prixSansTva = scanner.nextDouble();
        System.out.println("Entrez le taux de tva (p ex 12,5:) ");
        double tauxTva = scanner.nextDouble();
        double prixTva = prixAvecTva(prixSansTva,tauxTva);
        System.out.println("Le prix avec tva : "+ prixTva);
    }

    /**
     * calcule et renvoie le prix avec tva
     * @param prix
     * @param tva
     * @return le prix avec tva
     */
    public static double prixAvecTva(double prix, double tva){
        double prixTVAC = prix + (prix * tva / 100);
        double prixTVACArrondi = Math.round(prixTVAC * 100) / 100.0;
        return prixTVACArrondi;
        // OU
        //return Math.round(prixTVAC * 100) / 100.0;
    }
}
