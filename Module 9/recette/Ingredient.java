package module9.recette;


import static module9.recette.Util.checkString;

public class Ingredient {
    private final String nom;

    public Ingredient(String nom) {
        checkString(nom);
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString(){
        return nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (! (obj instanceof Ingredient))
            return false;
        Ingredient ingredient = (Ingredient) obj;
        return this.nom.equals(ingredient.nom);
    }

    @Override
    public int hashCode() {
        return this.nom.hashCode();
    }
}

