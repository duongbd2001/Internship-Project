package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.entity.Supplier;
import com.example.demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
        throw new RuntimeException("Không tìm thấy sản phẩm này");
    }

    @GetMapping("/create")
    public String create() {
        return "createProduct";
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("newProduct") Product inputProduct, Model model) throws RuntimeException {
        Product product = (Product) model.getAttribute("newProduct");
        if (product.getIdProduct() == null) {
            //thông báo yêu cầu nhập đủ thông tin
        }
        if (productService.findByName(product.getName()).isEmpty()) {
            throw new RuntimeException("Sản phẩm " + product.getName() + " đã tồn tại.");
        }
        productService.save(product);
        return "redirect:/get-all";
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
