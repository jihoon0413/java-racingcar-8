package racingcar.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class CarFactoryTest {

    @Test
    public void givenNameListWhenCreateCarsThenCarList() {
        CarFactory carFactory = new CarFactory();
        List<String> nameList = List.of("pobi","woni","jun");
        List<Car> carList =  carFactory.createCars(nameList);

        assertEquals(nameList.get(1), carList.get(1).getName());
        assertEquals(nameList.get(2), carList.get(2).getName());
    }

}