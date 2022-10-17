package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private CarServiseImpl carServise;
    @Autowired
    public void setOcean(CarServiseImpl carServise) {
        this.carServise = carServise;
    }

    @GetMapping("/cars")
    public String createList(ModelMap model, @RequestParam(name = "count",required = false,defaultValue = "5")int count) {

        model.addAttribute("info","Здесь лучшие тачки");
        model.addAttribute("cars",carServise.creatCarTable(new ArrayList<>()));
        System.out.println(carServise.needCar(carServise.creatCarTable(new ArrayList<>()),count));

        return "cars";
    }
}
