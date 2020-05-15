package racing;

import edu.next.racing.model.Car;
import edu.next.racing.model.RacingGame;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

public class RacingTest {

    private RacingGame racingGame = new RacingGame();
    ArrayList<Car> cars;

    private Car car = new Car();
    private int carPostion = 0;

    @BeforeEach
    void setRacing() {
        racingGame.setCars(3);
        cars = racingGame.move();
    }

    @DisplayName("자동차 객체 생성 테스트")
    @Test
    void racingGameTest() {
        assertThat(cars).hasSize(3);
    }

    @DisplayName("자동차 위치 포지션 테스트")
    @ParameterizedTest
    @ValueSource(ints = { 1,0,1,0,1 })
    void carPositionTest(int i) {
        carPostion += i;
        car.setPosition(i);
        assertThat(car.getPosition()).isEqualTo(carPostion);
    }
}
