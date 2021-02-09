package module3;

public class M3A2 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){
        int sommePositifs = 0;
        int sommeNegatifs = 0;

        System.out.println("Entrez 6 nombres : ");

        for(int i = 0; i < 6; i++){
            int input = scanner.nextInt();
            if(input > 0){
                sommePositifs += input;
            }
            else{
                sommeNegatifs += input;
            }
        }

        System.out.println("La somme des nombres positifs vaut : " + sommePositifs);
        System.out.println("La somme des nombres négatifs vaut : " + sommeNegatifs);
    }
}
