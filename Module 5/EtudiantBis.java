package module5;


public class EtudiantBis {

    private double[] tableCotes;
    private int nbreCotes;
    private int matricule;
    private static int MAX = 20;


    /**
     * constructeur etudiant sans cote
     * @param matricule
     * @throws IllegalArgumentException
     */
    public EtudiantBis(int matricule)throws IllegalArgumentException{
        this.matricule = matricule;
        this.tableCotes = new double[MAX];
        this.nbreCotes = 0;
    }

    // A NE PAS MODIFIER! VA SERVIR POUR LES TESTS
    /**
     * constructeur par recopie
     * ce constructeur leve une exception si la table passee en parametre contient aucune cote
     * @param matricule
     * @param tableARecopier
     * @throws IllegalArgumentException
     */
    public EtudiantBis(int matricule, double[] tableARecopier)throws IllegalArgumentException{
        if(tableARecopier.length == 0)
            throw new IllegalArgumentException("aucune cote");
        if(tableARecopier.length > MAX)
            throw new IllegalArgumentException("plus de 20 cotes");
        this.nbreCotes = tableARecopier.length;
        this.matricule = matricule;
        this.tableCotes = new double[MAX];
        for(int i = 0; i < tableARecopier.length; i++)
            tableCotes[i] = tableARecopier[i];
    }

    public int getNbreCotes() {
        return nbreCotes;
    }

    // A NE PAS MODIFIER! VA SERVIR POUR LES TESTS
    public String toString(){
        String aRenvoyer = "Matricule : "+matricule+"   Cotes : ";
        for(int i = 0; i < nbreCotes; i++)
            aRenvoyer = aRenvoyer + "  " + tableCotes[i];
        return aRenvoyer;
    }

    /**
     * ajoute en fin de table la cote passee en parametre, si la table n'est pas pleine
     * @param cote la cote a ajouter
     * @return true si l'ajout a pu etre fait, false si la table est pleine
     */
    public boolean ajoutCote(double cote){
        if(this.nbreCotes  == MAX) {
            return false;
        }
        this.tableCotes[this.nbreCotes] = cote;
        this.nbreCotes++;
        return true;
    }

    /**
     * calcule la moyenne des cotes
     * @return la moyenne
     */
    public double moyenne(){
        if(this.nbreCotes==0)
            return 0;
        double somme=0;
        for (int i=0; i<this.nbreCotes; i++)
            somme += tableCotes[i];
        return somme/this.nbreCotes;
    }

    /**
     * repere le nombre de cotes < 10
     * @return le nombre de cotes < 10
     */
    public int nombreEchecs(){
        int nbEchecs=0;
        for (int i=0; i<nbreCotes; i++){
            if (tableCotes[i] < 10 )
                nbEchecs++;
        }
        return nbEchecs;
    }

    /**
     * recherche la plus petite cote
     * @return la plus basse cote // -1 si aucune cote
     */
    public double min(){
        if(nbreCotes==0)
            return -1;
        double min = Double.MAX_VALUE;
        for (int i=0; i<nbreCotes; i++){
            if (tableCotes[i]<min)
                min = tableCotes[i];
        }

        return min;
    }

    /**
     * recherche la plus haute cote
     * @return la plus haute cote // -1 si pas de cote
     */
    public double max(){
        if(nbreCotes==0)
            return -1;
        double max = Double.MIN_VALUE;
        for (int i=0; i<nbreCotes; i++){
            if (tableCotes[i]>max)
                max = tableCotes[i];
        }
        return max;
    }

    /**
     * verifie si l'etudiant a reussi de plein droit
     * un etudiant a reussi de plein droit s'il n'a aucun echec
     * @return true si l'etudiant a reussi de plein droit, false sinon
     */
    public boolean aReussiDePleinDroit(){
        return this.nombreEchecs()==0;
    }

}
