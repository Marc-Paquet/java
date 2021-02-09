package module3;

public class M3B6 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int score = 0;
        final int BORNE_MIN = 0;
        int borneMax = 10;

        System.out.println("Entrainement aux multiplications. Voici 5 exercices :");
        for (int compteur = 0; compteur < 5; compteur++, borneMax += 10) {
            score += resultatUneMultiplication(BORNE_MIN, borneMax);
        }
        System.out.println("Voici ton score : " + score);
    }

    private static int resultatUneMultiplication(int borneMin, int borneMax){
        int premierNombre = unEntierAuHasardEntre (borneMin, borneMax);
        int secondNombre = unEntierAuHasardEntre (borneMin, borneMax);
        int reponseCorrecte = premierNombre * secondNombre;

        System.out.println ("Voici un exercice :");
        System.out.println ("Calcule: " + premierNombre + "x" + secondNombre + "=");
        int reponseEleve = scanner.nextInt();

        if (reponseEleve == reponseCorrecte) {
            System.out.println("Tres bien");
            return 2;
        } else {
            System.out.println("Allez, réessaye :");
            reponseEleve = scanner.nextInt();

            if (reponseEleve == reponseCorrecte) {
                System.out.println("Tres bien");
                return 1;
            } else {
                System.out.println("Non, c'etait : " + reponseCorrecte);
                System.out.println("Pas de chance!");
                return 0;
            }
        }
    }

    private static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1))
                + valeurMinimale;
        return resultat;
    }
}
