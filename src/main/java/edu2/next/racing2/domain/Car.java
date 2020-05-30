package edu2.next.racing2.domain;


import java.util.Objects;

public class Car {

    private String name;
    private int position;
    
    //생성자 중복의 경우 인자가 적은 쪽에서 인자가 많은쪽을 호출
    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("자동차 이름은 값이 존재해야 합니다.");
        }
        if (position < 0) {
            throw new IllegalArgumentException("위치 값이 0보다 작을 수 없습니다.");
        }

        this.name = name;
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    int getMaxPosition(int maxPosition) {
        return (this.position > maxPosition) ? this.position : maxPosition;
    }

    public boolean match(int maxPosition) {
        return (this.position == maxPosition);
    }
}
