package web.service;

import web.controller.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {


    default List<Car> allCar(List<Car> cars) {
        return cars;
    }
}
