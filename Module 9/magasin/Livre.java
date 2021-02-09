package module9.magasin;

import java.util.Objects;

public class Livre implements Produit {

    private String reference;
    private String titre;
    private String auteur;
    private int nbPage;
    private double prix;

    public Livre(String reference, String titre, String auteur, int nbPage, double prix) {
        this.reference = reference;
        this.titre = titre;
        this.auteur = auteur;
        this.nbPage = nbPage;
        this.prix = prix;
    }

    public String getReference() {
        return reference;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPage() {
        return nbPage;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return nbPage == livre.nbPage && Double.compare(livre.prix, prix) == 0 && Objects.equals(reference, livre.reference) && Objects.equals(titre, livre.titre) && Objects.equals(auteur, livre.auteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, titre, auteur, nbPage, prix);
    }
}
