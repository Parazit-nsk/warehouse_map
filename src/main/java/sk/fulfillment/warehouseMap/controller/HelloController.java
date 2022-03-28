package sk.fulfillment.warehouseMap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sk.fulfillment.warehouseMap.dao.ShopDao;
import sk.fulfillment.warehouseMap.service.ShopService;

@Controller
public class HelloController {
    @Autowired
    public ShopService service;

    @GetMapping("/")
    public String shops(Model model) {
        model.addAttribute("shops", service.findAll());
        return "shops";
    }
}
