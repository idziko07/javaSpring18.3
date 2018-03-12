package pl.shop.product;

public enum Category {
    SPOZYWCZE("spozywcze"),
    DOMOWE("domowe"),
    INNE("inne");

    private String articles;

    Category(String articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return articles;
    }
}
