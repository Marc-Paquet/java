package module9.recette;

import static module9.recette.Util.*;

public class IngredientQuantifie {

    private Ingredient ingredient;
    private Unite unite;
    private int quantite;

    public IngredientQuantifie(Ingredient ingredient, Unite unite, int quantite) {
        checkObject(ingredient);
        checkObject(unite);
        checkPositive(quantite);
        this.ingredient = ingredient;
        this.unite = unite;
        this.quantite = quantite;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public Unite getUnite() {
        return unite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setIngredient(Ingredient ingredient) {
        checkObject(ingredient);
        this.ingredient = ingredient;
    }

    public void setUnite(Unite unite) {
        checkObject(unite);
        this.unite = unite;
    }

    public void setQuantite(int quantite) {
        checkPositive(quantite);
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return quantite + " " + unite + " " + ingredient.getNom();
    }
}
