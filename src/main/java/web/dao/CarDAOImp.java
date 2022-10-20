package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImp implements CarDAO{
    private List<Car> cars;

    public CarDAOImp() {
        cars = new ArrayList<>();
        cars.add(new Car("LADA", "NIVA", 1977));
        cars.add(new Car("VW", "TOUAREG", 2010));
        cars.add(new Car("TOYOTA", "LC200", 2022));
        cars.add(new Car("SKODA", "OCTAVIA", 2012));
        cars.add(new Car("RENAULT", "DUSTER", 2020));
    }

    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<Car> getAllCar() {
        return cars.stream().collect(Collectors.toUnmodifiableList());
    }
}
