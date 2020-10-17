package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;
import web.service.CarsServiceImpl;

@Controller
public class CarsController {

    CarsService carsService = new CarsServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer x, Model model) {
        if (x == null) {
            model.addAttribute("cars", carsService.listCars(5));
        } else {
            model.addAttribute("cars", carsService.listCars(x));
        }
        return "cars";
    }
}

