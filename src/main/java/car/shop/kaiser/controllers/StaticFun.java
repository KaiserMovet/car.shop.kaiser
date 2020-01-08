package car.shop.kaiser.controllers;

import org.springframework.ui.Model;

class StaticFun {
    public static String generate(Model model, String page) {
        model.addAttribute("page", "home");
        return "layout";
    }
}