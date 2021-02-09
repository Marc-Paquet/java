public class M1C7 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrez trois nombres :");
        int premierNombre = scanner.nextInt();
        System.out.println("Entrez le second :");
        int secondNombre = scanner.nextInt();
        System.out.println("Entrez le dernier : ");
        int troisiemeNombre = scanner.nextInt();

        if(premierNombre == secondNombre && secondNombre == troisiemeNombre) {
            System.out.println("Les trois nombres introduits sont égaux");
        } else {
            System.out.println("Les trois nombres introduits ne sont pas tous égaux");
        }
    }
}
