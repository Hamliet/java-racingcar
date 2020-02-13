package racingGame.utils;

import org.junit.jupiter.api.Test;
import racingGame.domain.Car;
import racingGame.domain.Name;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilTest {
    @Test
    void splitCarName_쉼표로_구분되어_입력된_자동차_이름() {
        final String inputCarName = "a,b,c,d";

        String[] actual = StringUtil.splitCarName(inputCarName);

        String[] expected = {"a", "b", "c", "d"};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void convertPositionToString_자동차_위치를_문자로_변환() {
        final Car car = new Car(new Name("test"));
        car.move(9);
        car.move(9);
        car.move(9);
        car.move(9);

        final String actual = StringUtil.convertPositionToString(car.getPosition());

        final String expected = "----";

        assertThat(actual).isEqualTo(expected);
    }
}
