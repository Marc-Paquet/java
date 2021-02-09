package module9.recette;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static module9.recette.Util.*;

public class Plat {

    private String nom;
    private int nbPersonne;
    private Difficulte niveauDeDifficulte;
    private Cout cout;
    private int dureeEnMinutes;

    private List<Instruction> instructions = new ArrayList<>();
    private Set<IngredientQuantifie> ingredientQuantifies = new HashSet<>();

    public Plat(String nom, int nbPersonne, Difficulte niveauDeDifficulte, Cout cout) {
        checkString(nom);
        checkPositive(nbPersonne);
        checkObject(niveauDeDifficulte);
        checkObject(cout);
        this.nom = nom;
        this.nbPersonne = nbPersonne;
        this.niveauDeDifficulte = niveauDeDifficulte;
        this.cout = cout;
    }

    public String getNom() {
        return nom;
    }

    public int getNbPersonne() {
        return nbPersonne;
    }

    public Difficulte getNiveauDeDifficulte() {
        return niveauDeDifficulte;
    }

    public Cout getCout() {
        return cout;
    }

    public int getDureeEnMinutes() {
        return dureeEnMinutes;
    }

    public void insererInstruction(int indice, Instruction instruction) {
        checkObject(instruction);
        checkPositiveOrZero(indice);
        if(indice > this.instructions.size()) {
            throw new IllegalArgumentException("Indice invalide");
        }
        this.instructions.add(indice, instruction);
        this.dureeEnMinutes += instruction.getDureeEnMinutes();
    }

    public void insererInstruction(Instruction instruction) {
        checkObject(instruction);
        this.instructions.add(instruction);
        this.dureeEnMinutes += instruction.getDureeEnMinutes();
    }

    public Instruction remplacerInstruction(int indice, Instruction instruction) {
        checkObject(instruction);
        checkPositiveOrZero(indice);
        if(indice > this.instructions.size()) {
            throw new IllegalArgumentException("Indice invalide");
        }
        Instruction remplacee = this.instructions.remove(indice);
        this.instructions.add(indice, instruction);
        this.dureeEnMinutes += instruction.getDureeEnMinutes();
        this.dureeEnMinutes -= remplacee.getDureeEnMinutes();
        return remplacee;
    }

    public Instruction supprimerInstruction(int indice) {
        checkPositiveOrZero(indice);
        if(indice > this.instructions.size()) {
            throw new IllegalArgumentException("Indice invalide");
        }
        Instruction supprimee = this.instructions.remove(indice);
        this.dureeEnMinutes -= supprimee.getDureeEnMinutes();
        return supprimee;
    }

    public List<String> getRecette() {
        List<String> aRenvoyer = new ArrayList<>();
        int i = 1;
        for(Instruction instruction : instructions) {
            String instructionTexte = i++ + ". " + instruction.getDescription();
            aRenvoyer.add(instructionTexte);
        }
        return aRenvoyer;
    }

    public boolean ajouterIngredient(Ingredient ingredient, Unite unite, int quantite) {
        checkObject(ingredient);
        checkObject(unite);
        checkPositive(quantite);
        IngredientQuantifie ingredientQuantifie = new IngredientQuantifie(ingredient, unite, quantite);
        return this.ingredientQuantifies.add(ingredientQuantifie);
    }

    public boolean ajouterIngredient(Ingredient ingredient, int quantite) {
        checkObject(ingredient);
        checkPositive(quantite);
        IngredientQuantifie ingredientQuantifie = new IngredientQuantifie(ingredient, Unite.NEANT, quantite);
        return this.ingredientQuantifies.add(ingredientQuantifie);
    }

    public boolean modifierIngredient(Ingredient ingredient, Unite unite, int quantite) {
        checkObject(ingredient);
        checkObject(unite);
        checkPositive(quantite);

        for(IngredientQuantifie ingredientQuantifie : ingredientQuantifies) {
            if(ingredientQuantifie.getIngredient().equals(ingredient)) {
                ingredientQuantifie.setQuantite(quantite);
                ingredientQuantifie.setUnite(unite);
                return true;
            }
        }
        return false;
    }

    public boolean supprimerIngredient(Ingredient ingredient) {
        checkObject(ingredient);
        IngredientQuantifie aSupprimer = null;
        for(IngredientQuantifie ingredientQuantifie : ingredientQuantifies) {
            if(ingredientQuantifie.getIngredient().equals(ingredient)) {
                aSupprimer = ingredientQuantifie;
                break;
            }
        }
        if(aSupprimer != null) {
            ingredientQuantifies.remove(aSupprimer);
            return true;
        }
        return false;
    }

    public IngredientQuantifie getQuantite(Ingredient ingredient) {
        checkObject(ingredient);
        for(IngredientQuantifie ingredientQuantifie : ingredientQuantifies) {
            if(ingredientQuantifie.getIngredient().equals(ingredient)) {
                return ingredientQuantifie;
            }
        }
        return null;
    }

    public List<IngredientQuantifie> getIngredient() {
        return new ArrayList<>(ingredientQuantifies);
    }

    public String toString() {
        String total = "Pour " + nbPersonne + " personne(s)";
        total += "\nDifficulté : " + niveauDeDifficulte;
        total += "\nCoût : " + cout;
        total += "\nDurée : " + dureeEnMinutes + " minutes";
        total += "\n";
        total += "\nIngrédients :";
        for (IngredientQuantifie ingredientQuantifie : ingredientQuantifies) {
            total += "\n" + ingredientQuantifie;
        }
        total += "\n";
        for(String ligneInstruction : getRecette()) {
            total += "\n" + ligneInstruction;
        }
        return total;
    }

    public static enum Difficulte {
        X("*"), XX("**"), XXX("***"), XXXX("****"), XXXXX("*****");

        private final String titre;

        Difficulte(String titre) {
            this.titre = titre;
        }

        @Override
        public String toString() {
            return this.titre;
        }
    }

    public static enum Cout {

        $("€"), $$("€€"), $$$("€€€"), $$$$("€€€€"), $$$$$("€€€€€");

        private final String titre;

        Cout(String titre) {
            this.titre = titre;
        }

        @Override
        public String toString() {
            return this.titre;
        }
    }
}
