package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {


    default List<Car> creatCarTable(List<Car> cars) {
        return cars;
    }
}
