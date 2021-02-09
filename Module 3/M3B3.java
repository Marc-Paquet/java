package module3;

public class M3B3 {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int score = 0;

        System.out.println("Entrainement aux multiplications. Voici 5 exercices :");
        for (int compteur = 0; compteur < 5; compteur++) {
            score += resultatUneMultiplication();
        }
        System.out.println("Voici ton score : " + score);
    }

    private static int resultatUneMultiplication(){

        int premierNombre, secondNombre, reponseCorrecte, reponseEleve;

        System.out.println ("Voici un exercice :");
        premierNombre   = unEntierAuHasardEntre (5, 10);
        secondNombre    = unEntierAuHasardEntre (11, 19);
        reponseCorrecte = premierNombre * secondNombre;
        System.out.println ("Calcule: " + premierNombre + "x" + secondNombre + "=");
        reponseEleve = scanner.nextInt();

        if (reponseEleve == reponseCorrecte) {
            System.out.println("Tres bien");
            return 2;
        }
		
		System.out.println("Non, c'etait : " + reponseCorrecte);
		System.out.println("Un plus facile cette fois!");
		premierNombre   = unEntierAuHasardEntre (1, 6);
		secondNombre    = unEntierAuHasardEntre (3, 10);
		reponseCorrecte = premierNombre * secondNombre;
		System.out.println ("Calcule: " + premierNombre + "x" + secondNombre + "=");
		reponseEleve = scanner.nextInt();

		if (reponseEleve == reponseCorrecte) {
			System.out.println("Tres bien");
			return 1;
		}
		
		System.out.println("Non, c'etait : " + reponseCorrecte);
		System.out.println("Pas de chance!");
		return -2;
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
