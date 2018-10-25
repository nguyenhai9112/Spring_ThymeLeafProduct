package com.hainguyen.controller;

import com.hainguyen.model.Customer;
import com.hainguyen.service.CustomerService;
import com.hainguyen.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "index";
    }

    @GetMapping("/customer/create")
    public String create(Model model) {
        return "create";
    }

    @PostMapping("/customer/save")
    public String save(Customer customer, RedirectAttributes redirect) {
        customer.setId((int)(Math.random() * 10000));
        customerService.save(customer);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "edit";
    }

    @PostMapping("/customer/update")
    public String update(Customer customer, RedirectAttributes redirect){
        customerService.update(customer.getId(), customer);
        redirect.addFlashAttribute("success", "Modified customer successfully");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        redirect.addFlashAttribute("success", "Delete customer successfully");
        customerService.remove(id);
        return "redirect:/";
    }
}
