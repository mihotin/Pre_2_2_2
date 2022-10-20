package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, Model model) {

        if (count != null && count > 1  && count < 5) {
            model.addAttribute("allcars", carService.getCar(count));
        } else {
            model.addAttribute("allcars", carService.getAllCar());
        }

        return "cars";
    }
}
