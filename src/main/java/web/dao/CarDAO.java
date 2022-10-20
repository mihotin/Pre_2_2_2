package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getCar(int count);

    List<Car> getAllCar();
}
