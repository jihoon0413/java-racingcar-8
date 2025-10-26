package racingcar.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.dto.GameWinnerDto;

class OutputViewTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void givenOneWinnerDtoWhenPrintThenOneWinnerOutput() {
        List<Car> winnerList = List.of(createTempCar("pobi"));
        GameWinnerDto result = new GameWinnerDto(winnerList);
        RaceResultView raceResultView = new RaceResultView();

        raceResultView.printWinners(result);
        String output = outputStream.toString().trim();

        assertEquals("최종 우승자 : pobi", output);
    }

    @Test
    public void givenMultiWinnerDtoWhenPrintThenMultiWinnerOutput() {
        List<Car> winnerList = List.of(createTempCar("pobi"), createTempCar("woni"));
        GameWinnerDto result = new GameWinnerDto(winnerList);
        RaceResultView outputView = new RaceResultView();

        outputView.printWinners(result);
        String output = outputStream.toString().trim();

        assertEquals("최종 우승자 : pobi, woni", output);
    }

    private Car createTempCar(String name) {
        return Car.of(name);
    }

}