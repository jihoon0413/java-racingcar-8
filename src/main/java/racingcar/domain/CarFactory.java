package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public List<Car> createCars(List<String> names) {
        List<Car> carList = new ArrayList<>();
        for (String name : names) {
            carList.add(Car.of(name));
        }
        return carList;
    }
}
