package module3;

public class M3A5 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){
        double meilleure = Double.MIN_VALUE;
        double secondeMeilleure = Double.MIN_VALUE;

        System.out.println("Entrez 8 cotes : ");

        for(int i = 0; i < 8; i++){
            double input = scanner.nextDouble();
            if(input > meilleure){
                secondeMeilleure = meilleure;
                meilleure = input;
            }
            else if(input > secondeMeilleure){
                secondeMeilleure = input;
            }
        }

        System.out.println("La meilleure cote est : " + meilleure);
        System.out.println("La seconde meilleure cote est : " + secondeMeilleure);
    }
}
