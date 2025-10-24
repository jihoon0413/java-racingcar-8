package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.domain.Splitter;
import racingcar.dto.GameInitInputDto;

public class InputView {

    private Splitter splitter;

    public InputView() {
        this.splitter = new Splitter();
    }

    public GameInitInputDto ask() {
        printInitMessage();
        List<String> carNameList = splitter.split(readInput());
        printAskRepeatCount();
        int repeatCount = readRepeatCount();
        return new GameInitInputDto(carNameList, repeatCount);
    }

    private void printInitMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    private void printAskRepeatCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    private String readInput() {
        return Console.readLine();
    }

    private int readRepeatCount() {
        try{
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("반복할 횟수는 숫자로 입력해주세요");
        }
    }

}
