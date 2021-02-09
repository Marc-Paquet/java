package module9.article;

public class TestArticle {

    public static void main(String[] args) {

        Article nike = new Article("45646465", "Nike Air", "La chaussure qui respire", 70);
        try {
            Article errone = new Article("dfzf", "ezfezf", "Description", 4, 999);
        } catch (IllegalArgumentException exception) {
            System.out.println("Attention : " + exception.getMessage());
        }
    }
}
