package module3;

public class M3A9 {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String nomPlusJeune = "";
        // Attention, ne pas utiliser Interger.MIN_VALUE comme dans les précédents exos
        // 1990 - -2147483648 == 1990 + 2147483648
        // Sauf que 2147483648 c'est la valeur maximale qu'un entier peut supporter.
        // En y additionnant 1990, on dépasse sa capacité et on obtient un nombre négatif
        // alors qu'on s'attendait à un nombre positif
        int jourPlusJeune = 0;
        int moisPlusJeune = 0;
        int anneePlusJeune = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Entrez le nom d'un participant : ");
            String nomInput = scanner.next();
            System.out.println("Donnez son jour de naissance : ");
            int jourInput = scanner.nextInt();
            System.out.println("Donnez son mois de naissance : ");
            int moisInput = scanner.nextInt();
            System.out.println("Donnez son annee de naissance : ");
            int anneeInput = scanner.nextInt();

            if (compareDate(jourInput, moisInput, anneeInput, jourPlusJeune, moisPlusJeune, anneePlusJeune) > 0) {
                jourPlusJeune = jourInput;
                moisPlusJeune = moisInput;
                anneePlusJeune = anneeInput;
                nomPlusJeune = nomInput;
            }
        }

        System.out.println("Né le " + jourPlusJeune + "/" + moisPlusJeune + "/" + anneePlusJeune + ", " + nomPlusJeune + " est le participant le plus jeune!");
    }

    private static int compareDate(int jourDate1, int moisDate1, int anneeDate1,
                                   int jourDate2, int moisDate2, int anneeDate2) {
        if (anneeDate1 != anneeDate2) {
            return anneeDate1 - anneeDate2;
        }
        if (moisDate1 != moisDate2) {
            return moisDate1 - moisDate2;
        }
        if (jourDate1 != jourDate2) {
            return jourDate1 - jourDate2;
        }
        return 0;
    }
}
