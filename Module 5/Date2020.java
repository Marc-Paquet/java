package module5;


public class Date2020 {
    private int numeroJour;		// le 1/1/2020 est le jour n°1, c'est un mercredi
    private int jour;
    private int mois;
    private static final int[] tableau1 = {0,31,29,31,30,31,30,31,31,30,31,30,31};
    private static final int[] tableau2 = {0,31,60,91,121,152,182,213,244,274,305,335,366};

    private static String[] nomDesJours ={"","lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"};
    private static String[] nomDesMois = {"","janvier","fevrier","mars","avril","mai","juin","juillet","aout","septembre","octobre","novembre","decembre"};


    public Date2020(int jour, int mois) throws IllegalArgumentException{
        if(!estValide(jour,mois))
            throw new IllegalArgumentException("date non valide");
        this.jour = jour;
        this.mois = mois;

        int numeroDernierJourMoisPrecedent = tableau2[mois - 1];
        this.numeroJour = numeroDernierJourMoisPrecedent + jour;
    }

    public Date2020(int numeroJour)throws IllegalArgumentException{
        if(numeroJour <= 0 || numeroJour > 366)
            throw new IllegalArgumentException("numeroJour non valide");
        this.numeroJour = numeroJour;

        for(int i = 0; i < tableau2.length; i++) {
            if(tableau2[i] >= numeroJour) {
                this.mois = i;
                this.jour = numeroJour - tableau2[i - 1];
                return;
            }
        }
    }

    public int getJour(){
        return jour;
    }

    public int getMois(){
        return mois;
    }

    public int getNumeroJour(){
        return numeroJour;
    }

    public String toString(){
        return ""+jour+"/"+mois+"/Date2020";
    }

    public static boolean estValide(int jour, int mois){
        if(mois < 1 || mois > 12) {
            return false;
        }
        int jourMax = tableau1[mois];
        if(jour < 1 || jour > jourMax) {
            return false;
        }
        return true;
    }

    // renvoie null si la date est en 2021
    public Date2020 leLendemain(){
        if(this.numeroJour == 366)
            return null;
        return new Date2020(numeroJour+1);
    }

    // renvoie null si la date n'est pas en 2020
    public Date2020 datePlusNombreJours(int nombreJours){
        if(this.numeroJour + nombreJours > 366 || this.numeroJour + nombreJours <= 0) {
            return null;
        }

        return new Date2020(numeroJour + nombreJours);
    }

    // la methode compareTo renvoie un negatif si la date courante est anterieure a la date passee en parametre,
    // 0 si la date courante est egale a la date passee en parametre
    // un positif sinon
    public int compareTo(Date2020 autreDate){
        return this.numeroJour - autreDate.numeroJour;
    }


    public int nombreJoursEntre(Date2020 autreDate){
        return Math.abs(autreDate.numeroJour - this.numeroJour);
    }

    public String jourDeLaSemaine(){
        int reste = numeroJour % 7;
        if(reste > 5) {
            return nomDesJours[reste - 5];
        } else {
            return nomDesJours[reste + 2];
        }
    }

    public String dateEnToutesLettres(){
        // A COMPLETER (Ex 1/1/2020 :  mercredi 1 janvier
        int reste = numeroJour % 7;
        if(reste > 5) {
            return nomDesJours[reste - 5] + " " + jour + nomDesMois[mois];
        } else {
            return nomDesJours[reste + 2] + " " + jour + nomDesMois[mois];
        }
//        switch(reste) {
//            case 1:
//                System.out.println("Mecredi " + jour + nomDesMois[mois]);
//                break;
//            case 2:
//                System.out.println("Jeudi " + jour + nomDesMois[mois]);
//                break;
//            case 3:
//                System.out.println("Vendredi " + jour + nomDesMois[mois]);
//                break;
//            case 4:
//                System.out.println("Samedi " + jour + nomDesMois[mois]);
//                break;
//            case 5:
//                System.out.println("Dimanche " + jour + nomDesMois[mois]);
//                break;
//            case 6:
//                System.out.println("Lundi " + jour + nomDesMois[mois]);
//                break;
//            case 7:
//                System.out.println("Mardi " + jour + nomDesMois[mois]);
//                break;
//        }
    }

}
