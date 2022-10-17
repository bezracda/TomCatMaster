package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.Dao.CarDao;
import web.model.Car;

import java.util.*;
import java.util.stream.Collectors;
@Component
public class CarServiseImpl implements CarService {

    CarDao carDao = new CarDao();

    public List<Car> needCar(List<Car> cars, int i) {
        return carDao.needCar(cars, i);

    }

    public List<Car> creatCarTable(List<Car> cars) {
        return carDao.creatCarTable(cars);
    }
}

