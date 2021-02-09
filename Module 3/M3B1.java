package module3;

public class M3B1 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entrainement aux multiplications. Voici 5 exercices :");

        for (int compteur = 0; compteur < 5; compteur++) {
            faireUneMultiplication();
        }
    }

    private static void faireUneMultiplication(){
        int premierNombre, secondNombre, reponseCorrecte, reponseEleve, borneMax;

        System.out.println("Entrez la borne max : ");
        borneMax = scanner.nextInt();
        premierNombre = unEntierAuHasardEntre (borneMax);
        secondNombre = unEntierAuHasardEntre (borneMax);

        reponseCorrecte = premierNombre * secondNombre;
        System.out.println ("Calcule: " + premierNombre + "x" + secondNombre + "=");
        reponseEleve = scanner.nextInt();

        if (reponseEleve == reponseCorrecte) {
            System.out.println("Tres bien");
        } else {
            System.out.println("Non, c'etait : " + reponseCorrecte);
        }
    }

    private static int unEntierAuHasardEntre (int valeurMaximale){
        final int VALEUR_MIN = 0;
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - VALEUR_MIN + 1))
                + VALEUR_MIN;
        return resultat;
    }
}
