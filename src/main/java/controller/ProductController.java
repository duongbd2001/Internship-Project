package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/get-all")
    public String getAllProduct() {

        return null;
    }

    @PostMapping("/create")
    public String createProduct(){
        return null;
    }
}
