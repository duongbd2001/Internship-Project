package controller;

import entity.Bill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.BillService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/bill")
@Controller
public class BillController {
    private final BillService billService;

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
            throw new RuntimeException("Không tìm thấy hóa đơn với id " + id);
        }
        model.addAttribute("bill", bill);
        return null;
    }

    @PostMapping("/create")
    public String createBill(@ModelAttribute("createBill") Bill bill) {
        if (billService.getOne(bill.getIdBill()).isPresent()) {
            throw new RuntimeException("Hóa đơn " + bill.getIdBill() + " đã tồn tại.");
        }
        billService.create(bill);
        return null;
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