package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer x, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "green", 3));
        cars.add(new Car("Reno", "red", 232));
        cars.add(new Car("Audi", "black", 4));
        cars.add(new Car("Mazda", "white", 6));
        cars.add(new Car("Kia", "grey", 331));

        if (x == null || x>5 ) {
            model.addAttribute("cars", cars);
        } else {
            List<Car> list = cars.subList(0, x);
            model.addAttribute("cars",list);
        }
        return "cars";
    }
}

