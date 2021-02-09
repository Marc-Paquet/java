package module5;

public class TestEtudiant{

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String [] args){
        int choix;
        System.out.println("**************************************");
        System.out.println("Programme Test pour la classe Etudiant");
        System.out.println("**************************************");
        do{
            System.out.println();
            System.out.println("1 -> Tester la methode moyenne");
            System.out.println("2 -> Tester la methode nombreEchecs");
            System.out.println("3 -> Tester la methode min");
            System.out.println("4 -> Tester la methode max");
            System.out.println("5 -> Tester la methode aReussiDePleinDroit");
            System.out.println("6 -> Tester la methode aReussi");
            System.out.print("\nEntrez votre choix : ");
            choix=scanner.nextInt();
            switch(choix){
                case 1: verifierMoyenne(); break;
                case 2: verifierNombreEchecs(); break;
                case 3: verifierMin(); break;
                case 4: verifierMax(); break;
                case 5: verifierAReussiDePleinDroit(); break;
                case 6: verifierAReussi(); break;
            }
        }while(choix >=1&&choix<=6);
        System.out.println("Merci pour votre visite.");
    }

    private static void verifierMoyenne(){
        boolean tousReussis = true;
        Etudiant etudiant;
        double moyenne;
        // etudiant avec 4 cotes
        double[] tableTestee = {10,12,14,16};
        etudiant = new Etudiant(1,tableTestee);
        moyenne = etudiant.moyenne();
        if(moyenne != 13){
            System.out.print("\nAttention! Votre methode a trouve la moyenne "+ moyenne);
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        // etudiant avec 5 cotes
        double[] tableTestee2 = {10,12,14,16,18};
        etudiant = new Etudiant(2,tableTestee2);
        moyenne = etudiant.moyenne();
        if(moyenne != 14){
            System.out.print("\nAttention! Votre methode a trouve la moyenne "+ moyenne);
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        if(tousReussis)
            System.out.println("Tous les tests ont reussi.");
    }

    private static void verifierNombreEchecs(){
        boolean tousReussis = true;
        Etudiant etudiant;
        int nombreEchecs;
        // 4 cotes, 0 echec
        double[] tableTestee1 = {10,10,10,10};
        etudiant = new Etudiant(1,tableTestee1);
        nombreEchecs = etudiant.nombreEchecs();
        if(nombreEchecs != 0){
            System.out.print("\nAttention! Votre methode a trouve "+ nombreEchecs +"echec(s)");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        // 3 cotes, 0 echec
        double[] tableTestee2 = {10,10,10};
        etudiant = new Etudiant(2,tableTestee2);
        nombreEchecs = etudiant.nombreEchecs();
        if(nombreEchecs != 0){
            System.out.print("\nAttention! Votre methode a trouve "+ nombreEchecs +"echec(s)");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        // 3 cotes, 1 echec
        double[] tableTestee3 = {9,10,10};
        etudiant = new Etudiant(3,tableTestee3);
        nombreEchecs = etudiant.nombreEchecs();
        if(nombreEchecs != 1){
            System.out.print("\nAttention! Votre methode a trouve "+ nombreEchecs +"echec(s)");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        // 5 cotes, 2 echecs
        double[] tableTestee4 = {10,10,9,10,9};
        etudiant = new Etudiant(4,tableTestee4);
        nombreEchecs = etudiant.nombreEchecs();
        if(nombreEchecs != 2){
            System.out.print("\nAttention! Votre methode a trouve "+ nombreEchecs +"echec(s)");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        if(tousReussis)
            System.out.println("Tous les tests ont reussi.");
    }


    private static void verifierMin(){
        boolean tousReussis = true;
        Etudiant etudiant;
        double min;
        // 3 cotes - min est la premiere
        double[] tableTestee1 = {3,14,6};
        etudiant = new Etudiant(1,tableTestee1);
        min = etudiant.min();
        if(min != 3){
            System.out.print("\nAttention! Votre methode a trouve "+ min +" comme la plus petite cote");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }

        // 5 cotes - min est la derniere
        double[] tableTestee2 = {13,14,16,8,7};
        etudiant = new Etudiant(2,tableTestee2);
        min = etudiant.min();
        if(min != 7){
            System.out.print("\nAttention! Votre methode a trouve "+ min +" comme la plus petite cote");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }

        // 5 cotes - min au mileu
        double[] tableTestee3 = {13,14,6,8,7};
        etudiant = new Etudiant(3,tableTestee3);
        min = etudiant.min();
        if(min != 6){
            System.out.print("\nAttention! Votre methode a trouve "+ min +" comme la plus petite cote");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        if(tousReussis)
            System.out.println("Tous les tests ont reussi.");
    }

    private static void verifierMax(){
        boolean tousReussis = true;
        Etudiant etudiant;
        double max;
        // 3 cotes - max est la premiere
        double[] tableTestee1 = {17,14,6};
        etudiant = new Etudiant(1,tableTestee1);
        max = etudiant.max();
        if(max != 17){
            System.out.print("\nAttention! Votre methode a trouve "+ max +" comme la plus grande cote");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }

        // 5 cotes - max est la derniere
        double[] tableTestee2 = {13,14,16,8,17};
        etudiant = new Etudiant(2,tableTestee2);
        max = etudiant.max();
        if(max != 17){
            System.out.print("\nAttention! Votre methode a trouve "+ max +" comme la plus grande cote");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }

        // 5 cotes - max au mileu
        double[] tableTestee3 = {13,14,16,8,7};
        etudiant = new Etudiant(3,tableTestee3);
        max = etudiant.max();
        if(max != 16){
            System.out.print("\nAttention! Votre methode a trouve "+ max +" comme la plus grande cote");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        if(tousReussis)
            System.out.println("Tous les tests ont reussi.");
    }

    private static void verifierAReussiDePleinDroit(){
        boolean tousReussis = true;
        Etudiant etudiant;
        // 4 cotes, 0 echec
        double[] tableTestee1 = {10,10,10,10};
        etudiant = new Etudiant(1,tableTestee1);
        if(!etudiant.aReussiDePleinDroit()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        // 5 cotes, 1 echec
        double[] tableTestee2 = {10,10,10,10,9};
        etudiant = new Etudiant(2,tableTestee2);
        if(etudiant.aReussiDePleinDroit()){
            System.out.print("\nAttention! Votre methode signale la reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        if(tousReussis)
            System.out.println("Tous les tests ont reussi!");
    }

    private static void verifierAReussi(){
        boolean tousReussis = true;
        Etudiant etudiant;
        double[] cote = {13, 13, 13, 13, 13, 13, 13, 13, 9.5};
        etudiant = new Etudiant(1, cote);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote1 = {13, 13, 13, 13, 13, 13, 13, 13, 9};
        etudiant = new Etudiant(1, cote1);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote2 = {14, 14, 14, 14, 14, 14, 14, 14, 9.5};
        etudiant = new Etudiant(1, cote2);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote3 = {14, 14, 14, 14, 14, 14, 14, 14, 9};
        etudiant = new Etudiant(1, cote3);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote4 = {14, 14, 14, 14, 14, 14, 14, 14, 8};
        etudiant = new Etudiant(1, cote4);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote5 = {14, 14, 14, 14, 14, 14, 14, 14, 8.5};
        etudiant = new Etudiant(1, cote5);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote6 = {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 7};
        etudiant = new Etudiant(1, cote6);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote7 = {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 8};
        etudiant = new Etudiant(1, cote7);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote8 = {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 7.5};
        etudiant = new Etudiant(1, cote8);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote9 = {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 9};
        etudiant = new Etudiant(1, cote9);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote10 = {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 6};
        etudiant = new Etudiant(1, cote10);
        if(etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        double[] cote11 = {15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 12};
        etudiant = new Etudiant(1, cote11);
        if(!etudiant.aReussi()){
            System.out.print("\nAttention! Votre methode signale la non reussite");
            System.out.println(" pour l'etudiant : "+ etudiant.toString());
            tousReussis = false;
        }
        if(tousReussis)
            System.out.println("Tous les tests ont reussi!");
    }
}

