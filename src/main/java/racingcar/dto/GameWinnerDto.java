package racingcar.dto;

import java.util.List;
import racingcar.domain.Car;

public class GameWinnerDto {
    private List<Car> winnerList;

    public GameWinnerDto(List<Car> winnerList) {
        this.winnerList = winnerList;
    }

    public List<Car> getWinnerList() {
        return winnerList;
    }
}
