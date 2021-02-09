package module3;

public class M3A7 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){
        String nomVainqueur = "";
        double meilleurResultat = Double.MIN_VALUE;

        for(int i = 0; i < 4; i++){
            System.out.println("Entrez le nom d'un participant : ");
            String nom = scanner.next();
            System.out.println("Donnez son résultat : ");
            double resultat = scanner.nextDouble();
            if(resultat > meilleurResultat){
                meilleurResultat = resultat;
                nomVainqueur = nom;
            }
        }

        System.out.println("Avec " + meilleurResultat + " points, " + nomVainqueur + " remporte le concours!");
    }
}
