package racingcar.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ValidatorTest {

    Validator validator = new Validator();

    @Test
    public void givenEmptyStringWhenValidateThenException() {
        String str1 = "";
        String str2 = "  ";
        assertThrows(IllegalArgumentException.class, () -> validator.validateEmptyString(str1));
        assertThrows(IllegalArgumentException.class, () -> validator.validateEmptyString(str2));
    }

    @Test
    public void givenOnePlayerWhenValidateThenException() {
        String str = "pobi";
        assertThrows(IllegalArgumentException.class, () -> validator.validateInputOnePlayer(str));
    }

    @Test
    public void givenEmptyPlayerWhenValidateThenException() {
        List<String> list = List.of("pobi","","woni");
        assertThrows(IllegalArgumentException.class, () -> validator.validateInputEmptyPlayer(list));
    }

    @Test
    public void givenLongNameWhenValidateThenException() {
        List<String> list = List.of("longName","pobi","woni");
        assertThrows(IllegalArgumentException.class, () -> validator.validateInputLongNamePlayer(list));
    }

    @Test
    public void givenNotEnglishNameWhenValidateThenException() {
        List<String> list = List.of("longName","__+","^");
        assertThrows(IllegalArgumentException.class, () -> validator.validateNotEnglishNamePlayer(list));

    }



}