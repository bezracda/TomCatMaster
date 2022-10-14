package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiseImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String createList(ModelMap model, @RequestParam(name = "count",required = false,defaultValue = "5")int count) {
        List<Car> carList = new ArrayList<>();
        CarServiseImpl cars = new CarServiseImpl();
        model.addAttribute("info","Здесь лучшие тачки");
        model.addAttribute("carsss",cars.allCar(carList));
        cars.needCar(carList,count);


        return "cars";
    }
//    @GetMapping("/cars")
//    public String testMethod(HttpServletRequest request){
//        String full = request.getParameter("count");
//        List<Car> carList = new ArrayList<>();
//        CarServiseImpl cars = new CarServiseImpl();
//
//
//        return "cars";
//    }

}
