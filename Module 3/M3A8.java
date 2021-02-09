package module3;

public class M3A8 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){
        String nomVainqueur = "";
        int meilleurResultat = Integer.MIN_VALUE;
        boolean exaequo = false;

        for(int i = 0; i < 4; i++){
            System.out.println("Entrez le nom d'un participant : ");
            String nom = scanner.next();
            System.out.println("Donnez son résultat : ");
            int resultat = scanner.nextInt();
            if(resultat > meilleurResultat){
                meilleurResultat = resultat;
                nomVainqueur = nom;
                exaequo = false;
            }
            else if(resultat == meilleurResultat){
                exaequo = true;
            }
        }

        System.out.println("Avec " + meilleurResultat + " points, " + nomVainqueur + " remporte le concours!");
        if(exaequo){
            System.out.println("Attention! Il y a en réalité plusieurs gagnants...");
        }
    }
}
