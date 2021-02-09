package module3;

import java.util.Scanner;

public class M3C3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        int nbParticipantsQualifies = 0;

        System.out.println("Combien de participants y a-t-il?");
        int nbParticipants = scanner.nextInt();

        for(int i = 0; i < nbParticipants; i++){
            System.out.println("--- Participant n°" + (i + 1) + " ---");
            if(participantEstQualifie()){
                nbParticipantsQualifies++;
            }
        }
        System.out.println("Fin du programme. " + nbParticipantsQualifies + " participants se sont qualifiés.");
    }

    private static boolean participantEstQualifie() {
        final int NB_JUGES = 5;
        final int SEUIL_REUSSITE = 8;
        int sommeCotes = 0;
        int cotePlusBasse = Integer.MAX_VALUE;
        int cotePlusElevee = Integer.MIN_VALUE;

        for(int i = 0; i < NB_JUGES; i++){
            System.out.println("Quelle cote lui a attribué le juge n°" + (i + 1) + "?");
            int cote = scanner.nextInt();

            sommeCotes += cote;

            if(cote < cotePlusBasse){
                cotePlusBasse = cote;
            }

            if(cote > cotePlusElevee){
                cotePlusElevee = cote;
            }
        }

        sommeCotes -= cotePlusBasse + cotePlusElevee;
        double moyenne = (double) sommeCotes / (NB_JUGES - 2);
        System.out.println("Le participant obtient donc une moyenne de " + moyenne);
        return moyenne >= SEUIL_REUSSITE;
    }
}
