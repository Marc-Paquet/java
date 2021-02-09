package module9.magasin;

import java.util.Objects;

public class Dvd implements Produit {
    private String reference;
    private String titre;
    private String realisateur;
    private double prix;

    public Dvd(String reference, String titre, String realisateur, double prix) {
        this.reference = reference;
        this.titre = titre;
        this.realisateur = realisateur;
        this.prix = prix;
    }

    public String getReference() {
        return reference;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dvd dvd = (Dvd) o;
        return Double.compare(dvd.prix, prix) == 0 && Objects.equals(reference, dvd.reference) && Objects.equals(titre, dvd.titre) && Objects.equals(realisateur, dvd.realisateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, titre, realisateur, prix);
    }
}
