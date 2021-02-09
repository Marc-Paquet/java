public class M1C5 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entrez deux nombres à trier : ");
        int premierNombre = scanner.nextInt();
        System.out.println("Et le second : ");
        int secondNombre = scanner.nextInt();
        System.out.println("Voici l'ordre : ");

        if(premierNombre < secondNombre) {
            System.out.println(premierNombre + " -> " + secondNombre);
        } else {
            System.out.println(secondNombre + " -> " + premierNombre);
        }
    }
}
