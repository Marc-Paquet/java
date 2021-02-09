package module9.magasin;

import java.util.ArrayList;
import java.util.List;

public class Caddie {

    private List<Produit> produits;

    public Caddie() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    public double calculerPrix() {
        double sommePrix = 0;
        for(Produit produit : produits) {
            sommePrix += produit.getPrix();
        }
        return sommePrix;
    }

    public String toString() {
        String total = "Le caddie contient : ";
        for(Produit produit : produits) {
            if(produit instanceof Cd) {
                total += "\n[CD] " + produit.getTitre();
            } else if(produit instanceof Dvd) {
                total += "\n[DVD] " + produit.getTitre();
            } else {
                total += "\n[Livre] " + produit.getTitre();
            }
        }
        return total;
    }

    public int nbCd(){
        int cpt = 0;
        for(Produit produit : produits) {
            if(produit instanceof Cd) {
                cpt++;
            }
        }
        return cpt;
    }

    public int nbDvd(){
        int cpt = 0;
        for(Produit produit : produits) {
            if(produit instanceof Dvd) {
                cpt++;
            }
        }
        return cpt;
    }

    public int nbLivre(){
        int cpt = 0;
        for(Produit produit : produits) {
            if(produit instanceof Livre) {
                cpt++;
            }
        }
        return cpt;
    }

}
