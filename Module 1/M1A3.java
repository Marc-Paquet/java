public class M1A3{

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrainement aux multiplications. Voici un exercice :");

        int premierNombre, secondNombre, reponseCorrecte, reponseEleve, borneMax;

        System.out.println("Entrez la valeur maximale : ");
        borneMax = scanner.nextInt();
        premierNombre = unEntierAuHasardEntre (0, borneMax);
        secondNombre = unEntierAuHasardEntre (0, borneMax);
        reponseCorrecte = premierNombre * secondNombre;
        System.out.println("Calculez : " + premierNombre + " x " + secondNombre + " = ");
        reponseEleve = scanner.nextInt();

        if (reponseEleve == reponseCorrecte) {
            System.out.println("Tres bien");
        } else {
            System.out.println("Non, c'etait : " + reponseCorrecte);
        }

    }

    public static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1))
                + valeurMinimale;
        return resultat;
    }
}
