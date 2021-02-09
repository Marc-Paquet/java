package magasinChaussures;

import java.util.Objects;

public class Chaussure {

    private String nom;
    private double prix;
    private double pointure;

    public Chaussure(String nom, double prix, double pointure) {
        this.nom = nom;
        this.prix = prix;
        this.pointure = pointure;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public double getPointure() {
        return pointure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chaussure chaussure = (Chaussure) o;
        return Double.compare(chaussure.prix, prix) == 0 && Double.compare(chaussure.pointure, pointure) == 0 && Objects.equals(nom, chaussure.nom);
    }
}
