package module3;

public class M3C2 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        double sommeDesMoyennes = 0;
        double moyennePlusBasse = Double.MAX_VALUE;
        double moyennePlusElevee = Double.MIN_VALUE;

        System.out.println("Entrez le nombre d'étudiants : ");
        int nbEtudiants = scanner.nextInt();
        System.out.println("Combien de cotes ont-ils ?");
        int nbCotes = scanner.nextInt();

        for(int i = 0; i < nbEtudiants; i++){
            System.out.println("Etudiant n°" + (i + 1));
            double moyenneEtudiant = moyenneUnEtudiant(nbCotes);

            sommeDesMoyennes += moyenneEtudiant;

            if(moyenneEtudiant < moyennePlusBasse){
                moyennePlusBasse = moyenneEtudiant;
            }

            if(moyenneEtudiant > moyennePlusElevee){
                moyennePlusElevee = moyenneEtudiant;
            }
        }
        System.out.println("******* Fin du programme *******");
        System.out.println("Le moyenne de la classe est de : " + sommeDesMoyennes / nbEtudiants);
        System.out.println("Le moyenne la plus basse est de : " + moyennePlusBasse);
        System.out.println("Le moyenne la plus élevée est de : " + moyennePlusElevee);
    }

    /**
     * lit les cotes, calcule et renvoie la moyenne d'un étudiant
     * @return le resultat du concurrent
     */
    private static double moyenneUnEtudiant(int nbCotes) {
        double sommeDesCotes = 0;
        for(int i = 0; i < nbCotes; i++){
            System.out.println("Entrez une cote : ");
            sommeDesCotes += scanner.nextDouble();
        }

        double moyenneEleve = sommeDesCotes / nbCotes;
        System.out.println("Le moyenne de l'élève est de : " + moyenneEleve);

        return moyenneEleve;
    }
}
