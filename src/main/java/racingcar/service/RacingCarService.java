package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.CarFactory;
import racingcar.dto.GameInitInputDto;
import racingcar.dto.GameWinnerDto;

public class RacingCarService {

    private final CarFactory carFactory;

    private static List<Car> carList = new ArrayList<>();

    public RacingCarService() {
        this.carFactory = new CarFactory();
    }


    public GameWinnerDto play(GameInitInputDto dto) {
        createCar(dto.getCarNameList());
        printResult(playGame(dto.getRepeatCount()));
        return null;
    }

    private void createCar(List<String> names) {
        carList = carFactory.createCars(names);
    }

    private List<Car> playGame(int count) {



        return null;
    }

    private void printResult(List<Car> winners) {


    }

}
