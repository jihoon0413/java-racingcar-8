package racingcar.view;

import racingcar.domain.Car;
import racingcar.dto.GameWinnerDto;

public class OutputView {
    public void printWinners(GameWinnerDto dto) {
        StringBuilder sb = new StringBuilder();
        sb.append("최종 우승자 : ");
        sb.append(String.join(", ", dto.getWinnerList().stream().map(Car::getName).toList()));
        System.out.println(sb);
    }
}
