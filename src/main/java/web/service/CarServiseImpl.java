package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.Dao.CarDao;
import web.model.Car;

import java.util.*;
import java.util.stream.Collectors;
@Component
public class CarServiseImpl implements CarService {

    private CarDao carDao;

    @Autowired
    public void CarDaoSet(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> needCar( int i) {
        return carDao.needCar(i);

    }
}

