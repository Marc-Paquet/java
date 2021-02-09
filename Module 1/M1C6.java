public class M1C6 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrez trois nombres :");
        int premierNombre = scanner.nextInt();
        System.out.println("Entrez le second :");
        int secondNombre = scanner.nextInt();
        System.out.println("Entrez le dernier : ");
        int troisiemeNombre = scanner.nextInt();

        if(premierNombre < secondNombre && secondNombre < troisiemeNombre) {
            System.out.println("Vous avez introduit les nombres de manière croisssante");
        } else {
            System.out.println("Les nombres n'ont pas été introduits de manière croissante");
        }
    }
}
