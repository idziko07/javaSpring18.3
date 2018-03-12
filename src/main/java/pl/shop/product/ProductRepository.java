package pl.shop.product;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products;
    private BigDecimal priceSum;

    public ProductRepository() {
        this.products =new ArrayList<>();
        products.add(new Product("chleb",new BigDecimal("1.80"),"SPOZYWCZE"));
        products.add(new Product("maslo",new BigDecimal("4.58"),"SPOZYWCZE"));
        products.add(new Product("opony",new BigDecimal("458"),"INNE"));
        products.add(new Product("olej samochodowy",new BigDecimal("57.74"),"DOMOWE"));
        products.add(new Product("szynka",new BigDecimal("4.26"),"SPOZYWCZE"));
        products.add(new Product("remont samochodu",new BigDecimal("238"),"INNE"));
        products.add(new Product("wieszak",new BigDecimal("1.69"),"INNE"));
        products.add(new Product("proszek",new BigDecimal("13.70"),"DOMOWE"));
    }

    public BigDecimal getPriceSum() {
        return priceSum;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> findByCategory(String category){
        priceSum = new BigDecimal(0);
        String text = category;
       if (category!=null) {
           category = category.toUpperCase();
       }
        List<Product> prod = new ArrayList<>();
        for (Product product : products) {
            if (text == null || product.getCategory().equals(category)) {
                prod.add(product);
                priceSum = priceSum.add(product.getPrice());
            }
        }
            return prod;
        }
}
