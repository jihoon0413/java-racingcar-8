package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class CarFactory {

    public List<Car> createCars(List<String> names) {
        return names.stream().map(Car::of).collect(Collectors.toList());
    }
}
