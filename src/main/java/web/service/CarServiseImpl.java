package web.service;

import web.controller.Car;

import java.util.*;
import java.util.stream.Collectors;

public class CarServiseImpl implements CarService {

    @Override
    public List<Car> allCar(List<Car> cars) {
        cars.add(new Car("Lada", 2101, "sedan"));
        cars.add(new Car("Lada", 2102, "sedan"));
        cars.add(new Car("Lada", 2103, "sedan"));
        cars.add(new Car("Lada", 2104, "sedan"));
        cars.add(new Car("Lada", 2105, "sedan"));

        return cars;
    }

    public void needCar(List<Car> cars, int i) {
//        CarServiseImpl car = new CarServiseImpl();
//        car.allCar(cars);
        Iterator iterator = cars.iterator();
        int g = 0;
        while (iterator.hasNext() && g < i) {
            if (i >= 5) {
                System.out.println(cars);
                break;
            } else {
                System.out.println(iterator.next());
                ++g;
            }
        }
    }
//    public static void main(String[] args) {
//        CarServiseImpl car = new CarServiseImpl();
//        List<Car> cars = new ArrayList<>();
//        car.needCar(cars, 2);
//
//
//        }
//    }
}

