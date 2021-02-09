package magasinChaussures;

import java.util.Objects;

public class Client {
    private String nom;
    private double pointure;
    private double budget;

    public Client(String nom, double pointure, double budget) {
        this.nom = nom;
        this.pointure = pointure;
        this.budget = budget;
    }

    public String getNom() {
        return nom;
    }

    public double getPointure() {
        return pointure;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Double.compare(client.pointure, pointure) == 0 && Double.compare(client.budget, budget) == 0 && Objects.equals(nom, client.nom);
    }
}
