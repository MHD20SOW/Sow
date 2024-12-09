package entity;

public class Article {
    private int id;
    private String lib;

    // Constructeur par défaut
    public Article() {}

    // Constructeur avec paramètres
    public Article(int id, String lib) {
        this.id = id;
        this.lib = lib;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }
}
