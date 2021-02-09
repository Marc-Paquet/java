package module9.recette;

import static module9.recette.Util.*;
public class Instruction {

    public String description;
    private int dureeEnMinutes;

    public Instruction(String description, int dureeEnMinutes) {
        checkString(description);
        this.description = description;
        checkPositive(dureeEnMinutes);
        this.dureeEnMinutes = dureeEnMinutes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        checkString(description);
        this.description = description;
    }

    public int getDureeEnMinutes() {
        return dureeEnMinutes;
    }

    public void setDureeEnMinutes(int dureeEnMinutes) {
        checkPositive(dureeEnMinutes);
        this.dureeEnMinutes = dureeEnMinutes;
    }

    @Override
    public String toString() {
        return "(" + dureeEnMinutes + ") " + description;
    }
}
