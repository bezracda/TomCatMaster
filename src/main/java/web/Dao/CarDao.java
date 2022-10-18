package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDao implements CarDaoInt {

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Lada", 2101, "sedan"));
        cars.add(new Car("Lada", 2102, "sedan"));
        cars.add(new Car("Lada", 2103, "sedan"));
        cars.add(new Car("Lada", 2104, "sedan"));
        cars.add(new Car("Lada", 2105, "sedan"));
    }

    @Override
    public List<Car> needCar(int i) {
        if (i >= 5) {
            return cars;
        } else {
            return cars.stream().
                    limit(i).collect(Collectors.toList());

        }
    }
}
