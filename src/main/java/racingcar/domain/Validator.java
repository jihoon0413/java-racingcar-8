package racingcar.domain;

import java.util.List;

public class Validator {

    public void validateEmptyString(String str) { // 빈 문자열을 입력할 경우
    }

    public void validateInputOnePlayer(String str) { // 플레이어 1명만 입력한 경우
    }

    public void validateInputEmptyPlayer(List<String> list) { // 중간에 빈 사용자를 입력하는 경우 ex)pobi,,jun
    }

    public void validateInputLongNamePlayer(List<String> list) { // 5자 이상의 이름을 입력한 경우
    }
}
