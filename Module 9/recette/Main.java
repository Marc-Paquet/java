package module9.recette;

public class Main {

    public static void main(String[] args) {

        Plat plat = new Plat("Poulet au légumes", 4, Plat.Difficulte.XX, Plat.Cout.$$$);

        Ingredient carotte = new Ingredient("Carottes");
        Ingredient poulet = new Ingredient("Blanc de poulet");
        Ingredient celeri = new Ingredient("Céléri");
        Ingredient sel = new Ingredient("Sel");

        plat.ajouterIngredient(carotte, 2);
        plat.ajouterIngredient(poulet, Unite.GRAMME, 600);
        plat.ajouterIngredient(celeri, Unite.GRAMME, 200);
        plat.ajouterIngredient(sel, Unite.PINCEE, 1);

        Instruction instruction0 = new Instruction("Couper les légumes", 10);
        Instruction instruction1 = new Instruction("Faire revenir les légumes", 15);
        Instruction instruction2 = new Instruction("Ajouter le poulet", 5);
        Instruction instruction3 = new Instruction("Laisser mijoter jusqu'à cuisson du poulet", 10);
        Instruction instruction4 = new Instruction("Ajouter la crème et servir", 3);

        plat.insererInstruction(instruction0);
        plat.insererInstruction(instruction1);
        plat.insererInstruction(instruction2);
        plat.insererInstruction(instruction3);
        plat.insererInstruction(instruction4);

        System.out.println(plat);
    }
}
