package racingcar.domain;

public class Car implements Comparable<Car> {
    private final String name;
    private int score;

    private Car(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static Car of(String name) {
        return new Car(name, 0);
    }

    public static Car of(String name, int score) {
        return new Car(name, score);
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
