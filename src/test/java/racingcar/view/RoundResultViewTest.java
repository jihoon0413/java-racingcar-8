package racingcar.view;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

class RoundResultViewTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream original = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(original);
    }

    @Test
    public void givenRoundResultWhenPrintRoundResultThenResult() {
        RoundResultView roundResultView = new RoundResultView();
        List<Car> roundResult = createResult();

        roundResultView.printRoundResult(roundResult);
        String output = outputStream.toString().trim();

        assertThat(output).contains("pobi : ------");
        assertThat(output).contains("woni : ----");
    }


    private List<Car> createResult() {
        List<Car> roundResult = new ArrayList<>();

        roundResult.add(Car.of("pobi", 6));
        roundResult.add(Car.of("woni", 4));

        return roundResult;
    }

}