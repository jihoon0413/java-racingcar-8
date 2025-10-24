package racingcar.domain;

import java.util.List;
import java.util.Objects;

public class Validator {

    public void validateEmptyString(String str) { // 빈 문자열을 입력할 경우
        if(Objects.equals(str, "") || str.trim().isEmpty()) {
            throw new IllegalArgumentException("빈 문자열은 입력할 수 없습니다.");
        }
    }

    public void validateInputOnePlayer(String str) { // 플레이어 1명만 입력한 경우
        if(!str.contains(",")) {
            throw new IllegalArgumentException("한명 이상의 플레이어를 입력해주세요");
        }
    }

    public void validateNotEndWithComma(String str) {
        if(str.endsWith(",")) {
            throw new IllegalArgumentException(",로 문자를 마무리할 수 없습니다.");
        }
    }

    public void validateInputEmptyPlayer(List<String> list) { // 중간에 빈 사용자를 입력하는 경우 ex)pobi,,jun
        for(String name : list) {
            if(name.isEmpty()) {
                throw new IllegalArgumentException("정확한 형식으로 사용자의 이름을 입력해주세요");
            }
        }
    }

    public void validateInputLongNamePlayer(List<String> list) { // 5자 이상의 이름을 입력한 경우
        for(String name : list) {
            if(name.trim().length() > 5) {
                throw new IllegalArgumentException("너무 긴 사용자 이름을 사용하였습니다.");
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
