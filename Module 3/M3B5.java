package module3;

public class M3B5 {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int nbPremierEssais = 0;
        int nbSecondEssais = 0;

        System.out.println("Entrainement aux multiplications. Combien d'exercices souhaitez-vous effectuer ?");
        int nbExercices = scanner.nextInt();

        for(int i = 0; i < nbExercices; i++){
            int premierNombre = unEntierAuHasardEntre (0, 10);
            int secondNombre = unEntierAuHasardEntre (0, 10);
            System.out.println ("Voici un exercice :");
            System.out.println ("Calcule: " + premierNombre + "x" + secondNombre + "=");
            if(!resultatUneMultiplication(premierNombre, secondNombre)){
                System.out.println("Allez, tu as un deuxième essai :");
                if(resultatUneMultiplication(premierNombre, secondNombre)){
                    nbSecondEssais++;
                }
                else{
                    System.out.println("La réponse était : " + premierNombre * secondNombre);
                }
            }
            else{
                nbPremierEssais++;
            }
        }

        double pourcentPremierEssai = 100 * ((double) nbPremierEssais / nbExercices);
        double pourcentSecondEssai = 100 * ((double) nbSecondEssais / nbExercices);
        double pourcentEchec = 100 * ((double) (nbExercices - nbPremierEssais - nbSecondEssais) / nbExercices);
        System.out.println("Pourcentage de bonnes réponses au premier essai : " + pourcentPremierEssai + "%");
        System.out.println("Pourcentage de bonnes réponses au second essai : " + pourcentSecondEssai + "%");
        System.out.println("Pourcentage d'echec : " + pourcentEchec + "%");
    }

    private static boolean resultatUneMultiplication(int premierNombre, int secondNombre){
        int reponseCorrecte = premierNombre * secondNombre;
        int reponseEleve = scanner.nextInt();

        if (reponseEleve == reponseCorrecte) {
            System.out.println("Tres bien");
            return true;
        } else {
            System.out.println("Raté!");
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
