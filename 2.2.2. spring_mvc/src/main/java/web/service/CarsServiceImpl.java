package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsServiceImpl implements CarsService {

    @Override
    public List<Car> listCars(int countCars) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "green", 3));
        cars.add(new Car("Reno", "red", 232));
        cars.add(new Car("Audi", "black", 4));
        cars.add(new Car("Mazda", "white", 6));
        cars.add(new Car("Kia", "grey", 331));

        return countCars > 5 ? cars : cars.subList(0, countCars);
    }
}
