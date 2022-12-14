package Mebli.Store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Головна сторінка");
        return "home";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("title", "Головна сторінка");
        return "add";
    }

}