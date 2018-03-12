package pl.shop.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class ShowInfoProductController {
    private ProductRepository products;

    public ShowInfoProductController(ProductRepository products) {
        this.products = products;
    }

    @GetMapping("/lista")
    public String showInfo(String category, Model model){

        List<Product> productList = products.findByCategory(category);
            model.addAttribute("products",productList);
        BigDecimal priceSum = products.getPriceSum();
             model.addAttribute("price",priceSum);
        return "showInfo";
    }

}
