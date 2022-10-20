package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceIpl implements CarService{

    final CarDAO cardao;
    @Autowired
    public CarServiceIpl(CarDAO cardao) {
        this.cardao = cardao;
    }

    @Override
    public List<Car> getCar(int count) {
        return cardao.getCar(count);
    }

    @Override
    public List<Car> getAllCar() {
        return cardao.getAllCar();
    }
}
