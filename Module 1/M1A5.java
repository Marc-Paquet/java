public class M1A5{

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrainement aux multiplications. Voici un exercice :");

        int premierNombre, secondNombre, reponseCorrecte, reponseEleve;

        premierNombre = unEntierAuHasardEntre (0, 10);
        secondNombre = unEntierAuHasardEntre (0, 10);
        reponseCorrecte = premierNombre * secondNombre;
        System.out.println("Calculez : " + premierNombre + " x ... = " + reponseCorrecte);
        reponseEleve = scanner.nextInt();

        if (reponseEleve == secondNombre) {
            System.out.println("Tres bien");
        } else {
            System.out.println("Non, c'etait : " + secondNombre);
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
