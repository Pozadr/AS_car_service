package pl.pozadr.ksb2.service;

import pl.pozadr.ksb2.model.Car;
import pl.pozadr.ksb2.model.Color;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> getCarList();

    Optional<Car> getCarByID(long id);

    List<Car> getCarsByColor(Color color);

    boolean addNewCar(Car newCar);

    boolean deleteCar(long id);

    boolean modifyCarProperty(long id, String property, String value);

}