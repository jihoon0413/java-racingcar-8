package racingcar.controller;

import racingcar.dto.GameInitInputDto;
import racingcar.dto.GameWinnerDto;
import racingcar.service.RacingCarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCarController {

    private final InputView inputView;
    private final RacingCarService service;
    private final OutputView outputView;

    public RacingCarController() {
        this.inputView = new InputView();
        this.service = new RacingCarService();
        this.outputView = new OutputView();
    }

    public void run() {
        GameInitInputDto dto = inputView.ask();
        GameWinnerDto result = service.play(dto);
        outputView.printWinners(result);
        // 결과 출력
    }


}
