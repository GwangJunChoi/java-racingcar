package racing2;

import edu2.next.racing2.domain.Car;
import edu2.next.racing2.domain.Winners;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

    @Test
    void 우승자_구하기() {

        // Given
        Car test1 = new Car("test1", 3);
        Car test2 = new Car("test2", 2);
        Car test3 = new Car("test3", 3);
        List<Car> cars = Arrays.asList(test1, test2, test3);

        // When
        List<Car> winners = Winners.findWinners(cars);

        // Then
        assertThat(winners).hasSize(2);
        assertThat(winners).contains(test1, test3);

    }
}
