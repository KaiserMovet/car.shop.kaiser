package car.shop.kaiser.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {

        return "home";
    }

    @RequestMapping("/hello")
    public String hello(Model model, String imie, int wiek) {
        model.addAttribute("imie", imie);
        model.addAttribute("wiek", wiek);
        return "hello";
    }

}