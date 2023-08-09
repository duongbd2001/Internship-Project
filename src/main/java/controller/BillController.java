package controller;

import entity.Bill;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import service.BillService;

@RequestMapping("/bill")
@Controller
@Slf4j
public class BillController {
    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping("/get-all")
    public String getAllBill() {
        return null;
    }

    @GetMapping("/get-one/{id}")
    public String findById(@PathVariable("id") Integer id) {
        Bill bill = billService.getOne(id);
        return null;
    }

    @PostMapping("/create")
    public String createBill(@Validated Bill bill) {
        billService.create(bill);
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBill(@PathVariable("id") Integer id) {
        billService.deleteById(id);
        return null;
    }

    @PostMapping("/update")
    public String updateBill( Bill bill) {
        billService.update(bill);
        return null;
    }
//    @GetMapping("/page-query")
//    public String pageQuery(BillDTO billDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
//        Page<BillDTO> billPage = billService.findByCondition(billDto, pageable);
//        return null;
//    }

}