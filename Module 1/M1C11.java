public class M1C11 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        double prixPremiereSection = 1;
        double prixSectionsPeuCheres = 0.5;

        System.out.println("Bienvenue sur l'autoroute!");
        System.out.println("A quelle section êtes-vous entré ?");
        int debut = scanner.nextInt();
        System.out.println("Et à quelle section avez-vous quitté l'autoroute ?");
        int fin = scanner.nextInt();

        int nbSectionParcourues = fin - debut;
        int nbSectionsPeuCheres = nbSectionParcourues - 1;

        double prixTotal = prixPremiereSection + (nbSectionsPeuCheres * prixSectionsPeuCheres);

        System.out.println("Vous devez donc payer " + prixTotal + "€");
    }
}
