package pl.shop.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model){
        Category[] category = Category.values();
        model.addAttribute("categories", category);
        return "shop";
    }


}
