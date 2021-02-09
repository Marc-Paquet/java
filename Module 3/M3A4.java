package module3;

public class M3A4 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sommeResultats = 0;

        System.out.println("Entrez les 5 cotes : ");

        for(int i = 0; i < 5; i++){
            double cote = scanner.nextDouble();
            if(cote > max){
                max = cote;
            }
            if(cote < min){
                min = cote;
            }
            sommeResultats += cote;
        }

        System.out.println("Votre meilleure cote est : " + max);
        System.out.println("En revanche, votre pire résultat est : " + min);
        System.out.println("La moyenne de tous vos points vaut : " + sommeResultats/5);
    }
}
