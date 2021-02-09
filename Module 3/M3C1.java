package module3;

public class M3C1 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        final int NB_ELEVES = 5;
        double sommeDesMoyennes = 0;
        for(int i = 0; i < NB_ELEVES; i++){
            System.out.println("Eleve n°" + (i + 1));
            sommeDesMoyennes += moyenneUnEtudiant();
        }
        System.out.println("Le moyenne de la classe est de : " + sommeDesMoyennes / NB_ELEVES);
    }

    /**
     * lit les cotes, calcule et renvoie la moyenne d'un étudiant
     * @return le resultat du concurrent
     */
    private static double moyenneUnEtudiant() {
        final int NB_COTES = 3;
        double sommeDesCotes = 0;
        for(int i = 0; i < NB_COTES; i++){
            System.out.println("Entrez une cote : ");
            sommeDesCotes += scanner.nextDouble();
        }

        double moyenneEleve = sommeDesCotes / NB_COTES;
        System.out.println("Le moyenne de l'élève est de : " + moyenneEleve);

        return moyenneEleve;
    }
}
