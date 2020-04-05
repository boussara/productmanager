package com.mirage.java.productmanager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String ViewPageHome(Model model) {
      List<Product> listproduct = service.listAll();
      model.addAttribute("listproduct", listproduct);
        return "index";
    }
    
}