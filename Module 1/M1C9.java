public class M1C9 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        double tauxTVA = 1.21;

        System.out.println("Entrez un prix HTVA :");
        double prixHTVA = scanner.nextDouble();

        double prixTVAC = prixHTVA * tauxTVA;
        System.out.println("Le prix TVA comprise est de " + prixTVAC + "€");

        double prixTVACArrondi = Math.round(prixTVAC * 100)/100.0;
        System.out.println("[ARRONDI] Le prix TVA comprise est de " + prixTVACArrondi + "€");
    }
}
