package com.example.demo.controller;

import com.example.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/get-all")
    public String getAllCustomer(Model model) {
        model.addAttribute("allCustomer", customerService.findAll());
        return null;
    }

    @GetMapping("/get-one/{id}")
    public String getOneCustomer(@PathVariable("id") int id) {
        customerService.findById(id);
        return null;
    }

    @PostMapping("/create")
    public String createCustomer(@ModelAttribute("createCustomer") Customer customer) {
        customerService.save(customer);
        return null;
    }

    @PutMapping("/update")
    public String updateCustomer(@ModelAttribute("updateCustomer") Customer customer) {
        customerService.update(customer);
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") int id) {
        customerService.delete(id);
        return null;
    }
}
