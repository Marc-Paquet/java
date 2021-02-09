public class M1C10 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calcul du BMI. Entrez votre taille :");
        double taille = scanner.nextDouble();
        System.out.println("Entrez maintenant votre poids : ");
        int poids = scanner.nextInt();

        double bmi = poids / Math.pow(taille, 2);
        System.out.println("Votre BMI est de " + bmi);

        if(bmi < 20) {
            System.out.println("Vous êtes mince");
        }
        if(bmi > 20 && bmi < 25) {
            System.out.println("Votre état est normal");
        }
        if(bmi > 25 && bmi < 30) {
            System.out.println("Vous êtes en embonpoint");
        }
        if(bmi > 30) {
            System.out.println("Vous êtes obèse");
        }
    }
}
