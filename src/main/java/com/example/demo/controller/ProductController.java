package com.example.demo.controller;

import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ProductService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/get-all")
    public String getAllProduct(Model model) {
        List<Product> listProduct = productService.findAll();
        model.addAttribute("listProduct", listProduct);
        return null;
    }

    @GetMapping("/{id}")
    public String getOne(@PathVariable("id") int id, Model model) throws RuntimeException {
        Optional<Product> product = productService.findById(id);
        if (product.isPresent()) {
            model.addAttribute("product", product.get());
            return null;
        }
        throw new RuntimeException("Không tìm thấy sản phẩm có id: " + id);
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("newProduct") Product product) throws RuntimeException {
        if (productService.findById(product.getIdProduct()).isPresent()) {
            throw new RuntimeException("Sản phẩm " + product.getName() + " đã tồn tại.");
        }
        productService.save(product);
        return null;
    }

    @PutMapping("/update")
    public String updateProduct(@ModelAttribute("updateProduct") Product product) {
        productService.update(product);
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") int id) throws RuntimeException{
        if (productService.findById(id).isEmpty()) {
            throw new RuntimeException("Không tìm thấy sản phẩm id " + id);
        }
        productService.delete(id);
        return null;
    }

    @DeleteMapping("/delete")
    public String multiDeleteProduct(@ModelAttribute("listProduct") List<Product> listProduct) {
        productService.multiDelete(listProduct);
        return null;
    }
}
