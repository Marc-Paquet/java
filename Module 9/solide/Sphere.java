package module9.solide;

public class Sphere implements Solide {

    private double rayon;

    public Sphere(double rayon) {
        if(rayon < 0) {
            throw new IllegalArgumentException("Rayon invalide");
        }
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(rayon, 3) / 3;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * Math.pow(rayon, 2);
    }
}
