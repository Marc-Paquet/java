package module3;

public class M3A3 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){
        int nbPositifs = 0;
        int nbNegatifs = 0;

        System.out.println("Entrez 6 nombres : ");

        for(int i = 0; i < 6; i++){
            if(scanner.nextInt() > 0){
                nbPositifs++;
            }
            else{
                nbNegatifs++;
            }
        }

        System.out.println("Vous avez entré " + nbPositifs + " nombre(s) positifs");
        System.out.println("Vous avez entré " + nbNegatifs + " nombre(s) négatifs");
    }
}
