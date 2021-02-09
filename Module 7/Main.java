package magasinChaussures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Magasin magasin;

    public static void main(String[] args) {
        int choix = 0;
        Chaussure nike44 = new Chaussure("Nike Air", 75.99, 44);
        Chaussure nike43 = new Chaussure("Nike Air", 75.99, 43);
        Chaussure nike42 = new Chaussure("Nike Air", 75.99, 42);

        Chaussure[] chaussures = {nike42, nike43, nike44};
        magasin = new Magasin(chaussures, 3);

        System.out.println("Bienvenue dans le programme de magasin de chaussures");

        do {
            System.out.println("\n*******************************************");
            System.out.println("Tapez 1 : Ajouter une chaussure");
            System.out.println("Tapez 2 : Accueillir un client");
            System.out.println("Tapez 3 : Consulter le montant des ventes");
            System.out.println("Tapez 4 : Terminer le programme");

            try {
                choix = scanner.nextInt();
                switch (choix) {
                    case 1:
                        ajouterChaussure();
                        break;
                    case 2:
                        accueillirClient();
                        break;
                    case 3:
                        consulterVentes();
                        break;
                    case 4:
                        terminerProgramme();
                        break;
                    default:
                        System.out.println("Entrée incorrecte, tapez 1, 2, 3 ou 4!");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Entrée incorrecte, tapez 1, 2, 3 ou 4!");
                scanner = new Scanner(System.in);
            }

        } while(choix != 4);
    }

    private static void ajouterChaussure() {
        System.out.println("Entrez un nom de chaussure : ");
        String nom = scanner.next();
        System.out.println("Son prix :");
        double prix = scanner.nextDouble();
        System.out.println("Et enfin, sa pointure : ");
        double pointure = scanner.nextDouble();
        Chaussure chaussure = new Chaussure(nom, prix, pointure);
        magasin.ajoutChaussure(chaussure);
        System.out.println("La chaussure a été ajoutée.");
        System.out.println("Il y a désormais " + magasin.getNbChaussures() + " chaussure(s) dans le magasin.");
    }

    private static void accueillirClient() {
        System.out.println("Entrez le nom du client :");
        String nom = scanner.next();
        System.out.println("Sa pointure :");
        double pointure = scanner.nextDouble();
        System.out.println("Et enfin, son budget : ");
        double budget = scanner.nextDouble();
        Client client = new Client(nom, pointure, budget);

        try {
            Chaussure chaussure = magasin.vendreChaussure(client);
            System.out.println("La chaussure qui a été vendue à " + client.getNom() + " est une " + chaussure.getNom() + " et coûte " + chaussure.getPrix() + "€");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void consulterVentes() {
        System.out.println("Le montant des ventes s'élève à " + magasin.getMontantVentes() + "€");
    }

    private static void terminerProgramme() {
        System.out.println("Vous avez vendu pour " + magasin.getMontantVentes() + "€ aujourd'hui! A demain");
    }
}
