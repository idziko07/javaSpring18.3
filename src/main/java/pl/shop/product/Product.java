package pl.shop.product;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private Category category;

    public Product() {
    }

    public Product(String name, BigDecimal price, String category) {
        this.name = name;
        this.price = price;
        category = category.toUpperCase();
        this.category = Category.valueOf(category);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCategory() {
        return this.category.name();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = Category.valueOf(category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
