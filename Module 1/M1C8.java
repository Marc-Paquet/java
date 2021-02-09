public class M1C8 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrez votre année de naissance :");
        int anneeNaissance = scanner.nextInt();
        System.out.println("Entrez l'année civile actuelle :");
        int anneeCivile = scanner.nextInt();

        int age = anneeCivile - anneeNaissance;
        System.out.println("Vous avez donc " + age + " ans!");
    }
}
