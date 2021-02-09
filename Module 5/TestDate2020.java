package module5;


public class TestDate2020 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String args[]){

        int choix;
        System.out.println("Exercices d'algorithmique");
        System.out.println("***************************************");
        System.out.println("Programme Test pour la classe Date2020 ");
        System.out.println("***************************************");
        System.out.println();

        do{
            System.out.println("1 -> Tester le constructeur Date2020(int jour, int mois)");
            System.out.println("2 -> Tester le constructeur Date2020(int numeroJour))");
            System.out.println("3 -> Tester la methode estValide())");
            System.out.println("Autre -> Quitter");
            System.out.println();
            System.out.println("Entrez votre choix :");
            choix=scanner.nextInt();
            switch(choix){
                case 1: testConstructeur1(); break;
                case 2: testConstructeur2(); break;
                case 3: testEstValide(); break;
            }
        }while(choix>=1&&choix<=3);
        System.out.println("Merci pour votre visite.");
    }

    private static void testConstructeur1(){
        Date2020 date = new Date2020(1,1);
        if(date.getNumeroJour()!=1){
            System.out.println("Attention! Le numero de jour pour la date 1/1 est 1");
            System.out.println("Votre methode donne "+ date.getNumeroJour());
            return;
        }
        date=new Date2020(31,1);
        if(date.getNumeroJour()!=31){
            System.out.println("Attention! Le numero de jour pour la date 31/1 est 31");
            System.out.println("Votre methode donne "+ date.getNumeroJour());
            return;
        }
        date=new Date2020(1,2);
        if(date.getNumeroJour()!=32){
            System.out.println("Attention! Le numero de jour pour la date 1/2 est 32");
            System.out.println("Votre methode donne "+ date.getNumeroJour());
            return;
        }
        date=new Date2020(1,3);
        if(date.getNumeroJour()!=61){
            System.out.println("Attention! Le numero de jour pour la date 1/3 est 61");
            System.out.println("Votre methode donne "+ date.getNumeroJour());
            return;
        }
        date=new Date2020(31,12);
        if(date.getNumeroJour()!=366){
            System.out.println("Attention! Le numero de jour pour la date 31/12 est 366");
            System.out.println("Votre methode donne "+ date.getNumeroJour());
            return;
        }
        try{
            date = new Date2020(1,13);
            System.out.println("Attention, la date 1/13 n'est pas valide, il fallait lancer une exception!");
            System.out.println("Avez-vous completé la methode estValide()?");
            return;
        }catch (IllegalArgumentException e){

        }
        System.out.println("Tous les tests ont reussi!");
    }

    private static void testConstructeur2(){

        Date2020 date=new Date2020(1);
        if(date.getJour()!=1||date.getMois()!=1){
            System.out.println("Attention! Le numero de jour 1 correspond a la date 1/1");
            System.out.println("Votre methode donne "+ date);
            return;
        }
        date=new Date2020(31);
        if(date.getJour()!=31||date.getMois()!=1){
            System.out.println("Attention! Le numero de jour 31 correspond a la date 31/1");
            System.out.println("Votre methode donne "+ date);
            return;
        }
        date=new Date2020(32);
        if(date.getJour()!=1||date.getMois()!=2){
            System.out.println("Attention! Le numero de jour 32 correspond a la date 1/2");
            System.out.println("Votre methode donne "+ date);
            return;
        }
        date=new Date2020(61);
        if(date.getJour()!=1||date.getMois()!=3){
            System.out.println("Attention! Le numero de jour 61 correspond a la date 1/3");
            System.out.println("Votre methode donne "+ date);
            return;
        }
        date=new Date2020(366);
        if(date.getJour()!=31||date.getMois()!=12){
            System.out.println("Attention! Le numero de jour 366 correspond a date 31/12");
            System.out.println("Votre methode donne "+ date);
            return;
        }

        try{
            date = new Date2020(367);
            System.out.println("Attention, le numero de jour 366 n'est pas valide, il fallait lancer une exception!");
            return;
        }catch (IllegalArgumentException e){

        }

        System.out.println("Tous les tests ont reussi!");
    }

    private static void testEstValide(){
        if(Date2020.estValide(0,12)){
            System.out.println("Attention, le 0/12 n'est pas une date valide!");
            return;
        }
        if(Date2020.estValide(1,0)){
            System.out.println("Attention, le 1/0 n'est pas une date valide!");
            return;
        }
        if(Date2020.estValide(1,13)){
            System.out.println("Attention, le 1/13 n'est pas une date valide!");
            return;
        }
        if(Date2020.estValide(32,12)){
            System.out.println("Attention, le 32/12 n'est pas une date valide!");
            return;
        }
        if(!Date2020.estValide(29,2)){
            System.out.println("Attention, le 29/2 est une date valide!");
            return;
        }
        if(Date2020.estValide(31,4)){
            System.out.println("Attention, le 31/4 n'est pas une date valide!");
            return;
        }
        if(Date2020.estValide(-1,1)){
            System.out.println("Attention, le -1/1 n'est pas une date valide!");
            return;
        }
        if(Date2020.estValide(30,2)){
            System.out.println("Attention, le 30/2 n'est pas une date valide!");
            return;
        }
        if(!Date2020.estValide(30,12)){
            System.out.println("Attention, le 30/12 est une date valide!");
            return;
        }
        if(!Date2020.estValide(31,12)){
            System.out.println("Attention, le 31/12 est une date valide!");
            return;
        }
        if(!Date2020.estValide(1,1)){
            System.out.println("Attention, le 1/1 est une date valide!");
            return;
        }
        if(!Date2020.estValide(31,7)){
            System.out.println("Attention, le 31/7 est une date valide!");
            return;
        }
        System.out.println("Tous les tests ont reussi!");
    }

}
