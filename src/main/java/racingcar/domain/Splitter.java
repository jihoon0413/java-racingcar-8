package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Splitter {

    private final Validator validator;

    public Splitter() {
        this.validator = new Validator();
    }

    public List<String> split(String str) {
        validateInputString(str);
        List<String> names = trimming(str.split(","));
        validatePlayerName(names);
    return names;
    }

    private List<String> trimming(String[] arr) {
        List<String> result = new ArrayList<>();
        for (String string : arr) {
            result.add(string.trim());
        }
        return result;
    }

    private void validateInputString(String str) {
        validator.validateEmptyString(str);
        validator.validateInputOnePlayer(str);
        validator.validateNotEndWithComma(str);
    }

    private void validatePlayerName(List<String> list) {
        validator.validateInputEmptyPlayer(list);
        validator.validateInputLongNamePlayer(list);
    }
}
