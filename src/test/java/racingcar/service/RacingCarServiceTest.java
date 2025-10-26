package racingcar.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.dto.GameInitInputDto;
import racingcar.dto.GameWinnerDto;

class RacingCarServiceTest {

    RacingCarService service = new RacingCarService();

    @Test
    public void givenGameInitInputDtoWhenPlayThenGameWinnerDto() {
        GameInitInputDto inputDto = new GameInitInputDto(List.of("poni,woni"), 5);
        GameWinnerDto winnerDto = service.play(inputDto);

        assertNotNull(winnerDto.getWinnerList());
    }


}