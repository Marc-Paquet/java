public class M1E1 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bonjour, entrez votre moyenne : ");
        double moyenne = scanner.nextDouble();

        if(moyenne < 10) {
            System.out.println("Vous êtes refusé");
        } else {
            if(moyenne < 14) {
                System.out.println("Votre moyenne est satisfaisante");
            } else {
                if(moyenne < 16) {
                    System.out.println("Vous obtenez une distinction");
                } else {
                    System.out.println("Vous obtenez LA GRANDE DISTINCTION! Bravo.");
                }
            }
        }
    }
}
