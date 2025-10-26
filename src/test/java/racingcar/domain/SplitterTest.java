package racingcar.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class SplitterTest {

    Splitter splitter = new Splitter();

    @Test
    public void givenNormalStringWhenSplitThenList() {
        String str = "pobi,woni,jun";

        assertEquals(List.of("pobi", "woni", "jun"), splitter.split(str));
    }

    @Test
    public void givenWrongInputWhenSplitThenException() {
        String str1 = "";
        String str2 = "pobi";
        String str3 = "pobi,,jun";
        String str4 = "longName,pobi,woni";
        String str5 = "pobi,pobi";

        assertThrows(IllegalArgumentException.class, () -> splitter.split(str1));
        assertThrows(IllegalArgumentException.class, () -> splitter.split(str2));
        assertThrows(IllegalArgumentException.class, () -> splitter.split(str3));
        assertThrows(IllegalArgumentException.class, () -> splitter.split(str4));
        assertThrows(IllegalArgumentException.class, () -> splitter.split(str5));
    }

}