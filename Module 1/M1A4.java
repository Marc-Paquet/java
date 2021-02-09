public class M1A4 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrainement aux multiplications. Voici un exercice :");

        int premierNombre, secondNombre, reponseCorrecte, reponseEleve, borneMin, borneMax, tmp;

        System.out.println("Entrez la valeur minimale : ");
        borneMin = scanner.nextInt();
        System.out.println("Entrez la valeur maximale : ");
        borneMax = scanner.nextInt();

        if(borneMin > borneMax) {
            tmp = borneMax;
            borneMax = borneMin;
            borneMin = tmp;
        }

        premierNombre = unEntierAuHasardEntre (borneMin, borneMax);
        secondNombre = unEntierAuHasardEntre (borneMin, borneMax);
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
