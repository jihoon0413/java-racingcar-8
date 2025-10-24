package racingcar.controller;

import racingcar.dto.GameInitInputDto;
import racingcar.dto.GameWinnerDto;
import racingcar.service.RacingCarService;
import racingcar.view.InputView;

public class RacingCarController {

    private final InputView inputView;
    private final RacingCarService service;

    public RacingCarController() {
        this.inputView = new InputView();
        this.service = new RacingCarService();
    }
    public void run() {
        GameInitInputDto dto = inputView.ask();
        GameWinnerDto result =  service.play(dto);
        // 결과 출력
    }


}
