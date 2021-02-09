package module9.solide;

public class Cylindre implements Solide{

    private double rayon;
    private double hauteur;

    public Cylindre(double rayon, double hauteur) {
        if(rayon < 0) {
            throw new IllegalArgumentException("Rayon invalide");
        }
        if(hauteur < 0) {
            throw new IllegalArgumentException("Hauteur invalide");
        }
        this.rayon = rayon;
        this.hauteur = hauteur;
    }

    public double getRayon() {
        return rayon;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(rayon, 2) * hauteur;
    }

    @Override
    public double getSurface() {
        return 2 * Math.PI * Math.pow(rayon, 2) + 2 * Math.PI * rayon * hauteur;
    }
}
