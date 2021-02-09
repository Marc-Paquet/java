package magasinChaussures;

public class Magasin {

    private Chaussure[] chaussures;
    private int nbChaussures;
    private double montantVentes;

    public Magasin(Chaussure[] chaussures, int nbChaussures) {
        this.chaussures = chaussures;
        this.nbChaussures = nbChaussures;
        this.montantVentes = 0.0;
    }

    public Chaussure[] getChaussures() {
        return chaussures;
    }

    public int getNbChaussures() {
        return nbChaussures;
    }

    public double getMontantVentes() {
        return montantVentes;
    }

    public void ajoutChaussure(Chaussure chaussure) {
        if(chaussures.length == nbChaussures) {
            Chaussure[] nouveauTab = new Chaussure[chaussures.length * 2];
            for(int i = 0; i < chaussures.length; i++) {
                nouveauTab[i] = chaussures[i];
            }
            chaussures = nouveauTab;
        }
        chaussures[nbChaussures] = chaussure;
        nbChaussures++;
    }

    public Chaussure vendreChaussure(Client client) {
        if(nbChaussures == 0) {
            throw new IllegalArgumentException("Il n'y a plus de chaussure dans le magasin!");
        }
        for(int i = 0; i < nbChaussures; i++) {
            Chaussure chaussure = chaussures[i];
            if(chaussure.getPointure() == client.getPointure() && chaussure.getPrix() <= client.getBudget()) {
                nbChaussures--;
                chaussures[i] = chaussures[nbChaussures];
                chaussures[nbChaussures] = null;
                montantVentes += chaussure.getPrix();
                return chaussure;
            }
        }
        throw new IllegalArgumentException("Nous n'avons pas trouvé de chassure à votre pointure rentrant dans votre budget...");
    }
}
