package racingcar.domain;

import java.util.List;
import java.util.Objects;

public class Validator {

    public void validateEmptyString(String str) { // 빈 문자열을 입력할 경우
        if(Objects.equals(str, "") || str.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public void validateInputOnePlayer(String str) { // 플레이어 1명만 입력한 경우
        if(!str.contains(",")) {
            throw new IllegalArgumentException();
        }
    }

    public void validateInputEmptyPlayer(List<String> list) { // 중간에 빈 사용자를 입력하는 경우 ex)pobi,,jun
        for(String name : list) {
            if(name.isEmpty()) {
                throw new IllegalArgumentException();
            }
        }
    }

    public void validateInputLongNamePlayer(List<String> list) { // 5자 이상의 이름을 입력한 경우
        for(String name : list) {
            if(name.trim().length() > 5) {
                throw new IllegalArgumentException();
            }
        }
    }

    public void validateNotEnglishNamePlayer(List<String> list) {
        for(String name : list) {
            if(!name.matches("^[a-zA-Z]+$")) {
                throw new IllegalArgumentException();
            }
        }
    }
}
