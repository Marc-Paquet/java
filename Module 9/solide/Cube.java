package module9.solide;

public class Cube implements Solide {

    private double hauteur;

    public Cube(double hauteur) {
        if(hauteur < 0) {
            throw new IllegalArgumentException("Hauteur invalide");
        }
        this.hauteur = hauteur;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public double getVolume() {
        return Math.pow(hauteur, 3);
    }

    @Override
    public double getSurface() {
        return 6 * Math.pow(hauteur, 2);
    }
}
