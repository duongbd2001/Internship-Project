package controller;

import entity.BillDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.BillDetailService;

@RequestMapping("/bill-detail")
@Controller
public class BillDetailController {
    @Autowired
    private BillDetailService billDetailService;

    @GetMapping("/get-all")
    public String save() {
        billDetailService.getAll();
        return null;
    }

    @GetMapping("/{id}")
    public String getOne(@PathVariable("id") Integer id) {
        BillDetail billDetail = billDetailService.getById(id);
        return null;
    }

    @PostMapping("/create")
    public String createBillDetail(BillDetail billDetail){
        billDetailService.create(billDetail);
        return null;
    }

    @PutMapping("/update")
    public String update( BillDetail billDetail) {
        billDetailService.update(billDetail);
        return null;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {
        billDetailService.deleteById(id);
        return null;
    }
}