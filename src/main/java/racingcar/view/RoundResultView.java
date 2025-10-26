package racingcar.view;

import java.util.List;
import racingcar.domain.Car;

public class RoundResultView {
    public void printRoundResult(List<Car> carList) {
        StringBuilder sb = new StringBuilder();
        for (Car car : carList) {
            sb.append(generateScoreBoard(car)).append("\n");
        }
        sb.append("\n");
        System.out.println(sb);
    }

    private String generateScoreBoard(Car car) {
        StringBuilder sb = new StringBuilder();
        sb.append(car.getName()).append(" : ");
        for (int i = 0; i < car.getScore(); i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
