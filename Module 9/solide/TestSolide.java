package module9.solide;

public class TestSolide {

    public static void main(String[] args) {
        Solide sphere1 = new Sphere(2);
        System.out.println(sphere1.getSurface());
        System.out.println(sphere1.getVolume());

        Cylindre cylindre = new Cylindre(2, 4);
        System.out.println(cylindre.getSurface());
        System.out.println(cylindre.getVolume());

        Solide cube = new Cube(2);
        System.out.println(cube.getSurface());
        System.out.println(cube.getVolume());

    }
}
