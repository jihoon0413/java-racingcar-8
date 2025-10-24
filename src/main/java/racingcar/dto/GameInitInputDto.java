package racingcar.dto;

import java.util.List;

public class GameInitInputDto {

    List<String> carNameList;
    int repeatCount;

    public GameInitInputDto(List<String> carNameList, int repeatCount) {
        this.carNameList = carNameList;
        this.repeatCount = repeatCount;
    }

    public List<String> getCarNameList() {
        return carNameList;
    }

    public int getRepeatCount() {
        return repeatCount;
    }
}
