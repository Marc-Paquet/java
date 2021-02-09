public class M1C3 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entrez un premier nombre : ");
        int premierNombre = scanner.nextInt();
        System.out.println("Entrez le second : ");
        int secondNombre = scanner.nextInt();

        if (premierNombre > secondNombre) {
            System.out.println("Le plus grand des deux est : " + premierNombre);
        } else {
            System.out.println("Le plus grand des deux est : " + secondNombre);
        }
    }
}
