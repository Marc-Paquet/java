package module9.magasin;

import java.util.Objects;

public class Cd implements Produit {

    private String reference;
    private String titre;
    private String artiste;
    private int nbTitre;
    private double prix;

    public Cd(String reference, String titre, String artiste, int nbTitre, double prix) {
        this.reference = reference;
        this.titre = titre;
        this.artiste = artiste;
        this.nbTitre = nbTitre;
        this.prix = prix;
    }

    public String getReference() {
        return reference;
    }

    public String getTitre() {
        return titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public int getNbTitre() {
        return nbTitre;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cd cd = (Cd) o;
        return nbTitre == cd.nbTitre && Double.compare(cd.prix, prix) == 0 && Objects.equals(reference, cd.reference) && Objects.equals(titre, cd.titre) && Objects.equals(artiste, cd.artiste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, titre, artiste, nbTitre, prix);
    }
}
