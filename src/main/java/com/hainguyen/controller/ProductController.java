package com.hainguyen.controller;

import com.hainguyen.service.ProductService;
import com.hainguyen.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    private ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public String listProduct(Model model) {
        model.addAttribute("products", productService.findAll());
        return "list";
    }
}
