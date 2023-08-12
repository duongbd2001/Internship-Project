package controller;

import entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.SupplierService;

import java.util.List;

@Controller
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @GetMapping("/get-all")
    public String getAllSupplier(Model model) {
        model.addAttribute("allSupplier", supplierService.findAll());
        return null;
    }

    @GetMapping("/get-one/{id}")
    public String getOneSupplier(@PathVariable("id") int id) {
        supplierService.findById(id);
        return null;
    }

    @PostMapping("/create")
    public String createSupplier(@ModelAttribute("createSupplier") Supplier supplier) {
        supplierService.save(supplier);
        return null;
    }

    @PutMapping("/update")
    public String updateSupplier(@ModelAttribute("updateSupplier") Supplier supplier) {
        supplierService.update(supplier);
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSupplier(@PathVariable("id") int id) {
        supplierService.delete(id);
        return null;
    }
}
