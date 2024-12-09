package entity;

import java.util.Scanner;

public class ArticleImpl implements IArticle {

    @Override
    public Article saisie() {
        Scanner scanner = new Scanner(System.in);
        Article article = new Article();

        System.out.print("Entrez l'ID: ");
        article.setId(scanner.nextInt());
        scanner.nextLine();  // Consomme le reste de la ligne

        System.out.print("Entrez le libellé: ");
        article.setLib(scanner.nextLine());

        return article;
    }

    @Override
    public void affichage(Article a) {
        System.out.println("ID: " + a.getId());
        System.out.println("Libellé: " + a.getLib());
    }
}
