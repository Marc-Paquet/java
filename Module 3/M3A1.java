package module3;

public class M3A1 {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){
        int somme = 0;

        System.out.println("Entrez 10 nombres : ");

        for(int i = 0; i < 10; i++){
            somme += scanner.nextInt();
        }

        System.out.println("La somme de ces nombres vaut : " + somme);
    }
}
