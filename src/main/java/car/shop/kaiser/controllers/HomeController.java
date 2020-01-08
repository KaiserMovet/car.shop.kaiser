package car.shop.kaiser.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import car.shop.kaiser.myObj.CarManufacturer;
import car.shop.kaiser.myObj.CarModel;
import car.shop.kaiser.services.OffersService;

@Controller
public class HomeController {
    @Autowired
    private OffersService offersService;

    @RequestMapping("/")
    public String home(Model model) {

        CarManufacturer car_manufactorer = offersService.getCarManufacturer(2);
        CarModel car_model = offersService.getCarModel(2);

        model.addAttribute("car_manufactorer", car_manufactorer);
        model.addAttribute("car_model", car_model);

        return StaticFun.generate(model, "home");
    }

}
