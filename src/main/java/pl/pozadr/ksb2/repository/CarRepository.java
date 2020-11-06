package pl.pozadr.ksb2.repository;

import org.springframework.stereotype.Repository;
import pl.pozadr.ksb2.model.Car;
import pl.pozadr.ksb2.model.Color;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
    List<Car> carList;

    public CarRepository() {
        this.carList = new ArrayList<>();
        carList.add(new Car(1, "VW", "Polo", Color.BLUE));
        carList.add(new Car(2, "Volvo", "V60", Color.BLACK));
        carList.add(new Car(3, "Mercedes", "VClass", Color.WHITE));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
