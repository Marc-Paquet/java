package module5;


public class Etudiant{

    private double[] tableCotes;
    private int matricule;

    // A NE PAS MODIFIER! VA SERVIR POUR LES TESTS
    /**
     * constructeur par recopie
     * ce constructeur leve une exception si la table passee en parametre contient aucune cote
     * @param matricule
     * @param tableARecopier
     * @throws IllegalArgumentException
     */
    public Etudiant(int matricule, double[] tableARecopier)throws IllegalArgumentException{
        if(tableARecopier.length == 0)
            throw new IllegalArgumentException("aucune cote");
        this.matricule = matricule;
        this.tableCotes = new double[tableARecopier.length];
        for(int i = 0; i < tableCotes.length; i++)
            tableCotes[i] = tableARecopier[i];
    }

    // A NE PAS MODIFIER! VA SERVIR POUR LES TESTS
    public String toString(){
        String aRenvoyer = "\nMatricule : "+matricule+"\nCotes : ";
        for(int i = 0; i < tableCotes.length; i++)
            aRenvoyer = aRenvoyer + "  " + tableCotes[i];
        return aRenvoyer;
    }


    /**
     * calcule la moyenne des cotes
     * @return la moyenne
     */
    public double moyenne(){
        double sommeCote = 0;
        for(int i = 0; i < tableCotes.length; i++) {
            double cote = tableCotes[i];
            sommeCote += cote;
        }
        return sommeCote / tableCotes.length;
    }

    /**
     * repere le nombre de cotes < 10
     * @return le nombre de cotes < 10
     */
    public int nombreEchecs(){
        int cptEchecs = 0;
        for(int i = 0; i < tableCotes.length; i++) {
            double cote = tableCotes[i];
            if(cote < 10) {
                cptEchecs++;
            }
        }
        return cptEchecs;
    }


    /**
     * recherche la plus petite cote
     * @return la plus basse cote
     */
    public double min(){
        double min = 20;
        for(int i = 0; i < tableCotes.length; i++) {
            double cote = tableCotes[i];
            if(cote < min) {
                min = cote;
            }
        }
        return min;
    }


    /**
     * recherche la plus haute cote
     * @return la plus haute cote
     */
    public double max(){
        double max = 0;
        for(int i = 0; i < tableCotes.length; i++) {
            double cote = tableCotes[i];
            if(cote > max) {
                max = cote;
            }
        }
        return max;
    }


    /**
     * verifie si l'etudiant a reussi de plein droit
     * un etudiant a reussi de plein droit s'il n'a aucun echec
     * @return true si l'etudiant a reussi de plein droit, false sinon
     */
    public boolean aReussiDePleinDroit(){
        for(int i = 0; i < tableCotes.length; i++) {
            double cote = tableCotes[i];
            if(cote < 10) {
                return false;
            }
        }
        return true;
    }

    public boolean aReussi() {
        double moyenne = this.moyenne();
        for(int i = 0; i < tableCotes.length; i++) {
            double cote = tableCotes[i];
            if(cote < 10) {
                if(cote < 7) {
                    return false;
                }
                if(cote < 8 && moyenne < 14) {
                    return false;
                }
                if(cote < 9 && moyenne < 13) {
                    return false;
                }
                if(cote < 10 && moyenne < 12) {
                    return false;
                }
            }
        }
        return true;
    }

}
