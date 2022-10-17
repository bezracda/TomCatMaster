package web.Dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDao {

    private List<Car> cars = new ArrayList<>();

    public List<Car> creatCarTable(List<Car> cars) {
        cars.add(new Car("Lada", 2101, "sedan"));
        cars.add(new Car("Lada", 2102, "sedan"));
        cars.add(new Car("Lada", 2103, "sedan"));
        cars.add(new Car("Lada", 2104, "sedan"));
        cars.add(new Car("Lada", 2105, "sedan"));

        return cars;
    }

    public List<Car> needCar(List<Car> cars, int i) {
        if (i >= 5) {
            return cars;
        } else {
            return cars.stream().
                    limit(i).collect(Collectors.toList());

        }
    }
}
