package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
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
        return playGame(dto.getRepeatCount());
    }

    void createCar(List<String> names) {
        carList = carFactory.createCars(names);
    }

    GameWinnerDto playGame(int count) {
        for (int i = 0; i < count; i++) {
            playTurn();
        }
        List<Car> winnerList = getWinnerList();
        return new GameWinnerDto(winnerList);
    }

    void playTurn() {
        for (Car car : carList) {
            if (goOrStop()) {
                car.addScore();
            }
        }
        System.out.println();
    }

    boolean goOrStop() {
        int randNum = Randoms.pickNumberInRange(0, 9);
        return randNum >= 4;
    }

    List<Car> getWinnerList() {
        List<Car> winner = new ArrayList<>();
        Collections.sort(carList);
        int winnerScore = carList.getFirst().getScore();
        for (Car car : carList) {
            if (car.getScore() < winnerScore) {
                break;
            }
            winner.add(car);
        }
        return winner;
    }

}
