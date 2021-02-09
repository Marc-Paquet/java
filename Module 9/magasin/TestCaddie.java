package module9.magasin;

public class TestCaddie {

    public static void main(String[] args) {
        Produit livre = new Livre("54654", "Eragon", "Christopher", 250, 18.99);
        Produit cd = new Cd("54564", "Paradis Vert", "Yannick Noah", 13, 14);
        Produit dvd = new Dvd("456565", "Avatar", "Cameron", 21.99);
        Produit dvd2 = new Dvd("49807", "Memento", "Nolan", 18.99);

        Caddie caddie = new Caddie();
        caddie.ajouterProduit(livre);
        caddie.ajouterProduit(cd);
        caddie.ajouterProduit(dvd);
        caddie.ajouterProduit(dvd2);

        System.out.println(Math.round(caddie.calculerPrix() * 100) / 100.0);
        System.out.println(caddie.nbCd());
        System.out.println(caddie.nbDvd());

    }
}
