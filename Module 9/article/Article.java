package module9.article;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Objects;

public class Article {

    private String reference;
    private String nom;
    private String description;
    private double prixHTVA;
    private double tauxTVA;

    public Article(String reference, String nom, String description, double prixHTVA, double tauxTVA) {
        if(reference == null || reference.isEmpty()) {
            throw new IllegalArgumentException("La référence ne peut pas être vide");
        }
        if(nom == null || nom.isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide");
        }
        if(tauxTVA < 0 || tauxTVA > 100) {
            throw new IllegalArgumentException("Le taux de tva est invalide");
        }
        if(prixHTVA < 0) {
            throw new IllegalArgumentException("Le prix HTVA est invalide");
        }
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHTVA = prixHTVA;
        this.tauxTVA = tauxTVA;
    }

    public Article(String reference, String nom, String description, double prixHTVA) {
        if(reference == null || reference.isEmpty()) {
            throw new IllegalArgumentException("La référence ne peut pas être vide");
        }
        if(nom == null || nom.isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide");
        }
        if(prixHTVA < 0) {
            throw new IllegalArgumentException("Le prix HTVA est invalide");
        }
        this.reference = reference;
        this.nom = nom;
        this.description = description;
        this.prixHTVA = prixHTVA;
        this.tauxTVA = 0.21;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getPrixHTVA() {
        return prixHTVA;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrixHTVA(double prixHTVA) {
        if(prixHTVA < 0) {
            throw new IllegalArgumentException("Le prix HTVA est invalide");
        }
        this.prixHTVA = prixHTVA;
    }

    public void setTauxTVA(double tauxTVA) {
        if(tauxTVA < 0 || tauxTVA > 100) {
            throw new IllegalArgumentException("Le taux de tva est invalide");
        }
        this.tauxTVA = tauxTVA;
    }

    @Override
    public String toString() {
        return "[" + this.reference + "] " + this.nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Double.compare(article.prixHTVA, prixHTVA) == 0 && Double.compare(article.tauxTVA, tauxTVA) == 0 && Objects.equals(reference, article.reference) && Objects.equals(nom, article.nom) && Objects.equals(description, article.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, nom, description, prixHTVA, tauxTVA);
    }

    public double calculerPrix() {
        return this.prixHTVA + (this.prixHTVA * this.tauxTVA);
    }

    public double calculerPrix(int reduction) {
        if(reduction < 0 || reduction > 100) {
            throw new IllegalArgumentException("La réduction est invalide");
        }
        double prixBase = calculerPrix();
        return prixBase - (prixBase * reduction / 100);
    }
}
