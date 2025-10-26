package racingcar.domain;

public class Car implements Comparable<Car> {
    private final String name;
    private int score;

    public Car(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }

    @Override
    public int compareTo(Car o) {
        return o.score - this.score;
    }

}
