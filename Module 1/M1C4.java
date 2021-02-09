public class M1C4 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entrez un premier nombre : ");
        int premierNombre = scanner.nextInt();
        System.out.println("Entrez le second : ");
        int secondNombre = scanner.nextInt();
        System.out.println("Entrez le troisième : ");
        int troisiemeNombre = scanner.nextInt();

        //Pas idéal mais fonctionne
        if (premierNombre > secondNombre && premierNombre > troisiemeNombre) {
            System.out.println("Le plus grand des trois est : " + premierNombre);
        }

        if (secondNombre > premierNombre && secondNombre > troisiemeNombre) {
            System.out.println("Le plus grand des trois est : " + secondNombre);
        }

        if (troisiemeNombre > premierNombre && troisiemeNombre > secondNombre) {
            System.out.println("Le plus grand des trois est : " + troisiemeNombre);
        }

        // Mieux mais concerne des notions théoriques des 5ème slides
        if(premierNombre > secondNombre) {
            if(premierNombre > troisiemeNombre) {
                System.out.println("Le plus grand des trois est : " + premierNombre);
            } else {
                System.out.println("Le plus grand des trois est : " + troisiemeNombre);
            }
        } else if (secondNombre > troisiemeNombre) {
            System.out.println("Le plus grand des trois est : " + secondNombre);
        } else {
            System.out.println("Le plus grand des trois est : " + troisiemeNombre);
        }
    }
}
