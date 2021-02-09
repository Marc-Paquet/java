package module3;

public class M3B4 {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int bonneReponses = 0;

        System.out.println("Entrainement aux multiplications. Combien d'exercices souhaitez-vous effectuer ?");
        int nbExercices = scanner.nextInt();
        if(nbExercices < 1){
            System.out.println("Vous ne souhaitez pas vous entrainer? Au revoir!");
            return;
        }

        for (int compteur = 0; compteur < nbExercices; compteur++) {
            if(resultatUneMultiplication()){
                bonneReponses++;
            }
        }

        System.out.println("Voici la moyenne : " + 100 * ((double) bonneReponses / nbExercices) + "%");
    }

    private static boolean resultatUneMultiplication(){
        int premierNombre, secondNombre, reponseCorrecte, reponseEleve;

        System.out.println ("Voici un exercice :");
        premierNombre   = unEntierAuHasardEntre (0, 10);
        secondNombre    = unEntierAuHasardEntre (0, 10);
        reponseCorrecte = premierNombre * secondNombre;
        System.out.println ("Calcule: " + premierNombre + "x" + secondNombre + "=");
        reponseEleve = scanner.nextInt();

        if (reponseEleve == reponseCorrecte) {
            System.out.println("Tres bien");
            return true;
        } else {
            System.out.println("Non, c'etait : " + reponseCorrecte);
            return false;
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
