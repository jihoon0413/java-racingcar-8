package racingcar.controller;

import racingcar.dto.GameInitInputDto;
import racingcar.dto.GameWinnerDto;
import racingcar.service.RacingCarService;
import racingcar.view.InputView;
import racingcar.view.RaceResultView;

public class RacingCarController {

    private final InputView inputView;
    private final RacingCarService service;
    private final RaceResultView raceResultView;

    public RacingCarController() {
        this.inputView = new InputView();
        this.service = new RacingCarService();
        this.raceResultView = new RaceResultView();
    }

    public void run() {
        GameInitInputDto dto = inputView.ask();
        GameWinnerDto result = service.play(dto);
        raceResultView.printWinners(result);
        // 결과 출력
    }


}
