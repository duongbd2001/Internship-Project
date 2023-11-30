package com.example.demo.controller;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Product;
import com.example.demo.entity.Supplier;
import com.example.demo.service.ProductService;
import com.example.demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.BillService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/bill")
@Controller
public class BillController {
    private final BillService billService;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private ProductService productService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping("/get-all")
    public String getAllBill(Model model) {
        List<Bill> listBill = billService.getAll();
        model.addAttribute("listBill", listBill);
        return null;
    }

    @GetMapping("/get-one/{id}")
    public String findById(@PathVariable("id") Integer id, Model model) {
        Optional<Bill> bill = billService.getOne(id);
        if (bill.isEmpty()) {
            throw new RuntimeException("Không tìm thấy hóa đơn này.");
        }
        model.addAttribute("bill", bill.get());
        return null;
    }

    @GetMapping("/create")
    public String create() {
        return "bill";
    }

    @PostMapping("/create")
    public String createBill(@ModelAttribute("createBill") Bill bill, Model model, @RequestParam("nameSupplier") String nameSupplier, @RequestParam("nameProduct") String nameProduct) {
        //find supplier like input name
        List<Supplier> supplierList = supplierService.findByName(nameSupplier);
        //if this supplier does not exist => redirect to url /supplier/create and create new
        if (supplierList.isEmpty()) {
            return "redirect:/supplier/create";
        }
        //show list supplier to view
        model.addAttribute("listSupplier", supplierList);
        String supplier = (String) model.getAttribute("selectedSupplier");
        Optional<Supplier> selectedSupplier = supplierService.findBySelectedName(supplier);

        //find product by input name
        List<Product> listProduct = productService.findByName(nameProduct);
        //get product from checked form
        String id = (String) model.getAttribute("idProduct");
        if (listProduct.isEmpty()) {
            return "redirect:/product/create";
        }
        if (billService.getOne(bill.getIdBill()).isPresent()) {
            throw new RuntimeException("Hóa đơn " + bill.getName() + " đã tồn tại.");
        }
        billService.create(bill);
        return "pay";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBill(@PathVariable("id") Integer id) {
        if (billService.getOne(id).isEmpty()) {
            throw new RuntimeException("Không tìm thấy hóa đơn này.");
        }
        billService.deleteById(id);
        return null;
    }

    @PostMapping("/update")
    public String updateBill(@ModelAttribute("updateBill") Bill bill) {
        billService.update(bill);
        return null;
    }

}