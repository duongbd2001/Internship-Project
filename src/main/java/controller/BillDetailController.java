package controller;

import entity.BillDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.BillDetailService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/bill-detail")
@Controller
public class BillDetailController {
    @Autowired
    private BillDetailService billDetailService;

    @GetMapping("/get-all")
    public String getAllBillDetail(Model model) {
        List<BillDetail> listBillDetail = billDetailService.getAll();
        model.addAttribute("allBillDetail", listBillDetail);
        return null;
    }

    @GetMapping("/{id}")
    public String getOneBillDetail(@PathVariable("id") Integer id, Model model) {
        Optional<BillDetail> billDetail = billDetailService.getById(id);
        if (billDetail.isEmpty()) {
            throw new RuntimeException("Không tìm thấy hóa đơn chi tiết với id " + id);
        }
        model.addAttribute("billDetail", billDetail);
        return null;
    }

    @PostMapping("/create")
    public String createBillDetail(@ModelAttribute("createBillDetail") BillDetail billDetail){
        if (billDetailService.getById(billDetail.getIdBill()).isPresent()) {
            throw new RuntimeException("Hóa đơn này đã tồn tại");
        }
        billDetailService.create(billDetail);
        return null;
    }

    @PutMapping("/update")
    public String update(@ModelAttribute("updateBillDetail") BillDetail billDetail) {
        billDetailService.update(billDetail);
        return null;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {
        Optional<BillDetail> billDetail = billDetailService.getById(id);
        if (billDetail.isEmpty()) {
            throw new RuntimeException("Không tìm thấy hóa đơn chi tiết với id " + id);
        }
        billDetailService.deleteById(id);
        return null;
    }
}