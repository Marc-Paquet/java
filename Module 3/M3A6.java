package module3;

public class M3A6 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Entrez un entier : ");
        int entier = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int produit = i * entier;
            System.out.println(i + " x " + entier + " = " + produit);
        }
    }
}
