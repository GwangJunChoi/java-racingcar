package edu2.next.racing2.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {

    public static List<Car> findWinners(List<Car> cars) {
        return filterWinners(cars, getWinnerPosition(cars));
    }

    private static List<Car> filterWinners(List<Car> cars, int maxPosition) {
        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    private static int getWinnerPosition(List<Car> cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = car.getMaxPosition(maxPosition);
        }
        return maxPosition;
    }

}
